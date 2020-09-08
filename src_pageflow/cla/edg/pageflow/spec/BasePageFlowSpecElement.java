package cla.edg.pageflow.spec;


import clariones.tool.builder.BaseScriptElement;

import java.util.List;

public class BasePageFlowSpecElement extends BaseScriptElement {
	protected String name;
	protected String comments;	// 注释中的 '摘要'
	protected List<String> detailComments;	// 详细注解. 一句一行.

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

	public List<String> getDetailComments() {
		return detailComments;
	}

	public void setDetailComments(List<String> detailComments) {
		this.detailComments = detailComments;
	}
}
