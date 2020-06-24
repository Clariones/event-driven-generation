package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventContractPaymentPhase extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventcontractpaymentphase.EventContractPaymentPhase";
	}
	// 枚举对象

	// 引用的对象

	public Merchant payer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payer");
		member.setMemberName("payer");
		member.setReferDirection(true);
		member.setRelationName("payer");
		append(member);
		return member;
	}

	public Merchant payee() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payee");
		member.setMemberName("payee");
		member.setReferDirection(true);
		member.setRelationName("payee");
		append(member);
		return member;
	}

	public ProjectProgress projectProgress() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("project_progress");
		member.setMemberName("projectProgress");
		member.setReferDirection(true);
		member.setRelationName("projectProgress");
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

	public StringAttribute criteria(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("criteria");
		member.setName("criteria");
		useMember(member);
		return member;
	}

	public NumberAttribute proportion(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("proportion");
		member.setName("proportion");
		useMember(member);
		return member;
	}

	public NumberAttribute subTotal(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("subTotal");
		member.setName("sub_total");
		useMember(member);
		return member;
	}

	public NumberAttribute laborFeeProportion(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("laborFeeProportion");
		member.setName("labor_fee_proportion");
		useMember(member);
		return member;
	}

	public NumberAttribute laborFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("laborFee");
		member.setName("labor_fee");
		useMember(member);
		return member;
	}

	public NumberAttribute materialFeeProportion(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("materialFeeProportion");
		member.setName("material_fee_proportion");
		useMember(member);
		return member;
	}

	public NumberAttribute materialFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("materialFee");
		member.setName("material_fee");
		useMember(member);
		return member;
	}

	public NumberAttribute otherProportion(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("otherProportion");
		member.setName("other_proportion");
		useMember(member);
		return member;
	}

	public NumberAttribute otherFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("otherFee");
		member.setName("other_fee");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("comments");
		member.setName("comments");
		useMember(member);
		return member;
	}

	public DateTimeAttribute expectedPayTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("expectedPayTime");
		member.setName("expected_pay_time");
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

