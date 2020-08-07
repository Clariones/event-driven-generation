package cla.poc.workflow.spec;

import java.util.*;

public class SpecFactory extends BaseSpecFactory{
    protected Map<String, ProcessingSpec> allProcessing = new HashMap<>();


    public Map<String, ProcessingSpec> getAllProcessing() {
        return allProcessing;
    }

    public void setAllProcessing(Map<String, ProcessingSpec> allProcessing) {
        this.allProcessing = allProcessing;
    }

    public void ensureProcessing(String processingName) {
        if (allProcessing == null){
            allProcessing = new HashMap<>();
        }
        ProcessingSpec proc = allProcessing.get(processingName);
        if (proc == null) {
            proc = new ProcessingSpec();
            proc.setName(processingName);
            allProcessing.put(processingName, proc);
        }
        workingOn(proc);
    }


    public void setI18N(String localeName, String text) {
        if (workingOnProcessingLevel()){
            curProcessing.setZhName(text);
            return;
        }
        if (workingOnNodeLevel()){
            curNode.setZhName(text);
        }
        if (workingOnEventLevel()){
            curEvent.setZhName(text);
        }
        if (workingOnResultLevel()){
            curResult.setZhName(text);
        }
    }

    public void defineStatus(String statusCode) {
        NodeSpec spec = curProcessing.createStatusNode(statusCode);
        workingOn(spec);
    }


    public void defineEvent(String eventName) {
        if (curNode == null){
            error("定义 事件 必须在 in_status() 之后");
        }
        EventSpec event = curNode.createEvent(eventName);
        workingOn(event);
    }

    public void defineProcessResultCode(String resultCode) {
        if (curNode == null){
            error("split_to(), go_to() 和 copy_to() 必须在 in_status() 之后");
        }
        if (curEvent == null){
            this.defineEvent("enter");
            this.setI18N("zh_CN","进入");
        }
        ProcessResultSpec spec = curEvent.defineResultCode(resultCode);
        workingOn(spec);
    }

    public void setTargetStatus(String type, String[] tgtStatusArray) {
        if (curNode == null){
            error("split_to(), go_to() 和 copy_to() 必须在 in_status() 之后");
        }
        if (curEvent == null){
            this.defineEvent("enter");
            this.setI18N("zh_CN","进入");
        }
        if (curResult == null) {
            this.defineProcessResultCode("ok");
            this.setI18N("zh_CN","成功");
        }
        curResult.setTransferType(type);
        curResult.setTargetStatusCode(new ArrayList<>(Arrays.asList(tgtStatusArray)));
        workingOnTargetStatus();
    }


    public void defineRole(String roleName) {
        if (curNode == null){
            error("as_role() 必须在 in_status() 之后");
        }
        RoleSpec spec = curNode.defineRole(roleName);
        workingOn(spec);
    }

    public void defineActions(String[] actionArray) {
        if (curRole == null){
            error("can_do() 必须在 as_role() 之后");
        }
        curRole.setActions(new HashSet<>(Arrays.asList(actionArray)));
    }

    public void setAllowedRole(String[] roleNameArray) {
        if (curEvent == null){
            error("by_role() 必须在 in_status() 之后");
        }
        curEvent.setAllowedRoles(new HashSet<>(Arrays.asList(roleNameArray)));
        curEvent.setBlocking(false);
    }
    public void setBlockedRole(String[] roleNameArray) {
        if (curEvent == null){
            error("not_by_role() 必须在 on_event() 之后");
        }
        curEvent.setAllowedRoles(new HashSet<>(Arrays.asList(roleNameArray)));
        curEvent.setBlocking(true);
    }


    public void setEnterCondition() {
        if (curNode == null){
            error("as_role() 必须在 in_status() 之后");
        }
        workingOnEnterCondition();
    }

    public void enterMustHave(String statusCode) {
        if (curNode == null){
            error("must_have() 必须在 in_status() 之后");
        }
        curNode.getEnterChecking().put(statusCode, "must_all");
    }
    public void enterIfHave(String statusCode) {
        if (curNode == null){
            error("if_have() 必须在 in_status() 之后");
        }
        curNode.getEnterChecking().put(statusCode, "option_all");
    }

    public void enterNeedCheckAll(String statusCode) {
        if (curNode == null){
            error("all_success() 必须在 in_status() 之后");
        }
        String type = curNode.getEnterChecking().get(statusCode);
        if (type.startsWith("must_")){
            curNode.getEnterChecking().put(statusCode, "must_all");
            return;
        }

        if (type.startsWith("option_")){
            curNode.getEnterChecking().put(statusCode, "option_all");
            return;
        }
        throw new RuntimeException("只支持 must_all 或者 option_all");
    }
    public void enterNeedCheckAny(String statusCode) {
        if (curNode == null){
            error("any_success() 必须在 in_status() 之后");
        }
        String type = curNode.getEnterChecking().get(statusCode);
        if (type.startsWith("must_")){
            curNode.getEnterChecking().put(statusCode, "must_any");
            return;
        }

        if (type.startsWith("option_")){
            curNode.getEnterChecking().put(statusCode, "option_any");
            return;
        }
        throw new RuntimeException("只支持 must_any 或者 option_any");
    }
}
