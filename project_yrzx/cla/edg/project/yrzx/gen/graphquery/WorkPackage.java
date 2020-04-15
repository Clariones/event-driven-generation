package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkPackage extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.workpackage.WorkPackage";
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

	public ProjectType workPackageType() {
		ProjectType member = new ProjectType();
		member.setModelTypeName("project_type");
		member.setName("work_package_type");
		member.setMemberName("workPackageType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackageStatus status() {
		WorkPackageStatus member = new WorkPackageStatus();
		member.setModelTypeName("work_package_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant responsibleServiceCompany() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("responsible_service_company");
		member.setMemberName("responsibleServiceCompany");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectDocument projectDocumentList() {
		ProjectDocument member = new ProjectDocument();
		member.setModelTypeName("project_document");
		member.setName("work_package");
		member.setMemberName("projectDocumentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSubcontractAssignment projectSubcontractAssignmentList() {
		ProjectSubcontractAssignment member = new ProjectSubcontractAssignment();
		member.setModelTypeName("project_subcontract_assignment");
		member.setName("work_package");
		member.setMemberName("projectSubcontractAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageParticipatorContract workPackageParticipatorContractList() {
		WorkPackageParticipatorContract member = new WorkPackageParticipatorContract();
		member.setModelTypeName("work_package_participator_contract");
		member.setName("work_package");
		member.setMemberName("workPackageParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageProcessingRecord workPackageProcessingRecordList() {
		WorkPackageProcessingRecord member = new WorkPackageProcessingRecord();
		member.setModelTypeName("work_package_processing_record");
		member.setName("work_package");
		member.setMemberName("workPackageProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Task taskList() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("work_package");
		member.setMemberName("taskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskAcceptance taskAcceptanceList() {
		TaskAcceptance member = new TaskAcceptance();
		member.setModelTypeName("task_acceptance");
		member.setName("work_package");
		member.setMemberName("taskAcceptanceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReport projectDailyReportList() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("work_package");
		member.setMemberName("projectDailyReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotification projectNotificationList() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("work_package");
		member.setMemberName("projectNotificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationItem violationItemList() {
		ViolationItem member = new ViolationItem();
		member.setModelTypeName("violation_item");
		member.setName("work_package");
		member.setMemberName("violationItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillList() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("work_package");
		member.setMemberName("yourongBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceRequirement maintainanceRequirementList() {
		MaintainanceRequirement member = new MaintainanceRequirement();
		member.setModelTypeName("maintainance_requirement");
		member.setName("work_package");
		member.setMemberName("maintainanceRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Design designList() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("work_package");
		member.setMemberName("designList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Violation violationList() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("related_work_package");
		member.setMemberName("violationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageAcceptanceSettlement workPackageAcceptanceSettlementList() {
		WorkPackageAcceptanceSettlement member = new WorkPackageAcceptanceSettlement();
		member.setModelTypeName("work_package_acceptance_settlement");
		member.setName("work_package");
		member.setMemberName("workPackageAcceptanceSettlementList");
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

	public BooleanAttribute maintainRequired(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("maintainRequired");
		useMember(member);
		return member;
	}

	public NumberAttribute storeProfitShareRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("storeProfitShareRatio");
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

