package com.terapico.viewcomponent.spec;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.terapico.generator.Utils;

public class ComponentInfo {
	protected static Set<String> attrInBaseComponentInfo = new HashSet<>();
	static {
		attrInBaseComponentInfo.add("id");
		attrInBaseComponentInfo.add("componentType");
		attrInBaseComponentInfo.add("linkToUrl");
	}
	protected String name;
	protected List<AttributeInfo> attributes;
	protected String comments;
	protected transient AttributeInfo currentAttr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<AttributeInfo> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<AttributeInfo> attributes) {
		this.attributes = attributes;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public ComponentInfo $(String attrName) {
		AttributeInfo attr = findAttribute(attrName);
		if (attr != null) {
			attr.setName(attrName);
		}
		attr = createDefaultAttribute(attrName);
		currentAttr = attr;
		return this;
	}
	
	private AttributeInfo createDefaultAttribute(String attrName) {
		AttributeInfo attr = new AttributeInfo();
		attr.setName(attrName);
		attr.setType("string");
		ensureAttributes();
		attributes.add(attr);
		return attr;
	}
	private AttributeInfo findAttribute(String attrName) {
		ensureAttributes();
		String stdName = Utils.toCamelCase(attrName);
		if (attrInBaseComponentInfo.contains(stdName)) {
			throw new RuntimeException(attrName +"是基类属性,不要定制它");
		}
		return attributes.stream().filter(it->Utils.toCamelCase(it.getName()).equals(stdName)).findAny().orElse(null);
	}
	private void ensureAttributes() {
		if (attributes == null) {
			attributes = new LinkedList<>();
		}
	}
	public ComponentInfo booleanType() {
		currentAttr.setType("boolean");
		return this;
	}
	public ComponentInfo datetimeType() {
		currentAttr.setType("datetime");
		return this;
	}

	public ComponentInfo listType(String typeName) {
		currentAttr.setType("List<"+typeName+">");
		return this;
	}
}
