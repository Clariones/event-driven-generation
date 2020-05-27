package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShippingAddress extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.shippingaddress.ShippingAddress";
	}
	// 枚举对象

	// 引用的对象

	public Province province() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("province");
		member.setMemberName("province");
		member.setReferDirection(true);
		member.setRelationName("province");
		append(member);
		return member;
	}

	public City city() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("city");
		member.setMemberName("city");
		member.setReferDirection(true);
		member.setRelationName("city");
		append(member);
		return member;
	}

	public District district() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("district");
		member.setMemberName("district");
		member.setReferDirection(true);
		member.setRelationName("district");
		append(member);
		return member;
	}

	public User user() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("user");
		member.setMemberName("user");
		member.setReferDirection(true);
		member.setRelationName("user");
		append(member);
		return member;
	}

	// 被引用的对象

	public Shipping shippingList() {
		Shipping member = new Shipping();
		member.setModelTypeName("shipping");
		member.setName("shipping_address");
		member.setMemberName("shippingList");
		member.setRelationName("shippingAddress");
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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("detail");
		member.setName("detail");
		useMember(member);
		return member;
	}

	public StringAttribute mobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("mobile");
		member.setName("mobile");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

