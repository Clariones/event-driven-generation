package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Notification extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.notification.Notification";
	}
	// 枚举对象

	// 引用的对象

	public Merchant receiver() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("receiver");
		member.setMemberName("receiver");
		member.setReferDirection(true);
		member.setRelationName("receiver");
		append(member);
		return member;
	}

	public Merchant sender() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("sender");
		member.setMemberName("sender");
		member.setReferDirection(true);
		member.setRelationName("sender");
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

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("content");
		member.setName("content");
		useMember(member);
		return member;
	}

	public StringAttribute referObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("referObjectType");
		member.setName("refer_object_type");
		useMember(member);
		return member;
	}

	public StringAttribute referObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("referObjectId");
		member.setName("refer_object_id");
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

