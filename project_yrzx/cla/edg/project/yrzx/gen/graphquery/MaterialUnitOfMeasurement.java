package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaterialUnitOfMeasurement extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.materialunitofmeasurement.MaterialUnitOfMeasurement";
	}
	// 枚举对象

	// 引用的对象

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

	public MaterialPreservedSample materialPreservedSampleList() {
		MaterialPreservedSample member = new MaterialPreservedSample();
		member.setModelTypeName("material_preserved_sample");
		member.setName("material_unit_of_measurement");
		member.setMemberName("materialPreservedSampleList");
		member.setRelationName("materialUnitOfMeasurement");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialBidSample materialBidSampleList() {
		MaterialBidSample member = new MaterialBidSample();
		member.setModelTypeName("material_bid_sample");
		member.setName("material_unit_of_measurement");
		member.setMemberName("materialBidSampleList");
		member.setRelationName("materialUnitOfMeasurement");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialRecord materialRecordList() {
		MaterialRecord member = new MaterialRecord();
		member.setModelTypeName("material_record");
		member.setName("material_unit_of_measurement");
		member.setMemberName("materialRecordList");
		member.setRelationName("materialUnitOfMeasurement");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialChange materialChangeListAsContractMaterialUnitOfMeasurement() {
		MaterialChange member = new MaterialChange();
		member.setModelTypeName("material_change");
		member.setName("contract_material_unit_of_measurement");
		member.setMemberName("materialChangeListAsContractMaterialUnitOfMeasurement");
		member.setRelationName("contractMaterialUnitOfMeasurement");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialChange materialChangeListAsMaterialUnitOfMeasurement() {
		MaterialChange member = new MaterialChange();
		member.setModelTypeName("material_change");
		member.setName("material_unit_of_measurement");
		member.setMemberName("materialChangeListAsMaterialUnitOfMeasurement");
		member.setRelationName("contractMaterialUnitOfMeasurement");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialAcceptanceApplication materialAcceptanceApplicationList() {
		MaterialAcceptanceApplication member = new MaterialAcceptanceApplication();
		member.setModelTypeName("material_acceptance_application");
		member.setName("material_unit_of_measurement");
		member.setMemberName("materialAcceptanceApplicationList");
		member.setRelationName("materialUnitOfMeasurement");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialChangeInfo eventMaterialChangeInfoList() {
		EventMaterialChangeInfo member = new EventMaterialChangeInfo();
		member.setModelTypeName("event_material_change_info");
		member.setName("uom");
		member.setMemberName("eventMaterialChangeInfoList");
		member.setRelationName("uom");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialAcceptanceBasicInfo eventMaterialAcceptanceBasicInfoList() {
		EventMaterialAcceptanceBasicInfo member = new EventMaterialAcceptanceBasicInfo();
		member.setModelTypeName("event_material_acceptance_basic_info");
		member.setName("uom");
		member.setMemberName("eventMaterialAcceptanceBasicInfoList");
		member.setRelationName("uom");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialChangeContractInfo eventMaterialChangeContractInfoList() {
		EventMaterialChangeContractInfo member = new EventMaterialChangeContractInfo();
		member.setModelTypeName("event_material_change_contract_info");
		member.setName("uom");
		member.setMemberName("eventMaterialChangeContractInfoList");
		member.setRelationName("uom");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialPreservedBasicInfo eventMaterialPreservedBasicInfoList() {
		EventMaterialPreservedBasicInfo member = new EventMaterialPreservedBasicInfo();
		member.setModelTypeName("event_material_preserved_basic_info");
		member.setName("uom");
		member.setMemberName("eventMaterialPreservedBasicInfoList");
		member.setRelationName("uom");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

