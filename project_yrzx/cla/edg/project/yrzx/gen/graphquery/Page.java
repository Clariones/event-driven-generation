package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Page extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.page.Page";
	}
	// 枚举对象

	// 引用的对象

	public PageType pageType() {
		PageType member = new PageType();
		member.setModelTypeName("page_type");
		member.setName("page_type");
		member.setMemberName("pageType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MobileApp mobileApp() {
		MobileApp member = new MobileApp();
		member.setModelTypeName("mobile_app");
		member.setName("mobile_app");
		member.setMemberName("mobileApp");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public Slide slideList() {
		Slide member = new Slide();
		member.setModelTypeName("slide");
		member.setName("page");
		member.setMemberName("slideList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public UiAction uiActionList() {
		UiAction member = new UiAction();
		member.setModelTypeName("ui_action");
		member.setName("page");
		member.setMemberName("uiActionList");
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

	public StringAttribute pageTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("pageTitle");
		useMember(member);
		return member;
	}

	public StringAttribute linkToUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("linkToUrl");
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

