package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PartnerType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.partnertype.PartnerType";
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
	
	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("partner_type");
		member.setMemberName("emplacementApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("partner_type");
		member.setMemberName("partnerSettlementApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventApplyEmplacement eventApplyEmplacementList() {
		EventApplyEmplacement member = new EventApplyEmplacement();
		member.setModelTypeName("event_apply_emplacement");
		member.setName("partner_type");
		member.setMemberName("eventApplyEmplacementList");
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

	public StringAttribute category(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("category");
		member.setName("category");
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

