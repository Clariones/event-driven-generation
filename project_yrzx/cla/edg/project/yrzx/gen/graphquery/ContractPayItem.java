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
		append(member);
		return member;
	}

	public Merchant payer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payer");
		member.setMemberName("payer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant payee() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payee");
		member.setMemberName("payee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PayItemStatus payItemStatus() {
		PayItemStatus member = new PayItemStatus();
		member.setModelTypeName("pay_item_status");
		member.setName("pay_item_status");
		member.setMemberName("payItemStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public CommissionPayItem commissionPayItemList() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("contract_pay_item");
		member.setMemberName("commissionPayItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public NumberAttribute payAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("payAmount");
		useMember(member);
		return member;
	}

	public StringAttribute payCriteira(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("payCriteira");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}
