package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProcessInstance extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.processinstance.ProcessInstance";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	public ProcessInstanceVariable processInstanceVariableList() {
		ProcessInstanceVariable member = new ProcessInstanceVariable();
		member.setModelTypeName("process_instance_variable");
		member.setName("process_instance");
		member.setMemberName("processInstanceVariableList");
		member.setRelationName("processInstance");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public NodeInstance nodeInstanceList() {
		NodeInstance member = new NodeInstance();
		member.setModelTypeName("node_instance");
		member.setName("process_instance");
		member.setMemberName("nodeInstanceList");
		member.setRelationName("processInstance");
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

	public StringAttribute starter(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("starter");
		member.setName("starter");
		useMember(member);
		return member;
	}

	public StringAttribute processDefinitionId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("processDefinitionId");
		member.setName("process_definition_id");
		useMember(member);
		return member;
	}

	public BooleanAttribute completed(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("completed");
		member.setName("completed");
		useMember(member);
		return member;
	}

	public DateTimeAttribute updateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("updateTime");
		member.setName("update_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
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

