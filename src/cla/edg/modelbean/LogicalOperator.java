package cla.edg.modelbean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import cla.edg.Utils;
import cla.edg.noderoute.MeetingPoint;
import cla.edg.noderoute.Node;
import cla.edg.noderoute.NodeRoute;

public class LogicalOperator {
	public static Set<String> needKnownClasses = new HashSet<>();
	public enum Operator {
		eq,not,less_or_eq,bigger_or_eq,less,bigger,in,not_in,is_null,not_null
	}
	public enum CollectionType {
		and, or
	}
	
	
	protected CollectionType collectionType = CollectionType.and;
	protected List<LogicalOperator> operations = new ArrayList<>();
	protected MeetingPoint<BaseModelBean, BeanRelation> delareAtPoint;
	
	public MeetingPoint<BaseModelBean, BeanRelation> getDelareAtPoint() {
		return delareAtPoint;
	}
	public void setDelareAtPoint(MeetingPoint<BaseModelBean, BeanRelation> delareAtPoint) {
		this.delareAtPoint = delareAtPoint;
	}
	public CollectionType getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(CollectionType collectionType) {
		this.collectionType = collectionType;
	}
	public List<LogicalOperator> getOperations() {
		return operations;
	}
	public void setOperations(List<LogicalOperator> operations) {
		this.operations = operations;
	}
	
	protected Operator operator;
	protected Object op1;
	protected Object op2;
	
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Object getOp1() {
		return op1;
	}
	public void setOp1(Object op1) {
		this.op1 = op1;
	}
	public Object getOp2() {
		return op2;
	}
	public void setOp2(Object op2) {
		this.op2 = op2;
	}
	public LogicalOperator and (LogicalOperator ... operations) {
		this.setCollectionType(CollectionType.and);
		getOperations().addAll(Arrays.asList(operations));
		for(LogicalOperator op : operations) {
			mergeNodeRoute(this, op);
		}
		return this;
	}
//	private void mergeRouteMap(LogicalOperator op1, LogicalOperator op2) {
//		RouteMap<BaseModelBean, BeanRelation> rm1 = op1.getRouteMap();
//		RouteMap<BaseModelBean, BeanRelation> rm2 = op2.getRouteMap();
//		if(rm1 == null || rm2 == null) {
//			return;
//		}
//		try {
//			rm1.merge(rm2);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		}
//	}
//	public RouteMap<BaseModelBean, BeanRelation> getRouteMap() {
//		if (op1 instanceof BaseModelBean) {
//			return ((BaseModelBean) op1).getRouteMap();
//		}
//		if (op1 instanceof BaseAttribute) {
//			return ((BaseAttribute) op1).getContainerBean().getRouteMap();
//		}
//		if (op2 instanceof BaseModelBean) {
//			return ((BaseModelBean) op2).getRouteMap();
//		}
//		if (op2 instanceof BaseAttribute) {
//			return ((BaseAttribute) op2).getContainerBean().getRouteMap();
//		}
//		return null;
//	}
	public LogicalOperator or (LogicalOperator ... operations) {
		this.setCollectionType(CollectionType.or);
		getOperations().addAll(Arrays.asList(operations));
		for(LogicalOperator op : operations) {
			mergeNodeRoute(this, op);
		}
		return this;
	}
	
	// 把两个操作数的路径合并一下. 这个和where条件无关,纯粹的收集数据而已
	// 先找到合并的起点
	private void mergeNodeRoute(LogicalOperator operand1, LogicalOperator operand2) {
		ModelBeanRoute beanRoute1 = operand1.getBeanRoute();
		ModelBeanRoute beanRoute2 = operand2.getBeanRoute();
		beanRoute1.mergeFrom(beanRoute2);
	}
	
	public ModelBeanRoute getBeanRoute() {
		if (op1 instanceof BaseModelBean) {
			return ((BaseModelBean) op1).getBeanRoute();
		}
		if (op1 instanceof BaseAttribute) {
			return ((BaseAttribute) op1).getContainerBean().getBeanRoute();
		}
		// 目前应该就是这样,不然就要仔细想想
		exception("逻辑运算获取bean route超出预期");
		return null;
	}
	
	private void exception(String message) {
		throw new RuntimeException(message);
	}
	public static LogicalOperator create(Operator opr, Object op1, Object op2) {
		LogicalOperator result = new LogicalOperator();
		result.setOp1(op1);
		result.setOp2(op2);
		result.setOperator(opr);
		
		List<Object> listOp2 = Utils.convertToList(op2);
		listOp2.forEach(data -> {
			if (data instanceof EnumAttribute) {
				needKnownClasses.add(((EnumAttribute) data).getClassName());
			}
		});
		
		MeetingPoint<BaseModelBean, BeanRelation> point = updateNodeRoute(op1);
		if (point != null) {
			result.setDelareAtPoint(point);
		}
		updateNodeRoute(op2);
//		BaseModelBean fromBean = null;
//		BaseModelBean toBean = null;
//		if (op1 instanceof BaseModelBean) {
//			fromBean = (BaseModelBean) op1;
//		}else if (op1 instanceof BaseAttribute) {
//			fromBean = ((BaseAttribute) op1).getContainerBean();
//		}
//		if (op2 instanceof BaseModelBean) {
//			toBean = (BaseModelBean) op2;
//		}else if (op2 instanceof BaseAttribute) {
//			toBean = ((BaseAttribute) op2).getContainerBean();
//		}
//		if (fromBean != null && toBean != null) {
//			try {
//				fromBean.getRouteMap().merge(toBean.getRouteMap());
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new RuntimeException(e);
//			}
//			toBean.setRouteMap(fromBean.getRouteMap());
//		}
		
		return result;
	}
	
	protected static MeetingPoint<BaseModelBean, BeanRelation> updateNodeRoute(Object operand) {
		MeetingPoint<BaseModelBean, BeanRelation> point = null;
		if (operand instanceof BaseModelBean) {
			point = ((BaseModelBean) operand).getBeanRoute().getCurrentMeetingPoint().getEdgesToMe().iterator().next().getFromNode();
		}
		if (operand instanceof BaseAttribute) {
			point = ((BaseAttribute) operand).getContainerBean().getBeanRoute().getCurrentMeetingPoint();
		}
		return point;
	}
	public boolean hasMore() {
		if(this.getOperations() == null || this.getOperations().isEmpty()) {
			return false;
		}
		return true;
	}
	
}
