package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMainContractExpectedReceipts extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventmaincontractexpectedreceipts.EventMainContractExpectedReceipts";
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

	public StringAttribute projectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectId");
		member.setName("project_id");
		useMember(member);
		return member;
	}

	public StringAttribute projectName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectName");
		member.setName("project_name");
		useMember(member);
		return member;
	}

	public StringAttribute contractId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractId");
		member.setName("contract_id");
		useMember(member);
		return member;
	}

	public StringAttribute payItemId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payItemId");
		member.setName("pay_item_id");
		useMember(member);
		return member;
	}

	public StringAttribute contractName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractName");
		member.setName("contract_name");
		useMember(member);
		return member;
	}

	public StringAttribute contractNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractNumber");
		member.setName("contract_number");
		useMember(member);
		return member;
	}

	public StringAttribute payItemName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payItemName");
		member.setName("pay_item_name");
		useMember(member);
		return member;
	}

	public StringAttribute payCriteria(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payCriteria");
		member.setName("pay_criteria");
		useMember(member);
		return member;
	}

	public StringAttribute payAmount(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payAmount");
		member.setName("pay_amount");
		useMember(member);
		return member;
	}

	public StringAttribute payTime(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payTime");
		member.setName("pay_time");
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

