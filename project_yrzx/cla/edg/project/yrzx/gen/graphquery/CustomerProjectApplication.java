package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CustomerProjectApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.customerprojectapplication.CustomerProjectApplication";
	}
	// 枚举对象

	// 引用的对象

	public EstatePropertyType propertyType() {
		EstatePropertyType member = new EstatePropertyType();
		member.setModelTypeName("estate_property_type");
		member.setName("property_type");
		member.setMemberName("propertyType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CustomerApplicationStatus status() {
		CustomerApplicationStatus member = new CustomerApplicationStatus();
		member.setModelTypeName("customer_application_status");
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

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute propertyArea(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("propertyArea");
		useMember(member);
		return member;
	}

	public StringAttribute propertyLocation(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("propertyLocation");
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

