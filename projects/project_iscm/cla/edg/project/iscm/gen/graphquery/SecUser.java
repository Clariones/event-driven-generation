package cla.edg.project.iscm.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class SecUser extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.iscm.secuser.SecUser";
	}
	// 枚举对象

	// 引用的对象

	public UserDomain domain() {
		UserDomain member = new UserDomain();
		member.setModelTypeName("user_domain");
		member.setName("domain");
		member.setMemberName("domain");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public UserApp userAppList() {
		UserApp member = new UserApp();
		member.setModelTypeName("user_app");
		member.setName("sec_user");
		member.setMemberName("userAppList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoginHistory loginHistoryList() {
		LoginHistory member = new LoginHistory();
		member.setModelTypeName("login_history");
		member.setName("sec_user");
		member.setMemberName("loginHistoryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatWorkappIdentify wechatWorkappIdentifyList() {
		WechatWorkappIdentify member = new WechatWorkappIdentify();
		member.setModelTypeName("wechat_workapp_identify");
		member.setName("sec_user");
		member.setMemberName("wechatWorkappIdentifyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatMiniappIdentify wechatMiniappIdentifyList() {
		WechatMiniappIdentify member = new WechatMiniappIdentify();
		member.setModelTypeName("wechat_miniapp_identify");
		member.setName("sec_user");
		member.setMemberName("wechatMiniappIdentifyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute login(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("login");
		useMember(member);
		return member;
	}

	public StringAttribute mobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("mobile");
		useMember(member);
		return member;
	}

	public StringAttribute email(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_email");
		member.setName("email");
		useMember(member);
		return member;
	}

	public StringAttribute pwd(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_password");
		member.setName("pwd");
		useMember(member);
		return member;
	}

	public StringAttribute weixinOpenid(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("weixinOpenid");
		useMember(member);
		return member;
	}

	public StringAttribute weixinAppid(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("weixinAppid");
		useMember(member);
		return member;
	}

	public StringAttribute accessToken(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("accessToken");
		useMember(member);
		return member;
	}

	public NumberAttribute verificationCode(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("verificationCode");
		useMember(member);
		return member;
	}

	public DateTimeAttribute verificationCodeExpire(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("verificationCodeExpire");
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

