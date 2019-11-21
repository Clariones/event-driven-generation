package cla.edg.routemap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.BeanRelation;
import cla.edg.modelbean.ModelBeanRoute;

public class RouteMap <N,E>{
	protected Map<String, Node<N,E>> allNodes = new HashMap<>();
	protected transient Map<String, LinkedList<Edge<N,E>>> allEdges = new HashMap<>();
	protected Node<N,E> startNode = null;
	protected transient MeetingPoint<N,E> currentMeetingPoint = null;
	public Map<String, Node<N, E>> getAllNodes() {
		return allNodes;
	}
	public void setAllNodes(Map<String, Node<N, E>> allNodes) {
		this.allNodes = allNodes;
	}
	public Map<String, LinkedList<Edge<N, E>>> getAllEdges() {
		return allEdges;
	}
	public void setAllEdges(Map<String, LinkedList<Edge<N, E>>> allEdges) {
		this.allEdges = allEdges;
	}
	public Node<N, E> getStartNode() {
		return startNode;
	}
	public void setStartNode(Node<N, E> startNode) {
		this.startNode = startNode;
	}
	public MeetingPoint<N, E> getCurrentMeetingPoint() {
		return currentMeetingPoint;
	}
	public void setCurrentMeetingPoint(MeetingPoint<N, E> currentMeetingPoint) {
		this.currentMeetingPoint = currentMeetingPoint;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////
	public MeetingPoint<N, E> addNode(N nodeData) {
		// 仅用于起点
		if(startNode != null) {
			exception("只有起点可以单独添加,其他必须用路径添加");
		}
		startNode = createNode(nodeData);
		{
			// 创建交汇点
			currentMeetingPoint = createMeetingPoint(startNode);
			return currentMeetingPoint;
		}
	}
	
	public MeetingPoint<N, E> appendNode(E edgeData, N nodeData) {
		// 在已经有节点的情况下,添加新'路径'(路径=edge+node. 起点为当前 meetingPoint)
		if (currentMeetingPoint == null) {
			exception("起点还没有添加,路径没有起点");
		}
		String newNodeKey = RouteUtil.getKey(nodeData);
		Node<N, E> node = this.getNodeByKey(newNodeKey);
		if (node == null) {
			node = createNode(nodeData);
		}
		// 查看起点
		Edge<N, E> edge = createEdge(edgeData);
		edge.setFromNode(currentMeetingPoint);
		// 为新node查找或者创建新meeting point
		Edge<N, E> existedEdge = currentMeetingPoint.findSameEdgeFromMe(edge.getKey(), newNodeKey);
		if (existedEdge != null) {
			// 是一条重复的edge, 什么也不用做
			currentMeetingPoint = existedEdge.getToNode();
			return currentMeetingPoint;
		}
		// 是一条新路径
		{
			// 创建交汇点
			MeetingPoint<N,E> point = createMeetingPoint(node);
			edge.setFromNode(currentMeetingPoint);
			edge.setToNode(point);
			
			currentMeetingPoint.getEdgesFromMe().add(edge);
			point.getEdgesToMe().add(edge);
			
			currentMeetingPoint = point;
			return currentMeetingPoint;
		}
	}
	
	/**
	 * 先找到合并的入口点, 然后重放所有路径
	 * @param anotherRoute
	 * @return 
	 */
	public RouteMap<N, E> mergeWith(RouteMap <N,E> anotherRoute) {
		MeetingPoint<N, E> point = findMergerPoint(this, anotherRoute);
		RouteMap <N,E> tgtBeanRoute = null;
		RouteMap <N,E> additonalBeanRoute = null;
		if (point == null) {
			point = findMergerPoint(anotherRoute, this);
			tgtBeanRoute = anotherRoute;
			additonalBeanRoute = this;
		}else {
			tgtBeanRoute = this;
			additonalBeanRoute = anotherRoute;
		}
		
		if (point == null) {
			exception("合并的时候,找不到可以结合的点");
		}
		
		mergeBeanRoute(additonalBeanRoute, point, tgtBeanRoute);
		return tgtBeanRoute;
	}
	
	/** 移除一个交汇点 */
	public void removeMeetPoint(MeetingPoint<N, E> point) {
		Node<N, E> node = this.getNodeByKey(point.getNodeKey());
		if (node == null) {
			exception("要移除的节点"+point.getNodeKey()+"不存在");
		}
		if (!point.getEdgesFromMe().isEmpty()) {
			for(Edge<N, E> edge : point.getEdgesFromMe()) {
				removeMeetPoint(edge.getToNode());
				removeEdgeEdge(edge);
			}
		}
		if (!point.getEdgesToMe().isEmpty()) {
			for(Edge<N, E> edge: point.getEdgesToMe()) {
				MeetingPoint<N, E> fromPoint = edge.getFromNode();
				fromPoint.getEdgesFromMe().remove(edge);
			}
		}
		node.getMeetingPointList().remove(point);
		if (node.getMeetingPointList().isEmpty()) {
			allNodes.remove(point.getNodeKey());
		}
	}
	
	private void removeEdgeEdge(Edge<N, E> edge) {
		// 目前edge没统一记录,移除了节点就移除了edge
	}
	private void mergeBeanRoute(RouteMap<N, E> additonalBeanRoute, MeetingPoint<N, E> startPoint,
			RouteMap<N, E> tgtBeanRoute) {
		tgtBeanRoute.setCurrentMeetingPoint(startPoint);
		MeetingPoint<N, E> p1 = additonalBeanRoute.getStartNode().getMeetingPointList().get(0);
		mergeMeetingPoint(startPoint, p1);
		if (p1.getEdgesFromMe() == null || p1.getEdgesFromMe().isEmpty()) {
			return;
		}
		for(Edge<N, E> edge: p1.getEdgesFromMe()) {
			replayPath(tgtBeanRoute, additonalBeanRoute, startPoint, edge);
		}
	}
	private void replayPath(RouteMap<N, E> tgtBeanRoute, RouteMap<N, E> additonalBeanRoute, MeetingPoint<N, E> startPoint, Edge<N, E> edge) {
		tgtBeanRoute.setCurrentMeetingPoint(startPoint);
		MeetingPoint<N, E> toNode = edge.getToNode();
		E edgeData = edge.getData();
		N nodeData = additonalBeanRoute.getNodeByKey(toNode.getNodeKey()).getData();
		MeetingPoint<N, E> curPoint = tgtBeanRoute.appendNode(edgeData, nodeData);
		curPoint.getMirrorPoints().add(toNode);
		
		if (toNode.getEdgesFromMe() == null || toNode.getEdgesFromMe().isEmpty()) {
			return;
		}
		for(Edge<N, E> nextEdge: toNode.getEdgesFromMe()) {
			replayPath(tgtBeanRoute, additonalBeanRoute, curPoint, nextEdge);
		}
	}
	private void mergeMeetingPoint(MeetingPoint<N, E> startPoint, MeetingPoint<N, E> p1) {
		startPoint.getMirrorPoints().add(p1);
	}
	private MeetingPoint<N,E> findMergerPoint(RouteMap<N, E> nodeRoute, RouteMap<N, E> anotherRoute) {
		Node<N, E> startNode1 = nodeRoute.getStartNode();
		Node<N, E> startNode2 = anotherRoute.getStartNode();
		if (startNode1 == null || startNode2 == null) {
			exception("合并的时候,有一个没有起点,超出预期");
		}
		Node<N, E> nodeIn1 = nodeRoute.getNodeByKey(startNode2.getKey());
		if (nodeIn1 == null) {
			// 2的起点,在1里没有,就不能合并了. 我们要把2合到1里.
			return null;
		}
		// 还要找是哪个meeting point
		if (startNode2.getMeetingPointList().size() != 1) {
			exception("合并的时候,起点的meeting point超过1个,超出预期");
		}
		if (nodeIn1.getMeetingPointList().size() == 1) {
			return nodeIn1.getMeetingPointList().get(0);
		}
		MeetingPoint<N, E> startPoint2 = startNode2.getMeetingPointList().get(0);
		for (MeetingPoint<N, E> point: nodeIn1.getMeetingPointList()) {
			if (startPoint2.isInsidePoint(point)) {
				// 完全落在节点内,直接判定可以从这个节点开始merge
				return point;
			}
		}
		// 没有完全匹配的点
		exception("合并的时候,没找到可以开始merge的点,超出预期");
		return null;
	}
	
	protected MeetingPoint<N,E> createMeetingPoint(Node<N,E> node) {
		MeetingPoint<N,E> point = new MeetingPoint<>();
		point.setEdgesFromMe(new HashSet<>());
		point.setEdgesToMe(new HashSet<>());
		point.setMirrorPoints(new HashSet<>());
		point.setNodeKey(node.getKey());
		
		node.addMeetingPoint(point);
		
		return point;
	}
	protected Edge<N, E> createEdge(E edgeData) {
		Edge<N,E> edge = Edge.create(edgeData);
		return edge;
	}
	protected Node<N,E> getNodeByKey(String key) {
		return allNodes.get(key);
	}
	protected Node<N, E> createNode(N nodeData) {
		Node<N, E> node = Node.create(nodeData);
		allNodes.put(node.getKey(), node);
		return node;
	}
	protected void exception(String string) {
		throw new RuntimeException("出错了:"+string);
	}
	
}
