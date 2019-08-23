package cla.edg.graphquery.terms;

public interface StringLogicalOperationDescriptor {
	BaseQueryCondition eq(String value);
	BaseQueryCondition contains(String value);
	BaseQueryCondition starts_with(String value);
	BaseQueryCondition ends_with(String value);
	BaseQueryCondition less_then(String value);
	BaseQueryCondition more_then(String value);
	BaseQueryCondition not_eq(String value);
	BaseQueryCondition not_less_then(String value);
	BaseQueryCondition not_more_then(String value);
	BaseQueryCondition is_null();
	BaseQueryCondition is_not_null();
	BaseQueryCondition eq(MemberInfo memberInfo);
	BaseQueryCondition less_then(MemberInfo memberInfo);
	BaseQueryCondition more_then(MemberInfo memberInfo);
	BaseQueryCondition not_eq(MemberInfo memberInfo);
	BaseQueryCondition not_less_then(MemberInfo memberInfo);
	BaseQueryCondition not_more_then(MemberInfo memberInfo);
	BaseQueryCondition contains(MemberInfo memberInfo);
	BaseQueryCondition starts_with(MemberInfo memberInfo);
	BaseQueryCondition ends_with(MemberInfo memberInfo);
}
