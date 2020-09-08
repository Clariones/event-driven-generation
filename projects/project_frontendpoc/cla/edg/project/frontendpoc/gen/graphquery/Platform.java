package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.platform.Platform";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public Registration registrationList() {
		Registration member = new Registration();
		member.setModelTypeName("registration");
		member.setName("platform");
		member.setMemberName("registrationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ExamStatus examStatusList() {
		ExamStatus member = new ExamStatus();
		member.setModelTypeName("exam_status");
		member.setName("platform");
		member.setMemberName("examStatusList");
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
	
	public ExamRanking examRankingList() {
		ExamRanking member = new ExamRanking();
		member.setModelTypeName("exam_ranking");
		member.setName("platform");
		member.setMemberName("examRankingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ExamUser examUserList() {
		ExamUser member = new ExamUser();
		member.setModelTypeName("exam_user");
		member.setName("platform");
		member.setMemberName("examUserList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public School schoolList() {
		School member = new School();
		member.setModelTypeName("school");
		member.setName("platform");
		member.setMemberName("schoolList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public JobTitle jobTitleList() {
		JobTitle member = new JobTitle();
		member.setModelTypeName("job_title");
		member.setName("platform");
		member.setMemberName("jobTitleList");
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
	
	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("platform");
		member.setMemberName("changeRequestList");
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

