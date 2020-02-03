package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Student extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.student.Student";
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

	public User user() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("user");
		member.setMemberName("user");
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
	
	public StudentHealthSurvey studentHealthSurveyList() {
		StudentHealthSurvey member = new StudentHealthSurvey();
		member.setModelTypeName("student_health_survey");
		member.setName("student");
		member.setMemberName("studentHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HealthSurveyReport healthSurveyReportList() {
		HealthSurveyReport member = new HealthSurveyReport();
		member.setModelTypeName("health_survey_report");
		member.setName("student");
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

