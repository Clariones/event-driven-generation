package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Platform extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.platform.Platform";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public ChangeRequestType changeRequestTypeList() {
		ChangeRequestType member = new ChangeRequestType();
		member.setModelTypeName("change_request_type");
		member.setName("platform");
		member.setMemberName("changeRequestTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStoreStatus recommendedStoreStatusList() {
		RecommendedStoreStatus member = new RecommendedStoreStatus();
		member.setModelTypeName("recommended_store_status");
		member.setName("platform");
		member.setMemberName("recommendedStoreStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OperationCompany operationCompanyList() {
		OperationCompany member = new OperationCompany();
		member.setModelTypeName("operation_company");
		member.setName("platform");
		member.setMemberName("operationCompanyList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public GiantArea giantAreaList() {
		GiantArea member = new GiantArea();
		member.setModelTypeName("giant_area");
		member.setName("platform");
		member.setMemberName("giantAreaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MiddleArea middleAreaList() {
		MiddleArea member = new MiddleArea();
		member.setModelTypeName("middle_area");
		member.setName("platform");
		member.setMemberName("middleAreaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SmallArea smallAreaList() {
		SmallArea member = new SmallArea();
		member.setModelTypeName("small_area");
		member.setName("platform");
		member.setMemberName("smallAreaList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Province provinceList() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("platform");
		member.setMemberName("provinceList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public City cityList() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("platform");
		member.setMemberName("cityList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public District districtList() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("platform");
		member.setMemberName("districtList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StoreType storeTypeList() {
		StoreType member = new StoreType();
		member.setModelTypeName("store_type");
		member.setName("platform");
		member.setMemberName("storeTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public TradeAreaType tradeAreaTypeList() {
		TradeAreaType member = new TradeAreaType();
		member.setModelTypeName("trade_area_type");
		member.setName("platform");
		member.setMemberName("tradeAreaTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RoleType roleTypeList() {
		RoleType member = new RoleType();
		member.setModelTypeName("role_type");
		member.setName("platform");
		member.setMemberName("roleTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OperationCompanyRoleAssignment operationCompanyRoleAssignmentList() {
		OperationCompanyRoleAssignment member = new OperationCompanyRoleAssignment();
		member.setModelTypeName("operation_company_role_assignment");
		member.setName("platform");
		member.setMemberName("operationCompanyRoleAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CompanyAuditRoleRelationship companyAuditRoleRelationshipList() {
		CompanyAuditRoleRelationship member = new CompanyAuditRoleRelationship();
		member.setModelTypeName("company_audit_role_relationship");
		member.setName("platform");
		member.setMemberName("companyAuditRoleRelationshipList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuditTaskStatus auditTaskStatusList() {
		AuditTaskStatus member = new AuditTaskStatus();
		member.setModelTypeName("audit_task_status");
		member.setName("platform");
		member.setMemberName("auditTaskStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("platform");
		member.setMemberName("changeRequestList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Channel channelList() {
		Channel member = new Channel();
		member.setModelTypeName("channel");
		member.setName("platform");
		member.setMemberName("channelList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CityLevel cityLevelList() {
		CityLevel member = new CityLevel();
		member.setModelTypeName("city_level");
		member.setName("platform");
		member.setMemberName("cityLevelList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SearchStoreMethod searchStoreMethodList() {
		SearchStoreMethod member = new SearchStoreMethod();
		member.setModelTypeName("search_store_method");
		member.setName("platform");
		member.setMemberName("searchStoreMethodList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStore recommendedStoreList() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("platform");
		member.setMemberName("recommendedStoreList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Store storeList() {
		Store member = new Store();
		member.setModelTypeName("store");
		member.setName("platform");
		member.setMemberName("storeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StoreDeveloper storeDeveloperList() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("platform");
		member.setMemberName("storeDeveloperList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuditType auditTypeList() {
		AuditType member = new AuditType();
		member.setModelTypeName("audit_type");
		member.setName("platform");
		member.setMemberName("auditTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StoreReport storeReportList() {
		StoreReport member = new StoreReport();
		member.setModelTypeName("store_report");
		member.setName("platform");
		member.setMemberName("storeReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public OperationCompanyReport operationCompanyReportList() {
		OperationCompanyReport member = new OperationCompanyReport();
		member.setModelTypeName("operation_company_report");
		member.setName("platform");
		member.setMemberName("operationCompanyReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MonthlyStatistics monthlyStatisticsList() {
		MonthlyStatistics member = new MonthlyStatistics();
		member.setModelTypeName("monthly_statistics");
		member.setName("platform");
		member.setMemberName("monthlyStatisticsList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public BasicCalculationDataSetting basicCalculationDataSettingList() {
		BasicCalculationDataSetting member = new BasicCalculationDataSetting();
		member.setModelTypeName("basic_calculation_data_setting");
		member.setName("platform");
		member.setMemberName("basicCalculationDataSettingList");
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

	public DateTimeAttribute founded(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_now");
		member.setName("founded");
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

