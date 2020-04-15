package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CommonEventRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.commoneventrecord.CommonEventRecord";
	}
	// 枚举对象

	// 引用的对象

	public EmployeeNomination actor() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("actor");
		member.setMemberName("actor");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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
	
	public RunningAccountRecord runningAccountRecordList() {
		RunningAccountRecord member = new RunningAccountRecord();
		member.setModelTypeName("running_account_record");
		member.setName("source_event");
		member.setMemberName("runningAccountRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantRecord merchantRecordList() {
		MerchantRecord member = new MerchantRecord();
		member.setModelTypeName("merchant_record");
		member.setName("source_event");
		member.setMemberName("merchantRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeNominationRecord employeeNominationRecordList() {
		EmployeeNominationRecord member = new EmployeeNominationRecord();
		member.setModelTypeName("employee_nomination_record");
		member.setName("source_event");
		member.setMemberName("employeeNominationRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrderProcessingRecord mainOrderProcessingRecordList() {
		MainOrderProcessingRecord member = new MainOrderProcessingRecord();
		member.setModelTypeName("main_order_processing_record");
		member.setName("event_source");
		member.setMemberName("mainOrderProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentRecord paymentRecordList() {
		PaymentRecord member = new PaymentRecord();
		member.setModelTypeName("payment_record");
		member.setName("source_event");
		member.setMemberName("paymentRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectRunningContractConfirmRecord projectRunningContractConfirmRecordList() {
		ProjectRunningContractConfirmRecord member = new ProjectRunningContractConfirmRecord();
		member.setModelTypeName("project_running_contract_confirm_record");
		member.setName("source_event");
		member.setMemberName("projectRunningContractConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentConfirmRecord projectDocumentConfirmRecordList() {
		ProjectDocumentConfirmRecord member = new ProjectDocumentConfirmRecord();
		member.setModelTypeName("project_document_confirm_record");
		member.setName("source_event");
		member.setMemberName("projectDocumentConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignmentRecord projectJobAssignmentRecordList() {
		ProjectJobAssignmentRecord member = new ProjectJobAssignmentRecord();
		member.setModelTypeName("project_job_assignment_record");
		member.setName("source_event");
		member.setMemberName("projectJobAssignmentRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgress projectProgressList() {
		ProjectProgress member = new ProjectProgress();
		member.setModelTypeName("project_progress");
		member.setName("source_event");
		member.setMemberName("projectProgressList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageProcessingRecord workPackageProcessingRecordList() {
		WorkPackageProcessingRecord member = new WorkPackageProcessingRecord();
		member.setModelTypeName("work_package_processing_record");
		member.setName("source_event");
		member.setMemberName("workPackageProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskProcessingRecord taskProcessingRecordList() {
		TaskProcessingRecord member = new TaskProcessingRecord();
		member.setModelTypeName("task_processing_record");
		member.setName("source_event");
		member.setMemberName("taskProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBillRecord yourongBillRecordList() {
		YourongBillRecord member = new YourongBillRecord();
		member.setModelTypeName("yourong_bill_record");
		member.setName("source_event");
		member.setMemberName("yourongBillRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceProcessRecord maintainanceProcessRecordList() {
		MaintainanceProcessRecord member = new MaintainanceProcessRecord();
		member.setModelTypeName("maintainance_process_record");
		member.setName("source_event");
		member.setMemberName("maintainanceProcessRecordList");
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

	public StringAttribute eventCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventCode");
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

	public StringAttribute key1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("key1");
		useMember(member);
		return member;
	}

	public StringAttribute key2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("key2");
		useMember(member);
		return member;
	}

	public StringAttribute key3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("key3");
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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
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

