package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PlatformConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.platformconfiguration.PlatformConfiguration";
	}
	// 枚举对象

	// 引用的对象

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
	
	public AccountTitleMapping accountTitleMappingList() {
		AccountTitleMapping member = new AccountTitleMapping();
		member.setModelTypeName("account_title_mapping");
		member.setName("platform_configuration");
		member.setMemberName("accountTitleMappingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FinancialBusinessConfiguration financialBusinessConfigurationList() {
		FinancialBusinessConfiguration member = new FinancialBusinessConfiguration();
		member.setModelTypeName("financial_business_configuration");
		member.setName("platform_configuration");
		member.setMemberName("financialBusinessConfigurationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PropertyOwnerMission propertyOwnerMissionList() {
		PropertyOwnerMission member = new PropertyOwnerMission();
		member.setModelTypeName("property_owner_mission");
		member.setName("platform_configuration");
		member.setMemberName("propertyOwnerMissionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArticleCategory articleCategoryList() {
		ArticleCategory member = new ArticleCategory();
		member.setModelTypeName("article_category");
		member.setName("platform_configuration");
		member.setMemberName("articleCategoryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HomepageShowConfiguration homepageShowConfigurationList() {
		HomepageShowConfiguration member = new HomepageShowConfiguration();
		member.setModelTypeName("homepage_show_configuration");
		member.setName("platform_configuration");
		member.setMemberName("homepageShowConfigurationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DocumentTag documentTagList() {
		DocumentTag member = new DocumentTag();
		member.setModelTypeName("document_tag");
		member.setName("platform_configuration");
		member.setMemberName("documentTagList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJob projectJobList() {
		ProjectJob member = new ProjectJob();
		member.setModelTypeName("project_job");
		member.setName("platform_configuration");
		member.setMemberName("projectJobList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ReportCheckItem reportCheckItemList() {
		ReportCheckItem member = new ReportCheckItem();
		member.setModelTypeName("report_check_item");
		member.setName("platform_configuration");
		member.setMemberName("reportCheckItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ReportSegmentType reportSegmentTypeList() {
		ReportSegmentType member = new ReportSegmentType();
		member.setModelTypeName("report_segment_type");
		member.setName("platform_configuration");
		member.setMemberName("reportSegmentTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDailyReportTemplate projectDailyReportTemplateList() {
		ProjectDailyReportTemplate member = new ProjectDailyReportTemplate();
		member.setModelTypeName("project_daily_report_template");
		member.setName("platform_configuration");
		member.setMemberName("projectDailyReportTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AvailableServiceType availableServiceTypeList() {
		AvailableServiceType member = new AvailableServiceType();
		member.setModelTypeName("available_service_type");
		member.setName("platform_configuration");
		member.setMemberName("availableServiceTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AvailableServiceLocation availableServiceLocationList() {
		AvailableServiceLocation member = new AvailableServiceLocation();
		member.setModelTypeName("available_service_location");
		member.setName("platform_configuration");
		member.setMemberName("availableServiceLocationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AvailableIndustry availableIndustryList() {
		AvailableIndustry member = new AvailableIndustry();
		member.setModelTypeName("available_industry");
		member.setName("platform_configuration");
		member.setMemberName("availableIndustryList");
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

	public StringAttribute homepageActionBackground(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("homepageActionBackground");
		useMember(member);
		return member;
	}

	public StringAttribute defaultServiceFeeImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultServiceFeeImage");
		useMember(member);
		return member;
	}

	public StringAttribute defaultProjectFeeImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultProjectFeeImage");
		useMember(member);
		return member;
	}

	public StringAttribute defaultTaskFeeImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultTaskFeeImage");
		useMember(member);
		return member;
	}

	public StringAttribute defaultFineImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultFineImage");
		useMember(member);
		return member;
	}

	public StringAttribute defaultMerchantImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultMerchantImage");
		useMember(member);
		return member;
	}

	public StringAttribute defaultLogoImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("defaultLogoImage");
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

