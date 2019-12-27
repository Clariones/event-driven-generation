package cla.edg.project.storedev.gen.graphquery;

public class MODEL{
	public static String getBasePackageName() {
		return "com.doublechain.storedev";
	}

	public static Platform platform() {
		Platform rst = new Platform();
		rst.setModelTypeName("platform");
		return rst;
	}

	public static ChangeRequestType changeRequestType() {
		ChangeRequestType rst = new ChangeRequestType();
		rst.setModelTypeName("change_request_type");
		return rst;
	}

	public static RecommendedStoreStatus recommendedStoreStatus() {
		RecommendedStoreStatus rst = new RecommendedStoreStatus();
		rst.setModelTypeName("recommended_store_status");
		return rst;
	}

	public static OperationCompany operationCompany() {
		OperationCompany rst = new OperationCompany();
		rst.setModelTypeName("operation_company");
		return rst;
	}

	public static GiantArea giantArea() {
		GiantArea rst = new GiantArea();
		rst.setModelTypeName("giant_area");
		return rst;
	}

	public static MiddleArea middleArea() {
		MiddleArea rst = new MiddleArea();
		rst.setModelTypeName("middle_area");
		return rst;
	}

	public static SmallArea smallArea() {
		SmallArea rst = new SmallArea();
		rst.setModelTypeName("small_area");
		return rst;
	}

	public static Province province() {
		Province rst = new Province();
		rst.setModelTypeName("province");
		return rst;
	}

	public static City city() {
		City rst = new City();
		rst.setModelTypeName("city");
		return rst;
	}

	public static District district() {
		District rst = new District();
		rst.setModelTypeName("district");
		return rst;
	}

	public static StoreType storeType() {
		StoreType rst = new StoreType();
		rst.setModelTypeName("store_type");
		return rst;
	}

	public static TradeAreaType tradeAreaType() {
		TradeAreaType rst = new TradeAreaType();
		rst.setModelTypeName("trade_area_type");
		return rst;
	}

	public static RoleType roleType() {
		RoleType rst = new RoleType();
		rst.setModelTypeName("role_type");
		return rst;
	}

	public static OperationCompanyRoleAssignment operationCompanyRoleAssignment() {
		OperationCompanyRoleAssignment rst = new OperationCompanyRoleAssignment();
		rst.setModelTypeName("operation_company_role_assignment");
		return rst;
	}

	public static CompanyAuditRoleRelationship companyAuditRoleRelationship() {
		CompanyAuditRoleRelationship rst = new CompanyAuditRoleRelationship();
		rst.setModelTypeName("company_audit_role_relationship");
		return rst;
	}

	public static AuditTaskStatus auditTaskStatus() {
		AuditTaskStatus rst = new AuditTaskStatus();
		rst.setModelTypeName("audit_task_status");
		return rst;
	}

	public static RecommendedStoreHistory recommendedStoreHistory() {
		RecommendedStoreHistory rst = new RecommendedStoreHistory();
		rst.setModelTypeName("recommended_store_history");
		return rst;
	}

	public static ChangeRequest changeRequest() {
		ChangeRequest rst = new ChangeRequest();
		rst.setModelTypeName("change_request");
		return rst;
	}

	public static BaseInformation baseInformation() {
		BaseInformation rst = new BaseInformation();
		rst.setModelTypeName("base_information");
		return rst;
	}

	public static StoreInformation storeInformation() {
		StoreInformation rst = new StoreInformation();
		rst.setModelTypeName("store_information");
		return rst;
	}

	public static Channel channel() {
		Channel rst = new Channel();
		rst.setModelTypeName("channel");
		return rst;
	}

	public static CityLevel cityLevel() {
		CityLevel rst = new CityLevel();
		rst.setModelTypeName("city_level");
		return rst;
	}

	public static PeopleFlow peopleFlow() {
		PeopleFlow rst = new PeopleFlow();
		rst.setModelTypeName("people_flow");
		return rst;
	}

