package cla.edg.graph;

public interface Graph <N, E>{
	Node<N, E> setNode(N node) throws Exception;
	Edge<N, E> setEdge(String fromNodeKey, String toNodeKey, E edge) throws Exception;
	
	default String getEdgeKey(String fromNodeId, String toNodeId, String edgeKey) {
		return String.format("%s-[%s]-%s", fromNodeId, edgeKey, toNodeId);
	}
}
