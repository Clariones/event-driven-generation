package cla.edg.graphquery.terms;

public class ReferByMemberInfo extends MemberInfo {
	protected String referByClassName;
	public String getReferByClassName() {
		return referByClassName;
	}

	public void setReferByClassName(String referByClassName) {
		this.referByClassName = referByClassName;
	}

	public static ReferByMemberInfo create(String clazz, String member, String referByClazz) {
		ReferByMemberInfo rst = new ReferByMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		rst.setReferByClassName(referByClazz);
		return rst;
	}
	
}