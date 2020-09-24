package cla.edg.extfile.loader;

import cla.edg.extfile.element.*;
import cla.edg.pageflow.PageFlowScript;
import clariones.tool.builder.CONST;
import clariones.tool.builder.Utils;

import java.util.*;
import java.util.stream.Collectors;

public class PageFlowScriptMaker {
    protected Map<String, PageElement> pages = new TreeMap<>();
    protected Map<String, RequestElement> requests = new TreeMap<>();
    private Map<String, BaseElement> inputNodes;
    private Map<String, BaseElement> inputLinks;


    public void makeScript(PageFlowScript script) {
        Set<String> declaredPages = new HashSet<>();
        for (RequestElement req : requests.values()) {
            StringBuilder sb = new StringBuilder();
            if (req.getFormId() == null) {
                script.request(req.getName());
                sb.append(".request(").append(req.getName()).append(')');
            } else {
                script.request_with_changerequest(req.getFormName());
                sb.append(".request_with_changerequest(").append(req.getFormName()).append(')');
            }
            // 参数部分
            if (req.getParams() == null || req.getParams().isEmpty()) {
                if (isPresetRequest(req, script, sb)){
                    //
                }else if (req.getRequestType().equals(CONST.PAGE_TYPE.LIST)) {
                    script.with_string("tab name").with_last_record_id();
                    sb.append(".with_string(tab name).with_last_record_id()");
                } else if (req.getRequestType().equals(CONST.PAGE_TYPE.DETAIL)) {
                    String tgtPageId = req.getTargetPages().get(CONST.BRANCH_BY_DEFAULT);
                    PageElement tgtPage = pages.get(tgtPageId);
                    script.with_string(makeIdParam(tgtPage.getName()));
                    sb.append(".with_string(").append(makeIdParam(tgtPage.getName())).append(")");
                } else if (req.getSplitNodeId() != null) {
                    if (req.getName().startsWith("view")) {
                        script.with_string(makeIdParam(req.getName()));
                        sb.append(".with_string(").append(makeIdParam(req.getName())).append(")");
                    }
                }
            } else {
            }

            Utils.debug(sb.toString());

            // comments 部分
            sb = new StringBuilder("    ");
            script.comments(req.getTitle());
            sb.append(".comments(").append(req.getTitle()).append(")");
            if (isPresetRequest(req, script, sb)){
                script.no_login();
                sb.append(".no_login()");
            }else if (req.isNeedLogin()){
                script.need_login();
                sb.append(".need_login()");
            }else{
                script.no_login();
                sb.append(".no_login()");
            }
            if (req.getTargetPages().size() == 1){
                String tgtPageId = req.getTargetPages().get(CONST.BRANCH_BY_DEFAULT);
                PageElement tgtPage = pages.get(tgtPageId);
                if (tgtPage.isCanRefresh()){
                    script.can_refresh();
                    sb.append(".can_refresh()");
                }
                if (tgtPage.isHasFootPrint()){
                    script.has_footprint();
                    sb.append(".has_footprint()");
                }
                if (tgtPage.getCacheInSecond() > 0){
                    script.cache_in_seconds(tgtPage.getCacheInSecond());
                    sb.append(".cache_in_seconds(").append(tgtPage.getCacheInSecond()).append(")");
                }
            }
            Utils.debug(sb.toString());

            // 页面部分

            if (req.getTargetPages().size() == 1) {
                sb = new StringBuilder("    ");
                String tgtPageId = req.getTargetPages().get(CONST.BRANCH_BY_DEFAULT);
                PageElement tgtPage = pages.get(tgtPageId);
                appendPageInfo(script, declaredPages, sb, tgtPageId, tgtPage);
                Utils.debug(sb.toString());
            }else{
                for (Map.Entry<String, String> entry : req.getTargetPages().entrySet()) {
                    sb = new StringBuilder("    ");
                    String branchName = entry.getKey();
                    String tgtPageId = req.getTargetPages().get(branchName);
                    if (!branchName.equals(CONST.BRANCH_BY_DEFAULT)){
                        BaseElement link = inputLinks.get(branchName);
                        script.when(link.getName()).comments(link.getTitle());
                        sb.append(".when(").append(link.getName()).append(").comments(").append(link.getTitle()).append(")");
                    }else{
                        script.when_others();
                        sb.append(".when_others()");
                    }
                    Utils.debug(sb.toString());

                    sb = new StringBuilder("        ");
                    PageElement tgtPage = pages.get(tgtPageId);
                    if (tgtPage != null){
                        appendPageInfo(script, declaredPages, sb, tgtPageId, tgtPage);
                    }else{
                        NodeElement node = (NodeElement) inputNodes.get(tgtPageId);
                        appendResultFormInfo(script, declaredPages, sb, node.getName());
                    }
                    Utils.debug(sb.toString());
                }
            }

        }
    }


