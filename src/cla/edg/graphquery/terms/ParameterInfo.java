package cla.edg.graphquery.terms;

public class ParameterInfo {
	protected boolean extType;
	protected boolean list;
	protected String typeClassName;
	protected String paramName;
	
	public boolean isList() {
		return list;
	}
	public void setList(boolean list) {
		this.list = list;
	}
	public boolean isExtType() {
		return extType;
	}
	public void setExtType(boolean extType) {
		this.extType = extType;
	}
	public String getTypeClassName() {
		return typeClassName;
	}
	public void setTypeClassName(String typeClassName) {
		this.typeClassName = typeClassName;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	
}
