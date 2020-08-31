package cla.edg.modelbean;

import cla.edg.modelbean.LogicalOperator.Operator;
import clariones.poc.pathmap.PathMap;


public abstract class BaseModelBean {
	private String fileName;
	private String lineNumber;
	// 接口声明
	public abstract String getFullClassName();
	public abstract StringAttribute id();
	
	///////////////////////////////////////////////////////////////////////////
	protected String name;
	protected boolean referDirection;
	protected String modelTypeName;
	protected transient BaseModelBean previousBean;
	protected ModelBeanAdditionalData additonalData = new ModelBeanAdditionalData();
	protected String memberName;
	protected String relationName;
	///////////////////////////////////////////////////////////////////////////
	public BaseModelBean(){
		super();
		Throwable t = new Throwable();
		StackTraceElement st = t.getStackTrace()[3];
		lineNumber = st.getLineNumber()+"";
		fileName = st.getFileName();
	}
	public String declaredPostion(){
		return fileName+":"+lineNumber;
	}

	public String getInternalType() {
		String fullClassName = getFullClassName();
		return fullClassName.substring(fullClassName.lastIndexOf('.')+1);
	}
	public String getRelationName() {
		return relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	public ModelBeanAdditionalData getAdditonalData() {
		return additonalData;
	}
	//////////////
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


	public LogicalOperator eq(Object o) {
		return LogicalOperator.create(Operator.eq, this, o);
	}
	public LogicalOperator not(Object o) {
		return LogicalOperator.create(Operator.not, this, o);
	}
	public LogicalOperator is_null() {
		return LogicalOperator.create(Operator.is_null, this);
	}
	public LogicalOperator not_null() {
		return LogicalOperator.create(Operator.not_null, this);
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
	public LogicalOperator in(Object ... o) {
		return LogicalOperator.create(Operator.in, this, o);
	}
	public LogicalOperator not_in(Object ... o) {
		return LogicalOperator.create(Operator.not_in, this, o);
	}

	/**
	 * 说明:
	 * 每个path上的所有bean都共享一个 corperatedPath. 所以它需要在append的过程中人工组装. 而不是自动的'有则用之,无则建之'.
	 * 前提: 每次append后,'当前'节点一定是新加入的节点;
	 * 算法: 当前节点理应持有'corperatedPath',如果没有,说明它是头结点,它负责创建. 而后,负责将它传递下去.
	 */
	public void append(BaseModelBean bean) {
		BeanPath beanPath = getBeanPath();
		beanPath.addNode(bean.getModelTypeName(), bean.getName(), bean.getMemberName(),
				bean.isReferDirection()? PathMap.PATH_UPSTREAM:PathMap.PATH_DOWNSTREAM);
		bean.setBeanPath(beanPath);
	}

	public void useMember(BaseAttribute member) {
		BeanPath beanPath = getBeanPath();
		beanPath.appendAttribute(member.getName(), member.getModelTypeName());
		member.setContainerBean(this);
	}



	/**
	 * 2020-8-18
	 */
	protected BeanPath beanPath;
	public BeanPath getBeanPath() {
		return beanPath;
	}
	public void setBeanPath(BeanPath beanPath) {
		this.beanPath = beanPath;
	}
	public EnumAttribute[] getEnumNameList() { return null;}
}
