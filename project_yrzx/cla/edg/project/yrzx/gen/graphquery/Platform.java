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

	public ProjectPhaseType projectPhaseTypeList() {
		ProjectPhaseType member = new ProjectPhaseType();
		member.setModelTypeName("project_phase_type");
		member.setName("platform");
		member.setMemberName("projectPhaseTypeList");
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

