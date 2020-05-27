package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class StandardTintColor extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.standardtintcolor.StandardTintColor";
	}
	// 枚举对象
	public static EnumAttribute GRAY = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "GRAY");
	public static EnumAttribute GREEN = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "GREEN");
	public static EnumAttribute AMBER = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "AMBER");
	public static EnumAttribute BLUE = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "BLUE");
	public static EnumAttribute PURPLE = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "PURPLE");
	public static EnumAttribute PINK = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "PINK");
	public static EnumAttribute YELLOW = new EnumAttribute("com.doublechaintech.optical.standardtintcolor.StandardTintColor", "YELLOW");

	// 引用的对象

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

	public StandardLensTint standardLensTintList() {
		StandardLensTint member = new StandardLensTint();
		member.setModelTypeName("standard_lens_tint");
		member.setName("color");
		member.setMemberName("standardLensTintList");
		member.setRelationName("color");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

