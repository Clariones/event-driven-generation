package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PartnerApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.partnerapplication.PartnerApplication";
	}
	// 枚举对象

	// 引用的对象

	public AvailableServiceType serviceType() {
		AvailableServiceType member = new AvailableServiceType();
		member.setModelTypeName("available_service_type");
		member.setName("service_type");
		member.setMemberName("serviceType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AvailableServiceLocation serviceLocation() {
		AvailableServiceLocation member = new AvailableServiceLocation();
		member.setModelTypeName("available_service_location");
		member.setName("service_location");
		member.setMemberName("serviceLocation");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AvailableIndustry industry() {
		AvailableIndustry member = new AvailableIndustry();
		member.setModelTypeName("available_industry");
		member.setName("industry");
		member.setMemberName("industry");
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

	public StringAttribute merchantWebsite(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("merchantWebsite");
		useMember(member);
		return member;
	}

	public StringAttribute merchantName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("merchantName");
		useMember(member);
		return member;
	}

	public StringAttribute merchantLocation(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("merchantLocation");
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

