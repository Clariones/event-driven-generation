package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.pagetype.PageType";
	}
	// 枚举对象
	public static EnumAttribute HOME = new EnumAttribute("com.doublechaintech.optical.pagetype.PageType", "HOME");
	public static EnumAttribute ME = new EnumAttribute("com.doublechaintech.optical.pagetype.PageType", "ME");
	public static EnumAttribute GENERIC_PAGE = new EnumAttribute("com.doublechaintech.optical.pagetype.PageType", "GENERIC_PAGE");
	public static EnumAttribute LISTOF_PAGE = new EnumAttribute("com.doublechaintech.optical.pagetype.PageType", "LISTOF_PAGE");
	public static EnumAttribute SERVICE_CENTER = new EnumAttribute("com.doublechaintech.optical.pagetype.PageType", "SERVICE_CENTER");
	public static EnumAttribute SIMPLE = new EnumAttribute("com.doublechaintech.optical.pagetype.PageType", "SIMPLE");

	// 引用的对象

	public MobileApp mobileApp() {
		MobileApp member = new MobileApp();
		member.setModelTypeName("mobile_app");
		member.setName("mobile_app");
		member.setMemberName("mobileApp");
		member.setReferDirection(true);
		member.setRelationName("mobileApp");
		append(member);
		return member;
	}

	// 被引用的对象

	public Page pageList() {
		Page member = new Page();
		member.setModelTypeName("page");
		member.setName("page_type");
		member.setMemberName("pageList");
		member.setRelationName("pageType");
		member.setReferDirection(false);
		append(member);
		return member;
	}


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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public BooleanAttribute footerTab(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("footerTab");
		member.setName("footer_tab");
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

