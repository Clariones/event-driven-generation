package cla.edg.modelbeanv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BeanPath {
    protected LinkedList<BeanPathNode> nodeList;

    public LinkedList<BeanPathNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(LinkedList<BeanPathNode> nodeList) {
        this.nodeList = nodeList;
    }

    public BeanPath name(String startNodeName) {
        BeanPathNode startNode = new BeanPathNode();
        startNode.setBeanName(startNodeName);
        nodeList = new LinkedList<>();
        nodeList.add(startNode);
        return this;
    }

    public void addNode(String nodeName, String attrName, String memberName, String pathType) {
        BeanPathNode newNode = new BeanPathNode();
        newNode.setBeanName(nodeName);
        newNode.setByPath(attrName);
        newNode.setMemberName(memberName);
        newNode.setPathType(pathType);
        nodeList.add(newNode);
    }

    public void appendAttribute(String name, String modelTypeName) {
        // 在最后一个节点上附加
        BeanPathNode lstNode = nodeList.getLast();
        lstNode.setAttributeName(name);
        lstNode.setAttributeType(modelTypeName);
    }
}
