package cla.edg.graphquery.terms;

public interface StringLogicalOperationDescriptor extends BaseLogicalOperationDescriptor {
	default BaseQueryCondition contains(String param) {
		return addParamCondition("LIKE", param, "%", "%");
	}

	default BaseQueryCondition starts_with(String param) {
		return addParamCondition("LIKE", param, "%", null);
	}

	default BaseQueryCondition ends_with(String param) {
		return addParamCondition("LIKE", param, null, "%");
	}

	default BaseQueryCondition less_then(String param) {
		return addParamCondition("<", param);
	}

	default BaseQueryCondition more_then(String param) {
		return addParamCondition(">", param);
	}

	default BaseQueryCondition not_less_then(String param) {
		return addParamCondition(">=", param);
	}

	default BaseQueryCondition not_more_then(String param) {
		return addParamCondition("<=", param);
	}

	default BaseQueryCondition is_null() {
		return addParamCondition("== null", null);
	}

	default BaseQueryCondition is_not_null() {
		return addParamCondition("!= null", null);
	}

	default BaseQueryCondition less_then(MemberInfo memberInfo) {
		return addMemberInfoCondition("<", memberInfo);
	}
	default BaseQueryCondition more_then(MemberInfo memberInfo) {
		return addMemberInfoCondition(">", memberInfo);
	}
	default BaseQueryCondition not_less_then(MemberInfo memberInfo) {
		return addMemberInfoCondition(">=", memberInfo);
	}
	default BaseQueryCondition not_more_then(MemberInfo memberInfo) {
		return addMemberInfoCondition("<=", memberInfo);
	}
	default BaseQueryCondition contains(MemberInfo memberInfo) {
		return addMemberInfoCondition("LIKE", memberInfo,"%","%");
	}
	default BaseQueryCondition starts_with(MemberInfo memberInfo) {
		return addMemberInfoCondition("LIKE", memberInfo, null, "%");
	}
	default BaseQueryCondition ends_with(MemberInfo memberInfo) {
		return addMemberInfoCondition("LIKE", memberInfo, "%",null);
	}
}
