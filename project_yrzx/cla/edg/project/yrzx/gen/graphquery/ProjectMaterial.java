package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterial extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectmaterial.ProjectMaterial";
	}
	// 枚举对象

	// 引用的对象

	public DailyTaskType dailyTaskType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("daily_task_type");
		member.setMemberName("dailyTaskType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public DailyTaskTemplate dailyTaskTemplate() {
		DailyTaskTemplate member = new DailyTaskTemplate();
		member.setModelTypeName("daily_task_template");
		member.setName("daily_task_template");
		member.setMemberName("dailyTaskTemplate");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectMaterialType projectMaterialType() {
		ProjectMaterialType member = new ProjectMaterialType();
		member.setModelTypeName("project_material_type");
		member.setName("project_material_type");
		member.setMemberName("projectMaterialType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination materialSubmitter() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("material_submitter");
		member.setMemberName("materialSubmitter");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MaterialReviewResult materialReviewResult() {
		MaterialReviewResult member = new MaterialReviewResult();
		member.setModelTypeName("material_review_result");
		member.setName("material_review_result");
		member.setMemberName("materialReviewResult");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectMaterialReviewRecord projectMaterialReviewRecordList() {
		ProjectMaterialReviewRecord member = new ProjectMaterialReviewRecord();
		member.setModelTypeName("project_material_review_record");
		member.setName("project_material");
		member.setMemberName("projectMaterialReviewRecordList");
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

	public StringAttribute document(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		// member.setName("document");
		member.setName("document");
		useMember(member);
		return member;
	}

	public StringAttribute reviewResultComment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("reviewResultComment");
		member.setName("review_result_comment");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

