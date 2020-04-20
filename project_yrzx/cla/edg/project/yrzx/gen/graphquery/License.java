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
		append(member);
		return member;
	}

	public LicenseType licenseType() {
		LicenseType member = new LicenseType();
		member.setModelTypeName("license_type");
		member.setName("license_type");
		member.setMemberName("licenseType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ValidateStatus validateStatus() {
		ValidateStatus member = new ValidateStatus();
		member.setModelTypeName("validate_status");
		member.setName("validate_status");
		member.setMemberName("validateStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant owner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("owner");
		member.setMemberName("owner");
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

	public EmployeeNomination authenticator() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("authenticator");
		member.setMemberName("authenticator");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AuthenticateStatus authenticateStatus() {
		AuthenticateStatus member = new AuthenticateStatus();
		member.setModelTypeName("authenticate_status");
		member.setName("authenticate_status");
		member.setMemberName("authenticateStatus");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute licenseCopy(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		member.setName("licenseCopy");
		useMember(member);
		return member;
	}

	public StringAttribute licenseNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("licenseNumber");
		useMember(member);
		return member;
	}

	public StringAttribute expiredDate(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("expiredDate");
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

	public DateTimeAttribute authenticateDateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("authenticateDateTime");
		useMember(member);
		return member;
	}

	public StringAttribute authenticateComment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("authenticateComment");
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
