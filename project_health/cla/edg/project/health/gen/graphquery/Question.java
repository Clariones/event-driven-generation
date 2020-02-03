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

	public User creator() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("creator");
		member.setMemberName("creator");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ChangeRequest cq() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("cq");
		member.setMemberName("cq");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public DailySurveyQuestion dailySurveyQuestionList() {
		DailySurveyQuestion member = new DailySurveyQuestion();
		member.setModelTypeName("daily_survey_question");
		member.setName("survey_question");
		member.setMemberName("dailySurveyQuestionList");
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

