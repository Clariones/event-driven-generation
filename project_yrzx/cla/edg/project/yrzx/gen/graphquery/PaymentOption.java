package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentOption extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.paymentoption.PaymentOption";
	}
	// 枚举对象

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public PaymentItem paymentItemList() {
		PaymentItem member = new PaymentItem();
		member.setModelTypeName("payment_item");
		member.setName("payment_option");
		member.setMemberName("paymentItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentItemRecord paymentItemRecordList() {
		PaymentItemRecord member = new PaymentItemRecord();
		member.setModelTypeName("payment_item_record");
		member.setName("payment_option");
		member.setMemberName("paymentItemRecordList");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

