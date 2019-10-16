package com.skynet.moyi;


public class BaseEntity {
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getInternalType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BaseEntity mergePrimitiveDataTo(BaseEntity baseDest){
		return null;
	}
}
