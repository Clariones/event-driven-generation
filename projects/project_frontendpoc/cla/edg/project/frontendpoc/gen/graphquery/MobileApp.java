package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MobileApp extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.mobileapp.MobileApp";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public Page pageList() {
		Page member = new Page();
		member.setModelTypeName("page");
		member.setName("mobile_app");
		member.setMemberName("pageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PageType pageTypeList() {
		PageType member = new PageType();
		member.setModelTypeName("page_type");
		member.setName("mobile_app");
		member.setMemberName("pageTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

