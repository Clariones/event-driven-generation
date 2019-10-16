package cla.edg.graphquery.terms;

public class StringMemberInfo extends MemberInfoWithLogicalOperation implements StringLogicalOperationDescriptor{
	public static StringMemberInfo create(String clazz, String member) {
		StringMemberInfo rst = new StringMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}

	

}
