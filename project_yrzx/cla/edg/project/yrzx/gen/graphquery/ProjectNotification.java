package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectNotification extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectnotification.ProjectNotification";
	}
	// 枚举对象

	// 引用的对象

	public ProjectNotificationType type() {
		ProjectNotificationType member = new ProjectNotificationType();
		member.setModelTypeName("project_notification_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant sendMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("send_merchant");
		member.setMemberName("sendMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination sendEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("send_employee");
		member.setMemberName("sendEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectNotificationImage projectNotificationImageList() {
		ProjectNotificationImage member = new ProjectNotificationImage();
		member.setModelTypeName("project_notification_image");
		member.setName("project_notification");
		member.setMemberName("projectNotificationImageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotificationReceiver projectNotificationReceiverList() {
		ProjectNotificationReceiver member = new ProjectNotificationReceiver();
		member.setModelTypeName("project_notification_receiver");
		member.setName("project_notification");
		member.setMemberName("projectNotificationReceiverList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("content");
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

