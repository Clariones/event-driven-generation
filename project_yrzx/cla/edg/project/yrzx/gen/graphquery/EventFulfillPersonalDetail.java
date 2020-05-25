package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventFulfillPersonalDetail extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventfulfillpersonaldetail.EventFulfillPersonalDetail";
	}
	// 枚举对象

	// 引用的对象

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

	public StringAttribute industryType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("industryType");
		member.setName("industry_type");
		useMember(member);
		return member;
	}

	public StringAttribute engineeringType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("engineeringType");
		member.setName("engineering_type");
		useMember(member);
		return member;
	}

	public StringAttribute careerType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("careerType");
		member.setName("career_type");
		useMember(member);
		return member;
	}

	public StringAttribute workingYears(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
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

