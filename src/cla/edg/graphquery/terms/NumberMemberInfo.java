package cla.edg.graphquery.terms;

public class NumberMemberInfo extends MemberInfo implements NumberLogicalOperationDescriptor{
	public static NumberMemberInfo create(String clazz, String member) {
		NumberMemberInfo rst = new NumberMemberInfo();
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
	public BaseQueryCondition less_then(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition more_then(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_eq(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_less_then(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_more_then(String param) {
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
	public BaseQueryCondition less_then(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition more_then(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_eq(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_less_then(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_more_then(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
