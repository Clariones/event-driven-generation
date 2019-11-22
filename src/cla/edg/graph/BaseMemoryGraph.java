package cla.edg.graph;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseMemoryGraph<N, E> implements Graph<N, E> {
	protected abstract Node<N, E> saveNode(String key, N node) throws Exception;
	protected abstract Edge<N, E> saveEdge(String key, E edge, String fromNodeKey, String toNodeKey) throws Exception;
	protected abstract Node<N, E> getNode(String nodeKey);
	protected abstract void saveNode(Node<N, E> node) throws Exception;
		
	
	@Override
	public Node<N, E> setNode(N node) throws Exception {
		String key = getKey(node);
		return saveNode(key, node);
	}
	
	protected String getKey(Object data) throws Exception {
		try {
			if (data == null) {
				return "NULL";
			}
			if (data instanceof String) {
				return String.valueOf(data).trim();
			}
			if (data instanceof Number) {
				return String.valueOf(data).trim();
			}
			Method m = data.getClass().getMethod("getId");
			if (m != null) {
				return String.valueOf(m.invoke(data)).trim();
			}
			m = data.getClass().getMethod("getKey");
			if (m != null) {
				return String.valueOf(m.invoke(data)).trim();
			}
			return String.valueOf(data.hashCode());
		} catch (Exception e) {
			throw new Exception("获取Key失败:" + data.getClass().getSimpleName(), e);
		}
	}

	@Override
	public Edge<N, E> setEdge(String fromNodeKey, String toNodeKey, E edge) throws Exception {
		String key = getEdgeKey(fromNodeKey, toNodeKey, getKey(edge));
		Edge<N, E> existed = saveEdge(key, edge, fromNodeKey, toNodeKey);
		onEdgeFromNodeCreated(fromNodeKey, key);
		onEdgeToNodeCreated(toNodeKey, key);
		return existed;
	}
	
	protected void onEdgeToNodeCreated(String nodeKey, String edgeKey) throws Exception {
		Node<N, E> node = getNode(nodeKey);
		node.getEdgesToMe().add(edgeKey);
		saveNode(node);
	}
	protected void onEdgeFromNodeCreated(String nodeKey, String edgeKey) throws Exception {
		Node<N, E> node = getNode(nodeKey);
		node.getEdgesFromMe().add(edgeKey);
		saveNode(node);
	}

}
