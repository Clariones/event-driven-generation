package com.terapico.changerequest.builder;

public enum FieldType {
	TEXT("string","String"), 
	MULTI_TEXT("longtext", "String"), 
	BOOLEAN("boolean", "Boolean"), 
	IMAGES("images", "Images"), 
	IMAGE("image", "String"), 
	DATE("date", "Date"), 
	DATE_TIME("datetime", "DateTime"), 
	TIME("time", "Date"), 
	INTEGER("integer", "Integer"), 
	DECIMAL("decimal", "BigDecimal"), 
	MONEY("money", "BigDecimal"),
	ARTICLE("article", "String"),
	BASE_ENTITY("baseEntity", "BaseEntity");
	
	protected String systemTypeName;
	protected String javaTypeName;
	
	private FieldType(String systemTypeName, String javaTypeName) {
		this.setSystemTypeName(systemTypeName);
		this.setJavaTypeName(javaTypeName);
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
	
	
}
