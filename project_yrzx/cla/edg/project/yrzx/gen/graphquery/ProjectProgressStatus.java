package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectProgressStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus";
	}
	// 枚举对象
	public static EnumAttribute PLANNED = new EnumAttribute("com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus", "PLANNED");
	public static EnumAttribute EXECUTING = new EnumAttribute("com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus", "EXECUTING");
	public static EnumAttribute ACCEPTED = new EnumAttribute("com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus", "ACCEPTED");
	public static EnumAttribute SETTLEMENT = new EnumAttribute("com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus", "SETTLEMENT");
	public static EnumAttribute DELAYED = new EnumAttribute("com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus", "DELAYED");
	public static EnumAttribute WARNNING = new EnumAttribute("com.yrdec.yrzx.projectprogressstatus.ProjectProgressStatus", "WARNNING");

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

	public ProjectProgress projectProgressList() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("status");
		member.setMemberName("projectProgressList");
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

