package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class License extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.license.License";
	}
	// 枚举对象

	// 引用的对象

	public LicenseCategory licenseCategory() {
		LicenseCategory member = new LicenseCategory();
		member.setModelTypeName("license_category");
		member.setName("license_category");
		member.setMemberName("licenseCategory");
		member.setReferDirection(true);
		member.setRelationName("licenseCategory");
		append(member);
		return member;
	}

	public LicenseIndustryType licenseIndustryType() {
		LicenseIndustryType member = new LicenseIndustryType();
		member.setModelTypeName("license_industry_type");
		member.setName("license_industry_type");
		member.setMemberName("licenseIndustryType");
		member.setReferDirection(true);
		member.setRelationName("licenseIndustryType");
		append(member);
		return member;
	}

	public ValidateStatus validateStatus() {
		ValidateStatus member = new ValidateStatus();
		member.setModelTypeName("validate_status");
		member.setName("validate_status");
		member.setMemberName("validateStatus");
		member.setReferDirection(true);
		member.setRelationName("validateStatus");
		append(member);
		return member;
	}

	public Merchant owner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	public EmployeeNomination authenticator() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("authenticator");
		member.setMemberName("authenticator");
		member.setReferDirection(true);
		member.setRelationName("authenticator");
		append(member);
		return member;
	}

	public AuthenticateStatus authenticateStatus() {
		AuthenticateStatus member = new AuthenticateStatus();
		member.setModelTypeName("authenticate_status");
		member.setName("authenticate_status");
		member.setMemberName("authenticateStatus");
		member.setReferDirection(true);
		member.setRelationName("authenticateStatus");
		append(member);
		return member;
	}

	// 被引用的对象


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

	public StringAttribute licenseCopy(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("licenseCopy");
		member.setName("license_copy");
		useMember(member);
		return member;
	}

	public StringAttribute licenseNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("licenseNumber");
		member.setName("license_number");
		useMember(member);
		return member;
	}

	public StringAttribute expiredDate(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("expiredDate");
		member.setName("expired_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute authenticateDateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("authenticateDateTime");
		member.setName("authenticate_date_time");
		useMember(member);
		return member;
	}

	public StringAttribute authenticateComment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("authenticateComment");
		member.setName("authenticate_comment");
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

