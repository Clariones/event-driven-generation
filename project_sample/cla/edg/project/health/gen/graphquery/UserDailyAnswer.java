package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class UserDailyAnswer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.userdailyanswer.UserDailyAnswer";
	}
	// 枚举对象

	// 引用的对象

	public WechatUser user() {
		WechatUser member = new WechatUser();
		member.setModelTypeName("wechat_user");
		member.setName("user");
		member.setMemberName("user");
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

	public DailyHealthSurvey dailyHealthSurvey() {
		DailyHealthSurvey member = new DailyHealthSurvey();
		member.setModelTypeName("daily_health_survey");
		member.setName("daily_health_survey");
		member.setMemberName("dailyHealthSurvey");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public DailyAnswer dailyAnswerList() {
		DailyAnswer member = new DailyAnswer();
		member.setModelTypeName("daily_answer");
		member.setName("user_daily_answer");
		member.setMemberName("dailyAnswerList");
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

	public DateTimeAttribute answerTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("answerTime");
		useMember(member);
		return member;
	}

	public BooleanAttribute isAnswerSubmitted(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("isAnswerSubmitted");
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

