package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaterialChange extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.materialchange.MaterialChange";
	}
	// 枚举对象

	// 引用的对象

	public MaterialCategory contractMaterialCategory() {
		MaterialCategory member = new MaterialCategory();
		member.setModelTypeName("material_category");
		member.setName("contract_material_category");
		member.setMemberName("contractMaterialCategory");
		member.setReferDirection(true);
		member.setRelationName("contractMaterialCategory");
		append(member);
		return member;
	}

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

	public MaterialUnitOfMeasurement contractMaterialUnitOfMeasurement() {
		MaterialUnitOfMeasurement member = new MaterialUnitOfMeasurement();
		member.setModelTypeName("material_unit_of_measurement");
		member.setName("contract_material_unit_of_measurement");
		member.setMemberName("contractMaterialUnitOfMeasurement");
		member.setReferDirection(true);
		member.setRelationName("contractMaterialUnitOfMeasurement");
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

	public ProjectNomination applicant() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("applicant");
		member.setMemberName("applicant");
		member.setReferDirection(true);
		member.setRelationName("applicant");
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

	public DailyTaskType dailiTaskType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("daili_task_type");
		member.setMemberName("dailiTaskType");
		member.setReferDirection(true);
		member.setRelationName("dailiTaskType");
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

	public StringAttribute contractMaterialName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractMaterialName");
		member.setName("contract_material_name");
		useMember(member);
		return member;
	}

	public StringAttribute contractModel(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractModel");
		member.setName("contract_model");
		useMember(member);
		return member;
	}

	public StringAttribute contractMaterialBrand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractMaterialBrand");
		member.setName("contract_material_brand");
		useMember(member);
		return member;
	}

	public StringAttribute changeComments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("changeComments");
		member.setName("change_comments");
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

	public NumberAttribute numberOfChanges(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("numberOfChanges");
		member.setName("number_of_changes");
		useMember(member);
		return member;
	}

	public StringAttribute priceAdjustment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("priceAdjustment");
		member.setName("price_adjustment");
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

	public StringAttribute images(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("images");
		member.setName("images");
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

