package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShoppingCartItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.shoppingcartitem.ShoppingCartItem";
	}
	// 枚举对象

	// 引用的对象

	public ShoppingCart shoppingCart() {
		ShoppingCart member = new ShoppingCart();
		member.setModelTypeName("shopping_cart");
		member.setName("shopping_cart");
		member.setMemberName("shoppingCart");
		member.setReferDirection(true);
		member.setRelationName("shoppingCart");
		append(member);
		return member;
	}

	public LineItem lineItem() {
		LineItem member = new LineItem();
		member.setModelTypeName("line_item");
		member.setName("line_item");
		member.setMemberName("lineItem");
		member.setReferDirection(true);
		member.setRelationName("lineItem");
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

