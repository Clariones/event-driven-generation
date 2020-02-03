package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class StudentAnswer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.studentanswer.StudentAnswer";
	}
	// 枚举对象

	// 引用的对象

	public HealthSurveyReport healthSurveyReport() {
		HealthSurveyReport member = new HealthSurveyReport();
		member.setModelTypeName("health_survey_report");
		member.setName("health_survey_report");
		member.setMemberName("healthSurveyReport");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public StudentDailyAnswer dailyAnswer() {
		StudentDailyAnswer member = new StudentDailyAnswer();
		member.setModelTypeName("student_daily_answer");
		member.setName("daily_answer");
		member.setMemberName("dailyAnswer");
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

	public StringAttribute questionTopic(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("questionTopic");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

