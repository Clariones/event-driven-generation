package cla.edg.graphquery.terms;

import java.util.List;

public class PathInfoV2 {
	protected NodeInPathV2 fromNode;
	protected NodeInPathV2 toNode;
	protected BasePathInfo edge;
	public NodeInPathV2 getFromNode() {
		return fromNode;
	}
	public void setFromNode(NodeInPathV2 fromNode) {
		this.fromNode = fromNode;
	}
	public NodeInPathV2 getToNode() {
		return toNode;
	}
	public void setToNode(NodeInPathV2 toNode) {
		this.toNode = toNode;
	}
	public BasePathInfo getEdge() {
		return edge;
	}
	public void setEdge(BasePathInfo edge) {
		this.edge = edge;
	}
	@Override
	public String toString() {
		return "PathInfoV2 (from [" + fromNode.getNodeType() + "] to [" + toNode.getNodeType() + "] by edge " + edge.getEdgeName() + ")";
	}
	
	
}
