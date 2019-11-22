package cla.edg.routemap;

import java.util.HashSet;
import java.util.Set;

public class MeetingPoint<N,E> {
	protected String alias;
	protected String nodeKey;
	protected transient Set<Edge<N,E>> edgesToMe = new HashSet<>();
	protected Set<Edge<N,E>> edgesFromMe = new HashSet<>();
	protected Set<MeetingPoint<N,E>> mirrorPoints = new HashSet<>();
	protected String hashCodeStr;
	
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getNodeKey() {
		return nodeKey;
	}
	public void setNodeKey(String nodeKey) {
		this.nodeKey = nodeKey;
	}
	public Set<Edge<N, E>> getEdgesToMe() {
		return edgesToMe;
	}
	public void setEdgesToMe(Set<Edge<N, E>> edgesToMe) {
		this.edgesToMe = edgesToMe;
	}
	public Set<Edge<N, E>> getEdgesFromMe() {
		return edgesFromMe;
	}
	public void setEdgesFromMe(Set<Edge<N, E>> edgesFromMe) {
		this.edgesFromMe = edgesFromMe;
	}
	public Set<MeetingPoint<N, E>> getMirrorPoints() {
		return mirrorPoints;
	}
	public void setMirrorPoints(Set<MeetingPoint<N, E>> mirrorPoints) {
		this.mirrorPoints = mirrorPoints;
	}
	public void addEdgeFromMe(Edge<N, E> edge) {
		edgesFromMe.add(edge);
	}
	public void addEdgeToMe(Edge<N, E> edge) {
		edgesToMe.add(edge);
	}
	
	
	// ///////////////////////////////////////////////////////////////////////////////////////
	
	public MeetingPoint() {
		super();
		hashCodeStr = "MP-" + this.hashCode();
		// TODO Auto-generated constructor stub
	}
	/** 是否存在已经存在的, 起点为 this 的边. <p/>
	 *  判断规则是这样:
	 *  1. 首先 edge 的key 是一样的;
	 *  2. 其次 toNode 的可以是一眼的;
	 * @return
	 */
	public Edge<N, E> findSameEdgeFromMe(String edgeKey, String nodeKey) {
		if (getEdgesFromMe().isEmpty()) {
			return null;
		}
		for(Edge<N, E> curEdge: getEdgesFromMe()) {
			if (!curEdge.getKey().equals(edgeKey)) {
				continue;
			}
			if (curEdge.getToNode().getNodeKey().equals(nodeKey)) {
				return curEdge;
			}
		}
		return null;
	}
	/**
	 * 本meeting point是目标point的真子集. (所有路径都在目标point中)
	 * @param point
	 * @return
	 */
	public boolean isInsidePoint(MeetingPoint<N, E> point) {
		for(Edge<N, E> edge: this.getEdgesFromMe()) {
			String edgeKey = edge.getKey();
			String nodeKey = edge.getToNode().getNodeKey();
			if (point.findSameEdgeFromMe(edgeKey, nodeKey) == null) {
				return false;
			}
		}
		return true;
	}
	
	public void updatePointAlias(String alias) {
		this.setAlias(alias);
		for(MeetingPoint<N, E> p:this.getMirrorPoints()) {
			p.updatePointAlias(alias);
		}
	}
	
	
}
