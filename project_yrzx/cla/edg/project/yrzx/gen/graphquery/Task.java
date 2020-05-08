package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Task extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.task.Task";
	}
	// 枚举对象

	// 引用的对象

	public TaskStatus taskStatus() {
		TaskStatus member = new TaskStatus();
		member.setModelTypeName("task_status");
		member.setName("task_status");
		member.setMemberName("taskStatus");
		member.setReferDirection(true);
		member.setRelationName("taskStatus");
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		member.setRelationName("workPackage");
		append(member);
		return member;
	}

	// 被引用的对象

	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("task");
		member.setMemberName("standardContractList");
		member.setRelationName("task");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborSupervision laborSupervisionList() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("work_task");
		member.setMemberName("laborSupervisionList");
		member.setRelationName("workTask");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskOrder taskOrderList() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("task");
		member.setMemberName("taskOrderList");
		member.setRelationName("task");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("content");
		member.setName("content");
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

