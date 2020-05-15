package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Merchant extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.merchant.Merchant";
	}
	// 枚举对象

	// 引用的对象

	public MerchantType merchantType() {
		MerchantType member = new MerchantType();
		member.setModelTypeName("merchant_type");
		member.setName("merchant_type");
		member.setMemberName("merchantType");
		member.setReferDirection(true);
		member.setRelationName("merchantType");
		append(member);
		return member;
	}

	public MerchantBaseType merchantBaseType() {
		MerchantBaseType member = new MerchantBaseType();
		member.setModelTypeName("merchant_base_type");
		member.setName("merchant_base_type");
		member.setMemberName("merchantBaseType");
		member.setReferDirection(true);
		member.setRelationName("merchantBaseType");
		append(member);
		return member;
	}

	public MerchantStatus merchantStatus() {
		MerchantStatus member = new MerchantStatus();
		member.setModelTypeName("merchant_status");
		member.setName("merchant_status");
		member.setMemberName("merchantStatus");
		member.setReferDirection(true);
		member.setRelationName("merchantStatus");
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象

	public StandardContract standardContractListAsPartyA() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("party_a");
		member.setMemberName("standardContractListAsPartyA");
		member.setRelationName("partyA");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardContract standardContractListAsPartyB() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("party_b");
		member.setMemberName("standardContractListAsPartyB");
		member.setRelationName("partyA");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPayItem contractPayItemListAsPayer() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("payer");
		member.setMemberName("contractPayItemListAsPayer");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPayItem contractPayItemListAsPayee() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("payee");
		member.setMemberName("contractPayItemListAsPayee");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemListAsPayer() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("payer");
		member.setMemberName("commissionPayItemListAsPayer");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemListAsPayee() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("payee");
		member.setMemberName("commissionPayItemListAsPayee");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractViewRecord contractViewRecordList() {
		ContractViewRecord member = new ContractViewRecord();
		member.setModelTypeName("contract_view_record");
		member.setName("merchant");
		member.setMemberName("contractViewRecordList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractOperationLog contractOperationLogList() {
		ContractOperationLog member = new ContractOperationLog();
		member.setModelTypeName("contract_operation_log");
		member.setName("operator_merchant");
		member.setMemberName("contractOperationLogList");
		member.setRelationName("operatorMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by_merchant");
		member.setMemberName("articleList");
		member.setRelationName("postByMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantActiveNomination merchantActiveNominationList() {
		MerchantActiveNomination member = new MerchantActiveNomination();
		member.setModelTypeName("merchant_active_nomination");
		member.setName("merchant");
		member.setMemberName("merchantActiveNominationList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("owner");
		member.setMemberName("licenseList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Job jobList() {
		Job member = new Job();
		member.setModelTypeName("job");
		member.setName("merchant");
		member.setMemberName("jobList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeNomination employeeNominationListAsEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employee");
		member.setMemberName("employeeNominationListAsEmployee");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeNomination employeeNominationListAsEmployer() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employer");
		member.setMemberName("employeeNominationListAsEmployer");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkPackage workPackageList() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("vendor");
		member.setMemberName("workPackageList");
		member.setRelationName("vendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsProjectOwner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_owner");
		member.setMemberName("projectListAsProjectOwner");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsStore() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("store");
		member.setMemberName("projectListAsStore");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsPartner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("partner");
		member.setMemberName("projectListAsPartner");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialViewRecord projectMaterialViewRecordList() {
		ProjectMaterialViewRecord member = new ProjectMaterialViewRecord();
		member.setModelTypeName("project_material_view_record");
		member.setName("merchant");
		member.setMemberName("projectMaterialViewRecordList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialOperationLog projectMaterialOperationLogList() {
		ProjectMaterialOperationLog member = new ProjectMaterialOperationLog();
		member.setModelTypeName("project_material_operation_log");
		member.setName("operator_merchant");
		member.setMemberName("projectMaterialOperationLogList");
		member.setRelationName("operatorMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptance projectAcceptanceList() {
		ProjectAcceptance member = new ProjectAcceptance();
		member.setModelTypeName("project_acceptance");
		member.setName("property_owner");
		member.setMemberName("projectAcceptanceList");
		member.setRelationName("propertyOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AccountBook accountBookList() {
		AccountBook member = new AccountBook();
		member.setModelTypeName("account_book");
		member.setName("owner");
		member.setMemberName("accountBookList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Recommendation recommendationList() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("applicant_merchant");
		member.setMemberName("recommendationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("applicant_merchant");
		member.setMemberName("emplacementApplicationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_merchant");
		member.setMemberName("customerProjectApplicationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("applicant_merchant");
		member.setMemberName("partnerSettlementApplicationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Notification notificationListAsReceiver() {
		Notification member = new Notification();
		member.setModelTypeName("notification");
		member.setName("receiver");
		member.setMemberName("notificationListAsReceiver");
		member.setRelationName("receiver");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Notification notificationListAsSender() {
		Notification member = new Notification();
		member.setModelTypeName("notification");
		member.setName("sender");
		member.setMemberName("notificationListAsSender");
		member.setRelationName("receiver");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventShowAllType eventShowAllTypeList() {
		EventShowAllType member = new EventShowAllType();
		member.setModelTypeName("event_show_all_type");
		member.setName("field_biz_candidate");
		member.setMemberName("eventShowAllTypeList");
		member.setRelationName("fieldBizCandidate");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectInfo eventProjectInfoList() {
		EventProjectInfo member = new EventProjectInfo();
		member.setModelTypeName("event_project_info");
		member.setName("merchant");
		member.setMemberName("eventProjectInfoList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanFund loanFundList() {
		LoanFund member = new LoanFund();
		member.setModelTypeName("loan_fund");
		member.setName("fund_vendor");
		member.setMemberName("loanFundList");
		member.setRelationName("fundVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("applicant");
		member.setMemberName("loanApplicationList");
		member.setRelationName("applicant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanContract loanContractListAsBorrower() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("borrower");
		member.setMemberName("loanContractListAsBorrower");
		member.setRelationName("borrower");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanContract loanContractListAsLender() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("lender");
		member.setMemberName("loanContractListAsLender");
		member.setRelationName("borrower");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TodoList todoListList() {
		TodoList member = new TodoList();
		member.setModelTypeName("todo_list");
		member.setName("owner");
		member.setMemberName("todoListList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessAudit processAuditList() {
		ProcessAudit member = new ProcessAudit();
		member.setModelTypeName("process_audit");
		member.setName("auditor");
		member.setMemberName("processAuditList");
		member.setRelationName("auditor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessApplication processApplicationList() {
		ProcessApplication member = new ProcessApplication();
		member.setModelTypeName("process_application");
		member.setName("owner");
		member.setMemberName("processApplicationList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerListAsFirstPartMerchant() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("first_part_merchant");
		member.setMemberName("contractLedgerListAsFirstPartMerchant");
		member.setRelationName("firstPartMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerListAsSecondPartMerchant() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("second_part_merchant");
		member.setMemberName("contractLedgerListAsSecondPartMerchant");
		member.setRelationName("firstPartMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("owner");
		member.setMemberName("contractRiskList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("owner");
		member.setMemberName("contractReportList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("owner");
		member.setMemberName("contractStatisticReportList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectStatisticReport projectStatisticReportList() {
		ProjectStatisticReport member = new ProjectStatisticReport();
		member.setModelTypeName("project_statistic_report");
		member.setName("owner");
		member.setMemberName("projectStatisticReportList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ServiceVendorStatisticReport serviceVendorStatisticReportListAsVendor() {
		ServiceVendorStatisticReport member = new ServiceVendorStatisticReport();
		member.setModelTypeName("service_vendor_statistic_report");
		member.setName("vendor");
		member.setMemberName("serviceVendorStatisticReportListAsVendor");
		member.setRelationName("vendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ServiceVendorStatisticReport serviceVendorStatisticReportListAsOwner() {
		ServiceVendorStatisticReport member = new ServiceVendorStatisticReport();
		member.setModelTypeName("service_vendor_statistic_report");
		member.setName("owner");
		member.setMemberName("serviceVendorStatisticReportListAsOwner");
		member.setRelationName("vendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FinancialServiceStatisticReport financialServiceStatisticReportList() {
		FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
		member.setModelTypeName("financial_service_statistic_report");
		member.setName("owner");
		member.setMemberName("financialServiceStatisticReportList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RecruitmentRequirement recruitmentRequirementList() {
		RecruitmentRequirement member = new RecruitmentRequirement();
		member.setModelTypeName("recruitment_requirement");
		member.setName("employee");
		member.setMemberName("recruitmentRequirementList");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CandidateTalent candidateTalentList() {
		CandidateTalent member = new CandidateTalent();
		member.setModelTypeName("candidate_talent");
		member.setName("candidate");
		member.setMemberName("candidateTalentList");
		member.setRelationName("candidate");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StaffFiles staffFilesListAsEmployer() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("employer");
		member.setMemberName("staffFilesListAsEmployer");
		member.setRelationName("employer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StaffFiles staffFilesListAsEmployee() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("employee");
		member.setMemberName("staffFilesListAsEmployee");
		member.setRelationName("employer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeRelation employeeRelationListAsEmployer() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("employer");
		member.setMemberName("employeeRelationListAsEmployer");
		member.setRelationName("employer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeRelation employeeRelationListAsEmployee() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("employee");
		member.setMemberName("employeeRelationListAsEmployee");
		member.setRelationName("employer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeSalary employeeSalaryList() {
		EmployeeSalary member = new EmployeeSalary();
		member.setModelTypeName("employee_salary");
		member.setName("employer");
		member.setMemberName("employeeSalaryList");
		member.setRelationName("employer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeePerformance employeePerformanceListAsEmployee() {
		EmployeePerformance member = new EmployeePerformance();
		member.setModelTypeName("employee_performance");
		member.setName("employee");
		member.setMemberName("employeePerformanceListAsEmployee");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeePerformance employeePerformanceListAsEmployer() {
		EmployeePerformance member = new EmployeePerformance();
		member.setModelTypeName("employee_performance");
		member.setName("employer");
		member.setMemberName("employeePerformanceListAsEmployer");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantSeal merchantSealList() {
		MerchantSeal member = new MerchantSeal();
		member.setModelTypeName("merchant_seal");
		member.setName("owner");
		member.setMemberName("merchantSealList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAttractInvestment projectAttractInvestmentList() {
		ProjectAttractInvestment member = new ProjectAttractInvestment();
		member.setModelTypeName("project_attract_investment");
		member.setName("post_by");
		member.setMemberName("projectAttractInvestmentList");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SerivceVendorAttractInvestment serivceVendorAttractInvestmentList() {
		SerivceVendorAttractInvestment member = new SerivceVendorAttractInvestment();
		member.setModelTypeName("serivce_vendor_attract_investment");
		member.setName("post_by");
		member.setMemberName("serivceVendorAttractInvestmentList");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public BrandAttractInvestment brandAttractInvestmentList() {
		BrandAttractInvestment member = new BrandAttractInvestment();
		member.setModelTypeName("brand_attract_investment");
		member.setName("post_by");
		member.setMemberName("brandAttractInvestmentList");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectSettlement projectSettlementList() {
		ProjectSettlement member = new ProjectSettlement();
		member.setModelTypeName("project_settlement");
		member.setName("responsible_merchant");
		member.setMemberName("projectSettlementList");
		member.setRelationName("responsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ServiceVendorSettlement serviceVendorSettlementList() {
		ServiceVendorSettlement member = new ServiceVendorSettlement();
		member.setModelTypeName("service_vendor_settlement");
		member.setName("vendor");
		member.setMemberName("serviceVendorSettlementList");
		member.setRelationName("vendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public BrandPartnerSettlement brandPartnerSettlementList() {
		BrandPartnerSettlement member = new BrandPartnerSettlement();
		member.setModelTypeName("brand_partner_settlement");
		member.setName("partner");
		member.setMemberName("brandPartnerSettlementList");
		member.setRelationName("partner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantVerification merchantVerificationList() {
		MerchantVerification member = new MerchantVerification();
		member.setModelTypeName("merchant_verification");
		member.setName("merchant");
		member.setMemberName("merchantVerificationList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PartnerRecommendation partnerRecommendationList() {
		PartnerRecommendation member = new PartnerRecommendation();
		member.setModelTypeName("partner_recommendation");
		member.setName("partner");
		member.setMemberName("partnerRecommendationList");
		member.setRelationName("partner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectDirective projectDirectiveListAsResponsibleMerchant() {
		ProjectDirective member = new ProjectDirective();
		member.setModelTypeName("project_directive");
		member.setName("responsible_merchant");
		member.setMemberName("projectDirectiveListAsResponsibleMerchant");
		member.setRelationName("responsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectDirective projectDirectiveListAsPostBy() {
		ProjectDirective member = new ProjectDirective();
		member.setModelTypeName("project_directive");
		member.setName("post_by");
		member.setMemberName("projectDirectiveListAsPostBy");
		member.setRelationName("responsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectDailyReport projectDailyReportList() {
		ProjectDailyReport member = new ProjectDailyReport();
		member.setModelTypeName("project_daily_report");
		member.setName("reporter");
		member.setMemberName("projectDailyReportList");
		member.setRelationName("reporter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressReport projectProgressReportList() {
		ProjectProgressReport member = new ProjectProgressReport();
		member.setModelTypeName("project_progress_report");
		member.setName("reporter");
		member.setMemberName("projectProgressReportList");
		member.setRelationName("reporter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectNotification projectNotificationListAsRecipientMerchant() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("recipient_merchant");
		member.setMemberName("projectNotificationListAsRecipientMerchant");
		member.setRelationName("recipientMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectNotification projectNotificationListAsPostBy() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("post_by");
		member.setMemberName("projectNotificationListAsPostBy");
		member.setRelationName("recipientMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Design designListAsDesigner() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("designer");
		member.setMemberName("designListAsDesigner");
		member.setRelationName("designer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Design designListAsReviewer() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("reviewer");
		member.setMemberName("designListAsReviewer");
		member.setRelationName("designer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionSchema constructionSchemaList() {
		ConstructionSchema member = new ConstructionSchema();
		member.setModelTypeName("construction_schema");
		member.setName("post_by");
		member.setMemberName("constructionSchemaList");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectBid projectBidListAsProjectOwner() {
		ProjectBid member = new ProjectBid();
		member.setModelTypeName("project_bid");
		member.setName("project_owner");
		member.setMemberName("projectBidListAsProjectOwner");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectBid projectBidListAsResponsibleMerchant() {
		ProjectBid member = new ProjectBid();
		member.setModelTypeName("project_bid");
		member.setName("responsible_merchant");
		member.setMemberName("projectBidListAsResponsibleMerchant");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborSupervision laborSupervisionListAsEmployee() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("employee");
		member.setMemberName("laborSupervisionListAsEmployee");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborSupervision laborSupervisionListAsEmployer() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("employer");
		member.setMemberName("laborSupervisionListAsEmployer");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SafetyInstruction safetyInstructionList() {
		SafetyInstruction member = new SafetyInstruction();
		member.setModelTypeName("safety_instruction");
		member.setName("post_by");
		member.setMemberName("safetyInstructionList");
		member.setRelationName("postBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DesignChange designChangeListAsDesigner() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("designer");
		member.setMemberName("designChangeListAsDesigner");
		member.setRelationName("designer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DesignChange designChangeListAsSponsor() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("sponsor");
		member.setMemberName("designChangeListAsSponsor");
		member.setRelationName("designer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Violation violationListAsResponsibleMerchant() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("responsible_merchant");
		member.setMemberName("violationListAsResponsibleMerchant");
		member.setRelationName("responsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Violation violationListAsImpactMerchant() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("impact_merchant");
		member.setMemberName("violationListAsImpactMerchant");
		member.setRelationName("responsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Material materialList() {
		Material member = new Material();
		member.setModelTypeName("material");
		member.setName("vendor");
		member.setMemberName("materialList");
		member.setRelationName("vendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionStartWorkingFiles constructionStartWorkingFilesList() {
		ConstructionStartWorkingFiles member = new ConstructionStartWorkingFiles();
		member.setModelTypeName("construction_start_working_files");
		member.setName("upload_user");
		member.setMemberName("constructionStartWorkingFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public QualitiyAcceptanceFiles qualitiyAcceptanceFilesList() {
		QualitiyAcceptanceFiles member = new QualitiyAcceptanceFiles();
		member.setModelTypeName("qualitiy_acceptance_files");
		member.setName("upload_user");
		member.setMemberName("qualitiyAcceptanceFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringExperimentFiles engineeringExperimentFilesList() {
		EngineeringExperimentFiles member = new EngineeringExperimentFiles();
		member.setModelTypeName("engineering_experiment_files");
		member.setName("upload_user");
		member.setMemberName("engineeringExperimentFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionProcessFiles constructionProcessFilesList() {
		ConstructionProcessFiles member = new ConstructionProcessFiles();
		member.setModelTypeName("construction_process_files");
		member.setName("upload_user");
		member.setMemberName("constructionProcessFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public NecessarySupplementFiles necessarySupplementFilesList() {
		NecessarySupplementFiles member = new NecessarySupplementFiles();
		member.setModelTypeName("necessary_supplement_files");
		member.setName("upload_user");
		member.setMemberName("necessarySupplementFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ConstructionCompletionFiles constructionCompletionFilesList() {
		ConstructionCompletionFiles member = new ConstructionCompletionFiles();
		member.setModelTypeName("construction_completion_files");
		member.setName("upload_user");
		member.setMemberName("constructionCompletionFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringQualitySupervisionFiles engineeringQualitySupervisionFilesList() {
		EngineeringQualitySupervisionFiles member = new EngineeringQualitySupervisionFiles();
		member.setModelTypeName("engineering_quality_supervision_files");
		member.setName("upload_user");
		member.setMemberName("engineeringQualitySupervisionFilesList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectFilesArchive projectFilesArchiveList() {
		ProjectFilesArchive member = new ProjectFilesArchive();
		member.setModelTypeName("project_files_archive");
		member.setName("upload_user");
		member.setMemberName("projectFilesArchiveList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchiveList() {
		EngineeringQualitySupervisionArchive member = new EngineeringQualitySupervisionArchive();
		member.setModelTypeName("engineering_quality_supervision_archive");
		member.setName("upload_user");
		member.setMemberName("engineeringQualitySupervisionArchiveList");
		member.setRelationName("uploadUser");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EconomicVerificationForm economicVerificationFormList() {
		EconomicVerificationForm member = new EconomicVerificationForm();
		member.setModelTypeName("economic_verification_form");
		member.setName("service_vendor");
		member.setMemberName("economicVerificationFormList");
		member.setRelationName("serviceVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectObjective projectObjectiveList() {
		ProjectObjective member = new ProjectObjective();
		member.setModelTypeName("project_objective");
		member.setName("service_store");
		member.setMemberName("projectObjectiveList");
		member.setRelationName("serviceStore");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanListAsOwner() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("owner");
		member.setMemberName("projectProgressFundingTrusteeshipPlanListAsOwner");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanListAsServiceStore() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("service_store");
		member.setMemberName("projectProgressFundingTrusteeshipPlanListAsServiceStore");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FundingCloseTrusteeshipContract fundingCloseTrusteeshipContractListAsFundingVendor() {
		FundingCloseTrusteeshipContract member = new FundingCloseTrusteeshipContract();
		member.setModelTypeName("funding_close_trusteeship_contract");
		member.setName("funding_vendor");
		member.setMemberName("fundingCloseTrusteeshipContractListAsFundingVendor");
		member.setRelationName("fundingVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FundingCloseTrusteeshipContract fundingCloseTrusteeshipContractListAsFundingConsumer() {
		FundingCloseTrusteeshipContract member = new FundingCloseTrusteeshipContract();
		member.setModelTypeName("funding_close_trusteeship_contract");
		member.setName("funding_consumer");
		member.setMemberName("fundingCloseTrusteeshipContractListAsFundingConsumer");
		member.setRelationName("fundingVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractListAsOwner() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("owner");
		member.setMemberName("projectCloseTrusteeshipContractListAsOwner");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractListAsStore() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("store");
		member.setMemberName("projectCloseTrusteeshipContractListAsStore");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FundingCloseOrganization fundingCloseOrganizationList() {
		FundingCloseOrganization member = new FundingCloseOrganization();
		member.setModelTypeName("funding_close_organization");
		member.setName("merchant");
		member.setMemberName("fundingCloseOrganizationList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskOrder taskOrderListAsBuyerMerchant() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("buyer_merchant");
		member.setMemberName("taskOrderListAsBuyerMerchant");
		member.setRelationName("buyerMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskOrder taskOrderListAsServiceMerchant() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("service_merchant");
		member.setMemberName("taskOrderListAsServiceMerchant");
		member.setRelationName("buyerMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TaskOrder taskOrderListAsStoreMerchant() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("store_merchant");
		member.setMemberName("taskOrderListAsStoreMerchant");
		member.setRelationName("buyerMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkPackageAcceptanceSettlement workPackageAcceptanceSettlementList() {
		WorkPackageAcceptanceSettlement member = new WorkPackageAcceptanceSettlement();
		member.setModelTypeName("work_package_acceptance_settlement");
		member.setName("service_vendor");
		member.setMemberName("workPackageAcceptanceSettlementList");
		member.setRelationName("serviceVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptanceSettlement projectAcceptanceSettlementList() {
		ProjectAcceptanceSettlement member = new ProjectAcceptanceSettlement();
		member.setModelTypeName("project_acceptance_settlement");
		member.setName("owner");
		member.setMemberName("projectAcceptanceSettlementList");
		member.setRelationName("owner");
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

	public StringAttribute contactMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("contactMobile");
		member.setName("contact_mobile");
		useMember(member);
		return member;
	}

	public StringAttribute contactAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contactAddress");
		member.setName("contact_address");
		useMember(member);
		return member;
	}

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("avatar");
		member.setName("avatar");
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

