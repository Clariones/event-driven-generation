package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaterialPreservedSample extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.materialpreservedsample.MaterialPreservedSample";
	}
	// 枚举对象

	// 引用的对象

	public StandardContract contract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("contract");
		member.setMemberName("contract");
		member.setReferDirection(true);
		member.setRelationName("contract");
		append(member);
		return member;
	}

	public MaterialCategory materialCategory() {
		MaterialCategory member = new MaterialCategory();
		member.setModelTypeName("material_category");
		member.setName("material_category");
		member.setMemberName("materialCategory");
		member.setReferDirection(true);
		member.setRelationName("materialCategory");
		append(member);
		return member;
	}

	public MaterialUnitOfMeasurement materialUnitOfMeasurement() {
		MaterialUnitOfMeasurement member = new MaterialUnitOfMeasurement();
		member.setModelTypeName("material_unit_of_measurement");
		member.setName("material_unit_of_measurement");
		member.setMemberName("materialUnitOfMeasurement");
		member.setReferDirection(true);
		member.setRelationName("materialUnitOfMeasurement");
		append(member);
		return member;
	}

	public ProjectNomination materialManager() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("material_manager");
		member.setMemberName("materialManager");
		member.setReferDirection(true);
		member.setRelationName("materialManager");
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

	public DailyTaskType dailyTaskType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("daily_task_type");
		member.setMemberName("dailyTaskType");
		member.setReferDirection(true);
		member.setRelationName("dailyTaskType");
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

	public StringAttribute materialName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("materialName");
		member.setName("material_name");
		useMember(member);
		return member;
	}

	public StringAttribute position(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("position");
		member.setName("position");
		useMember(member);
		return member;
	}

	public StringAttribute model(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("model");
		member.setName("model");
		useMember(member);
		return member;
	}

	public StringAttribute materialBrand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("materialBrand");
		member.setName("material_brand");
		useMember(member);
		return member;
	}

	public StringAttribute supplier(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("supplier");
		member.setName("supplier");
		useMember(member);
		return member;
	}

	public StringAttribute sealUpMaterialName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("sealUpMaterialName");
		member.setName("seal_up_material_name");
		useMember(member);
		return member;
	}

	public StringAttribute images(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("images");
		member.setName("images");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

