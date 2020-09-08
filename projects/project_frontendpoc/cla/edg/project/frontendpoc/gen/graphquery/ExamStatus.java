package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ExamStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.examstatus.ExamStatus";
	}
	// 枚举对象
	public static EnumAttribute STARTED = new EnumAttribute("com.doublechaintech.frontendpoc.examstatus.ExamStatus", "STARTED");
	public static EnumAttribute COMPLETED = new EnumAttribute("com.doublechaintech.frontendpoc.examstatus.ExamStatus", "COMPLETED");

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
	
	public Exam examList() {
		Exam member = new Exam();
		member.setModelTypeName("exam");
		member.setName("status");
		member.setMemberName("examList");
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

