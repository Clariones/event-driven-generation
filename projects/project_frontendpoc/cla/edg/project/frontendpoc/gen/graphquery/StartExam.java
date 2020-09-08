package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class StartExam extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.startexam.StartExam";
	}
	// 枚举对象

	// 引用的对象

	public ExamUser user() {
		ExamUser member = new ExamUser();
		member.setModelTypeName("exam_user");
		member.setName("user");
		member.setMemberName("user");
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

	public StringAttribute nickName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("nickName");
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

