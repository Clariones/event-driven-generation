package cla.edg.graph;

import java.util.HashSet;
import java.util.Set;

public class Node<N, E> {
	protected N nodeData;
	protected String nodeDataKey;
	protected Set<String> edgesFromMe = new HashSet<>();
	protected Set<String> edgesToMe = new HashSet<>();
	
	public N getNodeData() {
		return nodeData;
	}

	public void setNodeData(N nodeData) {
		this.nodeData = nodeData;
	}

	public Set<String> getEdgesFromMe() {
		return edgesFromMe;
	}

	public void setEdgesFromMe(Set<String> edgesFromMe) {
		this.edgesFromMe = edgesFromMe;
	}

	public Set<String> getEdgesToMe() {
		return edgesToMe;
	}

	public void setEdgesToMe(Set<String> edgesToMe) {
		this.edgesToMe = edgesToMe;
	}

	public String getNodeDataKey() {
		return nodeDataKey;
	}

	public void setNodeDataKey(String nodeDataKey) {
		this.nodeDataKey = nodeDataKey;
	}
	
}
