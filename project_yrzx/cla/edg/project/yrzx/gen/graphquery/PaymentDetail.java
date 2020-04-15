package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentDetail extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.paymentdetail.PaymentDetail";
	}
	// 枚举对象

	// 引用的对象

	public PaymentStatus paymentStatus() {
		PaymentStatus member = new PaymentStatus();
		member.setModelTypeName("payment_status");
		member.setName("payment_status");
		member.setMemberName("paymentStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant payerMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payer_merchant");
		member.setMemberName("payerMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination payerEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("payer_employee");
		member.setMemberName("payerEmployee");
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
	
	public PaymentItem paymentItemList() {
		PaymentItem member = new PaymentItem();
		member.setModelTypeName("payment_item");
		member.setName("payment_detail");
		member.setMemberName("paymentItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentSucceedRecord paymentSucceedRecordList() {
		PaymentSucceedRecord member = new PaymentSucceedRecord();
		member.setModelTypeName("payment_succeed_record");
		member.setName("payment_detail");
		member.setMemberName("paymentSucceedRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentRecord paymentRecordList() {
		PaymentRecord member = new PaymentRecord();
		member.setModelTypeName("payment_record");
		member.setName("payment_detail");
		member.setMemberName("paymentRecordList");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public StringAttribute paymentWaySummary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("paymentWaySummary");
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

	public DateTimeAttribute paidTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("paidTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute cancelTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("cancelTime");
		useMember(member);
		return member;
	}

	public StringAttribute businessValidateUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("businessValidateUrl");
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

