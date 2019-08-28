package cla.edg.graphquery.terms;

public class NumberMemberInfo extends MemberInfoWithLogicalOperation implements NumberLogicalOperationDescriptor{
	public static NumberMemberInfo create(String clazz, String member) {
		NumberMemberInfo rst = new NumberMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}

	@Override
	public BaseQueryCondition between(String param1, String param2) {
		NumberMemberInfo tc = create(this.getClassName(), this.getMemberName());
		tc.not_more_then(param2);
		this.not_less_then(param1).and(tc);
		return this;
	}

	@Override
	public BaseQueryCondition between(MemberInfo param1, MemberInfo param2) {
		NumberMemberInfo tc = create(this.getClassName(), this.getMemberName());
		tc.not_more_then(param2);
		this.not_less_then(param1).and(tc);
		return this;
	}

	
}
	
