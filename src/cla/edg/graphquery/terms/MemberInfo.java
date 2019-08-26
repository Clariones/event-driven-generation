package cla.edg.graphquery.terms;

public class MemberInfo {
	protected String className;
	protected String memberName;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public static MemberInfo create(String clazz, String member) {
		MemberInfo rst = new MemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		return rst;
	}
}
