package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAfterSales extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventaftersales.EventAfterSales";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		member.setRelationName("changeRequest");
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

	public StringAttribute projectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectId");
		member.setName("project_id");
		useMember(member);
		return member;
	}

	public StringAttribute dailyTaskTypeId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("dailyTaskTypeId");
		member.setName("daily_task_type_id");
		useMember(member);
		return member;
	}

	public StringAttribute dailyTaskType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("dailyTaskType");
		member.setName("daily_task_type");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute questionDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("questionDescription");
		member.setName("question_description");
		useMember(member);
		return member;
	}

	public StringAttribute images(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("images");
		member.setName("images");
		useMember(member);
		return member;
	}

	public StringAttribute creator(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("creator");
		member.setName("creator");
		useMember(member);
		return member;
	}

	public DateTimeAttribute time(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("time");
		member.setName("time");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("fieldGroup");
		member.setName("field_group");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorType");
		member.setName("event_initiator_type");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorId");
		member.setName("event_initiator_id");
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

