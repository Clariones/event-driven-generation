package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FaultAnswer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.faultanswer.FaultAnswer";
	}
	// 枚举对象

	// 引用的对象

	public ExamUser user() {
		ExamUser member = new ExamUser();
		member.setModelTypeName("exam_user");
		member.setName("user");
		member.setMemberName("user");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Question question() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("question");
		member.setMemberName("question");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute topic(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("topic");
		useMember(member);
		return member;
	}

	public StringAttribute yourAnswer(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("yourAnswer");
		useMember(member);
		return member;
	}

	public StringAttribute rightAnswer(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("rightAnswer");
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

	public NumberAttribute faultTimes(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("faultTimes");
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

