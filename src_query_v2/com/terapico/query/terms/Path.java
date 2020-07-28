package com.terapico.query.terms;

import com.terapico.datatype.BasicType;

import java.util.ArrayList;
import java.util.List;

/**
 * Path: 路径, 由一系列的 PathNode 组成.
 *
 * 第一个节点就是 起点, 最后一个就是终点
 */
public class Path {
    protected List<PathNode> nodeList;

    public List<PathNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<PathNode> nodeList) {
        this.nodeList = nodeList;
    }

    protected PathNode getLastNode() {
        return nodeList.get(nodeList.size() - 1);
    }
    protected PathNode getLastSecondNode() {
        return nodeList.get(nodeList.size() - 2);
    }
    public static Path startFrom(String nodeName) {
        Path path = new Path();
        path.nodeList = new ArrayList<>();
        return path.gotoNode(nodeName);
    }

    public Path gotoNode(String nodeName) {
        PathNode node = new PathNode();
        node.setName(nodeName);
        nodeList.add(node);
        return this;
    }

    public Path leaveThrough(String wayName) {
        PathNode nodeFrom = getLastSecondNode();
        PathNode nodeTo = getLastNode();
        nodeFrom.setLeaveWayName(wayName);
        nodeFrom.setLeaveByMe(true);
        nodeTo.setEnterWayName(wayName);
        nodeTo.setEnterByMe(false);
        return this;
    }
    public Path enterThrough(String wayName) {
        PathNode nodeFrom = getLastSecondNode();
        PathNode nodeTo = getLastNode();
        nodeFrom.setLeaveWayName(wayName);
        nodeFrom.setLeaveByMe(false);
        nodeTo.setEnterWayName(wayName);
        nodeTo.setEnterByMe(true);
        return this;
    }

    public Path withAttribute(BasicType attrType, String attrName) {
        PathNode node = getLastNode();
        Attribute attr = new Attribute();
        attr.setName(attrName);
        attr.setType(attrType);
        node.setAttribute(attr);
        return this;
    }
}
