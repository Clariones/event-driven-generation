package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentItemRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.paymentitemrecord.PaymentItemRecord";
	}
	// 枚举对象

	// 引用的对象

	public PaymentOption paymentOption() {
		PaymentOption member = new PaymentOption();
		member.setModelTypeName("payment_option");
		member.setName("payment_option");
		member.setMemberName("paymentOption");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PaymentRecord paymentRecord() {
		PaymentRecord member = new PaymentRecord();
		member.setModelTypeName("payment_record");
		member.setName("payment_record");
		member.setMemberName("paymentRecord");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public StringAttribute paymentStatus(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("paymentStatus");
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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

