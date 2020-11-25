package cla.edg.extfile.loader;

import cla.edg.extfile.element.BaseElement;
import cla.edg.extfile.element.LinkElement;
import cla.edg.extfile.element.NodeElement;
import cla.edg.extfile.element.ParamElement;
import clariones.tool.builder.CONST;
import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.FileUtil;

import javax.rmi.CORBA.Util;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DCJsonLoader {
    protected File inputFile;


    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public void setInputFile(File baseFolder, String fileNamePattern) {
        if(baseFolder == null){
            baseFolder = new File(".").getAbsoluteFile();
        }
        File lstFile = FileUtil.findLatestMatchedFile(baseFolder, null, fileNamePattern);
        setInputFile(lstFile);
    }

    public Map<String, Map<String, BaseElement>> doJob() {
        Map<String, Map<String, BaseElement>> result = new HashMap<>();
        String jsonStr = Utils.readFileAsString(getInputFile(), StandardCharsets.UTF_8);
        Map<String, Object> data = Utils.fromJson(jsonStr, Map.class);
        result.put(CONST.NODES, loadNodes(data));
        result.put(CONST.LINKS, loadLinks(data, result));
        return result;
    }

    private Map<String, BaseElement> loadLinks(Map<String, Object> data, Map<String, Map<String, BaseElement>> curResult) {
        List<Map<String, Object>> nodeList = (List<Map<String, Object>>) data.get("edges");
        Map<String, BaseElement> result = new HashMap<>();
        if (nodeList == null || nodeList.isEmpty()){
            return result;
        }
        Map<String, BaseElement> allNodes = curResult.get(CONST.NODES);
        for (Map<String, Object> curNode : nodeList) {
            String fromId = (String) curNode.get("source");
            String toId = (String) curNode.get("target");
            String id = (String) curNode.get("id");
            String title = (String) curNode.get("label");
            if (Utils.isBlank(fromId) || Utils.isBlank(toId)) {
                Utils.error("连接%s:%s[%s->%s]可能没连接上", id, title, fromId, toId);
            }

            NodeElement fromNode = (NodeElement) allNodes.get(fromId);
            NodeElement toNode = (NodeElement) allNodes.get(toId);
            if (fromNode == null) {
                Utils.error("连接%s:%s[%s->%s]的起点没找到", id, title, fromId, toId);
                return null;
            }
            if (toNode == null) {
                Utils.error("连接%s:%s[%s->%s]的终点没找到", id, title, fromId, toId);
                return null;
            }

            BaseElement t = createLink(id, title, curNode, fromNode, toNode);
            result.put(t.getId(), t);
        }
        return result;
    }

    private LinkElement createLink(String id, String title, Map<String, Object> curNode, NodeElement fromNode, NodeElement toNode) {
        LinkElement rst = new LinkElement();
        rst.setType(CONST.LINK);
        rst.setLevel2Type(CONST.LINK);
        rst.setId(id);
        rst.setTitle(title);
        rst.setName((String) curNode.get("name"));
        rst.setFromElement(fromNode.getId());
        rst.setToElement(toNode.getId());
        String linkType = calcLinkType(fromNode, toNode);
        if (linkType == null){
            return Utils.error("不能判断链接%s:%s(%s->%s)的类型", id, title, fromNode.getTitle(), toNode.getTitle());
        }
        rst.setLinkType(linkType);
        rst.setNeedLogin(Utils.getBoolean(curNode.get("needLogin"), true));
        // 校验必须有name的几种情况
        switch (linkType){
            case CONST.LINK_TYPE.REQUEST:
            case CONST.LINK_TYPE.FORM_RESPONSE_BRANCH:
            case CONST.LINK_TYPE.FORM_START_FROM_BRANCH:
            case CONST.LINK_TYPE.RESPONSE_BRANCH:{
                if (Utils.isBlank(rst.getName())){
                    Utils.error("链接%s:%s(%s->%s)必须设置name", id, title, fromNode.getTitle(), toNode.getTitle());
                }
            }
            default:
                break;
        }
        if (curNode.get("extra") != null){
            List<Map<String, String>> params = (List<Map<String, String>>) curNode.get("extra");
            for (Map<String, String> param : params) {
                String type = param.get("type");
                if (type == null){
                    continue;
                }
                String name = param.get("name");
                if (name == null){
                    Utils.error("链接%s:%s(%s->%s)参数没有设置name", id, title, fromNode.getTitle(), toNode.getTitle());
                }
                ParamElement pElement = new ParamElement();
                pElement.setLevel2Type(type);
                pElement.setName(name);
                rst.getParams().add(pElement);
            }
        }
        return rst;
    }

    protected static String[][] LINK_TYPES = {
            {CONST.NODE_TYPE.START_WAY, CONST.NODE_TYPE.PAGE, CONST.LINK_TYPE.REQUEST_RESPONSE},
            {CONST.NODE_TYPE.START_WAY, CONST.NODE_TYPE.FORM, CONST.LINK_TYPE.FORM_REQUEST},
            {CONST.NODE_TYPE.START_WAY, CONST.NODE_TYPE.SPLIT_POINT, CONST.LINK_TYPE.REQUEST},

            {CONST.NODE_TYPE.PAGE, CONST.NODE_TYPE.PAGE, CONST.LINK_TYPE.REQUEST_RESPONSE},
            {CONST.NODE_TYPE.PAGE, CONST.NODE_TYPE.FORM, CONST.LINK_TYPE.FORM_REQUEST},
            {CONST.NODE_TYPE.PAGE, CONST.NODE_TYPE.SPLIT_POINT, CONST.LINK_TYPE.REQUEST},

            {CONST.NODE_TYPE.FORM, CONST.NODE_TYPE.PAGE, CONST.LINK_TYPE.FORM_RESPONSE},
            {CONST.NODE_TYPE.FORM, CONST.NODE_TYPE.SPLIT_POINT, CONST.LINK_TYPE.FORM_RESULT}

            // {CONST.NODE_TYPE.SPLIT_POINT, CONST.NODE_TYPE.PAGE, CONST.LINK_TYPE.RESPONSE_BRANCH}
    };
    private String calcLinkType(NodeElement fromNode, NodeElement toNode) {
        for (String[] linkType : LINK_TYPES) {
            if (fromNode.getLevel2Type().equals(linkType[0])
                    &&  toNode.getLevel2Type().equals(linkType[1])){
                return linkType[2];
            }
        }
        if (fromNode.getLevel2Type().equals(CONST.NODE_TYPE.SPLIT_POINT)){
            String fromType = (String) fromNode.getAdditionalData().get(CONST.RESULT_FROM);
            if (toNode.getLevel2Type().equals(CONST.FORM)){
                return CONST.LINK_TYPE.FORM_START_FROM_BRANCH;
            }
            if ("form".equals(fromType)) {
                return CONST.LINK_TYPE.FORM_RESPONSE_BRANCH;
            }
            return CONST.LINK_TYPE.RESPONSE_BRANCH;
        }
        return null;
    }

    private Map<String, BaseElement> loadNodes(Map<String, Object> data) {
        List<Map<String, Object>> nodeList = (List<Map<String, Object>>) data.get("nodes");
        Map<String, BaseElement> result = new HashMap<>();
        if (nodeList == null || nodeList.isEmpty()){
            return result;
        }

        BaseElement t;

        for (Map<String, Object> curNode : nodeList) {
            String type = (String) curNode.get("xType");
            switch (type){
                case "start":
                    t = makeStartNode(curNode, data);
                    break;
                case "page":
                    t = makePageNode(curNode, data);
                    break;
                case "form":
                    t = makeFormNode(curNode, data);
                    if (hasFormAlready(result, t)){
                        Utils.error("表单"+t.getName()+"定义多次. 只有page可以多次定义");
                    }
                    break;
                case "condition":
                    t = makeConditionNode(curNode, data);
                    break;
                default:
                    throw new RuntimeException("无法处理"+type+"的节点");
            }
            result.put(t.getId(), t);
        }
        return result;
    }

    private boolean hasFormAlready(Map<String, BaseElement> result, BaseElement t) {
        String name = t.getName();
        return result.values().stream().anyMatch(it->it.getLevel2Type().equals(CONST.FORM) && it.getName().equals(name));
    }

    private BaseElement makeFormNode(Map<String, Object> curNode, Map<String, Object> data) {

        NodeElement  rst = new NodeElement();
        rst.setType(CONST.NODE);
        rst.setLevel2Type(CONST.NODE_TYPE.FORM);
        rst.setId((String) curNode.get("id"));
        rst.setTitle((String) curNode.get("label"));
        rst.setName((String) curNode.get("name"));
        if (Utils.isBlank(rst.getName())){
            Utils.error("表单%s没有指定name", rst.getTitle());
        }
        return rst;
    }

    private BaseElement makePageNode(Map<String, Object> curNode, Map<String, Object> data) {
        NodeElement  rst = new NodeElement();
        rst.setType(CONST.NODE);
        rst.setLevel2Type(CONST.NODE_TYPE.PAGE);
        rst.setId((String) curNode.get("id"));
        rst.setTitle((String) curNode.get("label"));
        rst.setName((String) curNode.get("name"));
        String nodeType = (String) curNode.get("type");
        if (nodeType.equals("node")){
            rst.setPageType(CONST.PAGE_TYPE.OTHER);
        }else{
            rst.setPageType(nodeType);
        }
        if (Utils.isBlank(rst.getName())){
            Utils.error("页面%s没有指定name", rst.getTitle());
        }
        rst.setAdditionalData(new HashMap<>());
        rst.getAdditionalData().put(CONST.CACHE_TIME_IN_SECOND, curNode.get("cache"));
        rst.getAdditionalData().put(CONST.CAN_REFRESH, curNode.get("canRefresh"));
        rst.getAdditionalData().put(CONST.HAS_FOOT_PRINT, curNode.get("hasFootPrint"));
        rst.getAdditionalData().put(CONST.DISPLAY_MODE, curNode.get("displayMode"));
        return rst;
    }

    private NodeElement makeStartNode(Map<String, Object> curNode, Map<String, Object> data) {
        NodeElement  rst = new NodeElement();
        rst.setType(CONST.NODE);
        rst.setLevel2Type(CONST.NODE_TYPE.START_WAY);
        rst.setId((String) curNode.get("id"));
        rst.setTitle((String) curNode.get("label"));
        return rst;
    }

    private NodeElement makeConditionNode(Map<String, Object> curNode, Map<String, Object> data) {
        NodeElement  rst = new NodeElement();
        rst.setType(CONST.NODE);
        rst.setLevel2Type(CONST.NODE_TYPE.SPLIT_POINT);
        rst.setId((String) curNode.get("id"));
        rst.setTitle((String) curNode.get("label"));
        rst.getAdditionalData().put(CONST.RESULT_FROM, findPreviousNodeType(data, rst.getId()));
        return rst;
    }

    private String findPreviousNodeType(Map<String, Object> data, String id) {
        List<Map<String, Object>> nodeList = (List<Map<String, Object>>) data.get("nodes");
        List<Map<String, Object>> edgeList = (List<Map<String, Object>>) data.get("edges");
        List<Map<String, Object>> fromNodes = edgeList.stream().filter(it -> it.get("target").equals(id)).collect(Collectors.toList());
        if (fromNodes.size() >= 1){
            String srcId = (String) fromNodes.get(0).get("source");
            Map<String, Object> rstData = nodeList.stream().filter(it->it.get("id").equals(srcId)).findFirst().get();
            return (String)rstData.get("xType");
        }
        return CONST.MULTIPLE;
    }
}
