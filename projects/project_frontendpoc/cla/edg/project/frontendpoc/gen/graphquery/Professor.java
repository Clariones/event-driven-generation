package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Professor extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.professor.Professor";
	}
	// 枚举对象

	// 引用的对象

	public School workingSchool() {
		School member = new School();
		member.setModelTypeName("school");
		member.setName("working_school");
		member.setMemberName("workingSchool");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public School graduateSchool() {
		School member = new School();
		member.setModelTypeName("school");
		member.setName("graduate_school");
		member.setMemberName("graduateSchool");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public JobTitle jobTitle() {
		JobTitle member = new JobTitle();
		member.setModelTypeName("job_title");
		member.setName("job_title");
		member.setMemberName("jobTitle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public CourseMajor courseMajorListAsTeacher() {
		CourseMajor member = new CourseMajor();
		member.setModelTypeName("course_major");
		member.setName("teacher");
		member.setMemberName("courseMajorListAsTeacher");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CourseMajor courseMajorListAsCouncelor() {
		CourseMajor member = new CourseMajor();
		member.setModelTypeName("course_major");
		member.setName("councelor");
		member.setMemberName("courseMajorListAsCouncelor");
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

	public StringAttribute gender(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_gender");
		member.setName("gender");
		useMember(member);
		return member;
	}

	public StringAttribute inauguratioTime(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("inauguratioTime");
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

