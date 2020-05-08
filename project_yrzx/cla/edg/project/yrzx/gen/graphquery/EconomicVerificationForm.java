package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EconomicVerificationForm extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.economicverificationform.EconomicVerificationForm";
	}
	// 枚举对象

	// 引用的对象

	public Merchant serviceVendor() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("service_vendor");
		member.setMemberName("serviceVendor");
		member.setReferDirection(true);
		member.setRelationName("serviceVendor");
		append(member);
		return member;
	}

	public EmployeeNomination responsibleEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("responsible_employee");
		member.setMemberName("responsibleEmployee");
		member.setReferDirection(true);
		member.setRelationName("responsibleEmployee");
		append(member);
		return member;
	}

	public MerchantSeal merchantSeal() {
		MerchantSeal member = new MerchantSeal();
		member.setModelTypeName("merchant_seal");
		member.setName("merchant_seal");
		member.setMemberName("merchantSeal");
		member.setReferDirection(true);
		member.setRelationName("merchantSeal");
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

	public DateTimeAttribute constructionDatetime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("constructionDatetime");
		member.setName("construction_datetime");
		useMember(member);
		return member;
	}

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("content");
		member.setName("content");
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

