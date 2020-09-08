package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Question extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.question.Question";
	}
	// 枚举对象

	// 引用的对象

	public QuestionType questionType() {
		QuestionType member = new QuestionType();
		member.setModelTypeName("question_type");
		member.setName("question_type");
		member.setMemberName("questionType");
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

	public Organization organization() {
		Organization member = new Organization();
		member.setModelTypeName("organization");
		member.setName("organization");
		member.setMemberName("organization");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public SurveyQuestion surveyQuestionList() {
		SurveyQuestion member = new SurveyQuestion();
		member.setModelTypeName("survey_question");
		member.setName("question");
		member.setMemberName("surveyQuestionList");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

