package cla.edg.graphquery.terms;

public class BooleanMemberInfo extends MemberInfo implements BooleanLogicalOperationDescriptor{
	public static BooleanMemberInfo create(String clazz, String member) {
		BooleanMemberInfo rst = new BooleanMemberInfo();
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
