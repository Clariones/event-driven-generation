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

	public DailyTaskSecondType dailyTaskSecondTypeList() {
		DailyTaskSecondType member = new DailyTaskSecondType();
		member.setModelTypeName("daily_task_second_type");
		member.setName("parent");
		member.setMemberName("dailyTaskSecondTypeList");
		member.setRelationName("parent");
		member.setReferDirection(false);
		append(member);
		return member;
	}

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

	public ProjectAcceptance projectAcceptanceList() {
		ProjectAcceptance member = new ProjectAcceptance();
		member.setModelTypeName("project_acceptance");
		member.setName("daily_task_type");
		member.setMemberName("projectAcceptanceList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AfterSales afterSalesList() {
		AfterSales member = new AfterSales();
		member.setModelTypeName("after_sales");
		member.setName("daily_task_type");
		member.setMemberName("afterSalesList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectPenalties projectPenaltiesList() {
		ProjectPenalties member = new ProjectPenalties();
		member.setModelTypeName("project_penalties");
		member.setName("daily_task_type");
		member.setMemberName("projectPenaltiesList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborWageManagementSheet laborWageManagementSheetList() {
		LaborWageManagementSheet member = new LaborWageManagementSheet();
		member.setModelTypeName("labor_wage_management_sheet");
		member.setName("daily_task_type");
		member.setMemberName("laborWageManagementSheetList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectReport projectReportList() {
		ProjectReport member = new ProjectReport();
		member.setModelTypeName("project_report");
		member.setName("daily_task_type");
		member.setMemberName("projectReportList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectCommand projectCommandList() {
		ProjectCommand member = new ProjectCommand();
		member.setModelTypeName("project_command");
		member.setName("daily_task_type");
		member.setMemberName("projectCommandList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialPreservedSample materialPreservedSampleList() {
		MaterialPreservedSample member = new MaterialPreservedSample();
		member.setModelTypeName("material_preserved_sample");
		member.setName("daily_task_type");
		member.setMemberName("materialPreservedSampleList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialBidSample materialBidSampleList() {
		MaterialBidSample member = new MaterialBidSample();
		member.setModelTypeName("material_bid_sample");
		member.setName("daily_task_type");
		member.setMemberName("materialBidSampleList");
		member.setRelationName("dailyTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialRecord materialRecordList() {
		MaterialRecord member = new MaterialRecord();
		member.setModelTypeName("material_record");
		member.setName("daili_task_type");
		member.setMemberName("materialRecordList");
		member.setRelationName("dailiTaskType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialChange materialChangeList() {
		MaterialChange member = new MaterialChange();
		member.setModelTypeName("material_change");
		member.setName("daili_task_type");
		member.setMemberName("materialChangeList");
		member.setRelationName("dailiTaskType");
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

