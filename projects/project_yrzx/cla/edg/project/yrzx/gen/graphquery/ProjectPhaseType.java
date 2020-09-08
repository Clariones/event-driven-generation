package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectPhaseType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectphasetype.ProjectPhaseType";
	}
	// 枚举对象
	public static EnumAttribute INTENTION = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "INTENTION");
	public static EnumAttribute EPC_HOSTING = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "EPC_HOSTING");
	public static EnumAttribute DESIGN_PREPARATION = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "DESIGN_PREPARATION");
	public static EnumAttribute DESGIN_RFP = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "DESGIN_RFP");
	public static EnumAttribute DESIGN_EXECUTING = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "DESIGN_EXECUTING");
	public static EnumAttribute CONSTRUCTING_PREPARATION = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "CONSTRUCTING_PREPARATION");
	public static EnumAttribute CONSTRUCTION_RFP = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "CONSTRUCTION_RFP");
	public static EnumAttribute CONSTRUCTING = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "CONSTRUCTING");
	public static EnumAttribute MAINTENANCE = new EnumAttribute("com.yrdec.yrzx.projectphasetype.ProjectPhaseType", "MAINTENANCE");

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

