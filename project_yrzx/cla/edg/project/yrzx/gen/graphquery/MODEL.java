package cla.edg.project.yrzx.gen.graphquery;

public class MODEL{
	public static String getBasePackageName() {
		return "com.yrdec.yrzx";
	}

	public static Platform platform() {
		Platform rst = new Platform();
		rst.setModelTypeName("platform");
		return rst;
	}

	public static LicenseType licenseType() {
		LicenseType rst = new LicenseType();
		rst.setModelTypeName("license_type");
		return rst;
	}

	public static LicenseStatus licenseStatus() {
		LicenseStatus rst = new LicenseStatus();
		rst.setModelTypeName("license_status");
		return rst;
	}

	public static LicenseCopy licenseCopy() {
		LicenseCopy rst = new LicenseCopy();
		rst.setModelTypeName("license_copy");
		return rst;
	}

	public static CommonEventRecord commonEventRecord() {
		CommonEventRecord rst = new CommonEventRecord();
		rst.setModelTypeName("common_event_record");
		return rst;
	}

	public static AccountChangeType accountChangeType() {
		AccountChangeType rst = new AccountChangeType();
		rst.setModelTypeName("account_change_type");
		return rst;
	}

	public static AccountTitle accountTitle() {
		AccountTitle rst = new AccountTitle();
		rst.setModelTypeName("account_title");
		return rst;
	}

	public static AccountTitleMapping accountTitleMapping() {
		AccountTitleMapping rst = new AccountTitleMapping();
		rst.setModelTypeName("account_title_mapping");
		return rst;
	}

	public static AccountBookType accountBookType() {
		AccountBookType rst = new AccountBookType();
		rst.setModelTypeName("account_book_type");
		return rst;
	}

	public static AccountBookItemStatus accountBookItemStatus() {
		AccountBookItemStatus rst = new AccountBookItemStatus();
		rst.setModelTypeName("account_book_item_status");
		return rst;
	}

	public static OriginalEvidenceRecord originalEvidenceRecord() {
		OriginalEvidenceRecord rst = new OriginalEvidenceRecord();
		rst.setModelTypeName("original_evidence_record");
		return rst;
	}

	public static RunningAccountRecord runningAccountRecord() {
		RunningAccountRecord rst = new RunningAccountRecord();
		rst.setModelTypeName("running_account_record");
		return rst;
	}

	public static GenericAccountBook genericAccountBook() {
		GenericAccountBook rst = new GenericAccountBook();
		rst.setModelTypeName("generic_account_book");
		return rst;
	}

	public static GenericAccountBookItem genericAccountBookItem() {
		GenericAccountBookItem rst = new GenericAccountBookItem();
		rst.setModelTypeName("generic_account_book_item");
		return rst;
	}

	public static MerchantType merchantType() {
		MerchantType rst = new MerchantType();
		rst.setModelTypeName("merchant_type");
		return rst;
	}

	public static MerchantBusinessType merchantBusinessType() {
		MerchantBusinessType rst = new MerchantBusinessType();
		rst.setModelTypeName("merchant_business_type");
		return rst;
	}

	public static MerchantStatus merchantStatus() {
		MerchantStatus rst = new MerchantStatus();
		rst.setModelTypeName("merchant_status");
		return rst;
	}

	public static Merchant merchant() {
		Merchant rst = new Merchant();
		rst.setModelTypeName("merchant");
		return rst;
	}

	public static MerchantRecord merchantRecord() {
		MerchantRecord rst = new MerchantRecord();
		rst.setModelTypeName("merchant_record");
		return rst;
	}

	public static MerchantLicense merchantLicense() {
		MerchantLicense rst = new MerchantLicense();
		rst.setModelTypeName("merchant_license");
		return rst;
	}

	public static ParentCompanyRecord parentCompanyRecord() {
		ParentCompanyRecord rst = new ParentCompanyRecord();
		rst.setModelTypeName("parent_company_record");
		return rst;
	}

	public static PartnerRecommendationRecord partnerRecommendationRecord() {
		PartnerRecommendationRecord rst = new PartnerRecommendationRecord();
		rst.setModelTypeName("partner_recommendation_record");
		return rst;
	}

	public static MerchantWarehouse merchantWarehouse() {
		MerchantWarehouse rst = new MerchantWarehouse();
		rst.setModelTypeName("merchant_warehouse");
		return rst;
	}

	public static EmployeeNomination employeeNomination() {
		EmployeeNomination rst = new EmployeeNomination();
		rst.setModelTypeName("employee_nomination");
		return rst;
	}

	public static EmployeeNominationRecord employeeNominationRecord() {
		EmployeeNominationRecord rst = new EmployeeNominationRecord();
		rst.setModelTypeName("employee_nomination_record");
		return rst;
	}

	public static ClientScenario clientScenario() {
		ClientScenario rst = new ClientScenario();
		rst.setModelTypeName("client_scenario");
		return rst;
	}

	public static OrderStatus orderStatus() {
		OrderStatus rst = new OrderStatus();
		rst.setModelTypeName("order_status");
		return rst;
	}

	public static MainOrder mainOrder() {
		MainOrder rst = new MainOrder();
		rst.setModelTypeName("main_order");
		return rst;
	}

	public static MainOrderProcessingRecord mainOrderProcessingRecord() {
		MainOrderProcessingRecord rst = new MainOrderProcessingRecord();
		rst.setModelTypeName("main_order_processing_record");
		return rst;
	}

