package cla.edg.graphquery.terms;

import clariones.tool.builder.Utils;

import java.util.List;


public class MemberInfoWithLogicalOperation extends MemberInfo implements  BaseQueryCondition{
	protected ConditionInfo conditionInfo;
	public ConditionInfo getConditionInfo() {
		if(conditionInfo == null) {
			conditionInfo = new ConditionInfo();
		}
		return conditionInfo;
	}
	public void setConditionInfo(ConditionInfo conditionInfo) {
		this.conditionInfo = conditionInfo;
	}

	public BaseQueryCondition addParamCondition(String operatorStr, String paramName, String prefix, String postFix) {
		getConditionInfo().init(operatorStr, paramName, prefix, postFix);
		return this;
	}

	public BaseQueryCondition addMemberInfoCondition(String operatorStr, MemberInfo param, String prefix, String postFix) {
		getConditionInfo().init(operatorStr, param, prefix, postFix);
		return this;
	}
	
	@Override
	public BaseQueryCondition connectWith(String connOperator, BaseQueryCondition condition) {
		getConditionInfo().connectWith(connOperator, condition);
		return this;
	}
	
	@Override
	public String toExpressionString(List<ParameterInfo> list) {
		String expStr = String.format("%s %s %s%s", 
				assembleTypeInfoInCondition(), 
				this.getConditionInfo().getOperatorStr(), 
				assembleParamInfoInCondition(list),
				assembleMoreCondition(list)
				);
		if (this.getConditionInfo().isNotFlag()) {
			return " !(" + expStr +") ";
		}else {
			return expStr;
		}

	}
	private String assembleMoreCondition(List<ParameterInfo> list) {
		List<BaseQueryCondition> moreCondition = this.getConditionInfo().getMoreConditions();
		if (moreCondition == null || moreCondition.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(BaseQueryCondition cond : moreCondition) {
			MemberInfoWithLogicalOperation condObj = (MemberInfoWithLogicalOperation) cond;
			sb.append(' ').append(condObj.getConditionInfo().getOperationType()).append(" (")
				.append(cond.toExpressionString(list)).append(") ");
		}
		return sb.toString();
	}
	private String assembleParamInfoInCondition(List<ParameterInfo> list) {
		String paramType = this.getConditionInfo().getParamType();
		if (paramType == null) {
			return "";
		}
		if (paramType.equals("input")) {
			ParameterInfo param = list.stream().filter(it->it.getParamName().equals(getConditionInfo().getParamName())).findAny().get();
			if (getConditionInfo().getPrefix() != null || getConditionInfo().getPostfix() != null) {
				return String.format("CONCAT(%s@%s%s)", 
						getConditionInfo().getPrefix()==null?"":"\""+getConditionInfo().getPrefix()+"\",",
						Utils.toJavaVariableName(getConditionInfo().getParamName())+(param.isList()?"List":""),
						getConditionInfo().getPostfix()==null?"":",\""+getConditionInfo().getPostfix()+"\""
						);
			}
			return String.format("@%s", Utils.toJavaVariableName(getConditionInfo().getParamName())+(param.isList()?"List":""));
		}
		if (paramType.equals("reference")) {
			if (getConditionInfo().getPrefix() != null || getConditionInfo().getPostfix() != null) {
				return String.format("CONCAT(%scotext.%s.%s%s)", 
						getConditionInfo().getPrefix()==null?"":"\""+getConditionInfo().getPrefix()+"\",",
						getConditionInfo().getParamMemberInfo().getClassName(),
						getConditionInfo().getParamMemberInfo().getMemberName(),
						getConditionInfo().getPostfix()==null?"":",\""+getConditionInfo().getPostfix()+"\""
						);
			}
			return String.format("cotext.%s.%s", 
					getConditionInfo().getParamMemberInfo().getClassName(),
					getConditionInfo().getParamMemberInfo().getMemberName());
		}
		return "未实现";
	}
	private String assembleTypeInfoInCondition() {
		if (getClassName() == null) {
			return "";
		}
		return String.format("context.%s.%s", this.getClassName(), this.getMemberName());
	}
	@Override
	public BaseQueryCondition wrapWithNot() {
		this.getConditionInfo().setNotFlag(true);
		return this;
	}
	
	
	
	

	
	
}
