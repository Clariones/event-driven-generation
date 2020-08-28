package cla.edg.graphquery.terms;

public class BooleanMemberInfo extends MemberInfoWithLogicalOperation implements BooleanLogicalOperationDescriptor{
	public static BooleanMemberInfo create(String clazz, String member) {
		BooleanMemberInfo rst = new BooleanMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}

	
}
