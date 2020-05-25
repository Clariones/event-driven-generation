package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IndustryType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.industrytype.IndustryType";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	public MerchantDetail merchantDetailList() {
		MerchantDetail member = new MerchantDetail();
		member.setModelTypeName("merchant_detail");
		member.setName("industry_type");
		member.setMemberName("merchantDetailList");
		member.setRelationName("industryType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventFillPersonalDetail eventFillPersonalDetailList() {
		EventFillPersonalDetail member = new EventFillPersonalDetail();
		member.setModelTypeName("event_fill_personal_detail");
		member.setName("industry_type");
		member.setMemberName("eventFillPersonalDetailList");
		member.setRelationName("industryType");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute platform(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("platform");
		member.setName("platform");
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

