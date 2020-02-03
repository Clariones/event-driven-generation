package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Teacher extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.teacher.Teacher";
	}
	// 枚举对象

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public User user() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("user");
		member.setMemberName("user");
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
	
	public ClassDailyHealthSurvey classDailyHealthSurveyList() {
		ClassDailyHealthSurvey member = new ClassDailyHealthSurvey();
		member.setModelTypeName("class_daily_health_survey");
		member.setName("teacher");
		member.setMemberName("classDailyHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StudentHealthSurvey studentHealthSurveyList() {
		StudentHealthSurvey member = new StudentHealthSurvey();
		member.setModelTypeName("student_health_survey");
		member.setName("teacher");
		member.setMemberName("studentHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HealthSurveyReport healthSurveyReportList() {
		HealthSurveyReport member = new HealthSurveyReport();
		member.setModelTypeName("health_survey_report");
		member.setName("teacher");
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

	public StringAttribute mobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("mobile");
		useMember(member);
		return member;
	}

	public StringAttribute school(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("school");
		useMember(member);
		return member;
	}

	public StringAttribute schoolClass(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("schoolClass");
		useMember(member);
		return member;
	}

	public NumberAttribute classSize(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("classSize");
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

