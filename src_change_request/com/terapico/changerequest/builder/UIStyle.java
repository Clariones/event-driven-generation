package com.terapico.changerequest.builder;

public enum UIStyle {

	INPUT_PROMPT("prompt-message", FieldType.TEXT,"[0,200]"),
	INPUT_HIDDEN("hidden", FieldType.TEXT,"[0,200]"),
	INPUT_TEXT("text", FieldType.TEXT,"[1,30]"),
	INPUT_VERIFY_CODE("vcode", FieldType.TEXT, "[1,18]"),
	INPUT_CODE_SCAN("qr-scan", FieldType.TEXT,"[1,512]"),
	INPUT_EMAIL("email", FieldType.TEXT, "[1,1024]"),
	INPUT_URL("url", FieldType.TEXT, "[1,1024]"),
	INPUT_TEXTAREA("textarea", FieldType.MULTI_TEXT, null),
	INPUT_RICHTEXT("richtext", FieldType.RICH_TEXT, null),
	INPUT_LONGTEXT("long-text", FieldType.MULTI_TEXT, null),
	INPUT_INTEGER("integer", FieldType.INTEGER, "[-99999999,99999999]"),
	INPUT_DOUBLE("double", FieldType.DECIMAL, "[-99999999.9999,99999999.9999]"),
	INPUT_DECIMAL("decimal", FieldType.DECIMAL, "[-99999999.9999,99999999.9999]"),
	INPUT_MONEY("money", FieldType.MONEY, "[-99999999.9999,99999999.9999]"),
	INPUT_BOOLEAN("boolean", FieldType.BOOLEAN, null),
	INPUT_DATE("date", FieldType.DATE, null),
	INPUT_DATETIME("datetime", FieldType.DATE_TIME, null),
	INPUT_SINGLE_SELECT("single-select", FieldType.TEXT, "[1,1]"),
	INPUT_MULTI_SELECT("multi-select", FieldType.TEXT,"[1,99]"),
	INPUT_TREE_SELECT("tree-select", FieldType.TEXT, "[1,1]"),
	INPUT_IMAGE("image", FieldType.IMAGES, "[1,9]"),
	INPUT_VIDEO("video", FieldType.VIDEO, "[1,1]"),
	INPUT_ATTACHMENT("file", FieldType.ATTACHMENT, "[1,1]"),
	INPUT_ARTICLE("article", FieldType.ARTICLE, null),
	INPUT_PICKER("picker", FieldType.TEXT, "[1,60]"),
	INPUT_REGION_PICKER("region-picker", FieldType.BASE_ENTITY, null),
	INPUT_OBJECT_SELECT("object-selector", FieldType.BASE_ENTITY, null),
	INPUT_OBJECT_PICKER("object-picker", FieldType.BASE_ENTITY, null);
	
	
	
	protected String uiStyle;
	protected FieldType defaultFieldType;
	protected String defaultRangeExpression;
	
	public String getName() {
		return uiStyle;
	}

	public FieldType getDefaultFieldType() {
		return defaultFieldType;
	}

	public String[] getDefaultRange() {
		if (defaultRangeExpression == null){
			return null;
		}
		return defaultRangeExpression.substring(1, defaultRangeExpression.length()-1).split("\\s*,\\s*");
	}

	private void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}

	private UIStyle(String styleName, FieldType fieldType, String rangeExpression) {
		this.setUiStyle(styleName);
		this.defaultFieldType = fieldType;
		this.defaultRangeExpression = rangeExpression;
	}
}
