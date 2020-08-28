package cla.edg.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryGraph<N, E> extends BaseMemoryGraph<N, E> {
	protected Map<String, Node<N,E>> allNodes = new HashMap<>();
	protected Map<String, Edge<N,E>> allEdges = new HashMap<>();
	protected List<Step<N,E>> allPaths = new ArrayList<>();
	
	@Override
	protected Node<N, E> saveNode(String key, N node) {
		Node<N, E> existedNode = allNodes.get(key);
		if (existedNode != null) {
			existedNode.setNodeData(node);
			return existedNode;
		}
		
		existedNode = new Node<N,E>();
		existedNode.setNodeData(node);
		existedNode.setNodeDataKey(key);
		allNodes.put(key, existedNode);
		return existedNode;
	}
	
	@Override
	protected Edge<N, E> saveEdge(String key, E edge, String fromNodeKey, String toNodeKey) throws Exception {
		Edge<N, E> existed = allEdges.get(key);
		if (existed != null) {
			existed.setEdgeData(edge);
			return existed;
		}
		existed = new Edge<N,E>();
		existed.setEdgeData(edge);
		existed.setFromNodeKey(fromNodeKey);
		existed.setToNodeKey(toNodeKey);
		existed.setEdgeDataKey(getKey(edge));
		existed.setEdgeKey(key);
		allEdges.put(key, existed);
		return existed;
	}

	public Edge<N, E> getEdge(String fromNodeKey, String toNodeKey, String edgeKey) {
		String key = getEdgeKey(fromNodeKey, toNodeKey, edgeKey);
		return allEdges.get(key);
	}
	
	protected Node<N, E> getNode(String nodeKey) {
		return allNodes.get(nodeKey);
	}

	@Override
	protected void saveNode(Node<N, E> node) throws Exception {
		// in memory, 所以什么也不做
	}

	public Step<N, E> addPath(Step<N,E> curStep, N fromNode, E edge, N toNode) throws Exception {
		Node<N, E> n1 = setNode(fromNode);
		Node<N, E> n2 = setNode(toNode);
		Edge<N, E> e = setEdge(n1.getNodeDataKey(), n2.getNodeDataKey(), edge);
		
		Step<N,E> newStep = new Step<N,E>();
		newStep.setPreviousStep(curStep);
		newStep.setWalkedEdge(e);
		if (curStep != null) {
			curStep.addContinuedStep(newStep);
		}else {
			allPaths.add(newStep);
		}
		return newStep;
	}
}
