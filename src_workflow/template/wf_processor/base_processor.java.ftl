package ${base_package};

import ${base_package}.systemprocessinginstance.SystemProcessingInstance;
import ${base_package}.utils.BaseEventProcessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.terapico.utils.*;
import com.terapico.workflow.*;

import java.util.*;
import java.util.stream.Collectors;

public abstract class BaseProcessor extends BaseEventProcessor {

    public static final String RESULT_CODE_SKIP = "__skip";
    public static final String RESULT_CODE_NO_EFFECT = "__no_effect";
    public static final String RESULT_CODE_FAIL = "__fail";
    public static final String RESULT_CODE_OK = "OK";
    public static final String EVENT_ENTER = "ENTER";
    public static final String STATUS_START = "START";
    public static final String ROLE_SYSTEM = "__system";

    public static final String SPLIT_TO = "split_to";
    public static final String GO_TO = "go_to";
    public static final String COPY_TO = "copy_to";

    public static final String MUST_ALL = "must_all";
    public static final String MUST_ANY = "must_any";
    public static final String OPTION_ALL = "option_all";
    public static final String OPTION_ANY = "option_any";

    public Actor getSystemActor() {
        Actor actor = new Actor();
        actor.setRole("ADMIN");
        actor.setId("[from_"+userContext.tokenId()+"]");
        return actor;
    }

    public boolean onEvent(String processIdentity, Actor actor, Event event) throws Exception {
        ProcessInstance proces = ensureProcessInstance(processIdentity);
        return onEvent(proces, actor, event);
    }

    protected ProcessInstance ensureProcessInstance(String id) throws Exception {
        String key = getType() + "_" + id;
        try {
            SystemProcessingInstance instance = userContext.getDAOGroup().getSystemProcessingInstanceDAO().loadByTargetIdentity(key, EO);
            return DebugUtil.getObjectMapper().readValue(instance.getDetail(), new TypeReference<ProcessInstance>() {
            });
        } catch (Exception e) {
            // e.printStackTrace();
        }

        ProcessInstance newInstance = new ProcessInstance();
        newInstance.setBrief(getProcessingSpec().getTitle() + "工作流");
        newInstance.setId(key);
        newInstance.setCategory(getType());
        newInstance.setStatusCode(STATUS_START);
        newInstance.setStatusName(getProcessingSpec().node(STATUS_START).getTitle());
        Node startNode = new Node();
        startNode.setStatusName(STATUS_START);
        startNode.setId(id);
        startNode.setBrief("初始化");
        newInstance.getNodes().put(STATUS_START, startNode);

        saveInstance(newInstance);
        return newInstance;
    }

    protected void saveInstance(ProcessInstance newInstance) throws Exception {
        String title = getProcessingSpec().getTitle();
        String type = newInstance.getCategory();
        String targetIdentity = newInstance.getId();
        String brief = newInstance.getBrief();
        String detail = DebugUtil.dumpAsJson(newInstance, false);
        String platformId = getSystemProcessingInstanceContainerId();
        try {
            SystemProcessingInstance record = userContext.getDAOGroup().getSystemProcessingInstanceDAO().loadByTargetIdentity(newInstance.getId(), EO);
            record.updateTitle(title);
            record.updateType(type);
            record.updateTargetIdentity(targetIdentity);
            record.updateBrief(brief);
            record.updateDetail(detail);
            userContext.getManagerGroup().getSystemProcessingInstanceManager().internalSaveSystemProcessingInstance(userContext, record, EO);
            return;
        } catch (Exception e) {
            // e.printStackTrace();
        }

        userContext.getManagerGroup().getSystemProcessingInstanceManager().createSystemProcessingInstance(userContext,
                title, type, targetIdentity, brief, detail, platformId);
    }

    protected abstract String getSystemProcessingInstanceContainerId();

