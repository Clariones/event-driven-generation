package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectNomination extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectnomination.ProjectNomination";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		member.setRelationName("project");
		append(member);
		return member;
	}

	public EmployeeNomination worker() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("worker");
		member.setMemberName("worker");
		member.setReferDirection(true);
		member.setRelationName("worker");
		append(member);
		return member;
	}

	public ProjectRole projectRole() {
		ProjectRole member = new ProjectRole();
		member.setModelTypeName("project_role");
		member.setName("project_role");
		member.setMemberName("projectRole");
		member.setReferDirection(true);
		member.setRelationName("projectRole");
		append(member);
		return member;
	}

	public Merchant merchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant");
		member.setMemberName("merchant");
		member.setReferDirection(true);
		member.setRelationName("merchant");
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

	public ProjectMaterialReviewRecord projectMaterialReviewRecordList() {
		ProjectMaterialReviewRecord member = new ProjectMaterialReviewRecord();
		member.setModelTypeName("project_material_review_record");
		member.setName("reviewer");
		member.setMemberName("projectMaterialReviewRecordList");
		member.setRelationName("reviewer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialCommentsRecord projectMaterialCommentsRecordList() {
		ProjectMaterialCommentsRecord member = new ProjectMaterialCommentsRecord();
		member.setModelTypeName("project_material_comments_record");
		member.setName("submitter");
		member.setMemberName("projectMaterialCommentsRecordList");
		member.setRelationName("submitter");
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

	public StringAttribute workTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("workTitle");
		member.setName("work_title");
		useMember(member);
		return member;
	}

	public DateTimeAttribute startDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("startDate");
		member.setName("start_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute endDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("endDate");
		member.setName("end_date");
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

