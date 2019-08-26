package cla.edg.graphquery.terms;

public class NumberMemberInfo extends MemberInfo implements NumberLogicalOperationDescriptor{
	public static NumberMemberInfo create(String clazz, String member) {
		NumberMemberInfo rst = new NumberMemberInfo();
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
	
