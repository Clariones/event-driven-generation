package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class DailyAnswer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.dailyanswer.DailyAnswer";
	}
	// 枚举对象

	// 引用的对象

	public UserDailyAnswer userDailyAnswer() {
		UserDailyAnswer member = new UserDailyAnswer();
		member.setModelTypeName("user_daily_answer");
		member.setName("user_daily_answer");
		member.setMemberName("userDailyAnswer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public UserAnswer userAnswer() {
		UserAnswer member = new UserAnswer();
		member.setModelTypeName("user_answer");
		member.setName("user_answer");
		member.setMemberName("userAnswer");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

