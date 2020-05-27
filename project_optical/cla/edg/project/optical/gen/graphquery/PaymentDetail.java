package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentDetail extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.paymentdetail.PaymentDetail";
	}
	// 枚举对象

	// 引用的对象

	public PaymentOption paymentOption() {
		PaymentOption member = new PaymentOption();
		member.setModelTypeName("payment_option");
		member.setName("payment_option");
		member.setMemberName("paymentOption");
		member.setReferDirection(true);
		member.setRelationName("paymentOption");
		append(member);
		return member;
	}

	public PaymentStatus paymentStatus() {
		PaymentStatus member = new PaymentStatus();
		member.setModelTypeName("payment_status");
		member.setName("payment_status");
		member.setMemberName("paymentStatus");
		member.setReferDirection(true);
		member.setRelationName("paymentStatus");
		append(member);
		return member;
	}

	public User payer() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("payer");
		member.setMemberName("payer");
		member.setReferDirection(true);
		member.setRelationName("payer");
		append(member);
		return member;
	}

	public MainOrder mainOrder() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("main_order");
		member.setMemberName("mainOrder");
		member.setReferDirection(true);
		member.setRelationName("mainOrder");
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

	public DateTimeAttribute paidTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("paidTime");
		member.setName("paid_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute cancelTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("cancelTime");
		member.setName("cancel_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

