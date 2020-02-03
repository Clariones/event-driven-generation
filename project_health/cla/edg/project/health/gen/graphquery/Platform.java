package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Platform extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.platform.Platform";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public Province provinceList() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("platform");
		member.setMemberName("provinceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public City cityList() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("platform");
		member.setMemberName("cityList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public District districtList() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("platform");
		member.setMemberName("districtList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Teacher teacherList() {
		Teacher member = new Teacher();
		member.setModelTypeName("teacher");
		member.setName("platform");
		member.setMemberName("teacherList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Student studentList() {
		Student member = new Student();
		member.setModelTypeName("student");
		member.setName("platform");
		member.setMemberName("studentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Question questionList() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("platform");
		member.setMemberName("questionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public QuestionType questionTypeList() {
		QuestionType member = new QuestionType();
		member.setModelTypeName("question_type");
		member.setName("platform");
		member.setMemberName("questionTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SurveyStatus surveyStatusList() {
		SurveyStatus member = new SurveyStatus();
		member.setModelTypeName("survey_status");
		member.setName("platform");
		member.setMemberName("surveyStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public User userList() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("platform");
		member.setMemberName("userList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("platform");
		member.setMemberName("changeRequestList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ChangeRequestType changeRequestTypeList() {
		ChangeRequestType member = new ChangeRequestType();
		member.setModelTypeName("change_request_type");
		member.setName("platform");
		member.setMemberName("changeRequestTypeList");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("description");
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

