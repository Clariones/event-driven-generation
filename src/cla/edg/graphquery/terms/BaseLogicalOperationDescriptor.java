package cla.edg.graphquery.terms;

public interface BaseLogicalOperationDescriptor {
	BaseQueryCondition addParamCondition(String operatorStr, String paramName, String prefix, String postFix);
	BaseQueryCondition addMemberInfoCondition(String string, MemberInfo param, String prefix, String postFix);
	
	
	default BaseQueryCondition addParamCondition(String operatorStr, String paramName) {
		return addParamCondition(operatorStr, paramName, null, null);
	}
	default BaseQueryCondition addMemberInfoCondition(String operatorStr, MemberInfo param) {
		return addMemberInfoCondition(operatorStr, param, null, null);
	}
	
	
	default BaseQueryCondition eq(String param) {
		return addParamCondition("==", param);
	}
	default BaseQueryCondition not_eq(String param) {
		return addParamCondition("!=", param);
	}
	default BaseQueryCondition eq(MemberInfo memberInfo) {
		return addMemberInfoCondition("==", memberInfo);
	}
	default BaseQueryCondition not_eq(MemberInfo memberInfo) {
		return addMemberInfoCondition("!=", memberInfo);
	}
}
