package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Exam extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.exam.Exam";
	}
	// 枚举对象

	// 引用的对象

	public ExamStatus status() {
		ExamStatus member = new ExamStatus();
		member.setModelTypeName("exam_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ExamUser user() {
		ExamUser member = new ExamUser();
		member.setModelTypeName("exam_user");
		member.setName("user");
		member.setMemberName("user");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public UserAnswer userAnswerList() {
		UserAnswer member = new UserAnswer();
		member.setModelTypeName("user_answer");
		member.setName("exam");
		member.setMemberName("userAnswerList");
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

	public StringAttribute myImages(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		member.setName("myImages");
		useMember(member);
		return member;
	}

	public StringAttribute photos(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		member.setName("photos");
		useMember(member);
		return member;
	}

	public NumberAttribute score(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("score");
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

