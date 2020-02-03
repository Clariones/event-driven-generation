package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ClassDailyHealthSurvey extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.classdailyhealthsurvey.ClassDailyHealthSurvey";
	}
	// 枚举对象

	// 引用的对象

	public Teacher teacher() {
		Teacher member = new Teacher();
		member.setModelTypeName("teacher");
		member.setName("teacher");
		member.setMemberName("teacher");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public User creator() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("creator");
		member.setMemberName("creator");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public DailySurveyQuestion dailySurveyQuestionList() {
		DailySurveyQuestion member = new DailySurveyQuestion();
		member.setModelTypeName("daily_survey_question");
		member.setName("class_daily_health_survey");
		member.setMemberName("dailySurveyQuestionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StudentHealthSurvey studentHealthSurveyList() {
		StudentHealthSurvey member = new StudentHealthSurvey();
		member.setModelTypeName("student_health_survey");
		member.setName("class_daily_health_survey");
		member.setMemberName("studentHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HealthSurveyReport healthSurveyReportList() {
		HealthSurveyReport member = new HealthSurveyReport();
		member.setModelTypeName("health_survey_report");
		member.setName("survey");
		member.setMemberName("healthSurveyReportList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

