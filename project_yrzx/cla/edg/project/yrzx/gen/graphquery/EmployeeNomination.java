package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EmployeeNomination extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.employeenomination.EmployeeNomination";
	}
	// 枚举对象

	// 引用的对象

	public Merchant employee() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employee");
		member.setMemberName("employee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant employer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employer");
		member.setMemberName("employer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MerchantRole role() {
		MerchantRole member = new MerchantRole();
		member.setModelTypeName("merchant_role");
		member.setName("role");
		member.setMemberName("role");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MerchantJob job() {
		MerchantJob member = new MerchantJob();
		member.setModelTypeName("merchant_job");
		member.setName("job");
		member.setMemberName("job");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public CommonEventRecord commonEventRecordList() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("actor");
		member.setMemberName("commonEventRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OriginalEvidenceRecord originalEvidenceRecordList() {
		OriginalEvidenceRecord member = new OriginalEvidenceRecord();
		member.setModelTypeName("original_evidence_record");
		member.setName("confirmer_employee");
		member.setMemberName("originalEvidenceRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeNominationRecord employeeNominationRecordList() {
		EmployeeNominationRecord member = new EmployeeNominationRecord();
		member.setModelTypeName("employee_nomination_record");
		member.setName("employee_nomination");
		member.setMemberName("employeeNominationRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ClientScenario clientScenarioList() {
		ClientScenario member = new ClientScenario();
		member.setModelTypeName("client_scenario");
		member.setName("employee_nomination");
		member.setMemberName("clientScenarioList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("buyer_employee");
		member.setMemberName("mainOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrderProcessingRecord mainOrderProcessingRecordList() {
		MainOrderProcessingRecord member = new MainOrderProcessingRecord();
		member.setModelTypeName("main_order_processing_record");
		member.setName("operator_employee");
		member.setMemberName("mainOrderProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LineItem lineItemList() {
		LineItem member = new LineItem();
		member.setModelTypeName("line_item");
		member.setName("seller_employee");
		member.setMemberName("lineItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("payer_employee");
		member.setMemberName("paymentDetailList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by_employee");
		member.setMemberName("articleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectRunningContractConfirmRecord projectRunningContractConfirmRecordList() {
		ProjectRunningContractConfirmRecord member = new ProjectRunningContractConfirmRecord();
		member.setModelTypeName("project_running_contract_confirm_record");
		member.setName("approve_employee");
		member.setMemberName("projectRunningContractConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentChangeRecord projectDocumentChangeRecordList() {
		ProjectDocumentChangeRecord member = new ProjectDocumentChangeRecord();
		member.setModelTypeName("project_document_change_record");
		member.setName("operator");
		member.setMemberName("projectDocumentChangeRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentConfirmRecord projectDocumentConfirmRecordList() {
		ProjectDocumentConfirmRecord member = new ProjectDocumentConfirmRecord();
		member.setModelTypeName("project_document_confirm_record");
		member.setName("approve_employee");
		member.setMemberName("projectDocumentConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignment projectJobAssignmentList() {
		ProjectJobAssignment member = new ProjectJobAssignment();
		member.setModelTypeName("project_job_assignment");
		member.setName("employee");
		member.setMemberName("projectJobAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignmentRecord projectJobAssignmentRecordListAsEmployee() {
		ProjectJobAssignmentRecord member = new ProjectJobAssignmentRecord();
		member.setModelTypeName("project_job_assignment_record");
		member.setName("employee");
		member.setMemberName("projectJobAssignmentRecordListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignmentRecord projectJobAssignmentRecordListAsOperator() {
		ProjectJobAssignmentRecord member = new ProjectJobAssignmentRecord();
		member.setModelTypeName("project_job_assignment_record");
		member.setName("operator");
		member.setMemberName("projectJobAssignmentRecordListAsOperator");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSubcontractAssignment projectSubcontractAssignmentList() {
		ProjectSubcontractAssignment member = new ProjectSubcontractAssignment();
		member.setModelTypeName("project_subcontract_assignment");
		member.setName("employee");
		member.setMemberName("projectSubcontractAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Task taskList() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("responsible_employee");
		member.setMemberName("taskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskAcceptance taskAcceptanceList() {
		TaskAcceptance member = new TaskAcceptance();
		member.setModelTypeName("task_acceptance");
		member.setName("acceptor_employee");
		member.setMemberName("taskAcceptanceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskProcessingRecord taskProcessingRecordList() {
		TaskProcessingRecord member = new TaskProcessingRecord();
		member.setModelTypeName("task_processing_record");
		member.setName("actor_employee");
		member.setMemberName("taskProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReport projectDailyReportListAsReporter() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("reporter");
		member.setMemberName("projectDailyReportListAsReporter");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReport projectDailyReportListAsDirectManager() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("direct_manager");
		member.setMemberName("projectDailyReportListAsDirectManager");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotification projectNotificationList() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("send_employee");
		member.setMemberName("projectNotificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotificationReceiver projectNotificationReceiverList() {
		ProjectNotificationReceiver member = new ProjectNotificationReceiver();
		member.setModelTypeName("project_notification_receiver");
		member.setName("receiver");
		member.setMemberName("projectNotificationReceiverList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBillRecord yourongBillRecordList() {
		YourongBillRecord member = new YourongBillRecord();
		member.setModelTypeName("yourong_bill_record");
		member.setName("operation_employee");
		member.setMemberName("yourongBillRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_employee");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerApplication partnerApplicationList() {
		PartnerApplication member = new PartnerApplication();
		member.setModelTypeName("partner_application");
		member.setName("applicant_employee");
		member.setMemberName("partnerApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignerRecommendation designerRecommendationList() {
		DesignerRecommendation member = new DesignerRecommendation();
		member.setModelTypeName("designer_recommendation");
		member.setName("referrer");
		member.setMemberName("designerRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceProviderRecommendation serviceProviderRecommendationList() {
		ServiceProviderRecommendation member = new ServiceProviderRecommendation();
		member.setModelTypeName("service_provider_recommendation");
		member.setName("referrer");
		member.setMemberName("serviceProviderRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceRequirement maintainanceRequirementList() {
		MaintainanceRequirement member = new MaintainanceRequirement();
		member.setModelTypeName("maintainance_requirement");
		member.setName("applicant_employee");
		member.setMemberName("maintainanceRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceProcessRecord maintainanceProcessRecordList() {
		MaintainanceProcessRecord member = new MaintainanceProcessRecord();
		member.setModelTypeName("maintainance_process_record");
		member.setName("actor_employee");
		member.setMemberName("maintainanceProcessRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Process processList() {
		Process member = new Process();
		member.setModelTypeName("process");
		member.setName("creator");
		member.setMemberName("processList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TodoList todoListList() {
		TodoList member = new TodoList();
		member.setModelTypeName("todo_list");
		member.setName("creator");
		member.setMemberName("todoListList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProcessApplication processApplicationList() {
		ProcessApplication member = new ProcessApplication();
		member.setModelTypeName("process_application");
		member.setName("creator");
		member.setMemberName("processApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StaffFiles staffFilesList() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("employment");
		member.setMemberName("staffFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeRelation employeeRelationList() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("employment");
		member.setMemberName("employeeRelationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EconomicVerificationForm economicVerificationFormList() {
		EconomicVerificationForm member = new EconomicVerificationForm();
		member.setModelTypeName("economic_verification_form");
		member.setName("responsible_employee");
		member.setMemberName("economicVerificationFormList");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public DateTimeAttribute startDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("startDate");
		useMember(member);
		return member;
	}

	public DateTimeAttribute endDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("endDate");
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