	public static SampleRow sampleRow() {
		SampleRow rst = new SampleRow();
		rst.setModelTypeName("sample_row");
		return rst;
	}

	public static SamplingDate samplingDate() {
		SamplingDate rst = new SamplingDate();
		rst.setModelTypeName("sampling_date");
		return rst;
	}

	public static SampleItemTitle sampleItemTitle() {
		SampleItemTitle rst = new SampleItemTitle();
		rst.setModelTypeName("sample_item_title");
		return rst;
	}

	public static ExpenseInformation expenseInformation() {
		ExpenseInformation rst = new ExpenseInformation();
		rst.setModelTypeName("expense_information");
		return rst;
	}

	public static SearchStoreMethod searchStoreMethod() {
		SearchStoreMethod rst = new SearchStoreMethod();
		rst.setModelTypeName("search_store_method");
		return rst;
	}

	public static RecommendedStore recommendedStore() {
		RecommendedStore rst = new RecommendedStore();
		rst.setModelTypeName("recommended_store");
		return rst;
	}

	public static RecommendedStoreActivityLog recommendedStoreActivityLog() {
		RecommendedStoreActivityLog rst = new RecommendedStoreActivityLog();
		rst.setModelTypeName("recommended_store_activity_log");
		return rst;
	}

	public static Store store() {
		Store rst = new Store();
		rst.setModelTypeName("store");
		return rst;
	}

	public static StoreDeveloper storeDeveloper() {
		StoreDeveloper rst = new StoreDeveloper();
		rst.setModelTypeName("store_developer");
		return rst;
	}

	public static AuditType auditType() {
		AuditType rst = new AuditType();
		rst.setModelTypeName("audit_type");
		return rst;
	}

	public static RecommendedStoreAuditTask recommendedStoreAuditTask() {
		RecommendedStoreAuditTask rst = new RecommendedStoreAuditTask();
		rst.setModelTypeName("recommended_store_audit_task");
		return rst;
	}

	public static WechatWorkLoginInfo wechatWorkLoginInfo() {
		WechatWorkLoginInfo rst = new WechatWorkLoginInfo();
		rst.setModelTypeName("wechat_work_login_info");
		return rst;
	}

	public static WechatLoginInfo wechatLoginInfo() {
		WechatLoginInfo rst = new WechatLoginInfo();
		rst.setModelTypeName("wechat_login_info");
		return rst;
	}

	public static StoreMonthlyOperationData storeMonthlyOperationData() {
		StoreMonthlyOperationData rst = new StoreMonthlyOperationData();
		rst.setModelTypeName("store_monthly_operation_data");
		return rst;
	}

	public static StoreReport storeReport() {
		StoreReport rst = new StoreReport();
		rst.setModelTypeName("store_report");
		return rst;
	}

	public static OperationCompanyReport operationCompanyReport() {
		OperationCompanyReport rst = new OperationCompanyReport();
		rst.setModelTypeName("operation_company_report");
		return rst;
	}

	public static MonthlyStatisticsItem monthlyStatisticsItem() {
		MonthlyStatisticsItem rst = new MonthlyStatisticsItem();
		rst.setModelTypeName("monthly_statistics_item");
		return rst;
	}

	public static MonthlyStatistics monthlyStatistics() {
		MonthlyStatistics rst = new MonthlyStatistics();
		rst.setModelTypeName("monthly_statistics");
		return rst;
	}

	public static BasicCalculationDataSetting basicCalculationDataSetting() {
		BasicCalculationDataSetting rst = new BasicCalculationDataSetting();
		rst.setModelTypeName("basic_calculation_data_setting");
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

	public static SecUserBlocking secUserBlocking() {
		SecUserBlocking rst = new SecUserBlocking();
		rst.setModelTypeName("sec_user_blocking");
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

	
}