    private boolean isPresetRequest(RequestElement req, PageFlowScript script, StringBuilder sb) {
        if (req.getName().equals("view me page")){
            return true;
        }
        if (req.getName().equals("view home page")){
            return true;
        }
        return false;
    }

    private String makeIdParam(String name) {
        return getObjectName(name)+" id";
    }

    private String getObjectName(String name) {
        if (Utils.isBlank(name)){
            return "";
        }
        return name.trim().replaceAll("^user\\s*","")
                .replaceAll("^my\\s*","")
                .replaceAll("^view\\s*","")
                .replaceAll("\\s*detail$", "")
                .replaceAll("\\s*list$","")
                ;
    }

    private void appendResultFormInfo(PageFlowScript script, Set<String> declaredPages, StringBuilder sb, String crName) {
        script.start_cr(crName);
        sb.append(".start_cr(").append(crName).append(")");
        java.sql.Date a;
    }

    private void appendPageInfo(PageFlowScript script, Set<String> declaredPages, StringBuilder sb, String tgtPageId, PageElement tgtPage) {
        script.got_page(tgtPage.getName());
        sb.append(".got_page(").append(tgtPage.getName()).append(")");
        if (tgtPage.getName().equals("home page") || tgtPage.getName().equals("home")){
            script.as_class("com.terapico.appview.HomePage");
            sb.append(".as_class(com.terapico.appview.HomePage)");
        }else if (tgtPage.getName().equals("me page") || tgtPage.getName().equals("me")) {
            script.as_class("com.terapico.appview.MePage");
            sb.append(".as_class(com.terapico.appview.MePage)");
        }
        if (!declaredPages.contains(tgtPageId)){
            script.title(tgtPage.getTitle());
            sb.append(".title(").append(tgtPage.getTitle()).append(")");
        }else{
            return;
        }
        if (tgtPage.getPageType().equals(CONST.PAGE_TYPE.LIST)){
            String dm = Utils.getString(tgtPage.getAdditionalData().get(CONST.DISPLAY_MODE), "auto");
            script.list_of(dm);
            sb.append(".list_of(").append(dm).append(")");
        }else if (tgtPage.getPageType().equals(CONST.PAGE_TYPE.DETAIL) ){
            script.detail_of(getObjectName(tgtPage.getName()));
            sb.append(".detail_of(").append(getObjectName(tgtPage.getName())).append(")");
        }else{
            // nothing
        }
    }



