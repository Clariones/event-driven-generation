package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedOrderLineItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkdeedorderlineitem.InkDeedOrderLineItem";
	}
	// 枚举对象

	// 引用的对象

	public InkDeed inkDeed() {
		InkDeed member = new InkDeed();
		member.setModelTypeName("ink_deed");
		member.setName("ink_deed");
		member.setMemberName("inkDeed");
		member.setReferDirection(true);
		member.setRelationName("inkDeed");
		append(member);
		return member;
	}

	public InkDeedOrder inkDeedOrder() {
		InkDeedOrder member = new InkDeedOrder();
		member.setModelTypeName("ink_deed_order");
		member.setName("ink_deed_order");
		member.setMemberName("inkDeedOrder");
		member.setReferDirection(true);
		member.setRelationName("inkDeedOrder");
		append(member);
		return member;
	}

	public MoyiUser seller() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("seller");
		member.setMemberName("seller");
		member.setReferDirection(true);
		member.setRelationName("seller");
		append(member);
		return member;
	}

	public MoyiUser buyer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("buyer");
		member.setMemberName("buyer");
		member.setReferDirection(true);
		member.setRelationName("buyer");
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

	public NumberAttribute price(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("price");
		member.setName("price");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

