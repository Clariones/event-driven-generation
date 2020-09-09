package cla.edg.extfile.pageflow;

import cla.edg.extfile.loader.BaseNgmLoader;
import cla.edg.extfile.loader.NutStoreNgmLoader;
import cla.edg.pageflow.Page;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PageflowUtil;
import cla.edg.pageflow.spec.Request;
import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.TextUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PageFlowParser {
    protected List<File> inputFiles;

    public List<File> getInputFiles() {
        if (inputFiles == null){
            inputFiles = new ArrayList<>();
        }
        return inputFiles;
    }

    public void setInputFiles(List<File> inputFiles) {
        this.inputFiles = inputFiles;
    }

    public PageFlowParser addInputFile(File file){
        getInputFiles().add(file);
        return this;
    }
    public PageFlowScript parseFromFile(PageFlowScript script) {
        try {
            BaseNgmLoader ngmLoader = new NutStoreNgmLoader();
            List<Node> allNodes = ngmLoader.loadNodesFromFile(getInputFiles());
            Map<String, Node> nodeMap = allNodes.stream().collect(Collectors.toMap(it -> it.getId(), it -> it));
            for (Node node : allNodes) {
                beforeApplyNode(script, node, nodeMap);
            }
            Utils.debug("开始构造的数据:" + Utils.toJson(nodeMap.values(), true));
            for (Node node : allNodes) {
                applyNodeToScript(script, node, nodeMap);
            }
            return script;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private void beforeApplyNode(PageFlowScript script, Node node, Map<String, Node> nodeMap) {
        if (node.getNodeType().equals("text")){
            String pId = node.getParent();
            Node parentNode = nodeMap.get(pId);
            parentNode.setName(node.getName());
            parentNode.setTitle(node.getTitle());
            return;
        }

        if (node.getNodeType().equals("branch")){
            if (TextUtil.isBlank(node.getName())){
                if (TextUtil.isBlank(node.getTitle())){
                    node.setTitle("正常情况");
                    node.setName("by default");
                }else{
                    // Utils.error("特定分支 " + node.getTitle()+" 没有定义代码");
                    node.setName("by default");
                }
            }
            return;
        }

        if (node.getNodeType().equals("request") && TextUtil.isBlank(node.getName())){
            if (node.getId().equals("5PQoWfJMQA1bLqQOxnqX-10")){
                Utils.debug("原始数据: %s", Utils.toJson(node));
            }
            Node toNode = nodeMap.get(node.getToNode());
            if (toNode != null && toNode.getNodeType().equals("page")){
                if (toNode.getName().endsWith(" form")){
                    node.setName("submit cr " + getFormName(toNode.getName()));
                    node.setTitle("提交表单 " + toNode.getTitle());
                }else {
                    node.setName("view " + removePrefix(toNode.getName()));
                    node.setTitle("查看" + toNode.getTitle());
                }
            }

            Node fromNode = nodeMap.get(node.getFromNode());
            if (fromNode != null && fromNode.getNodeType().equals("page")) {
                if (fromNode.getName().endsWith(" form")){
                    node.setName("submit cr " + getFormName(fromNode.getName()));
                    node.setTitle("提交表单 " + fromNode.getTitle());
                }
            }
        }
    }

    private void applyNodeToScript(PageFlowScript script, Node node, Map<String, Node> nodeMap) {
        switch (node.getNodeType()){
            case "request":
                applyRequestNodeToScript(script, node, nodeMap);
                Utils.debug("添加请求:"+node.getName());
                return;
            case "page":
                applyPageNodeToScript(script, node, nodeMap);
                Utils.debug("添加页面:"+node.getName());
                return;
            case "branch":
                applyRequestBranchNodeToScript(script, node, nodeMap);
                Utils.debug("添加分支:"+node.getName());
            case "request_point":
            case "start_way":
            default:
                // 没分析出来就什么都不做
                return;
        }
    }

    private void applyRequestBranchNodeToScript(PageFlowScript script, Node node, Map<String, Node> nodeMap) {
        Node reqNode = findLinkedFromNode(node, "request", nodeMap);
        Node pageNode = findLinkedToNode(node, "page", nodeMap);
        applyRequestNodeToScript(script, reqNode, nodeMap);
        script.when(node.getName()).comments(node.getTitle());
        script.got_page(pageNode.getName());
        Utils.debug("  当 %s 时, 访问 %s", node.getName(), pageNode.getName());
        applyPageNodeToScript(script, pageNode, nodeMap);
    }

    private void applyPageNodeToScript(PageFlowScript script, Node node, Map<String, Node> nodeMap) {
        Page page = PageflowUtil.findPageByName(script, node.getName());
        if (page != null && page.getComments() != null){
            script.in_page(node.getName());
            Utils.debug("  页面 %s:%s", node.getName(), page.getPageTitle());
            return;
        }
        if (node.getNodeType().endsWith(" form")){
            // form 页面统一处理
            return;
        }
        Node reqNode = findLinkedFromNode(node, "request", nodeMap);
        if (reqNode != null){
            applyRequestNodeToScript(script, reqNode, nodeMap);
        }
        script.in_page(node.getName()).comments(node.getTitle()+"页面").title(node.getTitle());
        if (node.getName().endsWith(" list")) {
            script.list_of("card");
        }
        Utils.debug("  得到页面 %s", node.getName());
    }



    private void applyRequestNodeToScript(PageFlowScript script, Node node, Map<String, Node> nodeMap) {
        Request req = script.findRequestByName(node.getName());
        if (req != null && !node.getName().startsWith("submit cr ")){
            script.for_request(node.getName());
            Utils.debug("  当请求 %s", node.getName());
            return;
        }
        String name = node.getName();
        if (Utils.isBlank(name)){
            Utils.error("节点未命名:"+node.getId());
        }

        script.for_request(name).comments(node.getTitle());
        Node toNode = nodeMap.get(node.getToNode());
        if (toNode != null && toNode.getNodeType().equals("page")){
            String pageName = toNode.getName();
            if (pageName.endsWith(" list")){
                script.with_string("tab name").with_last_record_id();
            }else if (pageName.endsWith(" form")){
                script.with_changerequest(getFormName(pageName));
            }else if (pageName.endsWith(" detail")){
                script.with_string(getDetailName(pageName)+" id");
                Utils.debug("add param '%s id' by %s",  getDetailName(pageName), node.getId());
            }

            if (pageName.equals("me")){
                // me 页面要特殊处理
                script.no_login();
            }else if (pageName.startsWith("user ") || pageName.startsWith("customer ") || pageName.startsWith("my ")){
                script.need_login();
            }else{
                script.no_login();
            }
            if (!toNode.getName().endsWith(" form")) {
                script.got_page(toNode.getName());
            }
            Utils.debug("  请求 %s, 得到页面 %s", node.getName(), toNode.getName());
        }else {
            Utils.debug("  请求 %s", node.getName());
        }
    }

    private String getDetailName(String name) {
        name = removePrefix(name);
        return name.replaceAll("detail$","").trim();
    }

    private String removePrefix(String name) {
        String[] knownPrefix = {"my ", "user ", "customer "};
        for (String prefix : knownPrefix) {
            if (name.startsWith(prefix)){
                return name.substring(prefix.length());
            }
        }
        return name;
    }

    private String getFormName(String name) {
        name = removePrefix(name);
        return name.replaceAll("form$","").trim();
    }

    private Node findLinkedToNode(Node fromNode, String tgtNodeType, Map<String, Node> nodeMap) {
        String toNodeId = fromNode.getToNode();
        if (!Utils.isBlank(toNodeId)){
            Node tgtNode = nodeMap.get(toNodeId);
            if (tgtNode == null){
                return null;
            }
            if (tgtNode.getNodeType().equals(tgtNodeType)){
                return tgtNode;
            }
            return findLinkedToNode(tgtNode, tgtNodeType, nodeMap);
        }

        // 没有 toNodeId, 那就找 src=me的
        List<Node> nodesFromMe = nodeMap.values().stream().filter(it -> fromNode.id.equals(it.getFromNode())).collect(Collectors.toList());
        if (nodesFromMe.isEmpty()) {
            return null;
        }
        for (Node node : nodesFromMe) {
            if (node.getNodeType().equals(tgtNodeType)){
                return node;
            }
            Node x = findLinkedToNode(node, tgtNodeType, nodeMap);
            if (x != null){
                return x;
            }
        }
        return null;
    }

    private Node findLinkedFromNode(Node node, String fromNodeType, Map<String, Node> nodeMap) {
        String fromNodeId = node.getFromNode();
        if(!Utils.isBlank(fromNodeId)){
            Node fromNode = nodeMap.get(fromNodeId);
            if (fromNode == null){
                return null;
            }
            if (fromNode.getNodeType().equals(fromNodeType)){
                return fromNode;
            }
            return findLinkedFromNode(fromNode, fromNodeType, nodeMap);
        }

        // 没有 fromNodeId, 那就找 tgt=me的
        List<Node> nodesToMe = nodeMap.values().stream().filter(it -> node.id.equals(it.getToNode())).collect(Collectors.toList());
        if (nodesToMe.isEmpty()) {
            return null;
        }
        for (Node snode : nodesToMe) {
            if (snode.getNodeType().equals(fromNodeType)){
                return snode;
            }
            Node x = findLinkedToNode(snode, fromNodeType, nodeMap);
            if (x != null){
                return x;
            }
        }
        return null;
    }
}
