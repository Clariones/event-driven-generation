package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectCommandAssignment extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectcommandassignment.ProjectCommandAssignment";
	}
	// 枚举对象

	// 引用的对象

	public ProjectCommand projectCommand() {
		ProjectCommand member = new ProjectCommand();
		member.setModelTypeName("project_command");
		member.setName("project_command");
		member.setMemberName("projectCommand");
		member.setReferDirection(true);
		member.setRelationName("projectCommand");
		append(member);
		return member;
	}

	public ProjectNomination reciever() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("reciever");
		member.setMemberName("reciever");
		member.setReferDirection(true);
		member.setRelationName("reciever");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public BooleanAttribute carbonCopy(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("carbonCopy");
		member.setName("carbon_copy");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

