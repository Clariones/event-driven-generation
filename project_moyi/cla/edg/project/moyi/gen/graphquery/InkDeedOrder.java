package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class InkDeedOrder extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkdeedorder.InkDeedOrder";
	}
	// 枚举对象

	// 引用的对象

	public InkDeedEntryOrder inkDeedEntryOrder() {
		InkDeedEntryOrder member = new InkDeedEntryOrder();
		member.setModelTypeName("ink_deed_entry_order");
		member.setName("ink_deed_entry_order");
		member.setMemberName("inkDeedEntryOrder");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser buyer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("buyer");
		member.setMemberName("buyer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public OrderStatus orderStatus() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("order_status");
		member.setMemberName("orderStatus");
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

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public NumberAttribute quantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("quantity");
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

	public NumberAttribute originalPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("originalPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute finalPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("finalPrice");
		useMember(member);
		return member;
	}

	public StringAttribute buyerHashcode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("buyerHashcode");
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

