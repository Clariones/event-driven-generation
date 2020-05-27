package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShoppingCart extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.shoppingcart.ShoppingCart";
	}
	// 枚举对象

	// 引用的对象

	public User owner() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
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

	public ShoppingCartItem shoppingCartItemList() {
		ShoppingCartItem member = new ShoppingCartItem();
		member.setModelTypeName("shopping_cart_item");
		member.setName("shopping_cart");
		member.setMemberName("shoppingCartItemList");
		member.setRelationName("shoppingCart");
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

	public NumberAttribute totalAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("totalAmount");
		member.setName("total_amount");
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

