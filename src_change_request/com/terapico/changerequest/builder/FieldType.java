package com.terapico.changerequest.builder;

public enum FieldType {
	TEXT("string","String", "[1,30]", UIStyle.INPUT_TEXT),
	MULTI_TEXT("longtext", "String", null, UIStyle.INPUT_TEXTAREA),
	RICH_TEXT("richText", "String", null, UIStyle.INPUT_RICHTEXT),
	BOOLEAN("boolean", "Boolean", null, UIStyle.INPUT_BOOLEAN),
	IMAGES("images", "Images", "[1,9]", UIStyle.INPUT_IMAGE),
	IMAGE("image", "String", null, UIStyle.INPUT_IMAGE),
	VIDEO("video", "String", null, UIStyle.INPUT_VIDEO),
	ATTACHMENT("file", "String", null, UIStyle.INPUT_ATTACHMENT),
	DATE("date", "Date", null, UIStyle.INPUT_DATE),
	DATE_TIME("datetime", "DateTime", null, UIStyle.INPUT_DATETIME),
	TIME("time", "Date", null, UIStyle.INPUT_TEXT),
	INTEGER("integer", "Integer", "[-99999999,99999999]", UIStyle.INPUT_INTEGER),
	DECIMAL("decimal", "BigDecimal", "[-99999999.9999,99999999.9999]", UIStyle.INPUT_DECIMAL),
	MONEY("money", "BigDecimal", "[-99999999.9999,99999999.9999]", UIStyle.INPUT_MONEY),
	ARTICLE("article", "String", null, UIStyle.INPUT_RICHTEXT),
	BASE_ENTITY("baseEntity", "BaseEntity", null, UIStyle.INPUT_SINGLE_SELECT),
	MOBILE("mobile", "String", "[11,11]", UIStyle.INPUT_TEXT);
	
	protected String systemTypeName;
	protected String javaTypeName;
	protected String defaultRangeExpression;
	protected UIStyle defaultUiStyle;
	
	private FieldType(String systemTypeName, String javaTypeName, String rangeExpression, UIStyle uiStyle) {
		this.setSystemTypeName(systemTypeName);
		this.setJavaTypeName(javaTypeName);
		this.defaultRangeExpression = rangeExpression;
		this.defaultUiStyle = uiStyle;
	}

	public String getSystemTypeName() {
		return systemTypeName;
	}

	public void setSystemTypeName(String systemTypeName) {
		this.systemTypeName = systemTypeName;
	}

	public String getJavaTypeName() {
		return javaTypeName;
	}

	public void setJavaTypeName(String javaTypeName) {
		this.javaTypeName = javaTypeName;
	}

	public String[] getDefaultRange() {
		if (defaultRangeExpression == null){
			return null;
		}
		return defaultRangeExpression.substring(1, defaultRangeExpression.length()-1).split("\\s*,\\s*");
	}

	public boolean isEquals(Object another) {
		if (another instanceof String) {
			if (this.getSystemTypeName().equals(another)) {
				return true;
			}
		}
		return this.equals(another);
	}

	public static FieldType of(String typeName) {
		for(FieldType ft: FieldType.values()) {
			if (ft.getSystemTypeName().equals(typeName)) {
				return ft;
			}
		}
		return null;
	}

	public UIStyle getDefaultUiStyle() {
		return defaultUiStyle;
	}
}
