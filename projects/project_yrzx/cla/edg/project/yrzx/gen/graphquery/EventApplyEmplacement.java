package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventApplyEmplacement extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventapplyemplacement.EventApplyEmplacement";
	}
	// 枚举对象

	// 引用的对象

	public PartnerType partnerType() {
		PartnerType member = new PartnerType();
		member.setModelTypeName("partner_type");
		member.setName("partner_type");
		member.setMemberName("partnerType");
		member.setReferDirection(true);
		member.setRelationName("partnerType");
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

	public StringAttribute merchantName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("merchantName");
		member.setName("merchant_name");
		useMember(member);
		return member;
	}

	public StringAttribute merchantLocation(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("merchantLocation");
		member.setName("merchant_location");
		useMember(member);
		return member;
	}

	public StringAttribute merchantWebsite(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		// member.setName("merchantWebsite");
		member.setName("merchant_website");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("comments");
		member.setName("comments");
		useMember(member);
		return member;
	}

	public StringAttribute contactName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contactName");
		member.setName("contact_name");
		useMember(member);
		return member;
	}

	public StringAttribute contactMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("contactMobile");
		member.setName("contact_mobile");
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

