package cla.edg.graph;

public class Edge<N, E> {
	protected E edgeData;
	protected String fromNodeKey;
	protected String toNodeKey;
	protected String edgeKey;
	protected String edgeDataKey;

	public E getEdgeData() {
		return edgeData;
	}
	public void setEdgeData(E edgeData) {
		this.edgeData = edgeData;
	}
	public String getFromNodeKey() {
		return fromNodeKey;
	}
	public void setFromNodeKey(String fromNodeKey) {
		this.fromNodeKey = fromNodeKey;
	}
	public String getToNodeKey() {
		return toNodeKey;
	}
	public void setToNodeKey(String toNodeKey) {
		this.toNodeKey = toNodeKey;
	}
	public String getEdgeKey() {
		return edgeKey;
	}
	public void setEdgeKey(String edgeKey) {
		this.edgeKey = edgeKey;
	}
	public String getEdgeDataKey() {
		return edgeDataKey;
	}
	public void setEdgeDataKey(String edgeDataKey) {
		this.edgeDataKey = edgeDataKey;
	}
	
}
