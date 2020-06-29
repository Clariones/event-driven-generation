package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractPaymentPhase extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractpaymentphase.ContractPaymentPhase";
	}
	// 枚举对象

	// 引用的对象

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

	public ContractPayItem contractPayItemList() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("contract_payment_phase");
		member.setMemberName("contractPayItemList");
		member.setRelationName("contractPaymentPhase");
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

