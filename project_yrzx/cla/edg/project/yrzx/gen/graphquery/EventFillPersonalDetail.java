package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventFillPersonalDetail extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventfillpersonaldetail.EventFillPersonalDetail";
	}
	// 枚举对象

	// 引用的对象

	public IndustryType industryType() {
		IndustryType member = new IndustryType();
		member.setModelTypeName("industry_type");
		member.setName("industry_type");
		member.setMemberName("industryType");
		member.setReferDirection(true);
		member.setRelationName("industryType");
		append(member);
		return member;
	}

	public EngineeringType engineeringType() {
		EngineeringType member = new EngineeringType();
		member.setModelTypeName("engineering_type");
		member.setName("engineering_type");
		member.setMemberName("engineeringType");
		member.setReferDirection(true);
		member.setRelationName("engineeringType");
		append(member);
		return member;
	}

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

	public StringAttribute merchantId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("merchantId");
		member.setName("merchant_id");
		useMember(member);
		return member;
	}

	public StringAttribute merchantName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("merchantName");
		member.setName("merchant_name");
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

	public NumberAttribute workingYears(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("workingYears");
		member.setName("working_years");
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

