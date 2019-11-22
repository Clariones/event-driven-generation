package cla.edg.routemap;

public class Edge<N, E> {
	protected transient E data;
	protected String key;
	protected transient MeetingPoint<N,E> fromNode;
	protected MeetingPoint<N,E> toNode;
	
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public MeetingPoint<N, E> getFromNode() {
		return fromNode;
	}
	public void setFromNode(MeetingPoint<N, E> fromNode) {
		this.fromNode = fromNode;
	}
	public MeetingPoint<N, E> getToNode() {
		return toNode;
	}
	public void setToNode(MeetingPoint<N, E> toNode) {
		this.toNode = toNode;
	}
	
	// ////////////////////////////////////////////////////////////////////////////////////////////
	public static <N,E> Edge<N, E> create(E edgeData) {
		Edge<N, E> edge = new Edge<>();
		edge.setData(edgeData);
		edge.setKey(RouteUtil.getKey(edgeData));
		return edge;
	}
	
	
}
