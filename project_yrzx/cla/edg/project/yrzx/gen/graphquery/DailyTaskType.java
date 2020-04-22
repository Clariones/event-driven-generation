package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DailyTaskType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.dailytasktype.DailyTaskType";
	}
	// 枚举对象

	// 引用的对象

	public DailyTaskCategory category() {
		DailyTaskCategory member = new DailyTaskCategory();
		member.setModelTypeName("daily_task_category");
		member.setName("category");
		member.setMemberName("category");
		member.setReferDirection(true);
		member.setRelationName("category");
		append(member);
		return member;
	}

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

	public DailyTaskTemplate dailyTaskTemplateList() {
		DailyTaskTemplate member = new DailyTaskTemplate();
		member.setModelTypeName("daily_task_template");
		member.setName("daily_task_type");
		member.setMemberName("dailyTaskTemplateList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterial projectMaterialList() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("daily_task_type");
		member.setMemberName("projectMaterialList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectCommand eventProjectCommandList() {
		EventProjectCommand member = new EventProjectCommand();
		member.setModelTypeName("event_project_command");
		member.setName("directive_type");
		member.setMemberName("eventProjectCommandList");
		member.setRelationName("directiveType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAcceptanceApplication eventAcceptanceApplicationList() {
		EventAcceptanceApplication member = new EventAcceptanceApplication();
		member.setModelTypeName("event_acceptance_application");
		member.setName("acceptance_type");
		member.setMemberName("eventAcceptanceApplicationList");
		member.setRelationName("acceptanceType");
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

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
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

