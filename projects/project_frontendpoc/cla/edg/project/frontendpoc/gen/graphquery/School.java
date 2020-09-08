package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class School extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.school.School";
	}
	// 枚举对象

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
	
	public Professor professorListAsWorkingSchool() {
		Professor member = new Professor();
		member.setModelTypeName("professor");
		member.setName("working_school");
		member.setMemberName("professorListAsWorkingSchool");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Professor professorListAsGraduateSchool() {
		Professor member = new Professor();
		member.setModelTypeName("professor");
		member.setName("graduate_school");
		member.setMemberName("professorListAsGraduateSchool");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CourseMajor courseMajorListAsOwnerSchool() {
		CourseMajor member = new CourseMajor();
		member.setModelTypeName("course_major");
		member.setName("owner_school");
		member.setMemberName("courseMajorListAsOwnerSchool");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CourseMajor courseMajorListAsQualificationSchool() {
		CourseMajor member = new CourseMajor();
		member.setModelTypeName("course_major");
		member.setName("qualification_school");
		member.setMemberName("courseMajorListAsQualificationSchool");
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

	public StringAttribute type(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("type");
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

