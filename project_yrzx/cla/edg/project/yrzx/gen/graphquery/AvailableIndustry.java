package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AvailableIndustry extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.availableindustry.AvailableIndustry";
	}
	// 枚举对象

	// 引用的对象

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public PartnerApplication partnerApplicationList() {
		PartnerApplication member = new PartnerApplication();
		member.setModelTypeName("partner_application");
		member.setName("industry");
		member.setMemberName("partnerApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceProviderRecommendation serviceProviderRecommendationList() {
		ServiceProviderRecommendation member = new ServiceProviderRecommendation();
		member.setModelTypeName("service_provider_recommendation");
		member.setName("industry");
		member.setMemberName("serviceProviderRecommendationList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

