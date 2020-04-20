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
	public static EnumAttribute DESGIN_RFP = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "DESGIN_RFP");
	public static EnumAttribute DESIGN_EXECUTING = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "DESIGN_EXECUTING");
	public static EnumAttribute CONSTRUCTING_PREPARATION = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "CONSTRUCTING_PREPARATION");
	public static EnumAttribute CONSTRUCTION_RFP = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "CONSTRUCTION_RFP");
	public static EnumAttribute CONSTRUCTING = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "CONSTRUCTING");
	public static EnumAttribute MAINTENANCE = new EnumAttribute("com.yrdec.yrzx.projectphase.ProjectPhase", "MAINTENANCE");

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public Project projectList() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_phase");
		member.setMemberName("projectList");
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

