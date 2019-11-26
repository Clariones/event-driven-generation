package cla.edg.modelbean;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import cla.edg.routemap.Edge;
import cla.edg.routemap.MeetingPoint;
import cla.edg.routemap.Node;
import cla.edg.routemap.RouteMap;

public class ModelBeanRoute extends RouteMap<BaseModelBean, BeanRelation>{
	protected String targetModelAlias;
	public String getTargetModelAlias() {
		return targetModelAlias;
	}
	public void setTargetModelAlias(String targetModelAlias) {
		this.targetModelAlias = targetModelAlias;
	}

	public void assignAlias() {
		AtomicInteger cnt = new AtomicInteger(0);
		for(MeetingPoint<BaseModelBean, BeanRelation> point: getStartNode().getMeetingPointList()) {
			assignAliasToPoint(point, cnt);
		}
	}

	private void assignAliasToPoint(MeetingPoint<BaseModelBean, BeanRelation> point, AtomicInteger cnt) {
//		if (point.getAlias() != null) {
//			return;
//		}
		String alias = String.format("%sT%d", point.getAlias()==null?"":point.getAlias(),cnt.incrementAndGet());
		point.updatePointAlias(alias);
		for(Edge<BaseModelBean, BeanRelation> edge: point.getEdgesFromMe()) {
			assignAliasToPoint(edge.getToNode(), cnt);
		}
	}

	public String getCountSelectClause(String targetModelType) {
		return getSelectClause(targetModelType, true);
	}
	
	public String getSelectClause(String targetModelType) {
		return getSelectClause(targetModelType, false);
	}
	protected String getSelectClause(String targetModelType, boolean isCount) {
		Node<BaseModelBean, BeanRelation> node = this.getNodeByKey(targetModelType);
		if (node == null) {
			exception("目标模型"+targetModelType+"没有在bean route中");
		}
		if(node.getMeetingPointList().size() > 1) {
			exception("目标模型"+targetModelType+"有多个交汇点,不能作为select的目标");
		}
		MeetingPoint<BaseModelBean, BeanRelation> startPoint = node.getMeetingPointList().get(0);
		String targetAlias = startPoint.getAlias();
		setTargetModelAlias(targetAlias);
		
		startPoint = this.getStartNode().getMeetingPointList().get(0);
		StringBuilder sb = new StringBuilder();
		if (isCount) {
			sb.append("SELECT COUNT(DISTINCT ").append(targetAlias).append(".id) from ");
		}else {
			sb.append("SELECT DISTINCT ").append(targetAlias).append(".* from ");
		}
		if (this.getAllNodes().size() == 1) {
			sb.append(targetModelType).append("_data ").append(targetAlias).append(" \r\n");
			return sb.toString();
		}
		sb.append(startPoint.getNodeKey()).append("_data ").append(startPoint.getAlias()).append(" ");
		for(Edge<BaseModelBean, BeanRelation> edge: startPoint.getEdgesFromMe()) {
			appendJoinClause(sb, startPoint, edge);
		}
		return sb.toString();
	}

	private void appendJoinClause(StringBuilder sb, MeetingPoint<BaseModelBean, BeanRelation> point,
			Edge<BaseModelBean, BeanRelation> edge) {
		MeetingPoint<BaseModelBean, BeanRelation> toNode = edge.getToNode();
		sb.append("\r\n        LEFT JOIN ").append(toNode.getNodeKey()).append("_data ").append(toNode.getAlias()).append(" ON ");
		if (edge.getData().isForwardReference()) {
			sb.append(point.getAlias()).append(".").append(edge.getData().getReferFieldName()).append(" = ")
			.append(toNode.getAlias()).append(".id ");
		}else {
			sb.append(toNode.getAlias()).append(".").append(edge.getData().getReferFieldName()).append(" = ")
			.append(point.getAlias()).append(".id ");
		}
		if (toNode.getEdgesFromMe().isEmpty()) {
			return;
		}
		for(Edge<BaseModelBean, BeanRelation> nextEdge : toNode.getEdgesFromMe()) {
			appendJoinClause(sb, toNode, nextEdge);
		}
	}
	
	
	

	

	

	

}
