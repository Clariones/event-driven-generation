package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialReviewRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectmaterialreviewrecord.ProjectMaterialReviewRecord";
	}
	// 枚举对象

	// 引用的对象

	public ProjectMaterialReviewRecordStatus status() {
		ProjectMaterialReviewRecordStatus member = new ProjectMaterialReviewRecordStatus();
		member.setModelTypeName("project_material_review_record_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

	public ProjectMaterial projectMaterial() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("project_material");
		member.setMemberName("projectMaterial");
		member.setReferDirection(true);
		member.setRelationName("projectMaterial");
		append(member);
		return member;
	}

	public ProjectNomination reviewer() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("reviewer");
		member.setMemberName("reviewer");
		member.setReferDirection(true);
		member.setRelationName("reviewer");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("comments");
		member.setName("comments");
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