	public static MainOrderPriceInfo mainOrderPriceInfo() {
		MainOrderPriceInfo rst = new MainOrderPriceInfo();
		rst.setModelTypeName("main_order_price_info");
		return rst;
	}

	public static LineItem lineItem() {
		LineItem rst = new LineItem();
		rst.setModelTypeName("line_item");
		return rst;
	}

	public static PaymentStatus paymentStatus() {
		PaymentStatus rst = new PaymentStatus();
		rst.setModelTypeName("payment_status");
		return rst;
	}

	public static PaymentOption paymentOption() {
		PaymentOption rst = new PaymentOption();
		rst.setModelTypeName("payment_option");
		return rst;
	}

	public static PaymentDetail paymentDetail() {
		PaymentDetail rst = new PaymentDetail();
		rst.setModelTypeName("payment_detail");
		return rst;
	}

	public static PaymentItem paymentItem() {
		PaymentItem rst = new PaymentItem();
		rst.setModelTypeName("payment_item");
		return rst;
	}

	public static PaymentSucceedRecord paymentSucceedRecord() {
		PaymentSucceedRecord rst = new PaymentSucceedRecord();
		rst.setModelTypeName("payment_succeed_record");
		return rst;
	}

	public static PaymentRecord paymentRecord() {
		PaymentRecord rst = new PaymentRecord();
		rst.setModelTypeName("payment_record");
		return rst;
	}

	public static PaymentItemRecord paymentItemRecord() {
		PaymentItemRecord rst = new PaymentItemRecord();
		rst.setModelTypeName("payment_item_record");
		return rst;
	}

	public static PlatformConfiguration platformConfiguration() {
		PlatformConfiguration rst = new PlatformConfiguration();
		rst.setModelTypeName("platform_configuration");
		return rst;
	}

	public static FinancialBusinessConfiguration financialBusinessConfiguration() {
		FinancialBusinessConfiguration rst = new FinancialBusinessConfiguration();
		rst.setModelTypeName("financial_business_configuration");
		return rst;
	}

	public static PropertyOwnerMissionType propertyOwnerMissionType() {
		PropertyOwnerMissionType rst = new PropertyOwnerMissionType();
		rst.setModelTypeName("property_owner_mission_type");
		return rst;
	}

	public static PropertyOwnerMission propertyOwnerMission() {
		PropertyOwnerMission rst = new PropertyOwnerMission();
		rst.setModelTypeName("property_owner_mission");
		return rst;
	}

	public static DataScreen dataScreen() {
		DataScreen rst = new DataScreen();
		rst.setModelTypeName("data_screen");
		return rst;
	}

	public static ArticleCategory articleCategory() {
		ArticleCategory rst = new ArticleCategory();
		rst.setModelTypeName("article_category");
		return rst;
	}

	public static Article article() {
		Article rst = new Article();
		rst.setModelTypeName("article");
		return rst;
	}

	public static ArticleParagraph articleParagraph() {
		ArticleParagraph rst = new ArticleParagraph();
		rst.setModelTypeName("article_paragraph");
		return rst;
	}

	public static HomepageShowType homepageShowType() {
		HomepageShowType rst = new HomepageShowType();
		rst.setModelTypeName("homepage_show_type");
		return rst;
	}

	public static SlideType slideType() {
		SlideType rst = new SlideType();
		rst.setModelTypeName("slide_type");
		return rst;
	}

	public static HomepageShowConfiguration homepageShowConfiguration() {
		HomepageShowConfiguration rst = new HomepageShowConfiguration();
		rst.setModelTypeName("homepage_show_configuration");
		return rst;
	}

	public static HomepageSlide homepageSlide() {
		HomepageSlide rst = new HomepageSlide();
		rst.setModelTypeName("homepage_slide");
		return rst;
	}

	public static WelcomeSlide welcomeSlide() {
		WelcomeSlide rst = new WelcomeSlide();
		rst.setModelTypeName("welcome_slide");
		return rst;
	}

	public static HomepageMarketingBlock homepageMarketingBlock() {
		HomepageMarketingBlock rst = new HomepageMarketingBlock();
		rst.setModelTypeName("homepage_marketing_block");
		return rst;
	}

	public static HomepageArticleGroup homepageArticleGroup() {
		HomepageArticleGroup rst = new HomepageArticleGroup();
		rst.setModelTypeName("homepage_article_group");
		return rst;
	}

	public static HomepageArticle homepageArticle() {
		HomepageArticle rst = new HomepageArticle();
		rst.setModelTypeName("homepage_article");
		return rst;
	}

	public static ProjectType projectType() {
		ProjectType rst = new ProjectType();
		rst.setModelTypeName("project_type");
		return rst;
	}

	public static ProjectPhase projectPhase() {
		ProjectPhase rst = new ProjectPhase();
		rst.setModelTypeName("project_phase");
		return rst;
	}

	public static ProjectContractType projectContractType() {
		ProjectContractType rst = new ProjectContractType();
		rst.setModelTypeName("project_contract_type");
		return rst;
	}

	public static ProjectContractStatus projectContractStatus() {
		ProjectContractStatus rst = new ProjectContractStatus();
		rst.setModelTypeName("project_contract_status");
		return rst;
	}

