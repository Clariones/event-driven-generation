package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractPayItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractpayitem.ContractPayItem";
	}
	// 枚举对象

	// 引用的对象

	public StandardContract contract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("contract");
		member.setMemberName("contract");
		member.setReferDirection(true);
		member.setRelationName("contract");
		append(member);
		return member;
	}

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

	public PayItemStatus payItemStatus() {
		PayItemStatus member = new PayItemStatus();
		member.setModelTypeName("pay_item_status");
		member.setName("pay_item_status");
		member.setMemberName("payItemStatus");
		member.setReferDirection(true);
		member.setRelationName("payItemStatus");
		append(member);
		return member;
	}

	public PayItemType payItemType() {
		PayItemType member = new PayItemType();
		member.setModelTypeName("pay_item_type");
		member.setName("pay_item_type");
		member.setMemberName("payItemType");
		member.setReferDirection(true);
		member.setRelationName("payItemType");
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

	// 被引用的对象

	public SupplementaryContractPayItem supplementaryContractPayItemList() {
		SupplementaryContractPayItem member = new SupplementaryContractPayItem();
		member.setModelTypeName("supplementary_contract_pay_item");
		member.setName("contract_pay_item");
		member.setMemberName("supplementaryContractPayItemList");
		member.setRelationName("contractPayItem");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemList() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("contract_pay_item");
		member.setMemberName("commissionPayItemList");
		member.setRelationName("contractPayItem");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPaymentApplication contractPaymentApplicationList() {
		ContractPaymentApplication member = new ContractPaymentApplication();
		member.setModelTypeName("contract_payment_application");
		member.setName("pay_item");
		member.setMemberName("contractPaymentApplicationList");
		member.setRelationName("payItem");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventAdditionalContractPaymentPhase eventAdditionalContractPaymentPhaseList() {
		EventAdditionalContractPaymentPhase member = new EventAdditionalContractPaymentPhase();
		member.setModelTypeName("event_additional_contract_payment_phase");
		member.setName("payment_item");
		member.setMemberName("eventAdditionalContractPaymentPhaseList");
		member.setRelationName("paymentItem");
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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("brief");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public NumberAttribute paymentPhase(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("paymentPhase");
		member.setName("payment_phase");
		useMember(member);
		return member;
	}

	public NumberAttribute payAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("payAmount");
		member.setName("pay_amount");
		useMember(member);
		return member;
	}

	public StringAttribute payCriteira(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payCriteira");
		member.setName("pay_criteira");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

