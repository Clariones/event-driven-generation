package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaterialCategory extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.materialcategory.MaterialCategory";
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
		member.setName("material_category");
		member.setMemberName("materialPreservedSampleList");
		member.setRelationName("materialCategory");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialBidSample materialBidSampleList() {
		MaterialBidSample member = new MaterialBidSample();
		member.setModelTypeName("material_bid_sample");
		member.setName("material_category");
		member.setMemberName("materialBidSampleList");
		member.setRelationName("materialCategory");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialType materialTypeList() {
		MaterialType member = new MaterialType();
		member.setModelTypeName("material_type");
		member.setName("category");
		member.setMemberName("materialTypeList");
		member.setRelationName("category");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialChange materialChangeList() {
		MaterialChange member = new MaterialChange();
		member.setModelTypeName("material_change");
		member.setName("contract_material_category");
		member.setMemberName("materialChangeList");
		member.setRelationName("contractMaterialCategory");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialAcceptanceApplication materialAcceptanceApplicationList() {
		MaterialAcceptanceApplication member = new MaterialAcceptanceApplication();
		member.setModelTypeName("material_acceptance_application");
		member.setName("material_category");
		member.setMemberName("materialAcceptanceApplicationList");
		member.setRelationName("materialCategory");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventMaterialPreservedBasicInfo eventMaterialPreservedBasicInfoList() {
		EventMaterialPreservedBasicInfo member = new EventMaterialPreservedBasicInfo();
		member.setModelTypeName("event_material_preserved_basic_info");
		member.setName("material_category");
		member.setMemberName("eventMaterialPreservedBasicInfoList");
		member.setRelationName("materialCategory");
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

