package cla.edg.pageflow;


import clariones.tool.builder.BaseScriptElement;
import clariones.tool.builder.Utils;

public class BasePageFlowElement extends BaseScriptElement {
	protected String name;
	protected String comments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public String getJavaName() {
		return Utils.toCamelCase(getName());
	}
}
