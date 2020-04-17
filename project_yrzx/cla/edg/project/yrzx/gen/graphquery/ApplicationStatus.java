package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ApplicationStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.applicationstatus.ApplicationStatus";
	}
	// 枚举对象
	public static EnumAttribute POSTED = new EnumAttribute("com.yrdec.yrzx.applicationstatus.ApplicationStatus", "POSTED");
	public static EnumAttribute PROCESSING = new EnumAttribute("com.yrdec.yrzx.applicationstatus.ApplicationStatus", "PROCESSING");
	public static EnumAttribute FINISHED = new EnumAttribute("com.yrdec.yrzx.applicationstatus.ApplicationStatus", "FINISHED");
	public static EnumAttribute CANCELLED = new EnumAttribute("com.yrdec.yrzx.applicationstatus.ApplicationStatus", "CANCELLED");

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
	
	public Recommendation recommendationList() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("status");
		member.setMemberName("recommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("status");
		member.setMemberName("emplacementApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("status");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("status");
		member.setMemberName("partnerSettlementApplicationList");
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

