package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CoatingType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.coatingtype.CoatingType";
	}
	// 枚举对象
	public static EnumAttribute STANDARD_AR_COATING = new EnumAttribute("com.doublechaintech.optical.coatingtype.CoatingType", "STANDARD_AR_COATING");
	public static EnumAttribute SUPER_HYDROPHOBIC_WATER_RESISTANT_AR_COATING = new EnumAttribute("com.doublechaintech.optical.coatingtype.CoatingType", "SUPER_HYDROPHOBIC_WATER_RESISTANT_AR_COATING");
	public static EnumAttribute OLEOPHOBIC_AR_COATING = new EnumAttribute("com.doublechaintech.optical.coatingtype.CoatingType", "OLEOPHOBIC_AR_COATING");
	public static EnumAttribute MIRROR_FINISH_OLEOPHOBIC_COATING = new EnumAttribute("com.doublechaintech.optical.coatingtype.CoatingType", "MIRROR_FINISH_OLEOPHOBIC_COATING");

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

	public LensArCoating lensArCoatingList() {
		LensArCoating member = new LensArCoating();
		member.setModelTypeName("lens_ar_coating");
		member.setName("coating_type");
		member.setMemberName("lensArCoatingList");
		member.setRelationName("coatingType");
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

