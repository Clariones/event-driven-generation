package cla.edg.modelbean;

import java.util.ArrayList;
import java.util.List;

import cla.edg.modelbean.LogicalOperator.Operator;
import cla.edg.routemap.MeetingPoint;

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
	protected String memberName;
	///////////////////////////////////////////////////////////////////////////
	protected ModelBeanRoute beanRoute;
	protected MeetingPoint<BaseModelBean, BeanRelation> lastMeetingPoint = null;
	
	public ModelBeanAdditionalData getAdditonalData() {
		return additonalData;
	}
	public ModelBeanRoute getBeanRoute() {
		return beanRoute;
	}
	public MeetingPoint<BaseModelBean, BeanRelation> getLastMeetingPoint() {
		return lastMeetingPoint;
	}
	public void setLastMeetingPoint(MeetingPoint<BaseModelBean, BeanRelation> lastMeetingPoint) {
		this.lastMeetingPoint = lastMeetingPoint;
	}
	//////////////
	public void setBeanRoute(ModelBeanRoute beanRoute) {
		this.beanRoute = beanRoute;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
	/** true: FROM-refer-TO; false: FROM-has-been-referred-by-TO; */
	public boolean isReferDirection() {
		return referDirection;
	}
	public void setReferDirection(boolean referDirection) {
		this.referDirection = referDirection;
	}

	
	private void goBackOneStep() {
		if (this.getLastMeetingPoint() == null) {
			return;
		}
		if (!this.isReferDirection()) {
			return;
		}
		MeetingPoint<BaseModelBean, BeanRelation> curPoint = this.getBeanRoute().getCurrentMeetingPoint();
		this.getBeanRoute().removeMeetPoint(curPoint);
		this.getBeanRoute().setCurrentMeetingPoint(lastMeetingPoint);
	}
	
	
	public LogicalOperator eq(Object o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.eq, this, o);
	}
	public LogicalOperator not(Object o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.not, this, o);
	}
	public LogicalOperator is_null() {
		goBackOneStep();
		return LogicalOperator.create(Operator.is_null, this, null);
	}
	public LogicalOperator not_null() {
		goBackOneStep();
		return LogicalOperator.create(Operator.not_null, this, null);
	}
	public LogicalOperator less_or_eq(Object o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.less_or_eq, this, o);
	}
	public LogicalOperator bigger_or_eq(Object o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.bigger_or_eq, this, o);
	}
	public LogicalOperator less_than(Object o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.less, this, o);
	}
	public LogicalOperator bigger_than(Object o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.bigger, this, o);
	}
	public LogicalOperator in(Object ... o) {
		goBackOneStep();
		return LogicalOperator.create(Operator.in, this, o);
	}
	public LogicalOperator not_in(Object ... o) {
		goBackOneStep();
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
		
		// 添加路劲
		appendToNodeRoute(bean);
		
	}
	
	private void appendToNodeRoute(BaseModelBean anotherBean) {
		ModelBeanRoute br1 = this.getBeanRoute();
		if (br1 == null) {
			// 起点的时候,需要创建beanRoute,并初始化自己为其起点
			this.setBeanRoute(new ModelBeanRoute());
			this.getBeanRoute().addNode(this);
		}
		MeetingPoint<BaseModelBean, BeanRelation> curPoint = this.getBeanRoute().getCurrentMeetingPoint();
		// 如果已经有beanRoute,说明已经不是一个空'路线图'了,需要在当前 meeting point 后面,追加'路径'. 所以先计算路径
		BeanRelation relation = createBeanRelation(this, anotherBean);
		this.getBeanRoute().appendNode(relation, anotherBean);
		
		// 一个路径上的所有节点,共享一个 beanRoute
		anotherBean.setBeanRoute(getBeanRoute());
		anotherBean.setLastMeetingPoint(curPoint);
	}
	
	private BeanRelation createBeanRelation(BaseModelBean fromBean, BaseModelBean toBean) {
		BeanRelation relation = new BeanRelation();
		relation.setFromBeanTypeName(fromBean.getModelTypeName());
		relation.setToBeanTypeName(toBean.getModelTypeName());
		if (toBean.isReferDirection()) {
			relation.setForwardReference(true);
			relation.setMemberName(toBean.getMemberName());
			relation.setReferFieldName(toBean.getName());
		}else {
			relation.setForwardReference(false);
			relation.setMemberName(toBean.getMemberName());
			relation.setReferFieldName(toBean.getName());
		}
		return relation;
		
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
		if (this.getBeanRoute() == null) {
			// 起点的时候,需要创建beanRoute,并初始化自己为其起点
			this.setBeanRoute(new ModelBeanRoute());
			this.getBeanRoute().addNode(this);
		}
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
	
	public String getKey() {
		return this.getModelTypeName();
	}
	
	public BaseModelBean getRoot() {
		if (this.getPreviousBean() == null) {
			return this;
		}
		return this.getPreviousBean().getRoot();
	}
}
