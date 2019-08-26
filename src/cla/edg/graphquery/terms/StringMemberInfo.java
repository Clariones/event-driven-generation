package cla.edg.graphquery.terms;

public class StringMemberInfo extends MemberInfo implements StringLogicalOperationDescriptor{
	public static StringMemberInfo create(String clazz, String member) {
		StringMemberInfo rst = new StringMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}

	@Override
	public BaseQueryCondition addParamCondition(String operatorStr, String paramName, String prefix, String postFix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseQueryCondition addMemberInfoCondition(String string, MemberInfo param, String prefix, String postFix) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
