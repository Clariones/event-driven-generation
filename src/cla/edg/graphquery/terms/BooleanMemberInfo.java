package cla.edg.graphquery.terms;

public class BooleanMemberInfo extends MemberInfo implements BooleanLogicalOperationDescriptor{
	public static BooleanMemberInfo create(String clazz, String member) {
		BooleanMemberInfo rst = new BooleanMemberInfo();
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
	public BaseQueryCondition not_eq(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition is_true() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition is_false() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition eq(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_eq(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
