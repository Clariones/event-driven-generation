package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.pagetype.PageType";
	}
	// 枚举对象
	public static EnumAttribute SHOPPING_HOMEPAGE_V4 = new EnumAttribute("com.terapico.moyi.pagetype.PageType", "SHOPPING_HOMEPAGE_V4");
	public static EnumAttribute SHOPS_V4 = new EnumAttribute("com.terapico.moyi.pagetype.PageType", "SHOPS_V4");
	public static EnumAttribute ARTISTS_V4 = new EnumAttribute("com.terapico.moyi.pagetype.PageType", "ARTISTS_V4");
	public static EnumAttribute HOMEPAGE_V1 = new EnumAttribute("com.terapico.moyi.pagetype.PageType", "HOMEPAGE_V1");

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		member.setRelationName("moyi");
		append(member);
		return member;
	}

	// 被引用的对象

	public PageSlide pageSlideList() {
		PageSlide member = new PageSlide();
		member.setModelTypeName("page_slide");
		member.setName("page_type");
		member.setMemberName("pageSlideList");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
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

