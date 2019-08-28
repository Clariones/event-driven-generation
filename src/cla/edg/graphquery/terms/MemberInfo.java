package cla.edg.graphquery.terms;

public class MemberInfo {
	protected String className;
	protected String memberName;
	protected String sortDirection = "desc";

	
	public String getSortDirection() {
		return sortDirection;
	}

	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
	}

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
	
	public MemberInfo asc() {
		setSortDirection("asc");
		return this;
	}
	public MemberInfo desc() {
		setSortDirection("desc");
		return this;
	}
}
