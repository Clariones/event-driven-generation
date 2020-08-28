package cla.edg.graphquery.terms;


public class ReferByMemberInfo extends MemberInfo {
	protected String referByClassName;
	protected String referByName;
	
	public String getReferByName() {
		return referByName;
	}
	public void setReferByName(String referByName) {
		this.referByName = referByName;
	}
	public String getReferByClassName() {
		return referByClassName;
	}

	public void setReferByClassName(String referByClassName) {
		this.referByClassName = referByClassName;
	}

	public static ReferByMemberInfo create(String clazz, String member, String referByClazz, String referByName) {
		ReferByMemberInfo rst = new ReferByMemberInfo();
		rst.setClassName(clazz);
		rst.setMemberName(member);
		rst.setReferByClassName(referByClazz);
		rst.setReferByName(referByName);
		return rst;
	}
	
	public String getEdgeName() {
		return this.getReferByClassName()+"$"+this.getReferByName();
	}
	
}
