package cla.edg.pageflow;

public class AccessParameter extends BasePageFlowElement{
	protected String typeName;
	protected String paramName;
	protected String formName;
	protected boolean customized = false;
	protected boolean asVariable = false;
	
	public boolean isCustomized() {
		return customized;
	}
	public void setCustomized(boolean customized) {
		this.customized = customized;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public boolean isAsVariable() {
		return asVariable;
	}
	public void setAsVariable(boolean asVariable) {
		this.asVariable = asVariable;
	}
	
	
}
