package cla.edg.graphquery.terms;

public class DateTimeMemberInfo extends MemberInfo implements DateTimeLogicalOperationDescriptor {
	public static DateTimeMemberInfo create(String clazz, String member) {
		DateTimeMemberInfo rst = new DateTimeMemberInfo();
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
