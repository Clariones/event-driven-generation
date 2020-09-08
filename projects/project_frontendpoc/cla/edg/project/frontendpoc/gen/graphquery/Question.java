package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Question extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.question.Question";
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

	// 被引用的对象
	
	public Answer answerList() {
		Answer member = new Answer();
		member.setModelTypeName("answer");
		member.setName("question");
		member.setMemberName("answerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public UserAnswer userAnswerList() {
		UserAnswer member = new UserAnswer();
		member.setModelTypeName("user_answer");
		member.setName("question");
		member.setMemberName("userAnswerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FaultAnswer faultAnswerList() {
		FaultAnswer member = new FaultAnswer();
		member.setModelTypeName("fault_answer");
		member.setName("question");
		member.setMemberName("faultAnswerList");
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

	public StringAttribute topic(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("topic");
		useMember(member);
		return member;
	}

	public StringAttribute level(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("level");
		useMember(member);
		return member;
	}

	public StringAttribute optionA(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("optionA");
		useMember(member);
		return member;
	}

	public StringAttribute optionB(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("optionB");
		useMember(member);
		return member;
	}

	public StringAttribute optionC(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("optionC");
		useMember(member);
		return member;
	}

	public StringAttribute optionD(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("optionD");
		useMember(member);
		return member;
	}

	public StringAttribute optionE(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("optionE");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

