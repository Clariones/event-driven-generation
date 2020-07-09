package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class WechatUser extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.wechatuser.WechatUser";
	}
	// 枚举对象

	// 引用的对象

	public Location address() {
		Location member = new Location();
		member.setModelTypeName("location");
		member.setName("address");
		member.setMemberName("address");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Organization organization() {
		Organization member = new Organization();
		member.setModelTypeName("organization");
		member.setName("organization");
		member.setMemberName("organization");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public UserDailyAnswer userDailyAnswerList() {
		UserDailyAnswer member = new UserDailyAnswer();
		member.setModelTypeName("user_daily_answer");
		member.setName("user");
		member.setMemberName("userDailyAnswerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatLoginInfo wechatLoginInfoList() {
		WechatLoginInfo member = new WechatLoginInfo();
		member.setModelTypeName("wechat_login_info");
		member.setName("wechat_user");
		member.setMemberName("wechatLoginInfoList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AnswerQuestion answerQuestionList() {
		AnswerQuestion member = new AnswerQuestion();
		member.setModelTypeName("answer_question");
		member.setName("user");
		member.setMemberName("answerQuestionList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute avarta(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("avarta");
		useMember(member);
		return member;
	}

	public BooleanAttribute isRegisteredSurvey(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("isRegisteredSurvey");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