    public void processInputElements(Map<String, Map<String, BaseElement>> allElements) {
        this.inputNodes = allElements.get(CONST.NODES);
        this.inputLinks = allElements.get(CONST.LINKS);

        processPages(allElements);
        Map<String, BaseElement> nodes = allElements.get(CONST.LINKS);
//        Utils.debug("开始时的所有link:"+Utils.toJson(nodes));
        // 先处理3种 request 起点
        for (BaseElement value : nodes.values()) {
            LinkElement link = (LinkElement) value;
            switch (link.getLinkType()){
                case CONST.LINK_TYPE.REQUEST_RESPONSE: {
                    RequestElement requestElement = processRequestResponseLink(link);
                    requests.put(requestElement.getId(), requestElement);
                }
                break;
                case CONST.LINK_TYPE.REQUEST:{
                    RequestElement requestElement = processRequestLink(link);
                    requests.put(requestElement.getId(), requestElement);
                }
                break;
                case CONST.LINK_TYPE.FORM_REQUEST:{
                    RequestElement requestElement = processFormRequestLink(allElements, link);
                    requests.put(requestElement.getId(), requestElement);
                }
                break;
                case CONST.LINK_TYPE.FORM_START_FROM_BRANCH:{
                    RequestElement requestElement = processFormRequestLink(allElements, link);
                    requestElement.setId(requestElement.getId()+"_cr");
                    requests.put(requestElement.getId(), requestElement);
                }
                default:
                    break;
            }
        }
//        Utils.debug("第一次,全是请求"+Utils.toJson(requests));

        // 再处理 form-result 这种唯一的一个 '三段中'
        for (BaseElement value : nodes.values()) {
            LinkElement link = (LinkElement) value;
            switch (link.getLinkType()) {
                case CONST.LINK_TYPE.FORM_RESULT:{
                    processFormResultLink(link);
                }
                break;
                default:
                    break;
            }
        }
//        Utils.debug("第二次,只处理form result: "+Utils.toJson(requests));

        // 最后处理分支
        for (BaseElement value : nodes.values()) {
            LinkElement link = (LinkElement) value;
            switch (link.getLinkType()) {
                case CONST.LINK_TYPE.RESPONSE_BRANCH:
                case CONST.LINK_TYPE.FORM_RESPONSE_BRANCH:
                case CONST.LINK_TYPE.FORM_START_FROM_BRANCH: {
                    processBranchLink(link);
                }
                break;
                case CONST.LINK_TYPE.FORM_RESPONSE:{
                    processFormResponseLink(link);
                }
                break;
                default:
//                    Utils.debug("跳过"+link.getTitle()+":"+link.getId());
                    break;
            }
        }

//        Utils.debug(Utils.toJson(requests));
    }

    private void processFormResponseLink(LinkElement link) {
        String formId = link.getFromElement();
        RequestElement requestElement = requests.values().stream()
                .filter(it -> it.getFormId() != null && it.getFormId().equals(formId)).findFirst().get();
        String pageId = link.getToElement();
        requestElement.getTargetPages().put(CONST.BRANCH_BY_DEFAULT, pageId);
    }

    private void processBranchLink(LinkElement link) {
        String conditionId = link.getFromElement();
        List<RequestElement> reqList = requests.values().stream()
                .filter(it -> it.getSplitNodeId() != null && it.getSplitNodeId().equals(conditionId))
                .collect(Collectors.toList());
        String pageId = link.getToElement();
        for (RequestElement requestElement : reqList) {
            requestElement.getTargetPages().put(link.getId(), pageId);
        }
    }

    private void processFormResultLink(LinkElement link) {
        String nodeId = link.getFromElement();
        for (RequestElement requestElement : requests.values()) {
            if (nodeId.equalsIgnoreCase(requestElement.getFormId())) {
                requestElement.setSplitNodeId(link.getToElement());
            }
        }
    }

    private RequestElement processFormRequestLink(Map<String, Map<String, BaseElement>> allElements, LinkElement link) {
        RequestElement requestElement = new RequestElement();
        String tgtFormId = link.getToElement();
        NodeElement formNode = (NodeElement) allElements.get(CONST.NODES).get(tgtFormId);
        RequestElement existRequestElement = findFormRequest(tgtFormId);
        if (existRequestElement != null){
            if (!Utils.isBlank(link.getName())){
                if (!existRequestElement.getName().equals(link.getName())){
                    Utils.error("到表单%s的请求有多条,推断的name不一致, 要么全部指定一样的名字, 要么全部不指定名字", formNode.getTitle());
                }
            }
            return existRequestElement;
        }

        requestElement.setId(link.getId());
        requestElement.setType(CONST.REQUEST);
        requestElement.setFormId(tgtFormId);


        if (Utils.isBlank(link.getName())){
            requestElement.setName("submit cr " + formNode.getName());
        }else{
            requestElement.setName(link.getName());
        }
        requestElement.setFormName(formNode.getName());
        if (Utils.isBlank(link.getTitle())){
            requestElement.setTitle("提交表单 " + formNode.getTitle());
        }else{
            requestElement.setTitle(link.getTitle());
        }
        requestElement.setNeedLogin(link.isNeedLogin());
        return requestElement;
    }



