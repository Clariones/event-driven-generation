package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class StudentHealthSurvey extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.studenthealthsurvey.StudentHealthSurvey";
	}
	// 枚举对象

	// 引用的对象

	public Student student() {
		Student member = new Student();
		member.setModelTypeName("student");
		member.setName("student");
		member.setMemberName("student");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SurveyStatus surveyStatus() {
		SurveyStatus member = new SurveyStatus();
		member.setModelTypeName("survey_status");
		member.setName("survey_status");
		member.setMemberName("surveyStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Teacher teacher() {
		Teacher member = new Teacher();
		member.setModelTypeName("teacher");
		member.setName("teacher");
		member.setMemberName("teacher");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ClassDailyHealthSurvey classDailyHealthSurvey() {
		ClassDailyHealthSurvey member = new ClassDailyHealthSurvey();
		member.setModelTypeName("class_daily_health_survey");
		member.setName("class_daily_health_survey");
		member.setMemberName("classDailyHealthSurvey");
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
	
	public StudentDailyAnswer studentDailyAnswerList() {
		StudentDailyAnswer member = new StudentDailyAnswer();
		member.setModelTypeName("student_daily_answer");
		member.setName("student_health_survey");
		member.setMemberName("studentDailyAnswerList");
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

	public DateTimeAttribute answerTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("answerTime");
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

