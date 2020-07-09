package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Organization extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.organization.Organization";
	}
	// 枚举对象

	// 引用的对象

	public Supervisor supervisor() {
		Supervisor member = new Supervisor();
		member.setModelTypeName("supervisor");
		member.setName("supervisor");
		member.setMemberName("supervisor");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public District district() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("district");
		member.setMemberName("district");
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
	
	public Question questionList() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("organization");
		member.setMemberName("questionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DailyHealthSurvey dailyHealthSurveyList() {
		DailyHealthSurvey member = new DailyHealthSurvey();
		member.setModelTypeName("daily_health_survey");
		member.setName("organization");
		member.setMemberName("dailyHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public UserDailyAnswer userDailyAnswerList() {
		UserDailyAnswer member = new UserDailyAnswer();
		member.setModelTypeName("user_daily_answer");
		member.setName("organization");
		member.setMemberName("userDailyAnswerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatUser wechatUserList() {
		WechatUser member = new WechatUser();
		member.setModelTypeName("wechat_user");
		member.setName("organization");
		member.setMemberName("wechatUserList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

