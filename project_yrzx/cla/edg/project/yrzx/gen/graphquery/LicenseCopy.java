package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LicenseCopy extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.licensecopy.LicenseCopy";
	}
	// 枚举对象

	// 引用的对象

	public LicenseType licenseType() {
		LicenseType member = new LicenseType();
		member.setModelTypeName("license_type");
		member.setName("license_type");
		member.setMemberName("licenseType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public LicenseStatus licenseStatus() {
		LicenseStatus member = new LicenseStatus();
		member.setModelTypeName("license_status");
		member.setName("license_status");
		member.setMemberName("licenseStatus");
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

	// 被引用的对象
	
	public MerchantLicense merchantLicenseList() {
		MerchantLicense member = new MerchantLicense();
		member.setModelTypeName("merchant_license");
		member.setName("license");
		member.setMemberName("merchantLicenseList");
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

	public StringAttribute licenseImageFront(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("licenseImageFront");
		useMember(member);
		return member;
	}

	public StringAttribute licenseImageBack(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("licenseImageBack");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

