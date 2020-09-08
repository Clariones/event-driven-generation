package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class BusinessType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.businesstype.BusinessType";
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

	public PersonalEmplacementApplication personalEmplacementApplicationList() {
		PersonalEmplacementApplication member = new PersonalEmplacementApplication();
		member.setModelTypeName("personal_emplacement_application");
		member.setName("business_type");
		member.setMemberName("personalEmplacementApplicationList");
		member.setRelationName("businessType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyPersonalEmplacement eventApplyPersonalEmplacementList() {
		EventApplyPersonalEmplacement member = new EventApplyPersonalEmplacement();
		member.setModelTypeName("event_apply_personal_emplacement");
		member.setName("business_type");
		member.setMemberName("eventApplyPersonalEmplacementList");
		member.setRelationName("businessType");
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

	public StringAttribute category(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("category");
		member.setName("category");
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

