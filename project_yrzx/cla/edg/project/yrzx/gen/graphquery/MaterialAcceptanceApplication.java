package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaterialAcceptanceApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.materialacceptanceapplication.MaterialAcceptanceApplication";
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

	public ProjectNomination auditor() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("auditor");
		member.setMemberName("auditor");
		member.setReferDirection(true);
		member.setRelationName("auditor");
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

	public StringAttribute usePart(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("usePart");
		member.setName("use_part");
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

	public NumberAttribute plannedMaterialAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("plannedMaterialAmount");
		member.setName("planned_material_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute actualMaterialAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("actualMaterialAmount");
		member.setName("actual_material_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute plannedArrivedAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("plannedArrivedAmount");
		member.setName("planned_arrived_amount");
		useMember(member);
		return member;
	}

	public StringAttribute isBroken(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("isBroken");
		member.setName("is_broken");
		useMember(member);
		return member;
	}

	public BooleanAttribute materialMatches(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("materialMatches");
		member.setName("material_matches");
		useMember(member);
		return member;
	}

	public BooleanAttribute meetQuanlityStandard(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("meetQuanlityStandard");
		member.setName("meet_quanlity_standard");
		useMember(member);
		return member;
	}

	public BooleanAttribute hasCertificates(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("hasCertificates");
		member.setName("has_certificates");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

