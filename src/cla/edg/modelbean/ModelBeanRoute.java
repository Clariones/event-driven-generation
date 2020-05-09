package cla.edg.modelbean;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.terapico.generator.Utils;

import cla.edg.routemap.Edge;
import cla.edg.routemap.MeetingPoint;
import cla.edg.routemap.Node;
import cla.edg.routemap.RouteMap;

public class ModelBeanRoute extends RouteMap<BaseModelBean, BeanRelation>{
	protected boolean isBlank(String str) {
		return Utils.isBlank(str);
	}
	
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
		if (!isBlank(point.getAlias())) {
			return;
		}
		String alias = String.format("%sT%d", isBlank(point.getAlias())?"":point.getAlias(),cnt.incrementAndGet());
		point.updatePointAlias(alias);
		for(Edge<BaseModelBean, BeanRelation> edge: point.getEdgesFromMe()) {
			assignAliasToPoint(edge.getToNode(), cnt);
		}
	}

	
	public String getCountOrSumSelectClause(String targetModelType, BaseAttribute sumAttribute) {
		return getSelectClause(targetModelType, sumAttribute, true);
	}
	
	public String getSelectClause(String targetModelType) {
		return getSelectClause(targetModelType, null, false);
	}
	protected String getSelectClause(String targetModelType, BaseAttribute sumAttribute, boolean isCountOrSum) {
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
		if (isCountOrSum) {
			if (sumAttribute == null) {
				sb.append("SELECT COUNT(DISTINCT ").append(targetAlias).append(".id) from ");
			}else {
				if (sumAttribute.getName().equalsIgnoreCase("id")) {
					MeetingPoint<BaseModelBean, BeanRelation> lastMP = sumAttribute.getContainerBean().getBeanRoute().getCurrentMeetingPoint().getEdgesToMe().iterator().next().getFromNode();
					String countByAlias = lastMP.getAlias();
					sb.append("SELECT ").append(countByAlias).append(".").append(sumAttribute.getContainerBean().getName())
							.append(" as id, COUNT(DISTINCT ").append(targetAlias).append(".id) as count from ");
				} else {
					MeetingPoint<BaseModelBean, BeanRelation> mp = sumAttribute.getContainerBean().getLastMeetingPoint();
					if (mp == null) {
						mp = sumAttribute.getContainerBean().getBeanRoute().getCurrentMeetingPoint();
					}
					sb.append("SELECT SUM( ").append(mp.getAlias()).append(".").append(sumAttribute.getName()).append(") from ");
				}
			}
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
