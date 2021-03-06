package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserAnswer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.useranswer.UserAnswer";
	}
	// 枚举对象

	// 引用的对象

	public Question question() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("question");
		member.setMemberName("question");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Exam exam() {
		Exam member = new Exam();
		member.setModelTypeName("exam");
		member.setName("exam");
		member.setMemberName("exam");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public AnswerQuestion answerQuestionList() {
		AnswerQuestion member = new AnswerQuestion();
		member.setModelTypeName("answer_question");
		member.setName("user_answer");
		member.setMemberName("answerQuestionList");
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

	public StringAttribute userSelect(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userSelect");
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

