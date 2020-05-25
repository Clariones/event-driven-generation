package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantDetail extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.merchantdetail.MerchantDetail";
	}
	// 枚举对象

	// 引用的对象

	public IndustryType industryType() {
		IndustryType member = new IndustryType();
		member.setModelTypeName("industry_type");
		member.setName("industry_type");
		member.setMemberName("industryType");
		member.setReferDirection(true);
		member.setRelationName("industryType");
		append(member);
		return member;
	}

	public EngineeringType engineeringType() {
		EngineeringType member = new EngineeringType();
		member.setModelTypeName("engineering_type");
		member.setName("engineering_type");
		member.setMemberName("engineeringType");
		member.setReferDirection(true);
		member.setRelationName("engineeringType");
		append(member);
		return member;
	}

	public CareerType careerType() {
		CareerType member = new CareerType();
		member.setModelTypeName("career_type");
		member.setName("career_type");
		member.setMemberName("careerType");
		member.setReferDirection(true);
		member.setRelationName("careerType");
		append(member);
		return member;
	}

	// 被引用的对象

	public Merchant merchantList() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant_detail");
		member.setMemberName("merchantList");
		member.setRelationName("merchantDetail");
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

	public StringAttribute gender(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_gender");
		// member.setName("gender");
		member.setName("gender");
		useMember(member);
		return member;
	}

	public NumberAttribute workingYears(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("workingYears");
		member.setName("working_years");
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