	public static WorkingStatus workingStatus() {
		WorkingStatus rst = new WorkingStatus();
		rst.setModelTypeName("working_status");
		return rst;
	}

	public static ParticipatorType participatorType() {
		ParticipatorType rst = new ParticipatorType();
		rst.setModelTypeName("participator_type");
		return rst;
	}

	public static FeeType feeType() {
		FeeType rst = new FeeType();
		rst.setModelTypeName("fee_type");
		return rst;
	}

	public static YourongProjectBookStatus yourongProjectBookStatus() {
		YourongProjectBookStatus rst = new YourongProjectBookStatus();
		rst.setModelTypeName("yourong_project_book_status");
		return rst;
	}

	public static YourongProjectBookType yourongProjectBookType() {
		YourongProjectBookType rst = new YourongProjectBookType();
		rst.setModelTypeName("yourong_project_book_type");
		return rst;
	}

	public static Project project() {
		Project rst = new Project();
		rst.setModelTypeName("project");
		return rst;
	}

	public static ProjectImage projectImage() {
		ProjectImage rst = new ProjectImage();
		rst.setModelTypeName("project_image");
		return rst;
	}

	public static ProjectParticipatorContract projectParticipatorContract() {
		ProjectParticipatorContract rst = new ProjectParticipatorContract();
		rst.setModelTypeName("project_participator_contract");
		return rst;
	}

	public static ProjectRunningContract projectRunningContract() {
		ProjectRunningContract rst = new ProjectRunningContract();
		rst.setModelTypeName("project_running_contract");
		return rst;
	}

	public static ProjectRunningContractConfirmRecord projectRunningContractConfirmRecord() {
		ProjectRunningContractConfirmRecord rst = new ProjectRunningContractConfirmRecord();
		rst.setModelTypeName("project_running_contract_confirm_record");
		return rst;
	}

	public static YourongProjectBook yourongProjectBook() {
		YourongProjectBook rst = new YourongProjectBook();
		rst.setModelTypeName("yourong_project_book");
		return rst;
	}

	public static DocumentTag documentTag() {
		DocumentTag rst = new DocumentTag();
		rst.setModelTypeName("document_tag");
		return rst;
	}

	public static ProjectDocumentProcessStyle projectDocumentProcessStyle() {
		ProjectDocumentProcessStyle rst = new ProjectDocumentProcessStyle();
		rst.setModelTypeName("project_document_process_style");
		return rst;
	}

	public static ProjectDocumentStatus projectDocumentStatus() {
		ProjectDocumentStatus rst = new ProjectDocumentStatus();
		rst.setModelTypeName("project_document_status");
		return rst;
	}

	public static ProjectDocument projectDocument() {
		ProjectDocument rst = new ProjectDocument();
		rst.setModelTypeName("project_document");
		return rst;
	}

	public static ProjectDocumentChangeRecord projectDocumentChangeRecord() {
		ProjectDocumentChangeRecord rst = new ProjectDocumentChangeRecord();
		rst.setModelTypeName("project_document_change_record");
		return rst;
	}

	public static ProjectDocumentConfirmRecord projectDocumentConfirmRecord() {
		ProjectDocumentConfirmRecord rst = new ProjectDocumentConfirmRecord();
		rst.setModelTypeName("project_document_confirm_record");
		return rst;
	}

	public static ProjectJobType projectJobType() {
		ProjectJobType rst = new ProjectJobType();
		rst.setModelTypeName("project_job_type");
		return rst;
	}

	public static ProjectJob projectJob() {
		ProjectJob rst = new ProjectJob();
		rst.setModelTypeName("project_job");
		return rst;
	}

	public static ProjectJobAssignment projectJobAssignment() {
		ProjectJobAssignment rst = new ProjectJobAssignment();
		rst.setModelTypeName("project_job_assignment");
		return rst;
	}

	public static ProjectJobAssignmentRecord projectJobAssignmentRecord() {
		ProjectJobAssignmentRecord rst = new ProjectJobAssignmentRecord();
		rst.setModelTypeName("project_job_assignment_record");
		return rst;
	}

	public static ProjectSubcontractAssignmentType projectSubcontractAssignmentType() {
		ProjectSubcontractAssignmentType rst = new ProjectSubcontractAssignmentType();
		rst.setModelTypeName("project_subcontract_assignment_type");
		return rst;
	}

	public static ProjectSubcontractAssignment projectSubcontractAssignment() {
		ProjectSubcontractAssignment rst = new ProjectSubcontractAssignment();
		rst.setModelTypeName("project_subcontract_assignment");
		return rst;
	}

	public static ProjectProgressStatus projectProgressStatus() {
		ProjectProgressStatus rst = new ProjectProgressStatus();
		rst.setModelTypeName("project_progress_status");
		return rst;
	}

	public static ProjectProgress projectProgress() {
		ProjectProgress rst = new ProjectProgress();
		rst.setModelTypeName("project_progress");
		return rst;
	}

	public static MerchantJob merchantJob() {
		MerchantJob rst = new MerchantJob();
		rst.setModelTypeName("merchant_job");
		return rst;
	}

	public static MerchantRole merchantRole() {
		MerchantRole rst = new MerchantRole();
		rst.setModelTypeName("merchant_role");
		return rst;
	}

	public static MerchantImage merchantImage() {
		MerchantImage rst = new MerchantImage();
		rst.setModelTypeName("merchant_image");
		return rst;
	}

