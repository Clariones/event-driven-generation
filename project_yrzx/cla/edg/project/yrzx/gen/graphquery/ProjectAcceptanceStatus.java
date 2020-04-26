package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectAcceptanceStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectacceptancestatus.ProjectAcceptanceStatus";
	}
	// 枚举对象
	public static EnumAttribute IN_APPLICATION = new EnumAttribute("com.yrdec.yrzx.projectacceptancestatus.ProjectAcceptanceStatus", "IN_APPLICATION");
	public static EnumAttribute APPLICATION_CANCELLED = new EnumAttribute("com.yrdec.yrzx.projectacceptancestatus.ProjectAcceptanceStatus", "APPLICATION_CANCELLED");
	public static EnumAttribute IN_ACCEPTANCE = new EnumAttribute("com.yrdec.yrzx.projectacceptancestatus.ProjectAcceptanceStatus", "IN_ACCEPTANCE");
	public static EnumAttribute APPROVED = new EnumAttribute("com.yrdec.yrzx.projectacceptancestatus.ProjectAcceptanceStatus", "APPROVED");
	public static EnumAttribute UNAPPROVED = new EnumAttribute("com.yrdec.yrzx.projectacceptancestatus.ProjectAcceptanceStatus", "UNAPPROVED");

	// 引用的对象

	// 被引用的对象

	public ProjectAcceptance projectAcceptanceList() {
		ProjectAcceptance member = new ProjectAcceptance();
		member.setModelTypeName("project_acceptance");
		member.setName("status");
		member.setMemberName("projectAcceptanceList");
		member.setRelationName("status");
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

