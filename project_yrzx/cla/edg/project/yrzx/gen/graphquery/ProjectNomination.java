package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectNomination extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectnomination.ProjectNomination";
	}
	// 枚举对象

	// 引用的对象

	public ProjectOrganizationType type() {
		ProjectOrganizationType member = new ProjectOrganizationType();
		member.setModelTypeName("project_organization_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		member.setRelationName("type");
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

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		member.setRelationName("workPackage");
		append(member);
		return member;
	}

	// 被引用的对象

	public ContractReviewRecord contractReviewRecordList() {
		ContractReviewRecord member = new ContractReviewRecord();
		member.setModelTypeName("contract_review_record");
		member.setName("reviewer");
		member.setMemberName("contractReviewRecordList");
		member.setRelationName("reviewer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractCommentsRecord contractCommentsRecordList() {
		ContractCommentsRecord member = new ContractCommentsRecord();
		member.setModelTypeName("contract_comments_record");
		member.setName("submitter");
		member.setMemberName("contractCommentsRecordList");
		member.setRelationName("submitter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public BooleanAttribute active(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("active");
		member.setName("active");
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

