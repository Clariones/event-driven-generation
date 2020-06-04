package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CareerType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.careertype.CareerType";
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

	public MerchantDetail merchantDetailList() {
		MerchantDetail member = new MerchantDetail();
		member.setModelTypeName("merchant_detail");
		member.setName("career_type");
		member.setMemberName("merchantDetailList");
		member.setRelationName("careerType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PersonalEmplacementApplication personalEmplacementApplicationList() {
		PersonalEmplacementApplication member = new PersonalEmplacementApplication();
		member.setModelTypeName("personal_emplacement_application");
		member.setName("career_type");
		member.setMemberName("personalEmplacementApplicationList");
		member.setRelationName("careerType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SubcontractApplication subcontractApplicationList() {
		SubcontractApplication member = new SubcontractApplication();
		member.setModelTypeName("subcontract_application");
		member.setName("career_type");
		member.setMemberName("subcontractApplicationList");
		member.setRelationName("careerType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventApplyPersonalEmplacement eventApplyPersonalEmplacementList() {
		EventApplyPersonalEmplacement member = new EventApplyPersonalEmplacement();
		member.setModelTypeName("event_apply_personal_emplacement");
		member.setName("career_type");
		member.setMemberName("eventApplyPersonalEmplacementList");
		member.setRelationName("careerType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventFillPersonalDetail eventFillPersonalDetailList() {
		EventFillPersonalDetail member = new EventFillPersonalDetail();
		member.setModelTypeName("event_fill_personal_detail");
		member.setName("career_type");
		member.setMemberName("eventFillPersonalDetailList");
		member.setRelationName("careerType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventSubcontractApplication eventSubcontractApplicationList() {
		EventSubcontractApplication member = new EventSubcontractApplication();
		member.setModelTypeName("event_subcontract_application");
		member.setName("application_type");
		member.setMemberName("eventSubcontractApplicationList");
		member.setRelationName("applicationType");
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

