package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Shipping extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.shipping.Shipping";
	}
	// 枚举对象

	// 引用的对象

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

	public ShippingAddress shippingAddress() {
		ShippingAddress member = new ShippingAddress();
		member.setModelTypeName("shipping_address");
		member.setName("shipping_address");
		member.setMemberName("shippingAddress");
		member.setReferDirection(true);
		member.setRelationName("shippingAddress");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

