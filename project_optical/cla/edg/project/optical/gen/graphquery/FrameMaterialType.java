package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrameMaterialType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.framematerialtype.FrameMaterialType";
	}
	// 枚举对象
	public static EnumAttribute TITANIUM = new EnumAttribute("com.doublechaintech.optical.framematerialtype.FrameMaterialType", "TITANIUM");
	public static EnumAttribute MEMORY_TITANIUM = new EnumAttribute("com.doublechaintech.optical.framematerialtype.FrameMaterialType", "MEMORY_TITANIUM");
	public static EnumAttribute STAINLESS_STEEL = new EnumAttribute("com.doublechaintech.optical.framematerialtype.FrameMaterialType", "STAINLESS_STEEL");
	public static EnumAttribute OTHER_METAL = new EnumAttribute("com.doublechaintech.optical.framematerialtype.FrameMaterialType", "OTHER_METAL");
	public static EnumAttribute MIXED_MATERIAL = new EnumAttribute("com.doublechaintech.optical.framematerialtype.FrameMaterialType", "MIXED_MATERIAL");
	public static EnumAttribute PLASTIC = new EnumAttribute("com.doublechaintech.optical.framematerialtype.FrameMaterialType", "PLASTIC");

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
		member.setName("frame_material_type");
		member.setMemberName("frameList");
		member.setRelationName("frameMaterialType");
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