	public static WorkPackageStatus workPackageStatus() {
		WorkPackageStatus rst = new WorkPackageStatus();
		rst.setModelTypeName("work_package_status");
		return rst;
	}

	public static WorkPackage workPackage() {
		WorkPackage rst = new WorkPackage();
		rst.setModelTypeName("work_package");
		return rst;
	}

	public static WorkPackageParticipatorContract workPackageParticipatorContract() {
		WorkPackageParticipatorContract rst = new WorkPackageParticipatorContract();
		rst.setModelTypeName("work_package_participator_contract");
		return rst;
	}

	public static WorkPackageProcessingRecord workPackageProcessingRecord() {
		WorkPackageProcessingRecord rst = new WorkPackageProcessingRecord();
		rst.setModelTypeName("work_package_processing_record");
		return rst;
	}

	public static TaskType taskType() {
		TaskType rst = new TaskType();
		rst.setModelTypeName("task_type");
		return rst;
	}

	public static TaskStatus taskStatus() {
		TaskStatus rst = new TaskStatus();
		rst.setModelTypeName("task_status");
		return rst;
	}

	public static TaskAcceptanceStatus taskAcceptanceStatus() {
		TaskAcceptanceStatus rst = new TaskAcceptanceStatus();
		rst.setModelTypeName("task_acceptance_status");
		return rst;
	}

	public static Task task() {
		Task rst = new Task();
		rst.setModelTypeName("task");
		return rst;
	}

	public static TaskAcceptance taskAcceptance() {
		TaskAcceptance rst = new TaskAcceptance();
		rst.setModelTypeName("task_acceptance");
		return rst;
	}

	public static TaskProcessingRecord taskProcessingRecord() {
		TaskProcessingRecord rst = new TaskProcessingRecord();
		rst.setModelTypeName("task_processing_record");
		return rst;
	}

	public static ReportType reportType() {
		ReportType rst = new ReportType();
		rst.setModelTypeName("report_type");
		return rst;
	}

	public static ReportCheckItem reportCheckItem() {
		ReportCheckItem rst = new ReportCheckItem();
		rst.setModelTypeName("report_check_item");
		return rst;
	}

	public static ReportSegmentType reportSegmentType() {
		ReportSegmentType rst = new ReportSegmentType();
		rst.setModelTypeName("report_segment_type");
		return rst;
	}

	public static ProjectDailyReportTemplate projectDailyReportTemplate() {
		ProjectDailyReportTemplate rst = new ProjectDailyReportTemplate();
		rst.setModelTypeName("project_daily_report_template");
		return rst;
	}

	public static ProjectDailyReportTemplateItem projectDailyReportTemplateItem() {
		ProjectDailyReportTemplateItem rst = new ProjectDailyReportTemplateItem();
		rst.setModelTypeName("project_daily_report_template_item");
		return rst;
	}

	public static ProjectDailyReport projectDailyReport() {
		ProjectDailyReport rst = new ProjectDailyReport();
		rst.setModelTypeName("project_daily_report");
		return rst;
	}

	public static ProjectDailyReportCheck projectDailyReportCheck() {
		ProjectDailyReportCheck rst = new ProjectDailyReportCheck();
		rst.setModelTypeName("project_daily_report_check");
		return rst;
	}

	public static ProjectDailyReportSegment projectDailyReportSegment() {
		ProjectDailyReportSegment rst = new ProjectDailyReportSegment();
		rst.setModelTypeName("project_daily_report_segment");
		return rst;
	}

	public static ProjectDailyReportReadRecord projectDailyReportReadRecord() {
		ProjectDailyReportReadRecord rst = new ProjectDailyReportReadRecord();
		rst.setModelTypeName("project_daily_report_read_record");
		return rst;
	}

	public static PrivateMessage privateMessage() {
		PrivateMessage rst = new PrivateMessage();
		rst.setModelTypeName("private_message");
		return rst;
	}

	public static ProjectNotificationType projectNotificationType() {
		ProjectNotificationType rst = new ProjectNotificationType();
		rst.setModelTypeName("project_notification_type");
		return rst;
	}

	public static ProjectNotification projectNotification() {
		ProjectNotification rst = new ProjectNotification();
		rst.setModelTypeName("project_notification");
		return rst;
	}

	public static ProjectNotificationImage projectNotificationImage() {
		ProjectNotificationImage rst = new ProjectNotificationImage();
		rst.setModelTypeName("project_notification_image");
		return rst;
	}

	public static ProjectNotificationReceiver projectNotificationReceiver() {
		ProjectNotificationReceiver rst = new ProjectNotificationReceiver();
		rst.setModelTypeName("project_notification_receiver");
		return rst;
	}

	public static ViolationItemStatus violationItemStatus() {
		ViolationItemStatus rst = new ViolationItemStatus();
		rst.setModelTypeName("violation_item_status");
		return rst;
	}

	public static ViolationTerm violationTerm() {
		ViolationTerm rst = new ViolationTerm();
		rst.setModelTypeName("violation_term");
		return rst;
	}

	public static ViolationItem violationItem() {
		ViolationItem rst = new ViolationItem();
		rst.setModelTypeName("violation_item");
		return rst;
	}

	public static BillStatus billStatus() {
		BillStatus rst = new BillStatus();
		rst.setModelTypeName("bill_status");
		return rst;
	}

