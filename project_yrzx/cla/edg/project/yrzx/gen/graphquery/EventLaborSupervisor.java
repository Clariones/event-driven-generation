package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventLaborSupervisor extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventlaborsupervisor.EventLaborSupervisor";
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

	public StringAttribute number(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("number");
		member.setName("number");
		useMember(member);
		return member;
	}

	public StringAttribute creator(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("creator");
		member.setName("creator");
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

	public StringAttribute contractNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractNumber");
		member.setName("contract_number");
		useMember(member);
		return member;
	}

	public StringAttribute bidPriceList(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("bidPriceList");
		member.setName("bid_price_list");
		useMember(member);
		return member;
	}

	public NumberAttribute totalLaborCost(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("totalLaborCost");
		member.setName("total_labor_cost");
		useMember(member);
		return member;
	}

	public StringAttribute projectProgress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectProgress");
		member.setName("project_progress");
		useMember(member);
		return member;
	}

	public DateTimeAttribute planPayDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("planPayDate");
		member.setName("plan_pay_date");
		useMember(member);
		return member;
	}

	public NumberAttribute planPayAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("planPayAmount");
		member.setName("plan_pay_amount");
		useMember(member);
		return member;
	}

	public StringAttribute contractPaymentManager(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractPaymentManager");
		member.setName("contract_payment_manager");
		useMember(member);
		return member;
	}

	public StringAttribute platformLaborManager(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("platformLaborManager");
		member.setName("platform_labor_manager");
		useMember(member);
		return member;
	}

	public DateTimeAttribute actualPayDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("actualPayDate");
		member.setName("actual_pay_date");
		useMember(member);
		return member;
	}

	public NumberAttribute actualPayAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("actualPayAmount");
		member.setName("actual_pay_amount");
		useMember(member);
		return member;
	}

	public StringAttribute paymentManager(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("paymentManager");
		member.setName("payment_manager");
		useMember(member);
		return member;
	}

	public StringAttribute contractorCommitment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractorCommitment");
		member.setName("contractor_commitment");
		useMember(member);
		return member;
	}

	public StringAttribute createTime(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("createTime");
		member.setName("create_time");
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

