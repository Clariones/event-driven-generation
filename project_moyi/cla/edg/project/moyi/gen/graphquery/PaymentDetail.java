package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class PaymentDetail extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.paymentdetail.PaymentDetail";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser payer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("payer");
		member.setMemberName("payer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PaymentStatus paymentStatus() {
		PaymentStatus member = new PaymentStatus();
		member.setModelTypeName("payment_status");
		member.setName("payment_status");
		member.setMemberName("paymentStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MainOrder mainOrder() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("main_order");
		member.setMemberName("mainOrder");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public PaymentLineItem paymentLineItemList() {
		PaymentLineItem member = new PaymentLineItem();
		member.setModelTypeName("payment_line_item");
		member.setName("payment_detail");
		member.setMemberName("paymentLineItemList");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
		useMember(member);
		return member;
	}

	public NumberAttribute cashAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("cashAmount");
		useMember(member);
		return member;
	}

	public NumberAttribute ibAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("ibAmount");
		useMember(member);
		return member;
	}

	public NumberAttribute autoIbAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("autoIbAmount");
		useMember(member);
		return member;
	}

	public StringAttribute wxAppId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("wxAppId");
		useMember(member);
		return member;
	}

	public StringAttribute wxOutTradeNo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("wxOutTradeNo");
		useMember(member);
		return member;
	}

	public DateTimeAttribute paidTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("paidTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

