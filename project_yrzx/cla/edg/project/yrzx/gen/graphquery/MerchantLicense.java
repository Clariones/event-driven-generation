package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantLicense extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.merchantlicense.MerchantLicense";
	}
	// 枚举对象

	// 引用的对象

	public Merchant merchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant");
		member.setMemberName("merchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public LicenseCopy license() {
		LicenseCopy member = new LicenseCopy();
		member.setModelTypeName("license_copy");
		member.setName("license");
		member.setMemberName("license");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
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

