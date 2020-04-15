package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WechatWorkappIdentify extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.wechatworkappidentify.WechatWorkappIdentify";
	}
	// 枚举对象

	// 引用的对象

	public SecUser secUser() {
		SecUser member = new SecUser();
		member.setModelTypeName("sec_user");
		member.setName("sec_user");
		member.setMemberName("secUser");
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

	public StringAttribute corpId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("corpId");
		useMember(member);
		return member;
	}

	public StringAttribute userId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userId");
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

	public DateTimeAttribute lastLoginTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("lastLoginTime");
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