	public static YourongBill yourongBill() {
		YourongBill rst = new YourongBill();
		rst.setModelTypeName("yourong_bill");
		return rst;
	}

	public static YourongBillRecord yourongBillRecord() {
		YourongBillRecord rst = new YourongBillRecord();
		rst.setModelTypeName("yourong_bill_record");
		return rst;
	}

	public static EstatePropertyType estatePropertyType() {
		EstatePropertyType rst = new EstatePropertyType();
		rst.setModelTypeName("estate_property_type");
		return rst;
	}

	public static CustomerApplicationStatus customerApplicationStatus() {
		CustomerApplicationStatus rst = new CustomerApplicationStatus();
		rst.setModelTypeName("customer_application_status");
		return rst;
	}

	public static CustomerProjectApplication customerProjectApplication() {
		CustomerProjectApplication rst = new CustomerProjectApplication();
		rst.setModelTypeName("customer_project_application");
		return rst;
	}

	public static AvailableServiceType availableServiceType() {
		AvailableServiceType rst = new AvailableServiceType();
		rst.setModelTypeName("available_service_type");
		return rst;
	}

	public static AvailableServiceLocation availableServiceLocation() {
		AvailableServiceLocation rst = new AvailableServiceLocation();
		rst.setModelTypeName("available_service_location");
		return rst;
	}

	public static AvailableIndustry availableIndustry() {
		AvailableIndustry rst = new AvailableIndustry();
		rst.setModelTypeName("available_industry");
		return rst;
	}

	public static PartnerApplication partnerApplication() {
		PartnerApplication rst = new PartnerApplication();
		rst.setModelTypeName("partner_application");
		return rst;
	}

	public static DesignerRecommendation designerRecommendation() {
		DesignerRecommendation rst = new DesignerRecommendation();
		rst.setModelTypeName("designer_recommendation");
		return rst;
	}

	public static ServiceProviderRecommendation serviceProviderRecommendation() {
		ServiceProviderRecommendation rst = new ServiceProviderRecommendation();
		rst.setModelTypeName("service_provider_recommendation");
		return rst;
	}

	public static MaintainanceRequirement maintainanceRequirement() {
		MaintainanceRequirement rst = new MaintainanceRequirement();
		rst.setModelTypeName("maintainance_requirement");
		return rst;
	}

	public static MaintainanceProcessRecord maintainanceProcessRecord() {
		MaintainanceProcessRecord rst = new MaintainanceProcessRecord();
		rst.setModelTypeName("maintainance_process_record");
		return rst;
	}

	public static FrontEndStatus frontEndStatus() {
		FrontEndStatus rst = new FrontEndStatus();
		rst.setModelTypeName("front_end_status");
		return rst;
	}

	public static FrontEndDocumentItem frontEndDocumentItem() {
		FrontEndDocumentItem rst = new FrontEndDocumentItem();
		rst.setModelTypeName("front_end_document_item");
		return rst;
	}

	public static FrontEndCard frontEndCard() {
		FrontEndCard rst = new FrontEndCard();
		rst.setModelTypeName("front_end_card");
		return rst;
	}

	public static ContractTemplate contractTemplate() {
		ContractTemplate rst = new ContractTemplate();
		rst.setModelTypeName("contract_template");
		return rst;
	}

	public static FinanceTemplate financeTemplate() {
		FinanceTemplate rst = new FinanceTemplate();
		rst.setModelTypeName("finance_template");
		return rst;
	}

	public static FiveBookTemplate fiveBookTemplate() {
		FiveBookTemplate rst = new FiveBookTemplate();
		rst.setModelTypeName("five_book_template");
		return rst;
	}

	public static ProjectEngineeringTemplate projectEngineeringTemplate() {
		ProjectEngineeringTemplate rst = new ProjectEngineeringTemplate();
		rst.setModelTypeName("project_engineering_template");
		return rst;
	}

	public static LoanFund loanFund() {
		LoanFund rst = new LoanFund();
		rst.setModelTypeName("loan_fund");
		return rst;
	}

	public static LoanApplication loanApplication() {
		LoanApplication rst = new LoanApplication();
		rst.setModelTypeName("loan_application");
		return rst;
	}

	public static LoanContract loanContract() {
		LoanContract rst = new LoanContract();
		rst.setModelTypeName("loan_contract");
		return rst;
	}

	public static ProcessMap processMap() {
		ProcessMap rst = new ProcessMap();
		rst.setModelTypeName("process_map");
		return rst;
	}

	public static Process process() {
		Process rst = new Process();
		rst.setModelTypeName("process");
		return rst;
	}

	public static TodoList todoList() {
		TodoList rst = new TodoList();
		rst.setModelTypeName("todo_list");
		return rst;
	}

	public static TodoListStatus todoListStatus() {
		TodoListStatus rst = new TodoListStatus();
		rst.setModelTypeName("todo_list_status");
		return rst;
	}

	public static ProcessAudit processAudit() {
		ProcessAudit rst = new ProcessAudit();
		rst.setModelTypeName("process_audit");
		return rst;
	}

	public static ProcessApplication processApplication() {
		ProcessApplication rst = new ProcessApplication();
		rst.setModelTypeName("process_application");
		return rst;
	}

	public static ContractType contractType() {
		ContractType rst = new ContractType();
		rst.setModelTypeName("contract_type");
		return rst;
	}

