package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventApplyPersonalEmplacement extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventapplypersonalemplacement.EventApplyPersonalEmplacement";
	}
	// 枚举对象

	// 引用的对象

	public CareerType careerType() {
		CareerType member = new CareerType();
		member.setModelTypeName("career_type");
		member.setName("career_type");
		member.setMemberName("careerType");
		member.setReferDirection(true);
		member.setRelationName("careerType");
		append(member);
		return member;
	}

	public BusinessType businessType() {
		BusinessType member = new BusinessType();
		member.setModelTypeName("business_type");
		member.setName("business_type");
		member.setMemberName("businessType");
		member.setReferDirection(true);
		member.setRelationName("businessType");
		append(member);
		return member;
	}

	public AvailableServiceLocation serviceLocation() {
		AvailableServiceLocation member = new AvailableServiceLocation();
		member.setModelTypeName("available_service_location");
		member.setName("service_location");
		member.setMemberName("serviceLocation");
		member.setReferDirection(true);
		member.setRelationName("serviceLocation");
		append(member);
		return member;
	}

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		member.setRelationName("changeRequest");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute gender(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("gender");
		member.setName("gender");
		useMember(member);
		return member;
	}

	public StringAttribute address(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("address");
		member.setName("address");
		useMember(member);
		return member;
	}

	public StringAttribute homePage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("homePage");
		member.setName("home_page");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute phone(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("phone");
		member.setName("phone");
		useMember(member);
		return member;
	}

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("avatar");
		member.setName("avatar");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("fieldGroup");
		member.setName("field_group");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorType");
		member.setName("event_initiator_type");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorId");
		member.setName("event_initiator_id");
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

