package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CustomerApplicationStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.customerapplicationstatus.CustomerApplicationStatus";
	}
	// 枚举对象
	public static EnumAttribute PENDING = new EnumAttribute("com.yrdec.yrzx.customerapplicationstatus.CustomerApplicationStatus", "PENDING");
	public static EnumAttribute PROCESSING = new EnumAttribute("com.yrdec.yrzx.customerapplicationstatus.CustomerApplicationStatus", "PROCESSING");
	public static EnumAttribute CANCELLED = new EnumAttribute("com.yrdec.yrzx.customerapplicationstatus.CustomerApplicationStatus", "CANCELLED");
	public static EnumAttribute CLOSED = new EnumAttribute("com.yrdec.yrzx.customerapplicationstatus.CustomerApplicationStatus", "CLOSED");

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
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("status");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerApplication partnerApplicationList() {
		PartnerApplication member = new PartnerApplication();
		member.setModelTypeName("partner_application");
		member.setName("status");
		member.setMemberName("partnerApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DesignerRecommendation designerRecommendationList() {
		DesignerRecommendation member = new DesignerRecommendation();
		member.setModelTypeName("designer_recommendation");
		member.setName("status");
		member.setMemberName("designerRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ServiceProviderRecommendation serviceProviderRecommendationList() {
		ServiceProviderRecommendation member = new ServiceProviderRecommendation();
		member.setModelTypeName("service_provider_recommendation");
		member.setName("status");
		member.setMemberName("serviceProviderRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceRequirement maintainanceRequirementList() {
		MaintainanceRequirement member = new MaintainanceRequirement();
		member.setModelTypeName("maintainance_requirement");
		member.setName("status");
		member.setMemberName("maintainanceRequirementList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MaintainanceProcessRecord maintainanceProcessRecordList() {
		MaintainanceProcessRecord member = new MaintainanceProcessRecord();
		member.setModelTypeName("maintainance_process_record");
		member.setName("status");
		member.setMemberName("maintainanceProcessRecordList");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

