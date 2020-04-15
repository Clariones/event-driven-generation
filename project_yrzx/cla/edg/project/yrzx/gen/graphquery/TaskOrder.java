package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TaskOrder extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.taskorder.TaskOrder";
	}
	// 枚举对象

	// 引用的对象

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public OrderStatus status() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant buyerMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("buyer_merchant");
		member.setMemberName("buyerMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant serviceMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("service_merchant");
		member.setMemberName("serviceMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant storeMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("store_merchant");
		member.setMemberName("storeMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public NumberAttribute finalAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("finalAmount");
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

	public DateTimeAttribute deliverTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("deliverTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute receiptTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("receiptTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute closedTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("closedTime");
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

