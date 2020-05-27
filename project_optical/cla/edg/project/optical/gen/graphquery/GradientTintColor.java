package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GradientTintColor extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.gradienttintcolor.GradientTintColor";
	}
	// 枚举对象
	public static EnumAttribute GRAY = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "GRAY");
	public static EnumAttribute DARK_GRAY = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "DARK_GRAY");
	public static EnumAttribute GREEN = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "GREEN");
	public static EnumAttribute AMBER = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "AMBER");
	public static EnumAttribute BROWN = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "BROWN");
	public static EnumAttribute BLUE = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "BLUE");
	public static EnumAttribute PURPLE = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "PURPLE");
	public static EnumAttribute PINK = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "PINK");
	public static EnumAttribute YELLOW = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "YELLOW");
	public static EnumAttribute DARK_YELLOW = new EnumAttribute("com.doublechaintech.optical.gradienttintcolor.GradientTintColor", "DARK_YELLOW");

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

	public GradientLensTint gradientLensTintList() {
		GradientLensTint member = new GradientLensTint();
		member.setModelTypeName("gradient_lens_tint");
		member.setName("color");
		member.setMemberName("gradientLensTintList");
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

