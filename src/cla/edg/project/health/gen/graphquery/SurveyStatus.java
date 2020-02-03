package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class SurveyStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.surveystatus.SurveyStatus";
	}
	// 枚举对象
	public static EnumAttribute UN_SUBMITTED = new EnumAttribute("com.doublechaintech.health.surveystatus.SurveyStatus", "UN_SUBMITTED");
	public static EnumAttribute SUBMITTE = new EnumAttribute("com.doublechaintech.health.surveystatus.SurveyStatus", "SUBMITTE");
	public static EnumAttribute DRAFT = new EnumAttribute("com.doublechaintech.health.surveystatus.SurveyStatus", "DRAFT");

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
	
	public StudentHealthSurvey studentHealthSurveyList() {
		StudentHealthSurvey member = new StudentHealthSurvey();
		member.setModelTypeName("student_health_survey");
		member.setName("survey_status");
		member.setMemberName("studentHealthSurveyList");
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

