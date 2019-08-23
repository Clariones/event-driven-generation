package cla.edg.graphquery.terms;

public class DateTimeMemberInfo extends MemberInfo implements DateTimeLogicalOperationDescriptor {
	public static DateTimeMemberInfo create(String clazz, String member) {
		DateTimeMemberInfo rst = new DateTimeMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}

	@Override
	public BaseQueryCondition eq(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition before(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition after(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_eq(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_before(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_after(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition between(String param1, String param2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition eq(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition before(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition after(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_eq(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_before(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_after(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
