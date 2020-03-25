package com.terapico.changerequest.builder;

public enum UIStyle {
	INPUT_TEXT("text"),
	INPUT_EMAIL("email"),
	INPUT_URL("url"),
	INPUT_TEXTAREA("textarea"),
	INPUT_LONGTEXT("longtext"),
	INPUT_INTEGER("integer"),
	INPUT_DOUBLE("double"),
	INPUT_DECIMAL("decimal"),
	INPUT_MONEY("money"),
	INPUT_BOOLEAN("boolean"),
	INPUT_DATE("date"),
	INPUT_DATETIME("datetime"),
	INPUT_SINGLE_SELECT("single-select"),
	INPUT_MULTI_SELECT("multi-select"),
	INPUT_TREE_SELECT("tree-select"),
	INPUT_IMAGE("image"),
	INPUT_ARTICLE("article"),
	INPUT_OBJECT_SELECT("object-selector");
	
	
	
	protected String uiStyle;
	
	public String getName() {
		return uiStyle;
	}
	private void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}

	private UIStyle(String styleName) {
		this.setUiStyle(styleName);
	}
}
