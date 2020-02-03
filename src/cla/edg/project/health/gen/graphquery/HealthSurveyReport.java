package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class HealthSurveyReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.healthsurveyreport.HealthSurveyReport";
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

	public Teacher teacher() {
		Teacher member = new Teacher();
		member.setModelTypeName("teacher");
		member.setName("teacher");
		member.setMemberName("teacher");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ClassDailyHealthSurvey survey() {
		ClassDailyHealthSurvey member = new ClassDailyHealthSurvey();
		member.setModelTypeName("class_daily_health_survey");
		member.setName("survey");
		member.setMemberName("survey");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public StudentAnswer studentAnswerList() {
		StudentAnswer member = new StudentAnswer();
		member.setModelTypeName("student_answer");
		member.setName("health_survey_report");
		member.setMemberName("studentAnswerList");
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

	public StringAttribute surveyName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("surveyName");
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

	public StringAttribute teacherName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("teacherName");
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

	public StringAttribute studentName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("studentName");
		useMember(member);
		return member;
	}

	public StringAttribute studentNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("studentNumber");
		useMember(member);
		return member;
	}

	public StringAttribute guardianName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("guardianName");
		useMember(member);
		return member;
	}

	public StringAttribute guardianMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("guardianMobile");
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

