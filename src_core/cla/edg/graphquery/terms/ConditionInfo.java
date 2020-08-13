package cla.edg.graphquery.terms;

import java.util.LinkedList;
import java.util.List;

public class ConditionInfo {
	protected String operatorStr;
	protected String paramName;
	protected String prefix;
	protected String postfix;
	protected MemberInfo paramMemberInfo;
	protected String paramType;
	protected String operationType;
	protected List<BaseQueryCondition> moreConditions;
	protected boolean notFlag = false;
	
	
	public boolean isNotFlag() {
		return notFlag;
	}
	public void setNotFlag(boolean notFlag) {
		this.notFlag = notFlag;
	}
	public String getOperatorStr() {
		return operatorStr;
	}
	public void setOperatorStr(String operatorStr) {
		this.operatorStr = operatorStr;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getPostfix() {
		return postfix;
	}
	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}
	public MemberInfo getParamMemberInfo() {
		return paramMemberInfo;
	}
	public void setParamMemberInfo(MemberInfo paramMemberInfo) {
		this.paramMemberInfo = paramMemberInfo;
	}
	public String getParamType() {
		return paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public List<BaseQueryCondition> getMoreConditions() {
		if (moreConditions == null) {
			moreConditions = new LinkedList<>();
		}
		return moreConditions;
	}
	public void setMoreConditions(List<BaseQueryCondition> moreConditions) {
		this.moreConditions = moreConditions;
	}

	public void init(String operatorStr, String paramName, String prefix, String postfix) {
		this.setParamType("input");
		this.setOperatorStr(operatorStr);
		this.setParamName(paramName);
		this.setPrefix(prefix);
		this.setPostfix(postfix);
	}

	public void init(String operatorStr, MemberInfo param, String prefix, String postfix) {
		this.setParamType("reference");
		this.setOperatorStr(operatorStr);
		this.setParamMemberInfo(param);
		this.setPrefix(prefix);
		this.setPostfix(postfix);
	}
	
	public void connectWith(String connOperator, BaseQueryCondition condition) {
		MemberInfoWithLogicalOperation obj = (MemberInfoWithLogicalOperation) condition;
		obj.getConditionInfo().setOperationType(connOperator);
		getMoreConditions().add(condition);
	}

	
}
