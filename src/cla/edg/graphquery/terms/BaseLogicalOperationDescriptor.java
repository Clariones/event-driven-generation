package cla.edg.graphquery.terms;

public interface BaseLogicalOperationDescriptor {
	BaseQueryCondition addParamCondition(String operatorStr, String paramName);
	BaseQueryCondition addMemberInfoCondition(String string, MemberInfo param);
}
