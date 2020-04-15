package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectPhase extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectphase.ProjectPhase";
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
	
	public Project projectList() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_phase");
		member.setMemberName("projectList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgress projectProgressList() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("project_phase");
		member.setMemberName("projectProgressList");
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

