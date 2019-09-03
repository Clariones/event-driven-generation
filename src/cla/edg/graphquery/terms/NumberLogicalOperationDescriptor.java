package cla.edg.graphquery.terms;

public interface NumberLogicalOperationDescriptor extends BaseLogicalOperationDescriptor{
	default BaseQueryCondition eq(String param) {
		return addParamCondition("=", param);
	}

	default BaseQueryCondition less_then(String param) {
		return addParamCondition("<", param);
	}
	
	default BaseQueryCondition more_then(String param) {
		return addParamCondition(">", param);
	}
	
	default BaseQueryCondition not_eq(String param) {
		return addParamCondition("!=", param);
	}
	
	default BaseQueryCondition not_less_then(String param) {
		return addParamCondition(">=", param);
	}
	
	default BaseQueryCondition not_more_then(String param) {
		return addParamCondition("<=", param);
	}
	
	BaseQueryCondition between(String param1, String param2);
	
	default BaseQueryCondition eq(MemberInfo param) {
		return addMemberInfoCondition("=", param);
	}

	default BaseQueryCondition less_then(MemberInfo param) {
		return addMemberInfoCondition("<", param);
	}

	default BaseQueryCondition more_then(MemberInfo param) {
		return addMemberInfoCondition(">", param);
	}
	default BaseQueryCondition not_eq(MemberInfo param) {
		return addMemberInfoCondition("!=", param);
	}
	default BaseQueryCondition not_less_then(MemberInfo param) {
		return addMemberInfoCondition(">=", param);
	}
	default BaseQueryCondition not_more_then(MemberInfo param) {
		return addMemberInfoCondition("<=", param);
	}
	BaseQueryCondition between(MemberInfo param1, MemberInfo param2);
}
