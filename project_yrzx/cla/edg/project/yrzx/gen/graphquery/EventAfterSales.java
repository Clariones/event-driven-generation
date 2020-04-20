package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAfterSales extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventaftersales.EventAfterSales";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
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

	public StringAttribute questionDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("questionDescription");
		useMember(member);
		return member;
	}

	public StringAttribute images(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		member.setName("images");
		useMember(member);
		return member;
	}

	public StringAttribute creator(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("creator");
		useMember(member);
		return member;
	}

	public DateTimeAttribute time(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("time");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldGroup");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventInitiatorType");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventInitiatorId");
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
