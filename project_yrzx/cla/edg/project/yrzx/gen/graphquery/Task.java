package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Task extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.task.Task";
	}
	// 枚举对象

	// 引用的对象

	public TaskType taskType() {
		TaskType member = new TaskType();
		member.setModelTypeName("task_type");
		member.setName("task_type");
		member.setMemberName("taskType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public TaskStatus taskStatus() {
		TaskStatus member = new TaskStatus();
		member.setModelTypeName("task_status");
		member.setName("task_status");
		member.setMemberName("taskStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination responsibleEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("responsible_employee");
		member.setMemberName("responsibleEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant responsibleMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("responsible_merchant");
		member.setMemberName("responsibleMerchant");
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

	// 被引用的对象
	
	public ProjectDocument projectDocumentList() {
		ProjectDocument member = new ProjectDocument();
		member.setModelTypeName("project_document");
		member.setName("task");
		member.setMemberName("projectDocumentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskAcceptance taskAcceptanceList() {
		TaskAcceptance member = new TaskAcceptance();
		member.setModelTypeName("task_acceptance");
		member.setName("task");
		member.setMemberName("taskAcceptanceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskProcessingRecord taskProcessingRecordList() {
		TaskProcessingRecord member = new TaskProcessingRecord();
		member.setModelTypeName("task_processing_record");
		member.setName("task");
		member.setMemberName("taskProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReport projectDailyReportList() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("task");
		member.setMemberName("projectDailyReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotification projectNotificationList() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("task");
		member.setMemberName("projectNotificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationItem violationItemList() {
		ViolationItem member = new ViolationItem();
		member.setModelTypeName("violation_item");
		member.setName("task");
		member.setMemberName("violationItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillList() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("task");
		member.setMemberName("yourongBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceRequirement maintainanceRequirementList() {
		MaintainanceRequirement member = new MaintainanceRequirement();
		member.setModelTypeName("maintainance_requirement");
		member.setName("task");
		member.setMemberName("maintainanceRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LaborSupervision laborSupervisionList() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("work_task");
		member.setMemberName("laborSupervisionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskOrder taskOrderList() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("task");
		member.setMemberName("taskOrderList");
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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
		useMember(member);
		return member;
	}

	public NumberAttribute taskOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("taskOrder");
		useMember(member);
		return member;
	}

	public NumberAttribute accountReceivableAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("accountReceivableAmount");
		useMember(member);
		return member;
	}

	public NumberAttribute accountPayableAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("accountPayableAmount");
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