    /**
     * @param process
     * @param actor
     * @param event
     * @return true: 事件已经被处理; false: 事件未被处理
     * @throws Exception
     */
    public boolean onEvent(ProcessInstance process, Actor actor, Event event) throws Exception {
        if (process == null || process.getNodes() == null || process.getNodes().isEmpty()) {
            debug("没有任何节点实例,什么事件也不处理");
            return false;
        }
        process.getNodes().values().forEach(n -> n.setWasHandled(false));
        boolean eventProcessed = false;
        ArrayList<Node> nodeList = new ArrayList<>(process.getNodes().values());
        for (Node node : nodeList) {
            if (handleEventOnNode(process, node, actor, event)) {
                eventProcessed = true;
            }
        }
        return eventProcessed;

    }

    protected boolean handleEventOnNode(ProcessInstance process, Node node, Actor actor, Event event) throws Exception {
        if (!checkEventShouldBeProcessed(process, node, actor, event)) {
            return false;
        }
        node.setWasHandled(true);
        ProcessSpec spec = getProcessingSpec();
        NodeSpec nodeSpec = spec.getNodesSpec().get(node.getStatusName());
        EventSpec evtSpec = nodeSpec.getEventsSpec().get(event.getEventName());
        if (evtSpec == null) {
            return false;  // 不处理的节点维持不变
        }
        if (!evtSpec.allowRole(actor.getRole())) {
            return false; // 不处理的节点维持不变
        }

        String resultCode = null;
        try {
            resultCode = handleEvent(process, node, actor, event);
            if (TextUtil.isEqualsIfNotNull(resultCode, RESULT_CODE_SKIP)) {
                return false; // 不处理的节点维持不变
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 失败通知
            eventProcessFailed(process, node, actor, event, resultCode, e);
            return false;
        }
        // 处理失败了也是处理过了
        node.setResultCode(resultCode);
        if (TextUtil.isEqualsIfNotNull(resultCode, RESULT_CODE_NO_EFFECT)) {
            return false; // 处理了, 结果是'维持当前状态不变'
        }

        if (TextUtil.isEqualsIfNotNull(resultCode, RESULT_CODE_FAIL)) {
            // 失败通知
            eventProcessFailed(process, node, actor, event, resultCode, null);
            return false;
        }
        // 来到这里, 说明处理完成了, 可能会有一个变化
        EventProcessingResultSpec proRstSpec = evtSpec.getProcessingSpec().get(resultCode);
        if (proRstSpec == null) {
            throw new Exception("未定义" + node.getStatusName() + "时,对事件" + event.getEventName() + "处理结果为" + resultCode + "的后续");
        }
        List<String> statusList = proRstSpec.getTargetStatusCode();
        for (String statusCode : statusList) {
            NodeSpec tgtNodeSpec = spec.getNodesSpec().get(statusCode);
            if (tgtNodeSpec == null) {
                throw new Exception("未定义" + spec.getTitle() + "的状态" + statusCode + "的规格");
            }
            if (!checkCanEnterNewStatus(event.getEventName(), proRstSpec, tgtNodeSpec, process)) {
                debug("还不能进入 " + tgtNodeSpec.getTitle() + " 状态");
                process.addNode(node); // 时机尚未成熟, 保留原来的不变
                continue;
            }
            // 进入条件满足
            Node newNode = new Node();
            newNode.setStatusName(statusCode);
            newNode.setId(actor.getRole() + "_" + actor.getId());
            newNode.setBrief(statusCode);
            newNode.setResultCode("");

            try {
                removePreviousNodesIfNeeded(process, node, tgtNodeSpec, proRstSpec, actor, event);
                enterNewStatusNode(process, node, newNode, actor, event);
            } catch (Exception e) {
                e.printStackTrace();
                // 失败通知
                eventProcessFailed(process, node, actor, event, resultCode, e);
                break;
            }
        }
        saveInstance(process);
        return true;
    }

    protected void removePreviousNodesIfNeeded(ProcessInstance process, Node fromNode, NodeSpec tgtNodeSpec, EventProcessingResultSpec proRstSpec, Actor actor, Event event) throws Exception {
        if (COPY_TO.equals(proRstSpec.getTransferType())) {
            // 是复制新node, 直接返回
            return;
        }
        if (tgtNodeSpec.getEnterCheckingNodes().isEmpty()){
            if (process.removeNode(fromNode)){
                onLeaveStatus(process, fromNode, actor, event);
            }
            return;
        }
        for (String statusCode : tgtNodeSpec.getEnterCheckingNodes().keySet()) {
            List<Node> srcNode = process.getNodesByStatus(statusCode);
            if (srcNode == null || srcNode.isEmpty()){
                continue;
            }
            NodeSpec nodeSpec = getProcessingSpec().getNodesSpec().get(statusCode);
            EventSpec evtSpec = nodeSpec.getEventsSpec().get(event.getEventName());
            if (evtSpec == null) {
                continue;
            }
            EventProcessingResultSpec pstSpec = evtSpec.getProcessingSpec().get(proRstSpec.getResultCode());
            if (pstSpec == null) {
                continue;
            }
            if (pstSpec.getTransferType().equals(COPY_TO)) {
                continue;
            }
            for (Node node : srcNode) {
                if (process.removeNode(node)){
                    onLeaveStatus(process, node, actor, event);
                }
            }
        }
    }

    protected void enterNewStatusNode(ProcessInstance process, Node fromNode, Node newNode, Actor actor, Event event) throws Exception {
        onEnterStatus(process, newNode, actor, event);

        Actor autoActor = new Actor();
        autoActor.setRole(ROLE_SYSTEM);
        autoActor.setId("[from_" + actor.getRole() + "_" + actor.getId() + "]");
        Event enterEvent = new Event();
        if (event.getRootEvent() == null) {
            enterEvent.setRootEvent(event);
        } else {
            enterEvent.setRootEvent(event.getRootEvent());
        }
        enterEvent.setEventName(EVENT_ENTER);
        enterEvent.setParams(MapUtil.put("triggerEvent", event)
                .put("triggerActor", actor)
                .into_map()
        );
        enterEvent.setTargetNode(newNode.getStatusName());
        process.addNode(newNode);
        this.handleEventOnNode(process, newNode, actor, enterEvent);
    }

    protected abstract void onEnterStatus(ProcessInstance process, Node newNode, Actor actor, Event event) throws Exception;

    protected abstract void onLeaveStatus(ProcessInstance process, Node fromNode, Actor actor, Event event) throws Exception;

    public Set<String> getAvailableActions(ProcessInstance processInstance, String roleUser) {
        ProcessSpec spec = this.getProcessingSpec();
        Set<String> result = new HashSet<>();
        processInstance.getNodes().values().forEach(n->{
            NodeSpec nodeSpec = spec.getNodesSpec().get(n.getStatusName());
            result.addAll(nodeSpec.getRoleActions().getOrDefault(roleUser, new HashSet<>()));
        });
        return result;
    }

    protected boolean checkCanEnterNewStatus(String eventName, EventProcessingResultSpec proRstSpec, NodeSpec tgtNodeSpec, ProcessInstance process) {
        if (tgtNodeSpec.getEnterCheckingNodes() == null) {
            debug("%s 无需检查进入条件", tgtNodeSpec.getTitle());
            return true;  // 没有特别的进入条件
        }
        if (tgtNodeSpec.getEnterCheckingNodes().isEmpty()) {
            debug("%s 不需要检查进入条件", tgtNodeSpec.getTitle());
            return true;  // 没有特别的进入条件
        }
        for (String statusCode : tgtNodeSpec.getEnterCheckingNodes().keySet()) {
            String checkWay = tgtNodeSpec.getEnterCheckingNodes().get(statusCode);
            List<Node> nodes = process.getNodes().values().stream()
                    .filter(n -> n.getStatusName().equals(statusCode))
                    .collect(Collectors.toList());
            switch (checkWay) {
                case MUST_ALL: {
                    if (nodes.isEmpty()) {
                        debug("%s must_all失败: 没有%s",tgtNodeSpec.getTitle(),statusCode);
                        return false;
                    }
                    // 判断这个节点, 是否应该 变成 新的节点
                    if (nodes.stream().allMatch(n -> {
                        if (n.getResultCode() == null) {
                            return false;
                        }
                        NodeSpec nodeSpec = getProcessingSpec().getNodesSpec().get(n.getStatusName());
                        return nodeSpec.willGoto(eventName, n.getResultCode()).contains(tgtNodeSpec.getStatusCode());
                    })) {
                        break;
                    }
                    debug("%s must_all失败: 有未成功的%s",tgtNodeSpec.getTitle(), statusCode);
                    return false;
                }
                case MUST_ANY: {
                    if (nodes.isEmpty()) {
                        debug("%s must_any失败: 没有%s",tgtNodeSpec.getTitle() ,statusCode);
                        return false;
                    }
                    // 判断这个节点, 是否应该 变成 新的节点
                    if (nodes.stream().anyMatch(n -> {
                        if (n.getResultCode() == null) {
                            return false;
                        }
                        NodeSpec nodeSpec = getProcessingSpec().getNodesSpec().get(n.getStatusName());
                        return nodeSpec.willGoto(eventName, n.getResultCode()).contains(tgtNodeSpec.getStatusCode());
                    })) {
                        break;
                    }
                    debug("%s must_any失败: 没有成功的%s",tgtNodeSpec.getTitle(), statusCode);
                    return false;
                }
                case OPTION_ALL: {
                    if (nodes.isEmpty()) {
                        return true;
                    }
                    if (nodes.stream().allMatch(n -> {
                        if (n.getResultCode() == null) {
                            return false;
                        }
                        NodeSpec nodeSpec = getProcessingSpec().getNodesSpec().get(n.getStatusName());
                        return nodeSpec.willGoto(eventName, n.getResultCode()).contains(tgtNodeSpec.getStatusCode());
                    })) {
                        break;
                    }
                    debug("%s option_all失败: 有未成功的%s",tgtNodeSpec.getTitle(), statusCode);
                    return false;
                }
                case OPTION_ANY: {
                    if (nodes.isEmpty()) {
                        return true;
                    }
                    if (nodes.stream().anyMatch(n -> {
                        if (n.getResultCode() == null) {
                            return false;
                        }
                        NodeSpec nodeSpec = getProcessingSpec().getNodesSpec().get(n.getStatusName());
                        return nodeSpec.willGoto(eventName, n.getResultCode()).contains(tgtNodeSpec.getStatusCode());
                    })) {
                        break;
                    }
                    debug("%s option_all失败: 没有成功的 %" ,tgtNodeSpec.getTitle(), statusCode);
                    return false;
                }
                default:
                    throw new RuntimeException("不支持的准入规则:" + checkWay);
            }

        }
        return true;
    }

    protected abstract void eventProcessFailed(ProcessInstance process, Node node, Actor actor, Event event, String resultCode, Exception e);

    protected abstract String handleEvent(ProcessInstance process, Node node, Actor actor, Event event) throws Exception;

    /**
     * 检查业务事件是否可以被处理. 包括权限校验等.
     * <p>
     * 默认啥也不做, 认为 checkEventShouldBeProcessed() 通过了就可以做. 这个只是一个重载点.
     *
     * @param process
     * @param actor
     * @param event
     * @throws Exception
     */
    protected abstract void checkEventCanBeProcessed(ProcessInstance process, Actor actor, Event event) throws Exception;

    protected abstract ProcessSpec getProcessingSpec();


    /**
     * 检查事件是不是应该被处理.
     * <p>
     * 默认的规则是,只要有任意node的当前状态注册了的事件, 都处理
     *
     * @param process
     * @param actor
     * @param event
     */
    protected boolean checkEventShouldBeProcessed(ProcessInstance process, Node node, Actor actor, Event event) {
        ProcessSpec spec = getProcessingSpec();
        EventSpec evtSpec = spec.getEventSpec(node.getStatusName(), event.getEventName());
        if (evtSpec == null) {
            return false;
        }
        if (node.isWasHandled()) {
            return false;
        }
        if (event.getTargetNode() == null) {
            return true;
        }
        return node.getStatusName().equals(event.getTargetNode());
    }

    /**
     * 检查事件是否应该被处理.
     * <p>
     * 默认返回true, 不考虑角色. 这个函数被调用的前提,是已经根据 node 的 statusName 过滤掉了注册了此消息的node
     *
     * @param process
     * @param actor
     * @param event
     * @param nodes
     * @return
     */
    protected abstract boolean checkEventShouldBeProcessed(ProcessInstance process, List<Node> nodes, Actor actor, Event event);
}