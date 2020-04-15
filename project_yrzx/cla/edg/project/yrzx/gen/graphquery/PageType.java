package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.pagetype.PageType";
	}
	// 枚举对象
	public static EnumAttribute HOME = new EnumAttribute("com.yrdec.yrzx.pagetype.PageType", "HOME");
	public static EnumAttribute ME = new EnumAttribute("com.yrdec.yrzx.pagetype.PageType", "ME");
	public static EnumAttribute GENERIC_PAGE = new EnumAttribute("com.yrdec.yrzx.pagetype.PageType", "GENERIC_PAGE");
	public static EnumAttribute LISTOF_PAGE = new EnumAttribute("com.yrdec.yrzx.pagetype.PageType", "LISTOF_PAGE");
	public static EnumAttribute SERVICE_CENTER = new EnumAttribute("com.yrdec.yrzx.pagetype.PageType", "SERVICE_CENTER");
	public static EnumAttribute SIMPLE = new EnumAttribute("com.yrdec.yrzx.pagetype.PageType", "SIMPLE");

	// 引用的对象

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
	
	public Page pageList() {
		Page member = new Page();
		member.setModelTypeName("page");
		member.setName("page_type");
		member.setMemberName("pageList");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
		useMember(member);
		return member;
	}

	public BooleanAttribute footerTab(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("footerTab");
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

