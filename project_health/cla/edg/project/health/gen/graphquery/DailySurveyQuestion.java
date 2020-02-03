package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class DailySurveyQuestion extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.dailysurveyquestion.DailySurveyQuestion";
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

	public ClassDailyHealthSurvey classDailyHealthSurvey() {
		ClassDailyHealthSurvey member = new ClassDailyHealthSurvey();
		member.setModelTypeName("class_daily_health_survey");
		member.setName("class_daily_health_survey");
		member.setMemberName("classDailyHealthSurvey");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Question surveyQuestion() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("survey_question");
		member.setMemberName("surveyQuestion");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public StudentDailyAnswer studentDailyAnswerList() {
		StudentDailyAnswer member = new StudentDailyAnswer();
		member.setModelTypeName("student_daily_answer");
		member.setName("question");
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

