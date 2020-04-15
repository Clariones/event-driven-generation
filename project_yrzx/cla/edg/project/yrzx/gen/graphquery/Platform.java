package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.platform.Platform";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public LicenseType licenseTypeList() {
		LicenseType member = new LicenseType();
		member.setModelTypeName("license_type");
		member.setName("platform");
		member.setMemberName("licenseTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LicenseStatus licenseStatusList() {
		LicenseStatus member = new LicenseStatus();
		member.setModelTypeName("license_status");
		member.setName("platform");
		member.setMemberName("licenseStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LicenseCopy licenseCopyList() {
		LicenseCopy member = new LicenseCopy();
		member.setModelTypeName("license_copy");
		member.setName("platform");
		member.setMemberName("licenseCopyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CommonEventRecord commonEventRecordList() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("platform");
		member.setMemberName("commonEventRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AccountChangeType accountChangeTypeList() {
		AccountChangeType member = new AccountChangeType();
		member.setModelTypeName("account_change_type");
		member.setName("platform");
		member.setMemberName("accountChangeTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AccountTitle accountTitleList() {
		AccountTitle member = new AccountTitle();
		member.setModelTypeName("account_title");
		member.setName("platform");
		member.setMemberName("accountTitleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AccountBookType accountBookTypeList() {
		AccountBookType member = new AccountBookType();
		member.setModelTypeName("account_book_type");
		member.setName("platform");
		member.setMemberName("accountBookTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AccountBookItemStatus accountBookItemStatusList() {
		AccountBookItemStatus member = new AccountBookItemStatus();
		member.setModelTypeName("account_book_item_status");
		member.setName("platform");
		member.setMemberName("accountBookItemStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RunningAccountRecord runningAccountRecordList() {
		RunningAccountRecord member = new RunningAccountRecord();
		member.setModelTypeName("running_account_record");
		member.setName("platform");
		member.setMemberName("runningAccountRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public GenericAccountBook genericAccountBookList() {
		GenericAccountBook member = new GenericAccountBook();
		member.setModelTypeName("generic_account_book");
		member.setName("platform");
		member.setMemberName("genericAccountBookList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantType merchantTypeList() {
		MerchantType member = new MerchantType();
		member.setModelTypeName("merchant_type");
		member.setName("platform");
		member.setMemberName("merchantTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantBusinessType merchantBusinessTypeList() {
		MerchantBusinessType member = new MerchantBusinessType();
		member.setModelTypeName("merchant_business_type");
		member.setName("platform");
		member.setMemberName("merchantBusinessTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantStatus merchantStatusList() {
		MerchantStatus member = new MerchantStatus();
		member.setModelTypeName("merchant_status");
		member.setName("platform");
		member.setMemberName("merchantStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Merchant merchantList() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("platform");
		member.setMemberName("merchantList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerRecommendationRecord partnerRecommendationRecordList() {
		PartnerRecommendationRecord member = new PartnerRecommendationRecord();
		member.setModelTypeName("partner_recommendation_record");
		member.setName("platform");
		member.setMemberName("partnerRecommendationRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OrderStatus orderStatusList() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("platform");
		member.setMemberName("orderStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("platform");
		member.setMemberName("mainOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentStatus paymentStatusList() {
		PaymentStatus member = new PaymentStatus();
		member.setModelTypeName("payment_status");
		member.setName("platform");
		member.setMemberName("paymentStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentOption paymentOptionList() {
		PaymentOption member = new PaymentOption();
		member.setModelTypeName("payment_option");
		member.setName("platform");
		member.setMemberName("paymentOptionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentSucceedRecord paymentSucceedRecordList() {
		PaymentSucceedRecord member = new PaymentSucceedRecord();
		member.setModelTypeName("payment_succeed_record");
		member.setName("platform");
		member.setMemberName("paymentSucceedRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PlatformConfiguration platformConfigurationList() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform");
		member.setMemberName("platformConfigurationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PropertyOwnerMissionType propertyOwnerMissionTypeList() {
		PropertyOwnerMissionType member = new PropertyOwnerMissionType();
		member.setModelTypeName("property_owner_mission_type");
		member.setName("platform");
		member.setMemberName("propertyOwnerMissionTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DataScreen dataScreenList() {
		DataScreen member = new DataScreen();
		member.setModelTypeName("data_screen");
		member.setName("platform");
		member.setMemberName("dataScreenList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("platform");
		member.setMemberName("articleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HomepageShowType homepageShowTypeList() {
		HomepageShowType member = new HomepageShowType();
		member.setModelTypeName("homepage_show_type");
		member.setName("platform");
		member.setMemberName("homepageShowTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SlideType slideTypeList() {
		SlideType member = new SlideType();
		member.setModelTypeName("slide_type");
		member.setName("platform");
		member.setMemberName("slideTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectType projectTypeList() {
		ProjectType member = new ProjectType();
		member.setModelTypeName("project_type");
		member.setName("platform");
		member.setMemberName("projectTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectPhase projectPhaseList() {
		ProjectPhase member = new ProjectPhase();
		member.setModelTypeName("project_phase");
		member.setName("platform");
		member.setMemberName("projectPhaseList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectContractType projectContractTypeList() {
		ProjectContractType member = new ProjectContractType();
		member.setModelTypeName("project_contract_type");
		member.setName("platform");
		member.setMemberName("projectContractTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectContractStatus projectContractStatusList() {
		ProjectContractStatus member = new ProjectContractStatus();
		member.setModelTypeName("project_contract_status");
		member.setName("platform");
		member.setMemberName("projectContractStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkingStatus workingStatusList() {
		WorkingStatus member = new WorkingStatus();
		member.setModelTypeName("working_status");
		member.setName("platform");
		member.setMemberName("workingStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ParticipatorType participatorTypeList() {
		ParticipatorType member = new ParticipatorType();
		member.setModelTypeName("participator_type");
		member.setName("platform");
		member.setMemberName("participatorTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FeeType feeTypeList() {
		FeeType member = new FeeType();
		member.setModelTypeName("fee_type");
		member.setName("platform");
		member.setMemberName("feeTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongProjectBookStatus yourongProjectBookStatusList() {
		YourongProjectBookStatus member = new YourongProjectBookStatus();
		member.setModelTypeName("yourong_project_book_status");
		member.setName("platform");
		member.setMemberName("yourongProjectBookStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongProjectBookType yourongProjectBookTypeList() {
		YourongProjectBookType member = new YourongProjectBookType();
		member.setModelTypeName("yourong_project_book_type");
		member.setName("platform");
		member.setMemberName("yourongProjectBookTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectList() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("platform");
		member.setMemberName("projectList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentProcessStyle projectDocumentProcessStyleList() {
		ProjectDocumentProcessStyle member = new ProjectDocumentProcessStyle();
		member.setModelTypeName("project_document_process_style");
		member.setName("platform");
		member.setMemberName("projectDocumentProcessStyleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentStatus projectDocumentStatusList() {
		ProjectDocumentStatus member = new ProjectDocumentStatus();
		member.setModelTypeName("project_document_status");
		member.setName("platform");
		member.setMemberName("projectDocumentStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobType projectJobTypeList() {
		ProjectJobType member = new ProjectJobType();
		member.setModelTypeName("project_job_type");
		member.setName("platform");
		member.setMemberName("projectJobTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSubcontractAssignmentType projectSubcontractAssignmentTypeList() {
		ProjectSubcontractAssignmentType member = new ProjectSubcontractAssignmentType();
		member.setModelTypeName("project_subcontract_assignment_type");
		member.setName("platform");
		member.setMemberName("projectSubcontractAssignmentTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgressStatus projectProgressStatusList() {
		ProjectProgressStatus member = new ProjectProgressStatus();
		member.setModelTypeName("project_progress_status");
		member.setName("platform");
		member.setMemberName("projectProgressStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantJob merchantJobList() {
		MerchantJob member = new MerchantJob();
		member.setModelTypeName("merchant_job");
		member.setName("platform");
		member.setMemberName("merchantJobList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantRole merchantRoleList() {
		MerchantRole member = new MerchantRole();
		member.setModelTypeName("merchant_role");
		member.setName("platform");
		member.setMemberName("merchantRoleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageStatus workPackageStatusList() {
		WorkPackageStatus member = new WorkPackageStatus();
		member.setModelTypeName("work_package_status");
		member.setName("platform");
		member.setMemberName("workPackageStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskType taskTypeList() {
		TaskType member = new TaskType();
		member.setModelTypeName("task_type");
		member.setName("platform");
		member.setMemberName("taskTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskStatus taskStatusList() {
		TaskStatus member = new TaskStatus();
		member.setModelTypeName("task_status");
		member.setName("platform");
		member.setMemberName("taskStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskAcceptanceStatus taskAcceptanceStatusList() {
		TaskAcceptanceStatus member = new TaskAcceptanceStatus();
		member.setModelTypeName("task_acceptance_status");
		member.setName("platform");
		member.setMemberName("taskAcceptanceStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ReportType reportTypeList() {
		ReportType member = new ReportType();
		member.setModelTypeName("report_type");
		member.setName("platform");
		member.setMemberName("reportTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotificationType projectNotificationTypeList() {
		ProjectNotificationType member = new ProjectNotificationType();
		member.setModelTypeName("project_notification_type");
		member.setName("platform");
		member.setMemberName("projectNotificationTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationItemStatus violationItemStatusList() {
		ViolationItemStatus member = new ViolationItemStatus();
		member.setModelTypeName("violation_item_status");
		member.setName("platform");
		member.setMemberName("violationItemStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationTerm violationTermList() {
		ViolationTerm member = new ViolationTerm();
		member.setModelTypeName("violation_term");
		member.setName("platform");
		member.setMemberName("violationTermList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BillStatus billStatusList() {
		BillStatus member = new BillStatus();
		member.setModelTypeName("bill_status");
		member.setName("platform");
		member.setMemberName("billStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillList() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("platform");
		member.setMemberName("yourongBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EstatePropertyType estatePropertyTypeList() {
		EstatePropertyType member = new EstatePropertyType();
		member.setModelTypeName("estate_property_type");
		member.setName("platform");
		member.setMemberName("estatePropertyTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerApplicationStatus customerApplicationStatusList() {
		CustomerApplicationStatus member = new CustomerApplicationStatus();
		member.setModelTypeName("customer_application_status");
		member.setName("platform");
		member.setMemberName("customerApplicationStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("platform");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerApplication partnerApplicationList() {
		PartnerApplication member = new PartnerApplication();
		member.setModelTypeName("partner_application");
		member.setName("platform");
		member.setMemberName("partnerApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractTemplate contractTemplateList() {
		ContractTemplate member = new ContractTemplate();
		member.setModelTypeName("contract_template");
		member.setName("platform");
		member.setMemberName("contractTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FinanceTemplate financeTemplateList() {
		FinanceTemplate member = new FinanceTemplate();
		member.setModelTypeName("finance_template");
		member.setName("platform");
		member.setMemberName("financeTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FiveBookTemplate fiveBookTemplateList() {
		FiveBookTemplate member = new FiveBookTemplate();
		member.setModelTypeName("five_book_template");
		member.setName("platform");
		member.setMemberName("fiveBookTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectEngineeringTemplate projectEngineeringTemplateList() {
		ProjectEngineeringTemplate member = new ProjectEngineeringTemplate();
		member.setModelTypeName("project_engineering_template");
		member.setName("platform");
		member.setMemberName("projectEngineeringTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanFund loanFundList() {
		LoanFund member = new LoanFund();
		member.setModelTypeName("loan_fund");
		member.setName("platform");
		member.setMemberName("loanFundList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("platform");
		member.setMemberName("loanApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanContract loanContractList() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("platform");
		member.setMemberName("loanContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProcessMap processMapList() {
		ProcessMap member = new ProcessMap();
		member.setModelTypeName("process_map");
		member.setName("platform");
		member.setMemberName("processMapList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Process processList() {
		Process member = new Process();
		member.setModelTypeName("process");
		member.setName("platform");
		member.setMemberName("processList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TodoList todoListList() {
		TodoList member = new TodoList();
		member.setModelTypeName("todo_list");
		member.setName("platform");
		member.setMemberName("todoListList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TodoListStatus todoListStatusList() {
		TodoListStatus member = new TodoListStatus();
		member.setModelTypeName("todo_list_status");
		member.setName("platform");
		member.setMemberName("todoListStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProcessAudit processAuditList() {
		ProcessAudit member = new ProcessAudit();
		member.setModelTypeName("process_audit");
		member.setName("platform");
		member.setMemberName("processAuditList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProcessApplication processApplicationList() {
		ProcessApplication member = new ProcessApplication();
		member.setModelTypeName("process_application");
		member.setName("platform");
		member.setMemberName("processApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractType contractTypeList() {
		ContractType member = new ContractType();
		member.setModelTypeName("contract_type");
		member.setName("platform");
		member.setMemberName("contractTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractLedger contractLedgerList() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("platform");
		member.setMemberName("contractLedgerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("platform");
		member.setMemberName("contractRiskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("platform");
		member.setMemberName("contractReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("platform");
		member.setMemberName("contractStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectStatisticReport projectStatisticReportList() {
		ProjectStatisticReport member = new ProjectStatisticReport();
		member.setModelTypeName("project_statistic_report");
		member.setName("platform");
		member.setMemberName("projectStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceVendorStatisticReport serviceVendorStatisticReportList() {
		ServiceVendorStatisticReport member = new ServiceVendorStatisticReport();
		member.setModelTypeName("service_vendor_statistic_report");
		member.setName("platform");
		member.setMemberName("serviceVendorStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FinancialServiceStatisticReport financialServiceStatisticReportList() {
		FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
		member.setModelTypeName("financial_service_statistic_report");
		member.setName("platform");
		member.setMemberName("financialServiceStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecruitmentRequirement recruitmentRequirementList() {
		RecruitmentRequirement member = new RecruitmentRequirement();
		member.setModelTypeName("recruitment_requirement");
		member.setName("platform");
		member.setMemberName("recruitmentRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public JobPosition jobPositionList() {
		JobPosition member = new JobPosition();
		member.setModelTypeName("job_position");
		member.setName("platform");
		member.setMemberName("jobPositionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CandidateTalent candidateTalentList() {
		CandidateTalent member = new CandidateTalent();
		member.setModelTypeName("candidate_talent");
		member.setName("platform");
		member.setMemberName("candidateTalentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StaffFiles staffFilesList() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("platform");
		member.setMemberName("staffFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeRelation employeeRelationList() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("platform");
		member.setMemberName("employeeRelationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeSalary employeeSalaryList() {
		EmployeeSalary member = new EmployeeSalary();
		member.setModelTypeName("employee_salary");
		member.setName("platform");
		member.setMemberName("employeeSalaryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeePerformance employeePerformanceList() {
		EmployeePerformance member = new EmployeePerformance();
		member.setModelTypeName("employee_performance");
		member.setName("platform");
		member.setMemberName("employeePerformanceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantSeal merchantSealList() {
		MerchantSeal member = new MerchantSeal();
		member.setModelTypeName("merchant_seal");
		member.setName("platform");
		member.setMemberName("merchantSealList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CooperateApplication cooperateApplicationList() {
		CooperateApplication member = new CooperateApplication();
		member.setModelTypeName("cooperate_application");
		member.setName("platform");
		member.setMemberName("cooperateApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectApplication projectApplicationList() {
		ProjectApplication member = new ProjectApplication();
		member.setModelTypeName("project_application");
		member.setName("platform");
		member.setMemberName("projectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectAttractInvestment projectAttractInvestmentList() {
		ProjectAttractInvestment member = new ProjectAttractInvestment();
		member.setModelTypeName("project_attract_investment");
		member.setName("platform");
		member.setMemberName("projectAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SerivceVendorAttractInvestment serivceVendorAttractInvestmentList() {
		SerivceVendorAttractInvestment member = new SerivceVendorAttractInvestment();
		member.setModelTypeName("serivce_vendor_attract_investment");
		member.setName("platform");
		member.setMemberName("serivceVendorAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BrandAttractInvestment brandAttractInvestmentList() {
		BrandAttractInvestment member = new BrandAttractInvestment();
		member.setModelTypeName("brand_attract_investment");
		member.setName("platform");
		member.setMemberName("brandAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSettlement projectSettlementList() {
		ProjectSettlement member = new ProjectSettlement();
		member.setModelTypeName("project_settlement");
		member.setName("platform");
		member.setMemberName("projectSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceVendorSettlement serviceVendorSettlementList() {
		ServiceVendorSettlement member = new ServiceVendorSettlement();
		member.setModelTypeName("service_vendor_settlement");
		member.setName("platform");
		member.setMemberName("serviceVendorSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BrandPartnerSettlement brandPartnerSettlementList() {
		BrandPartnerSettlement member = new BrandPartnerSettlement();
		member.setModelTypeName("brand_partner_settlement");
		member.setName("platform");
		member.setMemberName("brandPartnerSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantVerification merchantVerificationList() {
		MerchantVerification member = new MerchantVerification();
		member.setModelTypeName("merchant_verification");
		member.setName("platform");
		member.setMemberName("merchantVerificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public QualificationExamination qualificationExaminationList() {
		QualificationExamination member = new QualificationExamination();
		member.setModelTypeName("qualification_examination");
		member.setName("platform");
		member.setMemberName("qualificationExaminationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public QualificationResearch qualificationResearchList() {
		QualificationResearch member = new QualificationResearch();
		member.setModelTypeName("qualification_research");
		member.setName("platform");
		member.setMemberName("qualificationResearchList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerRecommendation partnerRecommendationList() {
		PartnerRecommendation member = new PartnerRecommendation();
		member.setModelTypeName("partner_recommendation");
		member.setName("platform");
		member.setMemberName("partnerRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDirective projectDirectiveList() {
		ProjectDirective member = new ProjectDirective();
		member.setModelTypeName("project_directive");
		member.setName("platform");
		member.setMemberName("projectDirectiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectReport projectReportList() {
		ProjectReport member = new ProjectReport();
		member.setModelTypeName("project_report");
		member.setName("platform");
		member.setMemberName("projectReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Design designList() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("platform");
		member.setMemberName("designList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionSchema constructionSchemaList() {
		ConstructionSchema member = new ConstructionSchema();
		member.setModelTypeName("construction_schema");
		member.setName("platform");
		member.setMemberName("constructionSchemaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectBid projectBidList() {
		ProjectBid member = new ProjectBid();
		member.setModelTypeName("project_bid");
		member.setName("platform");
		member.setMemberName("projectBidList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LaborSupervision laborSupervisionList() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("platform");
		member.setMemberName("laborSupervisionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SafetyInstruction safetyInstructionList() {
		SafetyInstruction member = new SafetyInstruction();
		member.setModelTypeName("safety_instruction");
		member.setName("platform");
		member.setMemberName("safetyInstructionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignChange designChangeList() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("platform");
		member.setMemberName("designChangeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Violation violationList() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("platform");
		member.setMemberName("violationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Material materialList() {
		Material member = new Material();
		member.setModelTypeName("material");
		member.setName("platform");
		member.setMemberName("materialList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Measurement measurementList() {
		Measurement member = new Measurement();
		member.setModelTypeName("measurement");
		member.setName("platform");
		member.setMemberName("measurementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectFunding projectFundingList() {
		ProjectFunding member = new ProjectFunding();
		member.setModelTypeName("project_funding");
		member.setName("platform");
		member.setMemberName("projectFundingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionStartWorkingFiles constructionStartWorkingFilesList() {
		ConstructionStartWorkingFiles member = new ConstructionStartWorkingFiles();
		member.setModelTypeName("construction_start_working_files");
		member.setName("platform");
		member.setMemberName("constructionStartWorkingFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public QualitiyAcceptanceFiles qualitiyAcceptanceFilesList() {
		QualitiyAcceptanceFiles member = new QualitiyAcceptanceFiles();
		member.setModelTypeName("qualitiy_acceptance_files");
		member.setName("platform");
		member.setMemberName("qualitiyAcceptanceFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringExperimentFiles engineeringExperimentFilesList() {
		EngineeringExperimentFiles member = new EngineeringExperimentFiles();
		member.setModelTypeName("engineering_experiment_files");
		member.setName("platform");
		member.setMemberName("engineeringExperimentFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionProcessFiles constructionProcessFilesList() {
		ConstructionProcessFiles member = new ConstructionProcessFiles();
		member.setModelTypeName("construction_process_files");
		member.setName("platform");
		member.setMemberName("constructionProcessFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public NecessarySupplementFiles necessarySupplementFilesList() {
		NecessarySupplementFiles member = new NecessarySupplementFiles();
		member.setModelTypeName("necessary_supplement_files");
		member.setName("platform");
		member.setMemberName("necessarySupplementFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionCompletionFiles constructionCompletionFilesList() {
		ConstructionCompletionFiles member = new ConstructionCompletionFiles();
		member.setModelTypeName("construction_completion_files");
		member.setName("platform");
		member.setMemberName("constructionCompletionFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringQualitySupervisionFiles engineeringQualitySupervisionFilesList() {
		EngineeringQualitySupervisionFiles member = new EngineeringQualitySupervisionFiles();
		member.setModelTypeName("engineering_quality_supervision_files");
		member.setName("platform");
		member.setMemberName("engineeringQualitySupervisionFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectFilesArchive projectFilesArchiveList() {
		ProjectFilesArchive member = new ProjectFilesArchive();
		member.setModelTypeName("project_files_archive");
		member.setName("platform");
		member.setMemberName("projectFilesArchiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchiveList() {
		EngineeringQualitySupervisionArchive member = new EngineeringQualitySupervisionArchive();
		member.setModelTypeName("engineering_quality_supervision_archive");
		member.setName("platform");
		member.setMemberName("engineeringQualitySupervisionArchiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractCollection contractCollectionList() {
		ContractCollection member = new ContractCollection();
		member.setModelTypeName("contract_collection");
		member.setName("platform");
		member.setMemberName("contractCollectionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractPayment contractPaymentList() {
		ContractPayment member = new ContractPayment();
		member.setModelTypeName("contract_payment");
		member.setName("platform");
		member.setMemberName("contractPaymentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractSettlement contractSettlementList() {
		ContractSettlement member = new ContractSettlement();
		member.setModelTypeName("contract_settlement");
		member.setName("platform");
		member.setMemberName("contractSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EconomicVerificationForm economicVerificationFormList() {
		EconomicVerificationForm member = new EconomicVerificationForm();
		member.setModelTypeName("economic_verification_form");
		member.setName("platform");
		member.setMemberName("economicVerificationFormList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectObjective projectObjectiveList() {
		ProjectObjective member = new ProjectObjective();
		member.setModelTypeName("project_objective");
		member.setName("platform");
		member.setMemberName("projectObjectiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanList() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("platform");
		member.setMemberName("projectProgressFundingTrusteeshipPlanList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractExamine contractExamineList() {
		ContractExamine member = new ContractExamine();
		member.setModelTypeName("contract_examine");
		member.setName("platform");
		member.setMemberName("contractExamineList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FundingCloseTrusteeshipContract fundingCloseTrusteeshipContractList() {
		FundingCloseTrusteeshipContract member = new FundingCloseTrusteeshipContract();
		member.setModelTypeName("funding_close_trusteeship_contract");
		member.setName("platform");
		member.setMemberName("fundingCloseTrusteeshipContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractList() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("platform");
		member.setMemberName("projectCloseTrusteeshipContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FundingCloseOrganization fundingCloseOrganizationList() {
		FundingCloseOrganization member = new FundingCloseOrganization();
		member.setModelTypeName("funding_close_organization");
		member.setName("platform");
		member.setMemberName("fundingCloseOrganizationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FundingCloseOrganizationType fundingCloseOrganizationTypeList() {
		FundingCloseOrganizationType member = new FundingCloseOrganizationType();
		member.setModelTypeName("funding_close_organization_type");
		member.setName("platform");
		member.setMemberName("fundingCloseOrganizationTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskOrder taskOrderList() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("platform");
		member.setMemberName("taskOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageAcceptanceSettlement workPackageAcceptanceSettlementList() {
		WorkPackageAcceptanceSettlement member = new WorkPackageAcceptanceSettlement();
		member.setModelTypeName("work_package_acceptance_settlement");
		member.setName("platform");
		member.setMemberName("workPackageAcceptanceSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectAcceptanceSettlement projectAcceptanceSettlementList() {
		ProjectAcceptanceSettlement member = new ProjectAcceptanceSettlement();
		member.setModelTypeName("project_acceptance_settlement");
		member.setName("platform");
		member.setMemberName("projectAcceptanceSettlementList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

