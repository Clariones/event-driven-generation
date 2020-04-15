package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TaskType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.tasktype.TaskType";
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
	
	public Task taskList() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task_type");
		member.setMemberName("taskList");
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

	public BooleanAttribute acceptanceCheck(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("acceptanceCheck");
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

