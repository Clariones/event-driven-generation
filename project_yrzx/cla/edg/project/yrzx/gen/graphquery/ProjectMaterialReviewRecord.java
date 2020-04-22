package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialReviewRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectmaterialreviewrecord.ProjectMaterialReviewRecord";
	}
	// 枚举对象

	// 引用的对象

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

	public ProjectMaterialReviewStatus reviewStatus() {
		ProjectMaterialReviewStatus member = new ProjectMaterialReviewStatus();
		member.setModelTypeName("project_material_review_status");
		member.setName("review_status");
		member.setMemberName("reviewStatus");
		member.setReferDirection(true);
		member.setRelationName("reviewStatus");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute reviewComment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("reviewComment");
		member.setName("review_comment");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastReadTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastReadTime");
		member.setName("last_read_time");
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

