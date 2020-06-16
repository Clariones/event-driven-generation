package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PayItemStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.payitemstatus.PayItemStatus";
	}
	// 枚举对象
	public static EnumAttribute PENDING_ON_APPLICATION = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "PENDING_ON_APPLICATION");
	public static EnumAttribute PENDING_ON_AUDIT = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "PENDING_ON_AUDIT");
	public static EnumAttribute APPROVED = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "APPROVED");
	public static EnumAttribute UNAPPROVED = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "UNAPPROVED");
	public static EnumAttribute CONCERN = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "CONCERN");
	public static EnumAttribute PENDING_ON_CONFIRMATION = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "PENDING_ON_CONFIRMATION");
	public static EnumAttribute CONFIRMED = new EnumAttribute("com.yrdec.yrzx.payitemstatus.PayItemStatus", "CONFIRMED");

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象

	public ContractPayItem contractPayItemList() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("pay_item_status");
		member.setMemberName("contractPayItemList");
		member.setRelationName("payItemStatus");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemList() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("pay_item_status");
		member.setMemberName("commissionPayItemList");
		member.setRelationName("payItemStatus");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

