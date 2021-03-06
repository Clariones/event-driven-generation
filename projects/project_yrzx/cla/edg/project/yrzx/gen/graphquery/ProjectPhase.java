package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectPhase extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectphase.ProjectPhase";
	}
	// 枚举对象
	public static EnumAttribute INTENTION = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "INTENTION");
	public static EnumAttribute EPC_HOSTING = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "EPC_HOSTING");
	public static EnumAttribute DESIGN_PREPARATION = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "DESIGN_PREPARATION");
	public static EnumAttribute DESIGN_RFP = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "DESIGN_RFP");
	public static EnumAttribute DESIGN_EXECUTING = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "DESIGN_EXECUTING");
	public static EnumAttribute CONSTRUCTING_PREPARATION = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "CONSTRUCTING_PREPARATION");
	public static EnumAttribute CONSTRUCTION_RFP = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "CONSTRUCTION_RFP");
	public static EnumAttribute CONSTRUCTING = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "CONSTRUCTING");
	public static EnumAttribute ACCEPTANCE = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "ACCEPTANCE");
	public static EnumAttribute MAINTENANCE = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "MAINTENANCE");

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

	public Project projectList() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_phase");
		member.setMemberName("projectList");
		member.setRelationName("projectPhase");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgress projectProgressList() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("project_phase");
		member.setMemberName("projectProgressList");
		member.setRelationName("projectPhase");
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

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("icon");
		member.setName("icon");
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

