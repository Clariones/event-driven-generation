package cla.edg.pageflow;

import com.terapico.generator.Utils;

public class BasePageFlowElement {
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
