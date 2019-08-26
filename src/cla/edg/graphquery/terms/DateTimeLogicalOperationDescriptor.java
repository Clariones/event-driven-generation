package cla.edg.graphquery.terms;

public interface DateTimeLogicalOperationDescriptor extends BaseLogicalOperationDescriptor {
	default BaseQueryCondition before(String param) {
		return addParamCondition("<", param);
	}
	default BaseQueryCondition after(String param) {
		return addParamCondition(">", param);
	}
	default BaseQueryCondition not_before(String param) {
		return addParamCondition(">=", param);
	}
	default BaseQueryCondition not_after(String param) {
		return addParamCondition("<=", param);
	}
	default BaseQueryCondition between(String param1, String param2) {
		return after(param1).and(before(param2));
	}
	default BaseQueryCondition before(MemberInfo memberInfo) {
		return addMemberInfoCondition("<", memberInfo);
	}
	default BaseQueryCondition after(MemberInfo memberInfo) {
		return addMemberInfoCondition(">", memberInfo);
	}
	default BaseQueryCondition not_before(MemberInfo memberInfo) {
		return addMemberInfoCondition(">=", memberInfo);
	}
	default BaseQueryCondition not_after(MemberInfo memberInfo) {
		return addMemberInfoCondition("<=", memberInfo);
	}
	default BaseQueryCondition between(MemberInfo memberInfo1, MemberInfo memberInfo2) {
		return after(memberInfo1).and(before(memberInfo2));
	}
}


