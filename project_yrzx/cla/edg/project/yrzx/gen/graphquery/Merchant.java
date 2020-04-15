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
		append(member);
		return member;
	}

	public MerchantStatus merchantStatus() {
		MerchantStatus member = new MerchantStatus();
		member.setModelTypeName("merchant_status");
		member.setName("merchant_status");
		member.setMemberName("merchantStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MerchantBusinessType merchantBusinessType() {
		MerchantBusinessType member = new MerchantBusinessType();
		member.setModelTypeName("merchant_business_type");
		member.setName("merchant_business_type");
		member.setMemberName("merchantBusinessType");
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
	
	public AccountTitle accountTitleList() {
		AccountTitle member = new AccountTitle();
		member.setModelTypeName("account_title");
		member.setName("merchant");
		member.setMemberName("accountTitleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OriginalEvidenceRecord originalEvidenceRecordList() {
		OriginalEvidenceRecord member = new OriginalEvidenceRecord();
		member.setModelTypeName("original_evidence_record");
		member.setName("confirmer_merchant");
		member.setMemberName("originalEvidenceRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public GenericAccountBook genericAccountBookList() {
		GenericAccountBook member = new GenericAccountBook();
		member.setModelTypeName("generic_account_book");
		member.setName("owner");
		member.setMemberName("genericAccountBookList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantRecord merchantRecordList() {
		MerchantRecord member = new MerchantRecord();
		member.setModelTypeName("merchant_record");
		member.setName("merchant");
		member.setMemberName("merchantRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantLicense merchantLicenseList() {
		MerchantLicense member = new MerchantLicense();
		member.setModelTypeName("merchant_license");
		member.setName("merchant");
		member.setMemberName("merchantLicenseList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ParentCompanyRecord parentCompanyRecordListAsMerchant() {
		ParentCompanyRecord member = new ParentCompanyRecord();
		member.setModelTypeName("parent_company_record");
		member.setName("merchant");
		member.setMemberName("parentCompanyRecordListAsMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ParentCompanyRecord parentCompanyRecordListAsParentMerchant() {
		ParentCompanyRecord member = new ParentCompanyRecord();
		member.setModelTypeName("parent_company_record");
		member.setName("parent_merchant");
		member.setMemberName("parentCompanyRecordListAsParentMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerRecommendationRecord partnerRecommendationRecordListAsMerchant() {
		PartnerRecommendationRecord member = new PartnerRecommendationRecord();
		member.setModelTypeName("partner_recommendation_record");
		member.setName("merchant");
		member.setMemberName("partnerRecommendationRecordListAsMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerRecommendationRecord partnerRecommendationRecordListAsPartner() {
		PartnerRecommendationRecord member = new PartnerRecommendationRecord();
		member.setModelTypeName("partner_recommendation_record");
		member.setName("partner");
		member.setMemberName("partnerRecommendationRecordListAsPartner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantWarehouse merchantWarehouseList() {
		MerchantWarehouse member = new MerchantWarehouse();
		member.setModelTypeName("merchant_warehouse");
		member.setName("merchant");
		member.setMemberName("merchantWarehouseList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeNomination employeeNominationListAsEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employee");
		member.setMemberName("employeeNominationListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeNomination employeeNominationListAsEmployer() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employer");
		member.setMemberName("employeeNominationListAsEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("buyer_merchant");
		member.setMemberName("mainOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MainOrderProcessingRecord mainOrderProcessingRecordList() {
		MainOrderProcessingRecord member = new MainOrderProcessingRecord();
		member.setModelTypeName("main_order_processing_record");
		member.setName("operator_merchant");
		member.setMemberName("mainOrderProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LineItem lineItemList() {
		LineItem member = new LineItem();
		member.setModelTypeName("line_item");
		member.setName("seller_merchant");
		member.setMemberName("lineItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("payer_merchant");
		member.setMemberName("paymentDetailList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by_merchant");
		member.setMemberName("articleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectListAsProjectOwner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_owner");
		member.setMemberName("projectListAsProjectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectListAsStore() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("store");
		member.setMemberName("projectListAsStore");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectListAsPartner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("partner");
		member.setMemberName("projectListAsPartner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectParticipatorContract projectParticipatorContractList() {
		ProjectParticipatorContract member = new ProjectParticipatorContract();
		member.setModelTypeName("project_participator_contract");
		member.setName("merchant");
		member.setMemberName("projectParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectRunningContract projectRunningContractListAsFirstPartMerchant() {
		ProjectRunningContract member = new ProjectRunningContract();
		member.setModelTypeName("project_running_contract");
		member.setName("first_part_merchant");
		member.setMemberName("projectRunningContractListAsFirstPartMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectRunningContract projectRunningContractListAsSecondPartMerchant() {
		ProjectRunningContract member = new ProjectRunningContract();
		member.setModelTypeName("project_running_contract");
		member.setName("second_part_merchant");
		member.setMemberName("projectRunningContractListAsSecondPartMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectRunningContractConfirmRecord projectRunningContractConfirmRecordList() {
		ProjectRunningContractConfirmRecord member = new ProjectRunningContractConfirmRecord();
		member.setModelTypeName("project_running_contract_confirm_record");
		member.setName("approve_merchant");
		member.setMemberName("projectRunningContractConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentConfirmRecord projectDocumentConfirmRecordList() {
		ProjectDocumentConfirmRecord member = new ProjectDocumentConfirmRecord();
		member.setModelTypeName("project_document_confirm_record");
		member.setName("approve_merchant");
		member.setMemberName("projectDocumentConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantImage merchantImageList() {
		MerchantImage member = new MerchantImage();
		member.setModelTypeName("merchant_image");
		member.setName("merchant");
		member.setMemberName("merchantImageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackage workPackageList() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("responsible_service_company");
		member.setMemberName("workPackageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageParticipatorContract workPackageParticipatorContractList() {
		WorkPackageParticipatorContract member = new WorkPackageParticipatorContract();
		member.setModelTypeName("work_package_participator_contract");
		member.setName("merchant");
		member.setMemberName("workPackageParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageProcessingRecord workPackageProcessingRecordList() {
		WorkPackageProcessingRecord member = new WorkPackageProcessingRecord();
		member.setModelTypeName("work_package_processing_record");
		member.setName("actor");
		member.setMemberName("workPackageProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Task taskList() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("responsible_merchant");
		member.setMemberName("taskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskAcceptance taskAcceptanceList() {
		TaskAcceptance member = new TaskAcceptance();
		member.setModelTypeName("task_acceptance");
		member.setName("acceptor_merchant");
		member.setMemberName("taskAcceptanceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskProcessingRecord taskProcessingRecordList() {
		TaskProcessingRecord member = new TaskProcessingRecord();
		member.setModelTypeName("task_processing_record");
		member.setName("actor_merchant");
		member.setMemberName("taskProcessingRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PrivateMessage privateMessageListAsSender() {
		PrivateMessage member = new PrivateMessage();
		member.setModelTypeName("private_message");
		member.setName("sender");
		member.setMemberName("privateMessageListAsSender");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PrivateMessage privateMessageListAsReader() {
		PrivateMessage member = new PrivateMessage();
		member.setModelTypeName("private_message");
		member.setName("reader");
		member.setMemberName("privateMessageListAsReader");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNotification projectNotificationList() {
		ProjectNotification member = new ProjectNotification();
		member.setModelTypeName("project_notification");
		member.setName("send_merchant");
		member.setMemberName("projectNotificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationItem violationItemListAsResponsibleMerchant() {
		ViolationItem member = new ViolationItem();
		member.setModelTypeName("violation_item");
		member.setName("responsible_merchant");
		member.setMemberName("violationItemListAsResponsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ViolationItem violationItemListAsImpactMerchant() {
		ViolationItem member = new ViolationItem();
		member.setModelTypeName("violation_item");
		member.setName("impact_merchant");
		member.setMemberName("violationItemListAsImpactMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillListAsPayerMerchant() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("payer_merchant");
		member.setMemberName("yourongBillListAsPayerMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillListAsPayeeMerchant() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("payee_merchant");
		member.setMemberName("yourongBillListAsPayeeMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_merchant");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerApplication partnerApplicationList() {
		PartnerApplication member = new PartnerApplication();
		member.setModelTypeName("partner_application");
		member.setName("applicant_merchant");
		member.setMemberName("partnerApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignerRecommendation designerRecommendationListAsReferrerEmployee() {
		DesignerRecommendation member = new DesignerRecommendation();
		member.setModelTypeName("designer_recommendation");
		member.setName("referrer_employee");
		member.setMemberName("designerRecommendationListAsReferrerEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignerRecommendation designerRecommendationListAsReferrerEmployer() {
		DesignerRecommendation member = new DesignerRecommendation();
		member.setModelTypeName("designer_recommendation");
		member.setName("referrer_employer");
		member.setMemberName("designerRecommendationListAsReferrerEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceProviderRecommendation serviceProviderRecommendationListAsReferrerEmployee() {
		ServiceProviderRecommendation member = new ServiceProviderRecommendation();
		member.setModelTypeName("service_provider_recommendation");
		member.setName("referrer_employee");
		member.setMemberName("serviceProviderRecommendationListAsReferrerEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceProviderRecommendation serviceProviderRecommendationListAsReferrerEmployer() {
		ServiceProviderRecommendation member = new ServiceProviderRecommendation();
		member.setModelTypeName("service_provider_recommendation");
		member.setName("referrer_employer");
		member.setMemberName("serviceProviderRecommendationListAsReferrerEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceRequirement maintainanceRequirementList() {
		MaintainanceRequirement member = new MaintainanceRequirement();
		member.setModelTypeName("maintainance_requirement");
		member.setName("applicant_merchant");
		member.setMemberName("maintainanceRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceProcessRecord maintainanceProcessRecordList() {
		MaintainanceProcessRecord member = new MaintainanceProcessRecord();
		member.setModelTypeName("maintainance_process_record");
		member.setName("actor_merchant");
		member.setMemberName("maintainanceProcessRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanFund loanFundList() {
		LoanFund member = new LoanFund();
		member.setModelTypeName("loan_fund");
		member.setName("fund_vendor");
		member.setMemberName("loanFundList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("applicant");
		member.setMemberName("loanApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanContract loanContractListAsBorrower() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("borrower");
		member.setMemberName("loanContractListAsBorrower");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LoanContract loanContractListAsLender() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("lender");
		member.setMemberName("loanContractListAsLender");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TodoList todoListList() {
		TodoList member = new TodoList();
		member.setModelTypeName("todo_list");
		member.setName("owner");
		member.setMemberName("todoListList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProcessAudit processAuditList() {
		ProcessAudit member = new ProcessAudit();
		member.setModelTypeName("process_audit");
		member.setName("auditor");
		member.setMemberName("processAuditList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProcessApplication processApplicationList() {
		ProcessApplication member = new ProcessApplication();
		member.setModelTypeName("process_application");
		member.setName("owner");
		member.setMemberName("processApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractLedger contractLedgerListAsFirstPartMerchant() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("first_part_merchant");
		member.setMemberName("contractLedgerListAsFirstPartMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractLedger contractLedgerListAsSecondPartMerchant() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("second_part_merchant");
		member.setMemberName("contractLedgerListAsSecondPartMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("owner");
		member.setMemberName("contractRiskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("owner");
		member.setMemberName("contractReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("owner");
		member.setMemberName("contractStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectStatisticReport projectStatisticReportList() {
		ProjectStatisticReport member = new ProjectStatisticReport();
		member.setModelTypeName("project_statistic_report");
		member.setName("owner");
		member.setMemberName("projectStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceVendorStatisticReport serviceVendorStatisticReportListAsVendor() {
		ServiceVendorStatisticReport member = new ServiceVendorStatisticReport();
		member.setModelTypeName("service_vendor_statistic_report");
		member.setName("vendor");
		member.setMemberName("serviceVendorStatisticReportListAsVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceVendorStatisticReport serviceVendorStatisticReportListAsOwner() {
		ServiceVendorStatisticReport member = new ServiceVendorStatisticReport();
		member.setModelTypeName("service_vendor_statistic_report");
		member.setName("owner");
		member.setMemberName("serviceVendorStatisticReportListAsOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FinancialServiceStatisticReport financialServiceStatisticReportList() {
		FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
		member.setModelTypeName("financial_service_statistic_report");
		member.setName("owner");
		member.setMemberName("financialServiceStatisticReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecruitmentRequirement recruitmentRequirementList() {
		RecruitmentRequirement member = new RecruitmentRequirement();
		member.setModelTypeName("recruitment_requirement");
		member.setName("employee");
		member.setMemberName("recruitmentRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CandidateTalent candidateTalentList() {
		CandidateTalent member = new CandidateTalent();
		member.setModelTypeName("candidate_talent");
		member.setName("candidate");
		member.setMemberName("candidateTalentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StaffFiles staffFilesListAsEmployer() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("employer");
		member.setMemberName("staffFilesListAsEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StaffFiles staffFilesListAsEmployee() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("employee");
		member.setMemberName("staffFilesListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeRelation employeeRelationListAsEmployer() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("employer");
		member.setMemberName("employeeRelationListAsEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeRelation employeeRelationListAsEmployee() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("employee");
		member.setMemberName("employeeRelationListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeSalary employeeSalaryList() {
		EmployeeSalary member = new EmployeeSalary();
		member.setModelTypeName("employee_salary");
		member.setName("employer");
		member.setMemberName("employeeSalaryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeePerformance employeePerformanceListAsEmployee() {
		EmployeePerformance member = new EmployeePerformance();
		member.setModelTypeName("employee_performance");
		member.setName("employee");
		member.setMemberName("employeePerformanceListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeePerformance employeePerformanceListAsEmployer() {
		EmployeePerformance member = new EmployeePerformance();
		member.setModelTypeName("employee_performance");
		member.setName("employer");
		member.setMemberName("employeePerformanceListAsEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantSeal merchantSealList() {
		MerchantSeal member = new MerchantSeal();
		member.setModelTypeName("merchant_seal");
		member.setName("owner");
		member.setMemberName("merchantSealList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectAttractInvestment projectAttractInvestmentList() {
		ProjectAttractInvestment member = new ProjectAttractInvestment();
		member.setModelTypeName("project_attract_investment");
		member.setName("post_by");
		member.setMemberName("projectAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SerivceVendorAttractInvestment serivceVendorAttractInvestmentList() {
		SerivceVendorAttractInvestment member = new SerivceVendorAttractInvestment();
		member.setModelTypeName("serivce_vendor_attract_investment");
		member.setName("post_by");
		member.setMemberName("serivceVendorAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BrandAttractInvestment brandAttractInvestmentList() {
		BrandAttractInvestment member = new BrandAttractInvestment();
		member.setModelTypeName("brand_attract_investment");
		member.setName("post_by");
		member.setMemberName("brandAttractInvestmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectSettlement projectSettlementList() {
		ProjectSettlement member = new ProjectSettlement();
		member.setModelTypeName("project_settlement");
		member.setName("responsible_merchant");
		member.setMemberName("projectSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceVendorSettlement serviceVendorSettlementList() {
		ServiceVendorSettlement member = new ServiceVendorSettlement();
		member.setModelTypeName("service_vendor_settlement");
		member.setName("vendor");
		member.setMemberName("serviceVendorSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BrandPartnerSettlement brandPartnerSettlementList() {
		BrandPartnerSettlement member = new BrandPartnerSettlement();
		member.setModelTypeName("brand_partner_settlement");
		member.setName("partner");
		member.setMemberName("brandPartnerSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantVerification merchantVerificationList() {
		MerchantVerification member = new MerchantVerification();
		member.setModelTypeName("merchant_verification");
		member.setName("merchant");
		member.setMemberName("merchantVerificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerRecommendation partnerRecommendationList() {
		PartnerRecommendation member = new PartnerRecommendation();
		member.setModelTypeName("partner_recommendation");
		member.setName("partner");
		member.setMemberName("partnerRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDirective projectDirectiveListAsResponsibleMerchant() {
		ProjectDirective member = new ProjectDirective();
		member.setModelTypeName("project_directive");
		member.setName("responsible_merchant");
		member.setMemberName("projectDirectiveListAsResponsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDirective projectDirectiveListAsPostBy() {
		ProjectDirective member = new ProjectDirective();
		member.setModelTypeName("project_directive");
		member.setName("post_by");
		member.setMemberName("projectDirectiveListAsPostBy");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectReport projectReportList() {
		ProjectReport member = new ProjectReport();
		member.setModelTypeName("project_report");
		member.setName("reporter");
		member.setMemberName("projectReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Design designListAsDesigner() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("designer");
		member.setMemberName("designListAsDesigner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Design designListAsReviewer() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("reviewer");
		member.setMemberName("designListAsReviewer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionSchema constructionSchemaList() {
		ConstructionSchema member = new ConstructionSchema();
		member.setModelTypeName("construction_schema");
		member.setName("post_by");
		member.setMemberName("constructionSchemaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectBid projectBidListAsProjectOwner() {
		ProjectBid member = new ProjectBid();
		member.setModelTypeName("project_bid");
		member.setName("project_owner");
		member.setMemberName("projectBidListAsProjectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectBid projectBidListAsResponsibleMerchant() {
		ProjectBid member = new ProjectBid();
		member.setModelTypeName("project_bid");
		member.setName("responsible_merchant");
		member.setMemberName("projectBidListAsResponsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LaborSupervision laborSupervisionListAsEmployee() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("employee");
		member.setMemberName("laborSupervisionListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public LaborSupervision laborSupervisionListAsEmployer() {
		LaborSupervision member = new LaborSupervision();
		member.setModelTypeName("labor_supervision");
		member.setName("employer");
		member.setMemberName("laborSupervisionListAsEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SafetyInstruction safetyInstructionList() {
		SafetyInstruction member = new SafetyInstruction();
		member.setModelTypeName("safety_instruction");
		member.setName("post_by");
		member.setMemberName("safetyInstructionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignChange designChangeListAsDesigner() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("designer");
		member.setMemberName("designChangeListAsDesigner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignChange designChangeListAsSponsor() {
		DesignChange member = new DesignChange();
		member.setModelTypeName("design_change");
		member.setName("sponsor");
		member.setMemberName("designChangeListAsSponsor");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Violation violationListAsResponsibleMerchant() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("responsible_merchant");
		member.setMemberName("violationListAsResponsibleMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Violation violationListAsImpactMerchant() {
		Violation member = new Violation();
		member.setModelTypeName("violation");
		member.setName("impact_merchant");
		member.setMemberName("violationListAsImpactMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Material materialList() {
		Material member = new Material();
		member.setModelTypeName("material");
		member.setName("vendor");
		member.setMemberName("materialList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionStartWorkingFiles constructionStartWorkingFilesList() {
		ConstructionStartWorkingFiles member = new ConstructionStartWorkingFiles();
		member.setModelTypeName("construction_start_working_files");
		member.setName("upload_user");
		member.setMemberName("constructionStartWorkingFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public QualitiyAcceptanceFiles qualitiyAcceptanceFilesList() {
		QualitiyAcceptanceFiles member = new QualitiyAcceptanceFiles();
		member.setModelTypeName("qualitiy_acceptance_files");
		member.setName("upload_user");
		member.setMemberName("qualitiyAcceptanceFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringExperimentFiles engineeringExperimentFilesList() {
		EngineeringExperimentFiles member = new EngineeringExperimentFiles();
		member.setModelTypeName("engineering_experiment_files");
		member.setName("upload_user");
		member.setMemberName("engineeringExperimentFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionProcessFiles constructionProcessFilesList() {
		ConstructionProcessFiles member = new ConstructionProcessFiles();
		member.setModelTypeName("construction_process_files");
		member.setName("upload_user");
		member.setMemberName("constructionProcessFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public NecessarySupplementFiles necessarySupplementFilesList() {
		NecessarySupplementFiles member = new NecessarySupplementFiles();
		member.setModelTypeName("necessary_supplement_files");
		member.setName("upload_user");
		member.setMemberName("necessarySupplementFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ConstructionCompletionFiles constructionCompletionFilesList() {
		ConstructionCompletionFiles member = new ConstructionCompletionFiles();
		member.setModelTypeName("construction_completion_files");
		member.setName("upload_user");
		member.setMemberName("constructionCompletionFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringQualitySupervisionFiles engineeringQualitySupervisionFilesList() {
		EngineeringQualitySupervisionFiles member = new EngineeringQualitySupervisionFiles();
		member.setModelTypeName("engineering_quality_supervision_files");
		member.setName("upload_user");
		member.setMemberName("engineeringQualitySupervisionFilesList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectFilesArchive projectFilesArchiveList() {
		ProjectFilesArchive member = new ProjectFilesArchive();
		member.setModelTypeName("project_files_archive");
		member.setName("upload_user");
		member.setMemberName("projectFilesArchiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchiveList() {
		EngineeringQualitySupervisionArchive member = new EngineeringQualitySupervisionArchive();
		member.setModelTypeName("engineering_quality_supervision_archive");
		member.setName("upload_user");
		member.setMemberName("engineeringQualitySupervisionArchiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EconomicVerificationForm economicVerificationFormList() {
		EconomicVerificationForm member = new EconomicVerificationForm();
		member.setModelTypeName("economic_verification_form");
		member.setName("service_vendor");
		member.setMemberName("economicVerificationFormList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectObjective projectObjectiveList() {
		ProjectObjective member = new ProjectObjective();
		member.setModelTypeName("project_objective");
		member.setName("service_store");
		member.setMemberName("projectObjectiveList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanListAsOwner() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("owner");
		member.setMemberName("projectProgressFundingTrusteeshipPlanListAsOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlanListAsServiceStore() {
		ProjectProgressFundingTrusteeshipPlan member = new ProjectProgressFundingTrusteeshipPlan();
		member.setModelTypeName("project_progress_funding_trusteeship_plan");
		member.setName("service_store");
		member.setMemberName("projectProgressFundingTrusteeshipPlanListAsServiceStore");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FundingCloseTrusteeshipContract fundingCloseTrusteeshipContractListAsFundingVendor() {
		FundingCloseTrusteeshipContract member = new FundingCloseTrusteeshipContract();
		member.setModelTypeName("funding_close_trusteeship_contract");
		member.setName("funding_vendor");
		member.setMemberName("fundingCloseTrusteeshipContractListAsFundingVendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FundingCloseTrusteeshipContract fundingCloseTrusteeshipContractListAsFundingConsumer() {
		FundingCloseTrusteeshipContract member = new FundingCloseTrusteeshipContract();
		member.setModelTypeName("funding_close_trusteeship_contract");
		member.setName("funding_consumer");
		member.setMemberName("fundingCloseTrusteeshipContractListAsFundingConsumer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractListAsOwner() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("owner");
		member.setMemberName("projectCloseTrusteeshipContractListAsOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectCloseTrusteeshipContract projectCloseTrusteeshipContractListAsStore() {
		ProjectCloseTrusteeshipContract member = new ProjectCloseTrusteeshipContract();
		member.setModelTypeName("project_close_trusteeship_contract");
		member.setName("store");
		member.setMemberName("projectCloseTrusteeshipContractListAsStore");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FundingCloseOrganization fundingCloseOrganizationList() {
		FundingCloseOrganization member = new FundingCloseOrganization();
		member.setModelTypeName("funding_close_organization");
		member.setName("merchant");
		member.setMemberName("fundingCloseOrganizationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskOrder taskOrderListAsBuyerMerchant() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("buyer_merchant");
		member.setMemberName("taskOrderListAsBuyerMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskOrder taskOrderListAsServiceMerchant() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("service_merchant");
		member.setMemberName("taskOrderListAsServiceMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TaskOrder taskOrderListAsStoreMerchant() {
		TaskOrder member = new TaskOrder();
		member.setModelTypeName("task_order");
		member.setName("store_merchant");
		member.setMemberName("taskOrderListAsStoreMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageAcceptanceSettlement workPackageAcceptanceSettlementList() {
		WorkPackageAcceptanceSettlement member = new WorkPackageAcceptanceSettlement();
		member.setModelTypeName("work_package_acceptance_settlement");
		member.setName("service_vendor");
		member.setMemberName("workPackageAcceptanceSettlementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectAcceptanceSettlement projectAcceptanceSettlementList() {
		ProjectAcceptanceSettlement member = new ProjectAcceptanceSettlement();
		member.setModelTypeName("project_acceptance_settlement");
		member.setName("owner");
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

	public StringAttribute contactInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("contactInfo");
		useMember(member);
		return member;
	}

	public StringAttribute contactAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("contactAddress");
		useMember(member);
		return member;
	}

	public StringAttribute logoImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("logoImage");
		useMember(member);
		return member;
	}

	public StringAttribute faceImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("faceImage");
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

