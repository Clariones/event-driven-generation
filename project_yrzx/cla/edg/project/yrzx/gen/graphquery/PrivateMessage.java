package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PrivateMessage extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.privatemessage.PrivateMessage";
	}
	// 枚举对象

	// 引用的对象

	public Merchant sender() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("sender");
		member.setMemberName("sender");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant reader() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("reader");
		member.setMemberName("reader");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
		useMember(member);
		return member;
	}

	public BooleanAttribute alreadyRead(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("alreadyRead");
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

