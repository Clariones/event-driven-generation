package com.terapico.changerequest.spec;

import java.util.LinkedList;
import java.util.List;

public class EventSpec extends CommonSpec<EventSpec>{
	protected List<FieldSpec> fieldSpecs;
	protected String type;
	protected EventSpec prototype;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<FieldSpec> getFieldSpecs() {
		return fieldSpecs;
	}
	public void setFieldSpecs(List<FieldSpec> fieldSpecs) {
		this.fieldSpecs = fieldSpecs;
	}
	public EventSpec getPrototype() {
		return prototype;
	}
	public void setPrototype(EventSpec prototype) {
		this.prototype = prototype;
	}
	
	
	
	public EventSpec withType(String eventType) {
		this.setType(eventType);
		return this;
	}

	public EventSpec withPrototype(EventSpec event) {
		this.setPrototype(event);
		return this;
	}
	
	
	protected List<FieldSpec> ensureFieldSpecs() {
		if (fieldSpecs != null) {
			return fieldSpecs;
		}
		return fieldSpecs = new LinkedList<>();
	}
	public void addField(FieldSpec fieldSpec) {
		ensureFieldSpecs().add(fieldSpec);
	}
	
	public void setI18nIfNotExists(String localeCode, String text) {
		if (this.getI18nName() != null && this.getI18nName().containsKey(localeCode)) {
			return; // 如果已经有了,就不更新
		}
		this.addI18n(localeCode, text);
	}
	
	public FieldSpec findField(String fieldName) {
		return this.ensureFieldSpecs().stream().filter(it->it.getName().equals(fieldName)).findFirst().orElse(null);
	}
	
}
