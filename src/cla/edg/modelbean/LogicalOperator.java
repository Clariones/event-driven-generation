package cla.edg.modelbean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import cla.edg.Utils;
import cla.edg.routemap.MeetingPoint;
import cla.edg.routemap.Node;
import cla.edg.routemap.RouteMap;

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
	protected ModelBeanRoute beanRoute;
	
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
		ModelBeanRoute mergedBeanRoute = (ModelBeanRoute) beanRoute1.mergeWith(beanRoute2);
		operand1.setBeanRoute(mergedBeanRoute);
	}
	public void setBeanRoute(ModelBeanRoute beanRoute) {
		if (op1 instanceof BaseModelBean) {
			((BaseModelBean) op1).setBeanRoute(beanRoute);
			return;
		}
		if (op1 instanceof BaseAttribute) {
			((BaseAttribute) op1).getContainerBean().setBeanRoute(beanRoute);
			return;
		}
		// 目前应该就是这样,不然就要仔细想想
		exception("逻辑运算更新bean route超出预期");
	}
	
	public ModelBeanRoute getBeanRoute() {
//		if (op1 instanceof BaseModelBean) {
//			return ((BaseModelBean) op1).getBeanRoute();
//		}
//		if (op1 instanceof BaseAttribute) {
//			return ((BaseAttribute) op1).getContainerBean().getBeanRoute();
//		}
		return beanRoute;
		// 目前应该就是这样,不然就要仔细想想
		// exception("逻辑运算获取bean route超出预期");
		// return null;
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
		
		result.beanRoute = updateNodeRoute(op1, opr);
		if (result.beanRoute == null) {
			throw new RuntimeException("指定条件时,必须指明条件相关的节点路径");
		}
		MeetingPoint<BaseModelBean, BeanRelation> point = result.beanRoute.getCurrentMeetingPoint();
		result.setDelareAtPoint(point);
		
		ModelBeanRoute br2 = updateNodeRoute(op2, opr);
		if(br2 != null) {
			result.beanRoute = (ModelBeanRoute) result.beanRoute.mergeWith(br2);
		}
		
		return result;
	}
	
	protected static ModelBeanRoute updateNodeRoute(Object operand, Operator opr) {
		MeetingPoint<BaseModelBean, BeanRelation> point = null;
		if (operand instanceof BaseModelBean) {
			ModelBeanRoute beanRoute = ((BaseModelBean) operand).getBeanRoute();
			if (beanRoute == null || beanRoute.getCurrentMeetingPoint() == null) {
				throw new RuntimeException("你直接指定了 MODEL.XXX()."+opr+"(). 无法通过关联关系或者属性推断你需要的字段, 您是不是想写: MODEL.XXX().id()."+opr+"()?");
			}
			return beanRoute;
		}
		if (operand instanceof BaseAttribute) {
			return  ((BaseAttribute) operand).getContainerBean().getBeanRoute();
		}
		return null;
	}
	public boolean hasMore() {
		if(this.getOperations() == null || this.getOperations().isEmpty()) {
			return false;
		}
		return true;
	}
	
}
