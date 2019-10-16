package cla.edg.graphquery.terms;

public class ReferToMemberInfo extends MemberInfo {
	protected String referToClassName;
	public String getReferToClassName() {
		return referToClassName;
	}

	public void setReferToClassName(String referToClassName) {
		this.referToClassName = referToClassName;
	}

	public static ReferToMemberInfo create(String clazz, String member, String referToClazz) {
		ReferToMemberInfo rst = new ReferToMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		rst.setReferToClassName(referToClazz);
		return rst;
	}
	
}