package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LineItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.lineitem.LineItem";
	}
	// 枚举对象

	// 引用的对象

	public LineItemType lineItemType() {
		LineItemType member = new LineItemType();
		member.setModelTypeName("line_item_type");
		member.setName("line_item_type");
		member.setMemberName("lineItemType");
		member.setReferDirection(true);
		member.setRelationName("lineItemType");
		append(member);
		return member;
	}

	public PrescriptionGlasses prescriptionGlasses() {
		PrescriptionGlasses member = new PrescriptionGlasses();
		member.setModelTypeName("prescription_glasses");
		member.setName("prescription_glasses");
		member.setMemberName("prescriptionGlasses");
		member.setReferDirection(true);
		member.setRelationName("prescriptionGlasses");
		append(member);
		return member;
	}

	public Prescription prescription() {
		Prescription member = new Prescription();
		member.setModelTypeName("prescription");
		member.setName("prescription");
		member.setMemberName("prescription");
		member.setReferDirection(true);
		member.setRelationName("prescription");
		append(member);
		return member;
	}

	// 被引用的对象

	public OrderItem orderItemList() {
		OrderItem member = new OrderItem();
		member.setModelTypeName("order_item");
		member.setName("line_item");
		member.setMemberName("orderItemList");
		member.setRelationName("lineItem");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShoppingCartItem shoppingCartItemList() {
		ShoppingCartItem member = new ShoppingCartItem();
		member.setModelTypeName("shopping_cart_item");
		member.setName("line_item");
		member.setMemberName("shoppingCartItemList");
		member.setRelationName("lineItem");
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

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("coverImage");
		member.setName("cover_image");
		useMember(member);
		return member;
	}

	public StringAttribute skuId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("skuId");
		member.setName("sku_id");
		useMember(member);
		return member;
	}

	public NumberAttribute quantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("quantity");
		member.setName("quantity");
		useMember(member);
		return member;
	}

	public NumberAttribute unitPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("unitPrice");
		member.setName("unit_price");
		useMember(member);
		return member;
	}

	public StringAttribute prescriptionImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("prescriptionImage");
		member.setName("prescription_image");
		useMember(member);
		return member;
	}

	public NumberAttribute subTotalPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("subTotalPrice");
		member.setName("sub_total_price");
		useMember(member);
		return member;
	}

	public StringAttribute userComments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("userComments");
		member.setName("user_comments");
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