	public static ContractLedger contractLedger() {
		ContractLedger rst = new ContractLedger();
		rst.setModelTypeName("contract_ledger");
		return rst;
	}

	public static ContractRisk contractRisk() {
		ContractRisk rst = new ContractRisk();
		rst.setModelTypeName("contract_risk");
		return rst;
	}

	public static ContractReport contractReport() {
		ContractReport rst = new ContractReport();
		rst.setModelTypeName("contract_report");
		return rst;
	}

	public static ContractStatisticReport contractStatisticReport() {
		ContractStatisticReport rst = new ContractStatisticReport();
		rst.setModelTypeName("contract_statistic_report");
		return rst;
	}

	public static ProjectStatisticReport projectStatisticReport() {
		ProjectStatisticReport rst = new ProjectStatisticReport();
		rst.setModelTypeName("project_statistic_report");
		return rst;
	}

	public static ServiceVendorStatisticReport serviceVendorStatisticReport() {
		ServiceVendorStatisticReport rst = new ServiceVendorStatisticReport();
		rst.setModelTypeName("service_vendor_statistic_report");
		return rst;
	}

	public static FinancialServiceStatisticReport financialServiceStatisticReport() {
		FinancialServiceStatisticReport rst = new FinancialServiceStatisticReport();
		rst.setModelTypeName("financial_service_statistic_report");
		return rst;
	}

	public static RecruitmentRequirement recruitmentRequirement() {
		RecruitmentRequirement rst = new RecruitmentRequirement();
		rst.setModelTypeName("recruitment_requirement");
		return rst;
	}

	public static JobPosition jobPosition() {
		JobPosition rst = new JobPosition();
		rst.setModelTypeName("job_position");
		return rst;
	}

	public static CandidateTalent candidateTalent() {
		CandidateTalent rst = new CandidateTalent();
		rst.setModelTypeName("candidate_talent");
		return rst;
	}

	public static StaffFiles staffFiles() {
		StaffFiles rst = new StaffFiles();
		rst.setModelTypeName("staff_files");
		return rst;
	}

	public static EmployeeRelation employeeRelation() {
		EmployeeRelation rst = new EmployeeRelation();
		rst.setModelTypeName("employee_relation");
		return rst;
	}

	public static EmployeeSalary employeeSalary() {
		EmployeeSalary rst = new EmployeeSalary();
		rst.setModelTypeName("employee_salary");
		return rst;
	}

	public static EmployeePerformance employeePerformance() {
		EmployeePerformance rst = new EmployeePerformance();
		rst.setModelTypeName("employee_performance");
		return rst;
	}

	public static MerchantSeal merchantSeal() {
		MerchantSeal rst = new MerchantSeal();
		rst.setModelTypeName("merchant_seal");
		return rst;
	}

	public static CooperateApplication cooperateApplication() {
		CooperateApplication rst = new CooperateApplication();
		rst.setModelTypeName("cooperate_application");
		return rst;
	}

	public static ProjectApplication projectApplication() {
		ProjectApplication rst = new ProjectApplication();
		rst.setModelTypeName("project_application");
		return rst;
	}

	public static ProjectAttractInvestment projectAttractInvestment() {
		ProjectAttractInvestment rst = new ProjectAttractInvestment();
		rst.setModelTypeName("project_attract_investment");
		return rst;
	}

	public static SerivceVendorAttractInvestment serivceVendorAttractInvestment() {
		SerivceVendorAttractInvestment rst = new SerivceVendorAttractInvestment();
		rst.setModelTypeName("serivce_vendor_attract_investment");
		return rst;
	}

	public static BrandAttractInvestment brandAttractInvestment() {
		BrandAttractInvestment rst = new BrandAttractInvestment();
		rst.setModelTypeName("brand_attract_investment");
		return rst;
	}

	public static ProjectSettlement projectSettlement() {
		ProjectSettlement rst = new ProjectSettlement();
		rst.setModelTypeName("project_settlement");
		return rst;
	}

	public static ServiceVendorSettlement serviceVendorSettlement() {
		ServiceVendorSettlement rst = new ServiceVendorSettlement();
		rst.setModelTypeName("service_vendor_settlement");
		return rst;
	}

	public static BrandPartnerSettlement brandPartnerSettlement() {
		BrandPartnerSettlement rst = new BrandPartnerSettlement();
		rst.setModelTypeName("brand_partner_settlement");
		return rst;
	}

	public static MerchantVerification merchantVerification() {
		MerchantVerification rst = new MerchantVerification();
		rst.setModelTypeName("merchant_verification");
		return rst;
	}

	public static QualificationExamination qualificationExamination() {
		QualificationExamination rst = new QualificationExamination();
		rst.setModelTypeName("qualification_examination");
		return rst;
	}

	public static QualificationResearch qualificationResearch() {
		QualificationResearch rst = new QualificationResearch();
		rst.setModelTypeName("qualification_research");
		return rst;
	}

	public static PartnerRecommendation partnerRecommendation() {
		PartnerRecommendation rst = new PartnerRecommendation();
		rst.setModelTypeName("partner_recommendation");
		return rst;
	}

	public static ProjectDirective projectDirective() {
		ProjectDirective rst = new ProjectDirective();
		rst.setModelTypeName("project_directive");
		return rst;
	}

	public static ProjectReport projectReport() {
		ProjectReport rst = new ProjectReport();
		rst.setModelTypeName("project_report");
		return rst;
	}

