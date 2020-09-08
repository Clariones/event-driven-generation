package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventSubcontractApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventsubcontractapplication.EventSubcontractApplication";
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

	public CareerType applicationType() {
		CareerType member = new CareerType();
		member.setModelTypeName("career_type");
		member.setName("application_type");
		member.setMemberName("applicationType");
		member.setReferDirection(true);
		member.setRelationName("applicationType");
		append(member);
		return member;
	}

	public MerchantType merchantType() {
		MerchantType member = new MerchantType();
		member.setModelTypeName("merchant_type");
		member.setName("merchant_type");
		member.setMemberName("merchantType");
		member.setReferDirection(true);
		member.setRelationName("merchantType");
		append(member);
		return member;
	}

	public WorkPackageType workPackageType() {
		WorkPackageType member = new WorkPackageType();
		member.setModelTypeName("work_package_type");
		member.setName("work_package_type");
		member.setMemberName("workPackageType");
		member.setReferDirection(true);
		member.setRelationName("workPackageType");
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

	public StringAttribute applicationUnit(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("applicationUnit");
		member.setName("application_unit");
		useMember(member);
		return member;
	}

	public StringAttribute applicant(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("applicant");
		member.setName("applicant");
		useMember(member);
		return member;
	}

	public StringAttribute applicationReason(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("applicationReason");
		member.setName("application_reason");
		useMember(member);
		return member;
	}

	public StringAttribute phone(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("phone");
		member.setName("phone");
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

