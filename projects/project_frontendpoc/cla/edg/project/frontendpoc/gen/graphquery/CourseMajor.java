package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CourseMajor extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.coursemajor.CourseMajor";
	}
	// 枚举对象

	// 引用的对象

	public School ownerSchool() {
		School member = new School();
		member.setModelTypeName("school");
		member.setName("owner_school");
		member.setMemberName("ownerSchool");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public School qualificationSchool() {
		School member = new School();
		member.setModelTypeName("school");
		member.setName("qualification_school");
		member.setMemberName("qualificationSchool");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Professor teacher() {
		Professor member = new Professor();
		member.setModelTypeName("professor");
		member.setName("teacher");
		member.setMemberName("teacher");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Professor councelor() {
		Professor member = new Professor();
		member.setModelTypeName("professor");
		member.setName("councelor");
		member.setMemberName("councelor");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
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

