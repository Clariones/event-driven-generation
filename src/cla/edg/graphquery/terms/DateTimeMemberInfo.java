package cla.edg.graphquery.terms;

public class DateTimeMemberInfo extends MemberInfoWithLogicalOperation implements DateTimeLogicalOperationDescriptor {
	public static DateTimeMemberInfo create(String clazz, String member) {
		DateTimeMemberInfo rst = new DateTimeMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}

	@Override
	public BaseQueryCondition between(String param1, String param2) {
		DateTimeMemberInfo tc = create(this.getClassName(), this.getMemberName());
		tc.before(param2);
		this.after(param1).and(tc);
		return this;
	}
	
	@Override
	public BaseQueryCondition between(MemberInfo param1, MemberInfo param2) {
		DateTimeMemberInfo tc = create(this.getClassName(), this.getMemberName());
		tc.before(param2);
		this.after(param1).and(tc);
		return this;
	}
}
