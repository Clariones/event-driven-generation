package cla.edg.graphquery.terms;

public interface DateTimeLogicalOperationDescriptor {
	BaseQueryCondition eq(String param);
	BaseQueryCondition before(String param);
	BaseQueryCondition after(String param);
	BaseQueryCondition not_eq(String param);
	BaseQueryCondition not_before(String param);
	BaseQueryCondition not_after(String param);
	BaseQueryCondition between(String param1, String param2);
	BaseQueryCondition eq(MemberInfo memberInfo);
	BaseQueryCondition before(MemberInfo memberInfo);
	BaseQueryCondition after(MemberInfo memberInfo);
	BaseQueryCondition not_eq(MemberInfo memberInfo);
	BaseQueryCondition not_before(MemberInfo memberInfo);
	BaseQueryCondition not_after(MemberInfo memberInfo);
}
