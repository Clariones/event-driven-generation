package cla.edg.modelbean;

import java.util.ArrayList;
import java.util.List;

import cla.edg.modelbean.LogicalOperator.Operator;

public abstract class BaseModelBean {
	// 接口声明
	public abstract String getFullClassName();
	public abstract StringAttribute id();
	
	///////////////////////////////////////////////////////////////////////////
	protected String name;
	protected boolean referDirection;
	protected String modelTypeName;
	protected transient List<CorperationPathNode> corperatedPath;
	protected transient BaseModelBean previousBean;
	protected ModelBeanAdditionalData additonalData = new ModelBeanAdditionalData();
	
	public ModelBeanAdditionalData getAdditonalData() {
		return additonalData;
	}
	public void setAdditonalData(ModelBeanAdditionalData additonalData) {
		this.additonalData = additonalData;
	}
	public BaseModelBean getPreviousBean() {
		return previousBean;
	}
	public void setPreviousBean(BaseModelBean previousBean) {
		this.previousBean = previousBean;
	}
	public List<CorperationPathNode> getCorperatedPath() {
		return corperatedPath;
	}
	public void setCorperatedPath(List<CorperationPathNode> corperatedPath) {
		this.corperatedPath = corperatedPath;
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
	public boolean isReferDirection() {
		return referDirection;
	}
	public void setReferDirection(boolean referDirection) {
		this.referDirection = referDirection;
	}

	
	
	
	public LogicalOperator eq(Object o) {
		return LogicalOperator.create(Operator.eq, this, o);
	}
	public LogicalOperator not(Object o) {
		return LogicalOperator.create(Operator.not, this, o);
	}
	public LogicalOperator is_null() {
		return LogicalOperator.create(Operator.is_null, this, null);
	}
	public LogicalOperator not_null() {
		return LogicalOperator.create(Operator.not_null, this, null);
	}
	public LogicalOperator less_or_eq(Object o) {
		return LogicalOperator.create(Operator.less_or_eq, this, o);
	}
	public LogicalOperator bigger_or_eq(Object o) {
		return LogicalOperator.create(Operator.bigger_or_eq, this, o);
	}
	public LogicalOperator less_than(Object o) {
		return LogicalOperator.create(Operator.less, this, o);
	}
	public LogicalOperator bigger_than(Object o) {
		return LogicalOperator.create(Operator.bigger, this, o);
	}
	public LogicalOperator in(Object o) {
		return LogicalOperator.create(Operator.in, this, o);
	}
	public LogicalOperator not_in(Object o) {
		return LogicalOperator.create(Operator.not_in, this, o);
	}
	
	/**
	 * 说明:
	 * 每个path上的所有bean都共享一个 corperatedPath. 所以它需要在append的过程中人工组装. 而不是自动的'有则用之,无则建之'.
	 * 前提: 每次append后,'当前'节点一定是新加入的节点;
	 * 算法: 当前节点理应持有'corperatedPath',如果没有,说明它是头结点,它负责创建. 而后,负责将它传递下去.
	 */
	public void append(BaseModelBean bean) {
		// 传递 corperatedPath 
		List<CorperationPathNode> ourPath = getCorperatedPath();
		if (ourPath == null) {
			ourPath = new ArrayList<>();
			this.setCorperatedPath(ourPath);
		}
		bean.setCorperatedPath(ourPath);
		bean.setPreviousBean(this);
		// 添加路径
		updateCorperatedPath(ourPath, this, bean);
	}
	protected void updateCorperatedPath(List<CorperationPathNode> ourPath, BaseModelBean fromBean, BaseModelBean toBean) {
		String key = CorperationPathNode.keyOf(fromBean,toBean);
		if (ourPath.stream().anyMatch(it->it.getKey().equals(key))) {
			return;
		}
		CorperationPathNode node = new CorperationPathNode();
		node.setKey(key);
		node.setFromBean(fromBean);
		node.setToBean(toBean);
		ourPath.add(node);
	}
	public void useMember(BaseAttribute member) {
		member.setContainerBean(this);
	}
	
	public String getFullPathInSearch() {
		if (this.getAdditonalData().fullPath != null) {
			return getAdditonalData().fullPath;
		}
		if (this.getPreviousBean() == null) {
			getAdditonalData().fullPath=this.getModelTypeName();
			return getAdditonalData().fullPath;
		}
		String prePath = this.getPreviousBean().getFullPathInSearch();
		getAdditonalData().fullPath = prePath+"/"+this.getName();
		return getAdditonalData().fullPath;
	}
	public void assignAlias(String alias) {
		this.getAdditonalData().aliasInSql = alias;
	}
}