	public static Design design() {
		Design rst = new Design();
		rst.setModelTypeName("design");
		return rst;
	}

	public static ConstructionSchema constructionSchema() {
		ConstructionSchema rst = new ConstructionSchema();
		rst.setModelTypeName("construction_schema");
		return rst;
	}

	public static ProjectBid projectBid() {
		ProjectBid rst = new ProjectBid();
		rst.setModelTypeName("project_bid");
		return rst;
	}

	public static LaborSupervision laborSupervision() {
		LaborSupervision rst = new LaborSupervision();
		rst.setModelTypeName("labor_supervision");
		return rst;
	}

	public static SafetyInstruction safetyInstruction() {
		SafetyInstruction rst = new SafetyInstruction();
		rst.setModelTypeName("safety_instruction");
		return rst;
	}

	public static DesignChange designChange() {
		DesignChange rst = new DesignChange();
		rst.setModelTypeName("design_change");
		return rst;
	}

	public static Violation violation() {
		Violation rst = new Violation();
		rst.setModelTypeName("violation");
		return rst;
	}

	public static Material material() {
		Material rst = new Material();
		rst.setModelTypeName("material");
		return rst;
	}

	public static Measurement measurement() {
		Measurement rst = new Measurement();
		rst.setModelTypeName("measurement");
		return rst;
	}

	public static ProjectFunding projectFunding() {
		ProjectFunding rst = new ProjectFunding();
		rst.setModelTypeName("project_funding");
		return rst;
	}

	public static ConstructionStartWorkingFiles constructionStartWorkingFiles() {
		ConstructionStartWorkingFiles rst = new ConstructionStartWorkingFiles();
		rst.setModelTypeName("construction_start_working_files");
		return rst;
	}

	public static QualitiyAcceptanceFiles qualitiyAcceptanceFiles() {
		QualitiyAcceptanceFiles rst = new QualitiyAcceptanceFiles();
		rst.setModelTypeName("qualitiy_acceptance_files");
		return rst;
	}

	public static EngineeringExperimentFiles engineeringExperimentFiles() {
		EngineeringExperimentFiles rst = new EngineeringExperimentFiles();
		rst.setModelTypeName("engineering_experiment_files");
		return rst;
	}

	public static ConstructionProcessFiles constructionProcessFiles() {
		ConstructionProcessFiles rst = new ConstructionProcessFiles();
		rst.setModelTypeName("construction_process_files");
		return rst;
	}

	public static NecessarySupplementFiles necessarySupplementFiles() {
		NecessarySupplementFiles rst = new NecessarySupplementFiles();
		rst.setModelTypeName("necessary_supplement_files");
		return rst;
	}

	public static ConstructionCompletionFiles constructionCompletionFiles() {
		ConstructionCompletionFiles rst = new ConstructionCompletionFiles();
		rst.setModelTypeName("construction_completion_files");
		return rst;
	}

	public static EngineeringQualitySupervisionFiles engineeringQualitySupervisionFiles() {
		EngineeringQualitySupervisionFiles rst = new EngineeringQualitySupervisionFiles();
		rst.setModelTypeName("engineering_quality_supervision_files");
		return rst;
	}

	public static ProjectFilesArchive projectFilesArchive() {
		ProjectFilesArchive rst = new ProjectFilesArchive();
		rst.setModelTypeName("project_files_archive");
		return rst;
	}

	public static EngineeringQualitySupervisionArchive engineeringQualitySupervisionArchive() {
		EngineeringQualitySupervisionArchive rst = new EngineeringQualitySupervisionArchive();
		rst.setModelTypeName("engineering_quality_supervision_archive");
		return rst;
	}

	public static ContractCollection contractCollection() {
		ContractCollection rst = new ContractCollection();
		rst.setModelTypeName("contract_collection");
		return rst;
	}

	public static ContractPayment contractPayment() {
		ContractPayment rst = new ContractPayment();
		rst.setModelTypeName("contract_payment");
		return rst;
	}

	public static ContractSettlement contractSettlement() {
		ContractSettlement rst = new ContractSettlement();
		rst.setModelTypeName("contract_settlement");
		return rst;
	}

	public static EconomicVerificationForm economicVerificationForm() {
		EconomicVerificationForm rst = new EconomicVerificationForm();
		rst.setModelTypeName("economic_verification_form");
		return rst;
	}

	public static ProjectObjective projectObjective() {
		ProjectObjective rst = new ProjectObjective();
		rst.setModelTypeName("project_objective");
		return rst;
	}

	public static ProjectProgressFundingTrusteeshipPlan projectProgressFundingTrusteeshipPlan() {
		ProjectProgressFundingTrusteeshipPlan rst = new ProjectProgressFundingTrusteeshipPlan();
		rst.setModelTypeName("project_progress_funding_trusteeship_plan");
		return rst;
	}

	public static ContractExamine contractExamine() {
		ContractExamine rst = new ContractExamine();
		rst.setModelTypeName("contract_examine");
		return rst;
	}

	public static FundingCloseTrusteeshipContract fundingCloseTrusteeshipContract() {
		FundingCloseTrusteeshipContract rst = new FundingCloseTrusteeshipContract();
		rst.setModelTypeName("funding_close_trusteeship_contract");
		return rst;
	}

