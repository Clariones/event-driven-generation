package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Worker extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.worker.Worker";
	}
	// 枚举对象

	// 引用的对象

	public Menu menu() {
		Menu member = new Menu();
		member.setModelTypeName("menu");
		member.setName("menu");
		member.setMemberName("menu");
		member.setReferDirection(true);
		member.setRelationName("menu");
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

	public NumberAttribute name(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public NumberAttribute age(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("age");
		member.setName("age");
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

