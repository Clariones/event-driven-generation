package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Merchant extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.merchant.Merchant";
	}
	// 枚举对象

	// 引用的对象

	public MerchantType merchantType() {
		MerchantType member = new MerchantType();
		member.setModelTypeName("merchant_type");
		member.setName("merchant_type");
		member.setMemberName("merchantType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MerchantBaseType merchantBaseType() {
		MerchantBaseType member = new MerchantBaseType();
		member.setModelTypeName("merchant_base_type");
		member.setName("merchant_base_type");
		member.setMemberName("merchantBaseType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MerchantStatus merchantStatus() {
		MerchantStatus member = new MerchantStatus();
		member.setModelTypeName("merchant_status");
		member.setName("merchant_status");
		member.setMemberName("merchantStatus");
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
	
	public StandardContract standardContractListAsPartyA() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("party_a");
		member.setMemberName("standardContractListAsPartyA");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StandardContract standardContractListAsPartyB() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("party_b");
		member.setMemberName("standardContractListAsPartyB");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractPayItem contractPayItemListAsPayer() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("payer");
		member.setMemberName("contractPayItemListAsPayer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractPayItem contractPayItemListAsPayee() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("payee");
		member.setMemberName("contractPayItemListAsPayee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CommissionPayItem commissionPayItemListAsPayer() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("payer");
		member.setMemberName("commissionPayItemListAsPayer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CommissionPayItem commissionPayItemListAsPayee() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("payee");
		member.setMemberName("commissionPayItemListAsPayee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by_merchant");
		member.setMemberName("articleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantActiveNomination merchantActiveNominationList() {
		MerchantActiveNomination member = new MerchantActiveNomination();
		member.setModelTypeName("merchant_active_nomination");
		member.setName("merchant");
		member.setMemberName("merchantActiveNominationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("owner");
		member.setMemberName("licenseList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNomination projectNominationList() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("merchant");
		member.setMemberName("projectNominationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Job jobList() {
		Job member = new Job();
		member.setModelTypeName("job");
		member.setName("merchant");
		member.setMemberName("jobList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeNomination employeeNominationListAsEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employee");
		member.setMemberName("employeeNominationListAsEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmployeeNomination employeeNominationListAsEmployer() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employer");
		member.setMemberName("employeeNominationListAsEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackage workPackageList() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("vendor");
		member.setMemberName("workPackageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectListAsProjectOwner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_owner");
		member.setMemberName("projectListAsProjectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectListAsStore() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("store");
		member.setMemberName("projectListAsStore");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Project projectListAsPartner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("partner");
		member.setMemberName("projectListAsPartner");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Recommendation recommendationListAsApplicantMerchant() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("applicant_merchant");
		member.setMemberName("recommendationListAsApplicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Recommendation recommendationListAsReferrerEmployee() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("referrer_employee");
		member.setMemberName("recommendationListAsReferrerEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Recommendation recommendationListAsReferrerEmployer() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("referrer_employer");
		member.setMemberName("recommendationListAsReferrerEmployer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("applicant_merchant");
		member.setMemberName("emplacementApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_merchant");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("applicant_merchant");
		member.setMemberName("partnerSettlementApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EventShowAllType eventShowAllTypeList() {
		EventShowAllType member = new EventShowAllType();
		member.setModelTypeName("event_show_all_type");
		member.setName("field_biz_candidate");
		member.setMemberName("eventShowAllTypeList");
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

	public StringAttribute contactMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("contactMobile");
		useMember(member);
		return member;
	}

	public StringAttribute contactAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("contactAddress");
		useMember(member);
		return member;
	}

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("avatar");
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
