package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MainOrder extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.mainorder.MainOrder";
	}
	// 枚举对象

	// 引用的对象

	public User buyer() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("buyer");
		member.setMemberName("buyer");
		member.setReferDirection(true);
		member.setRelationName("buyer");
		append(member);
		return member;
	}

	public Merchant seller() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("seller");
		member.setMemberName("seller");
		member.setReferDirection(true);
		member.setRelationName("seller");
		append(member);
		return member;
	}

	public OrderStatus status() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

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

	public OrderItem orderItemList() {
		OrderItem member = new OrderItem();
		member.setModelTypeName("order_item");
		member.setName("main_order");
		member.setMemberName("orderItemList");
		member.setRelationName("mainOrder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Shipping shippingList() {
		Shipping member = new Shipping();
		member.setModelTypeName("shipping");
		member.setName("main_order");
		member.setMemberName("shippingList");
		member.setRelationName("mainOrder");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("main_order");
		member.setMemberName("paymentDetailList");
		member.setRelationName("mainOrder");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public NumberAttribute totalAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("totalAmount");
		member.setName("total_amount");
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

	public DateTimeAttribute orderPlaceTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("orderPlaceTime");
		member.setName("order_place_time");
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

