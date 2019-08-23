package cla.edg.graphquery.terms;

public class StringMemberInfo extends MemberInfo implements StringLogicalOperationDescriptor{
	public static StringMemberInfo create(String clazz, String member) {
		StringMemberInfo rst = new StringMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}
	
	@Override
	public BaseQueryCondition eq(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition contains(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition starts_with(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition ends_with(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition less_then(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition more_then(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_eq(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_less_then(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition not_more_then(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition is_null() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition is_not_null() {
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

	@Override
	public BaseQueryCondition contains(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition starts_with(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition ends_with(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		return null;
	}}
