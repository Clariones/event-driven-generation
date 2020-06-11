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

	public PlatformConfiguration platformConfigurationList() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform");
		member.setMemberName("platformConfigurationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractTemplate contractTemplateList() {
		ContractTemplate member = new ContractTemplate();
		member.setModelTypeName("contract_template");
		member.setName("platform");
		member.setMemberName("contractTemplateList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractType contractTypeList() {
		ContractType member = new ContractType();
		member.setModelTypeName("contract_type");
		member.setName("platform");
		member.setMemberName("contractTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatus contractStatusList() {
		ContractStatus member = new ContractStatus();
		member.setModelTypeName("contract_status");
		member.setName("platform");
		member.setMemberName("contractStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("platform");
		member.setMemberName("standardContractList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PayItemStatus payItemStatusList() {
		PayItemStatus member = new PayItemStatus();
		member.setModelTypeName("pay_item_status");
		member.setName("platform");
		member.setMemberName("payItemStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("platform");
		member.setMemberName("articleList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LicenseCategory licenseCategoryList() {
		LicenseCategory member = new LicenseCategory();
		member.setModelTypeName("license_category");
		member.setName("platform");
		member.setMemberName("licenseCategoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LicenseIndustryType licenseIndustryTypeList() {
		LicenseIndustryType member = new LicenseIndustryType();
		member.setModelTypeName("license_industry_type");
		member.setName("platform");
		member.setMemberName("licenseIndustryTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ValidateStatus validateStatusList() {
		ValidateStatus member = new ValidateStatus();
		member.setModelTypeName("validate_status");
		member.setName("platform");
		member.setMemberName("validateStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuthenticateStatus authenticateStatusList() {
		AuthenticateStatus member = new AuthenticateStatus();
		member.setModelTypeName("authenticate_status");
		member.setName("platform");
		member.setMemberName("authenticateStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("platform");
		member.setMemberName("licenseList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantBaseType merchantBaseTypeList() {
		MerchantBaseType member = new MerchantBaseType();
		member.setModelTypeName("merchant_base_type");
		member.setName("platform");
		member.setMemberName("merchantBaseTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantStatus merchantStatusList() {
		MerchantStatus member = new MerchantStatus();
		member.setModelTypeName("merchant_status");
		member.setName("platform");
		member.setMemberName("merchantStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantType merchantTypeList() {
		MerchantType member = new MerchantType();
		member.setModelTypeName("merchant_type");
		member.setName("platform");
		member.setMemberName("merchantTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Merchant merchantList() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("platform");
		member.setMemberName("merchantList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public IndustryType industryTypeList() {
		IndustryType member = new IndustryType();
		member.setModelTypeName("industry_type");
		member.setName("platform");
		member.setMemberName("industryTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringType engineeringTypeList() {
		EngineeringType member = new EngineeringType();
		member.setModelTypeName("engineering_type");
		member.setName("platform");
		member.setMemberName("engineeringTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CareerType careerTypeList() {
		CareerType member = new CareerType();
		member.setModelTypeName("career_type");
		member.setName("platform");
		member.setMemberName("careerTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Role roleList() {
		Role member = new Role();
		member.setModelTypeName("role");
		member.setName("platform");
		member.setMemberName("roleList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Job jobList() {
		Job member = new Job();
		member.setModelTypeName("job");
		member.setName("platform");
		member.setMemberName("jobList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeNomination employeeNominationList() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("platform");
		member.setMemberName("employeeNominationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskStatus taskStatusList() {
		TaskStatus member = new TaskStatus();
		member.setModelTypeName("task_status");
		member.setName("platform");
		member.setMemberName("taskStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkStatus workStatusList() {
		WorkStatus member = new WorkStatus();
		member.setModelTypeName("work_status");
		member.setName("platform");
		member.setMemberName("workStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkPackageType workPackageTypeList() {
		WorkPackageType member = new WorkPackageType();
		member.setModelTypeName("work_package_type");
		member.setName("platform");
		member.setMemberName("workPackageTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectList() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("platform");
		member.setMemberName("projectList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectType projectTypeList() {
		ProjectType member = new ProjectType();
		member.setModelTypeName("project_type");
		member.setName("platform");
		member.setMemberName("projectTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectServiceType projectServiceTypeList() {
		ProjectServiceType member = new ProjectServiceType();
		member.setModelTypeName("project_service_type");
		member.setName("platform");
		member.setMemberName("projectServiceTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectPhase projectPhaseList() {
		ProjectPhase member = new ProjectPhase();
		member.setModelTypeName("project_phase");
		member.setName("platform");
		member.setMemberName("projectPhaseList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkingStatus workingStatusList() {
		WorkingStatus member = new WorkingStatus();
		member.setModelTypeName("working_status");
		member.setName("platform");
		member.setMemberName("workingStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectOrganizationType projectOrganizationTypeList() {
		ProjectOrganizationType member = new ProjectOrganizationType();
		member.setModelTypeName("project_organization_type");
		member.setName("platform");
		member.setMemberName("projectOrganizationTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectOrganizationCategory projectOrganizationCategoryList() {
		ProjectOrganizationCategory member = new ProjectOrganizationCategory();
		member.setModelTypeName("project_organization_category");
		member.setName("platform");
		member.setMemberName("projectOrganizationCategoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectRole projectRoleList() {
		ProjectRole member = new ProjectRole();
		member.setModelTypeName("project_role");
		member.setName("platform");
		member.setMemberName("projectRoleList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressStatus projectProgressStatusList() {
		ProjectProgressStatus member = new ProjectProgressStatus();
		member.setModelTypeName("project_progress_status");
		member.setName("platform");
		member.setMemberName("projectProgressStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DailyTaskCategory dailyTaskCategoryList() {
		DailyTaskCategory member = new DailyTaskCategory();
		member.setModelTypeName("daily_task_category");
		member.setName("platform");
		member.setMemberName("dailyTaskCategoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DailyTaskType dailyTaskTypeList() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("platform");
		member.setMemberName("dailyTaskTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DailyTaskSecondType dailyTaskSecondTypeList() {
		DailyTaskSecondType member = new DailyTaskSecondType();
		member.setModelTypeName("daily_task_second_type");
		member.setName("platform");
		member.setMemberName("dailyTaskSecondTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DailyTaskThirdType dailyTaskThirdTypeList() {
		DailyTaskThirdType member = new DailyTaskThirdType();
		member.setModelTypeName("daily_task_third_type");
		member.setName("platform");
		member.setMemberName("dailyTaskThirdTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DailyTaskTemplate dailyTaskTemplateList() {
		DailyTaskTemplate member = new DailyTaskTemplate();
		member.setModelTypeName("daily_task_template");
		member.setName("platform");
		member.setMemberName("dailyTaskTemplateList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialType projectMaterialTypeList() {
		ProjectMaterialType member = new ProjectMaterialType();
		member.setModelTypeName("project_material_type");
		member.setName("platform");
		member.setMemberName("projectMaterialTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialParentType projectMaterialParentTypeList() {
		ProjectMaterialParentType member = new ProjectMaterialParentType();
		member.setModelTypeName("project_material_parent_type");
		member.setName("platform");
		member.setMemberName("projectMaterialParentTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialReviewStatus projectMaterialReviewStatusList() {
		ProjectMaterialReviewStatus member = new ProjectMaterialReviewStatus();
		member.setModelTypeName("project_material_review_status");
		member.setName("platform");
		member.setMemberName("projectMaterialReviewStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialReviewResult materialReviewResultList() {
		MaterialReviewResult member = new MaterialReviewResult();
		member.setModelTypeName("material_review_result");
		member.setName("platform");
		member.setMemberName("materialReviewResultList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public YourongProjectBookStatus yourongProjectBookStatusList() {
		YourongProjectBookStatus member = new YourongProjectBookStatus();
		member.setModelTypeName("yourong_project_book_status");
		member.setName("platform");
		member.setMemberName("yourongProjectBookStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public YourongProjectBookType yourongProjectBookTypeList() {
		YourongProjectBookType member = new YourongProjectBookType();
		member.setModelTypeName("yourong_project_book_type");
		member.setName("platform");
		member.setMemberName("yourongProjectBookTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborDisputeStatus laborDisputeStatusList() {
		LaborDisputeStatus member = new LaborDisputeStatus();
		member.setModelTypeName("labor_dispute_status");
		member.setName("platform");
		member.setMemberName("laborDisputeStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborDisputeType laborDisputeTypeList() {
		LaborDisputeType member = new LaborDisputeType();
		member.setModelTypeName("labor_dispute_type");
		member.setName("platform");
		member.setMemberName("laborDisputeTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanFund loanFundList() {
		LoanFund member = new LoanFund();
		member.setModelTypeName("loan_fund");
		member.setName("platform");
		member.setMemberName("loanFundList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("platform");
		member.setMemberName("loanApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanContract loanContractList() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("platform");
		member.setMemberName("loanContractList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialCategory materialCategoryList() {
		MaterialCategory member = new MaterialCategory();
		member.setModelTypeName("material_category");
		member.setName("platform");
		member.setMemberName("materialCategoryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialType materialTypeList() {
		MaterialType member = new MaterialType();
		member.setModelTypeName("material_type");
		member.setName("platform");
		member.setMemberName("materialTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialUnitOfMeasurement materialUnitOfMeasurementList() {
		MaterialUnitOfMeasurement member = new MaterialUnitOfMeasurement();
		member.setModelTypeName("material_unit_of_measurement");
		member.setName("platform");
		member.setMemberName("materialUnitOfMeasurementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AccountBookType accountBookTypeList() {
		AccountBookType member = new AccountBookType();
		member.setModelTypeName("account_book_type");
		member.setName("platform");
		member.setMemberName("accountBookTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AccountBookItemStatus accountBookItemStatusList() {
		AccountBookItemStatus member = new AccountBookItemStatus();
		member.setModelTypeName("account_book_item_status");
		member.setName("platform");
		member.setMemberName("accountBookItemStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Recommendation recommendationList() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("platform");
		member.setMemberName("recommendationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("platform");
		member.setMemberName("emplacementApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PersonalEmplacementApplication personalEmplacementApplicationList() {
		PersonalEmplacementApplication member = new PersonalEmplacementApplication();
		member.setModelTypeName("personal_emplacement_application");
		member.setName("platform");
		member.setMemberName("personalEmplacementApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("platform");
		member.setMemberName("customerProjectApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("platform");
		member.setMemberName("partnerSettlementApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ChangeRequestType changeRequestTypeList() {
		ChangeRequestType member = new ChangeRequestType();
		member.setModelTypeName("change_request_type");
		member.setName("platform");
		member.setMemberName("changeRequestTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("platform");
		member.setMemberName("changeRequestList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public BusinessType businessTypeList() {
		BusinessType member = new BusinessType();
		member.setModelTypeName("business_type");
		member.setName("platform");
		member.setMemberName("businessTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuditStatus auditStatusList() {
		AuditStatus member = new AuditStatus();
		member.setModelTypeName("audit_status");
		member.setName("platform");
		member.setMemberName("auditStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Menu menuList() {
		Menu member = new Menu();
		member.setModelTypeName("menu");
		member.setName("platform");
		member.setMemberName("menuList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractTemplateFile contractTemplateFileList() {
		ContractTemplateFile member = new ContractTemplateFile();
		member.setModelTypeName("contract_template_file");
		member.setName("platform");
		member.setMemberName("contractTemplateFileList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FinanceTemplate financeTemplateList() {
		FinanceTemplate member = new FinanceTemplate();
		member.setModelTypeName("finance_template");
		member.setName("platform");
		member.setMemberName("financeTemplateList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FiveBookTemplate fiveBookTemplateList() {
		FiveBookTemplate member = new FiveBookTemplate();
		member.setModelTypeName("five_book_template");
		member.setName("platform");
		member.setMemberName("fiveBookTemplateList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectEngineeringTemplate projectEngineeringTemplateList() {
		ProjectEngineeringTemplate member = new ProjectEngineeringTemplate();
		member.setModelTypeName("project_engineering_template");
		member.setName("platform");
		member.setMemberName("projectEngineeringTemplateList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessMap processMapList() {
		ProcessMap member = new ProcessMap();
		member.setModelTypeName("process_map");
		member.setName("platform");
		member.setMemberName("processMapList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Process processList() {
		Process member = new Process();
		member.setModelTypeName("process");
		member.setName("platform");
		member.setMemberName("processList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TodoList todoListList() {
		TodoList member = new TodoList();
		member.setModelTypeName("todo_list");
		member.setName("platform");
		member.setMemberName("todoListList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TodoListStatus todoListStatusList() {
		TodoListStatus member = new TodoListStatus();
		member.setModelTypeName("todo_list_status");
		member.setName("platform");
		member.setMemberName("todoListStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessAudit processAuditList() {
		ProcessAudit member = new ProcessAudit();
		member.setModelTypeName("process_audit");
		member.setName("platform");
		member.setMemberName("processAuditList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessApplication processApplicationList() {
		ProcessApplication member = new ProcessApplication();
		member.setModelTypeName("process_application");
		member.setName("platform");
		member.setMemberName("processApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerList() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("platform");
		member.setMemberName("contractLedgerList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("platform");
		member.setMemberName("contractRiskList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("platform");
		member.setMemberName("contractReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("platform");
		member.setMemberName("contractStatisticReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectStatisticReport projectStatisticReportList() {
		ProjectStatisticReport member = new ProjectStatisticReport();
		member.setModelTypeName("project_statistic_report");
		member.setName("platform");
		member.setMemberName("projectStatisticReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ServiceVendorStatisticReport serviceVendorStatisticReportList() {
		ServiceVendorStatisticReport member = new ServiceVendorStatisticReport();
		member.setModelTypeName("service_vendor_statistic_report");
		member.setName("platform");
		member.setMemberName("serviceVendorStatisticReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FinancialServiceStatisticReport financialServiceStatisticReportList() {
		FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
		member.setModelTypeName("financial_service_statistic_report");
		member.setName("platform");
		member.setMemberName("financialServiceStatisticReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RecruitmentRequirement recruitmentRequirementList() {
		RecruitmentRequirement member = new RecruitmentRequirement();
		member.setModelTypeName("recruitment_requirement");
		member.setName("platform");
		member.setMemberName("recruitmentRequirementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public JobPosition jobPositionList() {
		JobPosition member = new JobPosition();
		member.setModelTypeName("job_position");
		member.setName("platform");
		member.setMemberName("jobPositionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CandidateTalent candidateTalentList() {
		CandidateTalent member = new CandidateTalent();
		member.setModelTypeName("candidate_talent");
		member.setName("platform");
		member.setMemberName("candidateTalentList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StaffFiles staffFilesList() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("platform");
		member.setMemberName("staffFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeRelation employeeRelationList() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("platform");
		member.setMemberName("employeeRelationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeSalary employeeSalaryList() {
		EmployeeSalary member = new EmployeeSalary();
		member.setModelTypeName("employee_salary");
		member.setName("platform");
		member.setMemberName("employeeSalaryList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeePerformance employeePerformanceList() {
		EmployeePerformance member = new EmployeePerformance();
		member.setModelTypeName("employee_performance");
		member.setName("platform");
		member.setMemberName("employeePerformanceList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantSeal merchantSealList() {
		MerchantSeal member = new MerchantSeal();
		member.setModelTypeName("merchant_seal");
		member.setName("platform");
		member.setMemberName("merchantSealList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CooperateApplication cooperateApplicationList() {
		CooperateApplication member = new CooperateApplication();
		member.setModelTypeName("cooperate_application");
		member.setName("platform");
		member.setMemberName("cooperateApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectApplication projectApplicationList() {
		ProjectApplication member = new ProjectApplication();
		member.setModelTypeName("project_application");
		member.setName("platform");
		member.setMemberName("projectApplicationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAttractInvestment projectAttractInvestmentList() {
		ProjectAttractInvestment member = new ProjectAttractInvestment();
		member.setModelTypeName("project_attract_investment");
		member.setName("platform");
		member.setMemberName("projectAttractInvestmentList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SerivceVendorAttractInvestment serivceVendorAttractInvestmentList() {
		SerivceVendorAttractInvestment member = new SerivceVendorAttractInvestment();
		member.setModelTypeName("serivce_vendor_attract_investment");
		member.setName("platform");
		member.setMemberName("serivceVendorAttractInvestmentList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public BrandAttractInvestment brandAttractInvestmentList() {
		BrandAttractInvestment member = new BrandAttractInvestment();
		member.setModelTypeName("brand_attract_investment");
		member.setName("platform");
		member.setMemberName("brandAttractInvestmentList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectSettlement projectSettlementList() {
		ProjectSettlement member = new ProjectSettlement();
		member.setModelTypeName("project_settlement");
		member.setName("platform");
		member.setMemberName("projectSettlementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ServiceVendorSettlement serviceVendorSettlementList() {
		ServiceVendorSettlement member = new ServiceVendorSettlement();
		member.setModelTypeName("service_vendor_settlement");
		member.setName("platform");
		member.setMemberName("serviceVendorSettlementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public BrandPartnerSettlement brandPartnerSettlementList() {
		BrandPartnerSettlement member = new BrandPartnerSettlement();
		member.setModelTypeName("brand_partner_settlement");
		member.setName("platform");
		member.setMemberName("brandPartnerSettlementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantVerification merchantVerificationList() {
		MerchantVerification member = new MerchantVerification();
		member.setModelTypeName("merchant_verification");
		member.setName("platform");
		member.setMemberName("merchantVerificationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public QualificationExamination qualificationExaminationList() {
		QualificationExamination member = new QualificationExamination();
		member.setModelTypeName("qualification_examination");
		member.setName("platform");
		member.setMemberName("qualificationExaminationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public QualificationResearch qualificationResearchList() {
		QualificationResearch member = new QualificationResearch();
		member.setModelTypeName("qualification_research");
		member.setName("platform");
		member.setMemberName("qualificationResearchList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PartnerRecommendation partnerRecommendationList() {
		PartnerRecommendation member = new PartnerRecommendation();
		member.setModelTypeName("partner_recommendation");
		member.setName("platform");
		member.setMemberName("partnerRecommendationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectDirective projectDirectiveList() {
		ProjectDirective member = new ProjectDirective();
		member.setModelTypeName("project_directive");
		member.setName("platform");
		member.setMemberName("projectDirectiveList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectDailyReport projectDailyReportList() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("platform");
		member.setMemberName("projectDailyReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressReport projectProgressReportList() {
		ProjectProgressReport member = new ProjectProgressReport();
		member.setModelTypeName("project_progress_report");
		member.setName("platform");
		member.setMemberName("projectProgressReportList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectNotification projectNotificationList() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("platform");
		member.setMemberName("projectNotificationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Design designList() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("platform");
		member.setMemberName("designList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionSchema constructionSchemaList() {
		ConstructionSchema member = new ConstructionSchema();
		member.setModelTypeName("construction_schema");
		member.setName("platform");
		member.setMemberName("constructionSchemaList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectBid projectBidList() {
		ProjectBid member = new ProjectBid();
		member.setModelTypeName("project_bid");
		member.setName("platform");
		member.setMemberName("projectBidList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborSupervision laborSupervisionList() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("platform");
		member.setMemberName("laborSupervisionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SafetyInstruction safetyInstructionList() {
		SafetyInstruction member = new SafetyInstruction();
		member.setModelTypeName("safety_instruction");
		member.setName("platform");
		member.setMemberName("safetyInstructionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DesignChange designChangeList() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("platform");
		member.setMemberName("designChangeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Violation violationList() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("platform");
		member.setMemberName("violationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectFunding projectFundingList() {
		ProjectFunding member = new ProjectFunding();
		member.setModelTypeName("project_funding");
		member.setName("platform");
		member.setMemberName("projectFundingList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionStartWorkingFiles constructionStartWorkingFilesList() {
		ConstructionStartWorkingFiles member = new ConstructionStartWorkingFiles();
		member.setModelTypeName("construction_start_working_files");
		member.setName("platform");
		member.setMemberName("constructionStartWorkingFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public QualitiyAcceptanceFiles qualitiyAcceptanceFilesList() {
		QualitiyAcceptanceFiles member = new QualitiyAcceptanceFiles();
		member.setModelTypeName("qualitiy_acceptance_files");
		member.setName("platform");
		member.setMemberName("qualitiyAcceptanceFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringExperimentFiles engineeringExperimentFilesList() {
		EngineeringExperimentFiles member = new EngineeringExperimentFiles();
		member.setModelTypeName("engineering_experiment_files");
		member.setName("platform");
		member.setMemberName("engineeringExperimentFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionProcessFiles constructionProcessFilesList() {
		ConstructionProcessFiles member = new ConstructionProcessFiles();
		member.setModelTypeName("construction_process_files");
		member.setName("platform");
		member.setMemberName("constructionProcessFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public NecessarySupplementFiles necessarySupplementFilesList() {
		NecessarySupplementFiles member = new NecessarySupplementFiles();
		member.setModelTypeName("necessary_supplement_files");
		member.setName("platform");
		member.setMemberName("necessarySupplementFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionCompletionFiles constructionCompletionFilesList() {
		ConstructionCompletionFiles member = new ConstructionCompletionFiles();
		member.setModelTypeName("construction_completion_files");
		member.setName("platform");
		member.setMemberName("constructionCompletionFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringQualitySupervisionFiles engineeringQualitySupervisionFilesList() {
		EngineeringQualitySupervisionFiles member = new EngineeringQualitySupervisionFiles();
		member.setModelTypeName("engineering_quality_supervision_files");
		member.setName("platform");
		member.setMemberName("engineeringQualitySupervisionFilesList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectFilesArchive projectFilesArchiveList() {
		ProjectFilesArchive member = new ProjectFilesArchive();
		member.setModelTypeName("project_files_archive");
		member.setName("platform");
		member.setMemberName("projectFilesArchiveList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchiveList() {
		EngineeringQualitySupervisionArchive member = new EngineeringQualitySupervisionArchive();
		member.setModelTypeName("engineering_quality_supervision_archive");
		member.setName("platform");
		member.setMemberName("engineeringQualitySupervisionArchiveList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractCollection contractCollectionList() {
		ContractCollection member = new ContractCollection();
		member.setModelTypeName("contract_collection");
		member.setName("platform");
		member.setMemberName("contractCollectionList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPayment contractPaymentList() {
		ContractPayment member = new ContractPayment();
		member.setModelTypeName("contract_payment");
		member.setName("platform");
		member.setMemberName("contractPaymentList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractSettlement contractSettlementList() {
		ContractSettlement member = new ContractSettlement();
		member.setModelTypeName("contract_settlement");
		member.setName("platform");
		member.setMemberName("contractSettlementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EconomicVerificationForm economicVerificationFormList() {
		EconomicVerificationForm member = new EconomicVerificationForm();
		member.setModelTypeName("economic_verification_form");
		member.setName("platform");
		member.setMemberName("economicVerificationFormList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectObjective projectObjectiveList() {
		ProjectObjective member = new ProjectObjective();
		member.setModelTypeName("project_objective");
		member.setName("platform");
		member.setMemberName("projectObjectiveList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanList() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("platform");
		member.setMemberName("projectProgressFundingTrusteeshipPlanList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractExamine contractExamineList() {
		ContractExamine member = new ContractExamine();
		member.setModelTypeName("contract_examine");
		member.setName("platform");
		member.setMemberName("contractExamineList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FundingCloseTrusteeshipContract fundingCloseTrusteeshipContractList() {
		FundingCloseTrusteeshipContract member = new FundingCloseTrusteeshipContract();
		member.setModelTypeName("funding_close_trusteeship_contract");
		member.setName("platform");
		member.setMemberName("fundingCloseTrusteeshipContractList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractList() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("platform");
		member.setMemberName("projectCloseTrusteeshipContractList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FundingCloseOrganization fundingCloseOrganizationList() {
		FundingCloseOrganization member = new FundingCloseOrganization();
		member.setModelTypeName("funding_close_organization");
		member.setName("platform");
		member.setMemberName("fundingCloseOrganizationList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FundingCloseOrganizationType fundingCloseOrganizationTypeList() {
		FundingCloseOrganizationType member = new FundingCloseOrganizationType();
		member.setModelTypeName("funding_close_organization_type");
		member.setName("platform");
		member.setMemberName("fundingCloseOrganizationTypeList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskOrder taskOrderList() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("platform");
		member.setMemberName("taskOrderList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskOrderStatus taskOrderStatusList() {
		TaskOrderStatus member = new TaskOrderStatus();
		member.setModelTypeName("task_order_status");
		member.setName("platform");
		member.setMemberName("taskOrderStatusList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkPackageAcceptanceSettlement workPackageAcceptanceSettlementList() {
		WorkPackageAcceptanceSettlement member = new WorkPackageAcceptanceSettlement();
		member.setModelTypeName("work_package_acceptance_settlement");
		member.setName("platform");
		member.setMemberName("workPackageAcceptanceSettlementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptanceSettlement projectAcceptanceSettlementList() {
		ProjectAcceptanceSettlement member = new ProjectAcceptanceSettlement();
		member.setModelTypeName("project_acceptance_settlement");
		member.setName("platform");
		member.setMemberName("projectAcceptanceSettlementList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public YourongDocument yourongDocumentList() {
		YourongDocument member = new YourongDocument();
		member.setModelTypeName("yourong_document");
		member.setName("platform");
		member.setMemberName("yourongDocumentList");
		member.setRelationName("platform");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public UserGuide userGuideList() {
		UserGuide member = new UserGuide();
		member.setModelTypeName("user_guide");
		member.setName("platform");
		member.setMemberName("userGuideList");
		member.setRelationName("platform");
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

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

