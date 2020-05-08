package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Material extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.material.Material";
	}
	// 枚举对象

	// 引用的对象

	public Merchant vendor() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("vendor");
		member.setMemberName("vendor");
		member.setReferDirection(true);
		member.setRelationName("vendor");
		append(member);
		return member;
	}

	public Measurement measurement() {
		Measurement member = new Measurement();
		member.setModelTypeName("measurement");
		member.setName("measurement");
		member.setMemberName("measurement");
		member.setReferDirection(true);
		member.setRelationName("measurement");
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public NumberAttribute quantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("quantity");
		member.setName("quantity");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

