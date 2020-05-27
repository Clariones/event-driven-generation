package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrameStyle extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.framestyle.FrameStyle";
	}
	// 枚举对象
	public static EnumAttribute BROWLINE = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "BROWLINE");
	public static EnumAttribute CATEYE = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "CATEYE");
	public static EnumAttribute SQUARE = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "SQUARE");
	public static EnumAttribute RECTANGLE = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "RECTANGLE");
	public static EnumAttribute ROUND = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "ROUND");
	public static EnumAttribute RIMLESS = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "RIMLESS");
	public static EnumAttribute HALFRIM = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "HALFRIM");
	public static EnumAttribute TITANIUM = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "TITANIUM");
	public static EnumAttribute METAL = new EnumAttribute("com.doublechaintech.optical.framestyle.FrameStyle", "METAL");

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

	public Frame frameList() {
		Frame member = new Frame();
		member.setModelTypeName("frame");
		member.setName("frame_style");
		member.setMemberName("frameList");
		member.setRelationName("frameStyle");
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