	public static ProjectCloseTrusteeshipContract projectCloseTrusteeshipContract() {
		ProjectCloseTrusteeshipContract rst = new ProjectCloseTrusteeshipContract();
		rst.setModelTypeName("project_close_trusteeship_contract");
		return rst;
	}

	public static FundingCloseOrganization fundingCloseOrganization() {
		FundingCloseOrganization rst = new FundingCloseOrganization();
		rst.setModelTypeName("funding_close_organization");
		return rst;
	}

	public static FundingCloseOrganizationType fundingCloseOrganizationType() {
		FundingCloseOrganizationType rst = new FundingCloseOrganizationType();
		rst.setModelTypeName("funding_close_organization_type");
		return rst;
	}

	public static TaskOrder taskOrder() {
		TaskOrder rst = new TaskOrder();
		rst.setModelTypeName("task_order");
		return rst;
	}

	public static WorkPackageAcceptanceSettlement workPackageAcceptanceSettlement() {
		WorkPackageAcceptanceSettlement rst = new WorkPackageAcceptanceSettlement();
		rst.setModelTypeName("work_package_acceptance_settlement");
		return rst;
	}

	public static ProjectAcceptanceSettlement projectAcceptanceSettlement() {
		ProjectAcceptanceSettlement rst = new ProjectAcceptanceSettlement();
		rst.setModelTypeName("project_acceptance_settlement");
		return rst;
	}

	public static MobileApp mobileApp() {
		MobileApp rst = new MobileApp();
		rst.setModelTypeName("mobile_app");
		return rst;
	}

	public static Page page() {
		Page rst = new Page();
		rst.setModelTypeName("page");
		return rst;
	}

	public static PageType pageType() {
		PageType rst = new PageType();
		rst.setModelTypeName("page_type");
		return rst;
	}

	public static Slide slide() {
		Slide rst = new Slide();
		rst.setModelTypeName("slide");
		return rst;
	}

	public static UiAction uiAction() {
		UiAction rst = new UiAction();
		rst.setModelTypeName("ui_action");
		return rst;
	}

	public static Section section() {
		Section rst = new Section();
		rst.setModelTypeName("section");
		return rst;
	}

	public static UserDomain userDomain() {
		UserDomain rst = new UserDomain();
		rst.setModelTypeName("user_domain");
		return rst;
	}

	public static UserWhiteList userWhiteList() {
		UserWhiteList rst = new UserWhiteList();
		rst.setModelTypeName("user_white_list");
		return rst;
	}

	public static SecUser secUser() {
		SecUser rst = new SecUser();
		rst.setModelTypeName("sec_user");
		return rst;
	}

	public static UserApp userApp() {
		UserApp rst = new UserApp();
		rst.setModelTypeName("user_app");
		return rst;
	}

	public static QuickLink quickLink() {
		QuickLink rst = new QuickLink();
		rst.setModelTypeName("quick_link");
		return rst;
	}

	public static ListAccess listAccess() {
		ListAccess rst = new ListAccess();
		rst.setModelTypeName("list_access");
		return rst;
	}

	public static ObjectAccess objectAccess() {
		ObjectAccess rst = new ObjectAccess();
		rst.setModelTypeName("object_access");
		return rst;
	}

	public static LoginHistory loginHistory() {
		LoginHistory rst = new LoginHistory();
		rst.setModelTypeName("login_history");
		return rst;
	}

	public static GenericForm genericForm() {
		GenericForm rst = new GenericForm();
		rst.setModelTypeName("generic_form");
		return rst;
	}

	public static FormMessage formMessage() {
		FormMessage rst = new FormMessage();
		rst.setModelTypeName("form_message");
		return rst;
	}

	public static FormFieldMessage formFieldMessage() {
		FormFieldMessage rst = new FormFieldMessage();
		rst.setModelTypeName("form_field_message");
		return rst;
	}

	public static FormField formField() {
		FormField rst = new FormField();
		rst.setModelTypeName("form_field");
		return rst;
	}

	public static FormAction formAction() {
		FormAction rst = new FormAction();
		rst.setModelTypeName("form_action");
		return rst;
	}

	public static CandidateContainer candidateContainer() {
		CandidateContainer rst = new CandidateContainer();
		rst.setModelTypeName("candidate_container");
		return rst;
	}

	public static CandidateElement candidateElement() {
		CandidateElement rst = new CandidateElement();
		rst.setModelTypeName("candidate_element");
		return rst;
	}

	public static WechatWorkappIdentify wechatWorkappIdentify() {
		WechatWorkappIdentify rst = new WechatWorkappIdentify();
		rst.setModelTypeName("wechat_workapp_identify");
		return rst;
	}

	public static WechatMiniappIdentify wechatMiniappIdentify() {
		WechatMiniappIdentify rst = new WechatMiniappIdentify();
		rst.setModelTypeName("wechat_miniapp_identify");
		return rst;
	}

	public static KeypairIdentify keypairIdentify() {
		KeypairIdentify rst = new KeypairIdentify();
		rst.setModelTypeName("keypair_identify");
		return rst;
	}

	public static PublicKeyType publicKeyType() {
		PublicKeyType rst = new PublicKeyType();
		rst.setModelTypeName("public_key_type");
		return rst;
	}

	public static TreeNode treeNode() {
		TreeNode rst = new TreeNode();
		rst.setModelTypeName("tree_node");
		return rst;
	}

	
}



