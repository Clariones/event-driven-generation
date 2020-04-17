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
	
	public ArticleCategory articleCategoryList() {
		ArticleCategory member = new ArticleCategory();
		member.setModelTypeName("article_category");
		member.setName("platform_configuration");
		member.setMemberName("articleCategoryList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ApplicationStatus applicationStatusList() {
		ApplicationStatus member = new ApplicationStatus();
		member.setModelTypeName("application_status");
		member.setName("platform_configuration");
		member.setMemberName("applicationStatusList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendationType recommendationTypeList() {
		RecommendationType member = new RecommendationType();
		member.setModelTypeName("recommendation_type");
		member.setName("platform_configuration");
		member.setMemberName("recommendationTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EstatePropertyType estatePropertyTypeList() {
		EstatePropertyType member = new EstatePropertyType();
		member.setModelTypeName("estate_property_type");
		member.setName("platform_configuration");
		member.setMemberName("estatePropertyTypeList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerType partnerTypeList() {
		PartnerType member = new PartnerType();
		member.setModelTypeName("partner_type");
		member.setName("platform_configuration");
		member.setMemberName("partnerTypeList");
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