    private RequestElement processRequestLink(LinkElement link) {
        RequestElement requestElement = new RequestElement();
        requestElement.setId(link.getId());
        requestElement.setType(CONST.REQUEST);
        requestElement.setSplitNodeId(link.getToElement());
        requestElement.setName(link.getName());
        requestElement.setTitle(link.getTitle());
        requestElement.setNeedLogin(link.isNeedLogin());
        return requestElement;
    }

    private RequestElement processRequestResponseLink(LinkElement link) {
        PageElement tgtPage = pages.get(link.getToElement());
//        RequestElement existRequestElement = findRequest(tgtPage.getId());
//        if (existRequestElement != null){
//            if (!Utils.isBlank(link.getName())){
//                if (!existRequestElement.getName().equals(link.getName())){
//                    Utils.error("到页面%s的请求有多条,推断的name不一致, 要么全部指定一样的名字, 要么全部不指定名字", tgtPage.getTitle());
//                }
//            }
//            return existRequestElement;
//        }

        RequestElement requestElement = new RequestElement();
        requestElement.setId(link.getId());
        requestElement.setType(CONST.REQUEST);
        requestElement.getTargetPages().put(CONST.BRANCH_BY_DEFAULT, tgtPage.getId());
        requestElement.setRequestType(tgtPage.getPageType());

        if (Utils.isBlank(link.getName())){
            if (tgtPage.getName().trim().equals("home")){
                requestElement.setName("view home page");
            }else {
                requestElement.setName("view " + tgtPage.getName());
            }
        }else{
            requestElement.setName(link.getName());
        }
        if (Utils.isBlank(link.getTitle())){
            requestElement.setTitle("查看 " + tgtPage.getTitle());
        }else{
            requestElement.setTitle(link.getTitle());
        }
        requestElement.setNeedLogin(link.isNeedLogin());

        RequestElement existReq = requests.values().stream().filter(it -> it.getName().equals(requestElement.getName())).findFirst().orElse(null);
        if (existReq == null) {
            return requestElement;
        }
        // 本来应该判断参数是否相同的
        return existReq;
    }

    private RequestElement findRequest(String tgtPageId) {
        for (RequestElement req : requests.values()) {
            if (req.getTargetPages() == null || req.getTargetPages().isEmpty()){
                continue;
            }
            if (req.getTargetPages().containsValue(tgtPageId)){
                return req;
            }
        }
        return null;
    }

    private RequestElement findFormRequest(String tgtFormId) {
        for (RequestElement req : requests.values()) {
            if (req.getFormId() == null){
                continue;
            }
            if (req.getFormId().equals(tgtFormId)){
                return req;
            }
        }
        return null;
    }

    private void processPages(Map<String, Map<String, BaseElement>> allElements) {
        Map<String, BaseElement> nodes = allElements.get(CONST.NODES);
        for (BaseElement nodeItem : nodes.values()) {
            NodeElement node = (NodeElement) nodeItem;
            String nodeType = node.getLevel2Type();
            if (!nodeType.equals(CONST.NODE_TYPE.PAGE)){
                continue;
            }
            PageElement page = new PageElement();
            page.setId(node.getId());
            page.setName(node.getName());
            if (Utils.isBlank(node.getTitle())){
                page.setTitle(node.getName());
            }else{
                page.setTitle(node.getTitle());
            }
            page.setPageType(node.getPageType());
            page.setCacheInSecond(Utils.getInt(node.getAdditionalData().get(CONST.CACHE_TIME_IN_SECOND),0));
            page.setCanRefresh(Utils.getBoolean(node.getAdditionalData().get(CONST.CAN_REFRESH), false));
            page.setHasFootPrint(Utils.getBoolean(node.getAdditionalData().get(CONST.HAS_FOOT_PRINT), false));

            pages.put(page.getId(), page);
        }
    }


}
