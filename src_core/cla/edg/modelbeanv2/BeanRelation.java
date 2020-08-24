package cla.edg.modelbeanv2;

public class BeanRelation {
	protected String memberName;
	protected String fromBeanTypeName;
	protected String toBeanTypeName;
	protected String referFieldName;
	protected boolean forwardReference;
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getFromBeanTypeName() {
		return fromBeanTypeName;
	}
	public void setFromBeanTypeName(String fromBeanTypeName) {
		this.fromBeanTypeName = fromBeanTypeName;
	}
	public String getToBeanTypeName() {
		return toBeanTypeName;
	}
	public void setToBeanTypeName(String toBeanTypeName) {
		this.toBeanTypeName = toBeanTypeName;
	}
	public boolean isForwardReference() {
		return forwardReference;
	}
	public void setForwardReference(boolean referOne) {
		this.forwardReference = referOne;
	}
	
	public String getReferFieldName() {
		return referFieldName;
	}
	public void setReferFieldName(String referFieldName) {
		this.referFieldName = referFieldName;
	}
	public String getKey() {
		if (this.isForwardReference()) {
			return getReferFieldName();
		}else {
			return "~"+getReferFieldName();
		}
	}
}
