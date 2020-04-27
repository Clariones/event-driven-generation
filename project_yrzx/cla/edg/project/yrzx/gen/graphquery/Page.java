package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Page extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.page.Page";
	}
	// 枚举对象
	public static EnumAttribute WXAPP_HOMEPAGE = new EnumAttribute("com.yrdec.yrzx.page.Page", "WXAPP_HOMEPAGE");
	public static EnumAttribute GOLDEN_SERVICE = new EnumAttribute("com.yrdec.yrzx.page.Page", "GOLDEN_SERVICE");
	public static EnumAttribute DESIGNER = new EnumAttribute("com.yrdec.yrzx.page.Page", "DESIGNER");
	public static EnumAttribute ORGNIZATION = new EnumAttribute("com.yrdec.yrzx.page.Page", "ORGNIZATION");
	public static EnumAttribute ASSOCIATION = new EnumAttribute("com.yrdec.yrzx.page.Page", "ASSOCIATION");
	public static EnumAttribute BIZ_CHAIN = new EnumAttribute("com.yrdec.yrzx.page.Page", "BIZ_CHAIN");
	public static EnumAttribute REAL_ESTATE = new EnumAttribute("com.yrdec.yrzx.page.Page", "REAL_ESTATE");

	// 引用的对象

	public PageType pageType() {
		PageType member = new PageType();
		member.setModelTypeName("page_type");
		member.setName("page_type");
		member.setMemberName("pageType");
		member.setReferDirection(true);
		member.setRelationName("pageType");
		append(member);
		return member;
	}

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

	public Slide slideList() {
		Slide member = new Slide();
		member.setModelTypeName("slide");
		member.setName("page");
		member.setMemberName("slideList");
		member.setRelationName("page");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UiAction uiActionList() {
		UiAction member = new UiAction();
		member.setModelTypeName("ui_action");
		member.setName("page");
		member.setMemberName("uiActionList");
		member.setRelationName("page");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Section sectionList() {
		Section member = new Section();
		member.setModelTypeName("section");
		member.setName("page");
		member.setMemberName("sectionList");
		member.setRelationName("page");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WelcomeSlide welcomeSlideList() {
		WelcomeSlide member = new WelcomeSlide();
		member.setModelTypeName("welcome_slide");
		member.setName("show_in");
		member.setMemberName("welcomeSlideList");
		member.setRelationName("showIn");
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

	public StringAttribute pageTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("pageTitle");
		member.setName("page_title");
		useMember(member);
		return member;
	}

	public StringAttribute linkToUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("linkToUrl");
		member.setName("link_to_url");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

