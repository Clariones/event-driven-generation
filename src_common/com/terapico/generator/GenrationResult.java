package com.terapico.generator;

import java.util.Map;

public class GenrationResult {
	public static final String ACTION_REPLACE = "replace";
	public static final String ACTION_CREATE_WHEN_NEED = "create_when_need";
	public static final String ACTION_MERGE = "merge";
	public static final String CONTENT_TEXT = "text";
	
	protected String fileName;
	protected String content;
	protected String contentCode;
	protected String actionCode;
	protected Map<String, Object> additionalData;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Map<String, Object> getAdditionalData() {
		return additionalData;
	}
	public void setAdditionalData(Map<String, Object> additionalData) {
		this.additionalData = additionalData;
	}
	public String getContentCode() {
		return contentCode;
	}
	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	
	public GenrationResult as_new_file() {
		this.setActionCode(ACTION_REPLACE);
		return this;
	}
	public GenrationResult when_not_exist() {
		this.setActionCode(ACTION_CREATE_WHEN_NEED);
		return this;
	}
	
}
