package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LineItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.lineitem.LineItem";
	}
	// 枚举对象

	// 引用的对象

	public Merchant sellerMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("seller_merchant");
		member.setMemberName("sellerMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination sellerEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("seller_employee");
		member.setMemberName("sellerEmployee");
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

	public NumberAttribute unitPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("unitPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute quantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("quantity");
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

	public StringAttribute referObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("referObjectType");
		useMember(member);
		return member;
	}

	public StringAttribute referObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("referObjectId");
		useMember(member);
		return member;
	}

	public StringAttribute referObjectImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("referObjectImage");
		useMember(member);
		return member;
	}

	public StringAttribute skuDetail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("skuDetail");
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

