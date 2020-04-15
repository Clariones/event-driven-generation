package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectNotificationReceiver extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectnotificationreceiver.ProjectNotificationReceiver";
	}
	// 枚举对象

	// 引用的对象

	public EmployeeNomination receiver() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("receiver");
		member.setMemberName("receiver");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectNotification projectNotification() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("project_notification");
		member.setMemberName("projectNotification");
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

	public BooleanAttribute mainlyTo(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("mainlyTo");
		useMember(member);
		return member;
	}

	public BooleanAttribute alreadyRead(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("alreadyRead");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

