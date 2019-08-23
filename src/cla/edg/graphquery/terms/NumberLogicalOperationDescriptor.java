package cla.edg.graphquery.terms;

public interface NumberLogicalOperationDescriptor {
	BaseQueryCondition eq(String param);
	BaseQueryCondition less_then(String param);
	BaseQueryCondition more_then(String param);
	BaseQueryCondition not_eq(String param);
	BaseQueryCondition not_less_then(String param);
	BaseQueryCondition not_more_then(String param);
	BaseQueryCondition between(String param1, String param2);
	BaseQueryCondition eq(MemberInfo memberInfo);
	BaseQueryCondition less_then(MemberInfo memberInfo);
	BaseQueryCondition more_then(MemberInfo memberInfo);
	BaseQueryCondition not_eq(MemberInfo memberInfo);
	BaseQueryCondition not_less_then(MemberInfo memberInfo);
	BaseQueryCondition not_more_then(MemberInfo memberInfo);
}
