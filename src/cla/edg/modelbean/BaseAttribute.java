package cla.edg.modelbean;

import cla.edg.modelbean.LogicalOperator.Operator;

public class BaseAttribute {
	protected String name;
	protected boolean parentDirection;
	protected String modelTypeName;
	protected BaseModelBean containerBean;
	
	public BaseModelBean getContainerBean() {
		return containerBean;
	}
	public void setContainerBean(BaseModelBean containerBean) {
		this.containerBean = containerBean;
	}
	public String getModelTypeName() {
		return modelTypeName;
	}
	public void setModelTypeName(String modelTypeName) {
		this.modelTypeName = modelTypeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isParentDirection() {
		return parentDirection;
	}
	public void setParentDirection(boolean parentDirection) {
		this.parentDirection = parentDirection;
	}
	
	public LogicalOperator eq(Object o) {
		return LogicalOperator.create(Operator.eq, this, o);
	}
	public LogicalOperator not(Object o) {
		return LogicalOperator.create(Operator.not, this, o);
	}
	public LogicalOperator in(Object ... o) {
		return LogicalOperator.create(Operator.in, this, o);
	}
	public LogicalOperator not_in(Object ... o) {
		return LogicalOperator.create(Operator.not_in, this, o);
	}
	public LogicalOperator less(Object o) {
		return LogicalOperator.create(Operator.less, this, o);
	}
	public LogicalOperator less_or_eq(Object o) {
		return LogicalOperator.create(Operator.less_or_eq, this, o);
	}
	public LogicalOperator bigger(Object o) {
		return LogicalOperator.create(Operator.bigger, this, o);
	}
	public LogicalOperator bigger_or_eq(Object o) {
		return LogicalOperator.create(Operator.bigger_or_eq, this, o);
	}
}
