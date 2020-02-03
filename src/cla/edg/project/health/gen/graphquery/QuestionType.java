package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class QuestionType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.questiontype.QuestionType";
	}
	// 枚举对象
	public static EnumAttribute SINGLE_SELECT = new EnumAttribute("com.doublechaintech.health.questiontype.QuestionType", "SINGLE_SELECT");
	public static EnumAttribute TEXT_INPUT = new EnumAttribute("com.doublechaintech.health.questiontype.QuestionType", "TEXT_INPUT");

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
	
	public Question questionList() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("question_type");
		member.setMemberName("questionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DailySurveyQuestion dailySurveyQuestionList() {
		DailySurveyQuestion member = new DailySurveyQuestion();
		member.setModelTypeName("daily_survey_question");
		member.setName("question_type");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

