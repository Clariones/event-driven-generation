package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.changerequest.ChangeRequest";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequestType requestType() {
		ChangeRequestType member = new ChangeRequestType();
		member.setModelTypeName("change_request_type");
		member.setName("request_type");
		member.setMemberName("requestType");
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
	
	public Teacher teacherList() {
		Teacher member = new Teacher();
		member.setModelTypeName("teacher");
		member.setName("change_request");
		member.setMemberName("teacherList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Student studentList() {
		Student member = new Student();
		member.setModelTypeName("student");
		member.setName("change_request");
		member.setMemberName("studentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Question questionList() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("cq");
		member.setMemberName("questionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ClassDailyHealthSurvey classDailyHealthSurveyList() {
		ClassDailyHealthSurvey member = new ClassDailyHealthSurvey();
		member.setModelTypeName("class_daily_health_survey");
		member.setName("change_request");
		member.setMemberName("classDailyHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StudentHealthSurvey studentHealthSurveyList() {
		StudentHealthSurvey member = new StudentHealthSurvey();
		member.setModelTypeName("student_health_survey");
		member.setName("change_request");
		member.setMemberName("studentHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StudentDailyAnswer studentDailyAnswerList() {
		StudentDailyAnswer member = new StudentDailyAnswer();
		member.setModelTypeName("student_daily_answer");
		member.setName("change_request");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

	public StringAttribute remoteIp(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_client_ip");
		member.setName("remoteIp");
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

