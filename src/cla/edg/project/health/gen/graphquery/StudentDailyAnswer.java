package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class StudentDailyAnswer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.studentdailyanswer.StudentDailyAnswer";
	}
	// 枚举对象

	// 引用的对象

	public StudentHealthSurvey studentHealthSurvey() {
		StudentHealthSurvey member = new StudentHealthSurvey();
		member.setModelTypeName("student_health_survey");
		member.setName("student_health_survey");
		member.setMemberName("studentHealthSurvey");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public DailySurveyQuestion question() {
		DailySurveyQuestion member = new DailySurveyQuestion();
		member.setModelTypeName("daily_survey_question");
		member.setName("question");
		member.setMemberName("question");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public StudentAnswer studentAnswerList() {
		StudentAnswer member = new StudentAnswer();
		member.setModelTypeName("student_answer");
		member.setName("daily_answer");
		member.setMemberName("studentAnswerList");
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

	public StringAttribute answer(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("answer");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

