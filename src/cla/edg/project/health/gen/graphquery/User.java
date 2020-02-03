package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class User extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.user.User";
	}
	// 枚举对象

	// 引用的对象

	public Location address() {
		Location member = new Location();
		member.setModelTypeName("location");
		member.setName("address");
		member.setMemberName("address");
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

	// 被引用的对象
	
	public Teacher teacherList() {
		Teacher member = new Teacher();
		member.setModelTypeName("teacher");
		member.setName("user");
		member.setMemberName("teacherList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Student studentList() {
		Student member = new Student();
		member.setModelTypeName("student");
		member.setName("user");
		member.setMemberName("studentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Question questionList() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("creator");
		member.setMemberName("questionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ClassDailyHealthSurvey classDailyHealthSurveyList() {
		ClassDailyHealthSurvey member = new ClassDailyHealthSurvey();
		member.setModelTypeName("class_daily_health_survey");
		member.setName("creator");
		member.setMemberName("classDailyHealthSurveyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WechatLoginInfo wechatLoginInfoList() {
		WechatLoginInfo member = new WechatLoginInfo();
		member.setModelTypeName("wechat_login_info");
		member.setName("user");
		member.setMemberName("wechatLoginInfoList");
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

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("avatar");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

