package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Recommendation extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.recommendation.Recommendation";
	}
	// 枚举对象

	// 引用的对象

	public RecommendationType type() {
		RecommendationType member = new RecommendationType();
		member.setModelTypeName("recommendation_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ApplicationStatus status() {
		ApplicationStatus member = new ApplicationStatus();
		member.setModelTypeName("application_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant applicantMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("applicant_merchant");
		member.setMemberName("applicantMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination applicantEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("applicant_employee");
		member.setMemberName("applicantEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination referrer() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("referrer");
		member.setMemberName("referrer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant referrerEmployee() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("referrer_employee");
		member.setMemberName("referrerEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant referrerEmployer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("referrer_employer");
		member.setMemberName("referrerEmployer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public RecommendationStatus recommendationStatus() {
		RecommendationStatus member = new RecommendationStatus();
		member.setModelTypeName("recommendation_status");
		member.setName("recommendation_status");
		member.setMemberName("recommendationStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public RecommendationType recommendationType() {
		RecommendationType member = new RecommendationType();
		member.setModelTypeName("recommendation_type");
		member.setName("recommendation_type");
		member.setMemberName("recommendationType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute contactName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("contactName");
		useMember(member);
		return member;
	}

	public StringAttribute contactMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("contactMobile");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("comments");
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

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
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

