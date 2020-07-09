package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class DailyHealthSurvey extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.dailyhealthsurvey.DailyHealthSurvey";
	}
	// 枚举对象

	// 引用的对象

	public Organization organization() {
		Organization member = new Organization();
		member.setModelTypeName("organization");
		member.setName("organization");
		member.setMemberName("organization");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public SurveyQuestion surveyQuestionList() {
		SurveyQuestion member = new SurveyQuestion();
		member.setModelTypeName("survey_question");
		member.setName("survey");
		member.setMemberName("surveyQuestionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public UserDailyAnswer userDailyAnswerList() {
		UserDailyAnswer member = new UserDailyAnswer();
		member.setModelTypeName("user_daily_answer");
		member.setName("daily_health_survey");
		member.setMemberName("userDailyAnswerList");
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

	public DateTimeAttribute surveyTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("surveyTime");
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

