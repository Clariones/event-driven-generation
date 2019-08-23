package cla.edg.graphquery.terms;

public interface BooleanLogicalOperationDescriptor {
	BaseQueryCondition eq(String param);
	BaseQueryCondition not_eq(String param);
	BaseQueryCondition is_true();
	BaseQueryCondition is_false();
	BaseQueryCondition eq(MemberInfo memberInfo);
	BaseQueryCondition not_eq(MemberInfo memberInfo);
}
