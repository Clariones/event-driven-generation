package com.terapico.changerequest.spec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EventSpec extends CommonSpec<EventSpec>{
	protected List<FieldSpec> fieldSpecs;
	protected String type;
	protected transient EventSpec prototype;
	protected int showPreviousCount = 0;  // 如果是multi-event, 0表示不显示之前的记录,-1表示显示所有之前的记录, 1~N表示显示前1~N条记录
	protected int showNextCount = 0;  // 如果是multi-event, 0表示不显示next的记录,-1表示显示所有next的记录, 1~N表示显示next 1~N条记录

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
	public int getShowPreviousCount() {
		return showPreviousCount;
	}
	public void setShowPreviousCount(int showPreviousCount) {
		this.showPreviousCount = showPreviousCount;
	}

	public int getShowNextCount() {
		return showNextCount;
	}

	public void setShowNextCount(int showNextCount) {
		this.showNextCount = showNextCount;
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
	
	protected Set<String> assignFlag = new HashSet<>();
	protected boolean testAndClearNotAssigned(String string) {
		if (assignFlag.contains(string)) {
			return false;
		}
		assignFlag.add(string);
		return true;
	}
	
	public void setI18nIfNotExists(String localeCode, String text) {
		if (testAndClearNotAssigned("setI18nIfNotExists")) {
			this.addI18n(localeCode, text);
		}
	}
	
	public void tryAddI18n(String localeCode, String text) {
		if (this.getI18nName() != null && this.getI18nName().containsKey(localeCode)) {
			return; // 如果已经有了,就不更新
		}
		this.addI18n(localeCode, text);
	}
	
	public FieldSpec findField(String fieldName) {
		return this.ensureFieldSpecs().stream().filter(it->it.getName().equals(fieldName)).findFirst().orElse(null);
	}
	
	@Override
	public String getSpecType() {
		return "Event";
	}
	public void mergeWithPrototype() {
		EventSpec baseData = this.getPrototype();
		List<FieldSpec> mineFields = new ArrayList<>();
		baseData.getFieldSpecs().forEach(baseField->{
			FieldSpec myField = this.findField(baseField.getName());
			if (myField == null) {
				mineFields.add(baseField.copy());
				return;
			}
			myField.mergeWith(baseField);
			mineFields.add(myField);
		});
		this.setFieldSpecs(mineFields);
	}
	
	
}
