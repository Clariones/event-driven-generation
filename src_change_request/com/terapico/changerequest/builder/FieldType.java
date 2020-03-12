package com.terapico.changerequest.builder;

public enum FieldType {
	TEXT("string"), 
	MULTI_TEXT("longtext"), 
	BOOLEAN("boolean"), 
	IMAGES("images"), 
	DATE("date"), 
	DATE_TIME("datetime"), 
	TIME("time"), 
	INTEGER("integer"), 
	DECIMAL("decimal"), 
	MONEY("money");
	
	protected String systemTypeName;
	
	private FieldType(String systemTypeName) {
		this.setSystemTypeName(systemTypeName);
	}

	public String getSystemTypeName() {
		return systemTypeName;
	}

	public void setSystemTypeName(String systemTypeName) {
		this.systemTypeName = systemTypeName;
	}

	public boolean isEquals(Object another) {
		if (another instanceof String) {
			if (this.getSystemTypeName().equals(another)) {
				return true;
			}
		}
		return this.equals(another);
	}
	
	
}
