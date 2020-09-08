package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WechatLoginInfo extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.wechatlogininfo.WechatLoginInfo";
	}
	// 枚举对象

	// 引用的对象

	public ExamUser examUser() {
		ExamUser member = new ExamUser();
		member.setModelTypeName("exam_user");
		member.setName("exam_user");
		member.setMemberName("examUser");
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

	public StringAttribute appId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("appId");
		useMember(member);
		return member;
	}

	public StringAttribute openId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("openId");
		useMember(member);
		return member;
	}

	public StringAttribute sessionKey(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sessionKey");
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

