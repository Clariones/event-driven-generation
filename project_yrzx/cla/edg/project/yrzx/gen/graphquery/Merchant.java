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
		member.setRelationName("merchantType");
		append(member);
		return member;
	}

	public MerchantBaseType merchantBaseType() {
		MerchantBaseType member = new MerchantBaseType();
		member.setModelTypeName("merchant_base_type");
		member.setName("merchant_base_type");
		member.setMemberName("merchantBaseType");
		member.setReferDirection(true);
		member.setRelationName("merchantBaseType");
		append(member);
		return member;
	}

	public MerchantStatus merchantStatus() {
		MerchantStatus member = new MerchantStatus();
		member.setModelTypeName("merchant_status");
		member.setName("merchant_status");
		member.setMemberName("merchantStatus");
		member.setReferDirection(true);
		member.setRelationName("merchantStatus");
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

	public StandardContract standardContractListAsPartyA() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("party_a");
		member.setMemberName("standardContractListAsPartyA");
		member.setRelationName("partyA");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardContract standardContractListAsPartyB() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("party_b");
		member.setMemberName("standardContractListAsPartyB");
		member.setRelationName("partyA");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPayItem contractPayItemListAsPayer() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("payer");
		member.setMemberName("contractPayItemListAsPayer");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPayItem contractPayItemListAsPayee() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("payee");
		member.setMemberName("contractPayItemListAsPayee");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemListAsPayer() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("payer");
		member.setMemberName("commissionPayItemListAsPayer");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemListAsPayee() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("payee");
		member.setMemberName("commissionPayItemListAsPayee");
		member.setRelationName("payer");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractViewRecord contractViewRecordList() {
		ContractViewRecord member = new ContractViewRecord();
		member.setModelTypeName("contract_view_record");
		member.setName("merchant");
		member.setMemberName("contractViewRecordList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractOperationLog contractOperationLogList() {
		ContractOperationLog member = new ContractOperationLog();
		member.setModelTypeName("contract_operation_log");
		member.setName("operator_merchant");
		member.setMemberName("contractOperationLogList");
		member.setRelationName("operatorMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by_merchant");
		member.setMemberName("articleList");
		member.setRelationName("postByMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantActiveNomination merchantActiveNominationList() {
		MerchantActiveNomination member = new MerchantActiveNomination();
		member.setModelTypeName("merchant_active_nomination");
		member.setName("merchant");
		member.setMemberName("merchantActiveNominationList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("owner");
		member.setMemberName("licenseList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Job jobList() {
		Job member = new Job();
		member.setModelTypeName("job");
		member.setName("merchant");
		member.setMemberName("jobList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeNomination employeeNominationListAsEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employee");
		member.setMemberName("employeeNominationListAsEmployee");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeNomination employeeNominationListAsEmployer() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employer");
		member.setMemberName("employeeNominationListAsEmployer");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkPackage workPackageList() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("vendor");
		member.setMemberName("workPackageList");
		member.setRelationName("vendor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsProjectOwner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project_owner");
		member.setMemberName("projectListAsProjectOwner");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsStore() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("store");
		member.setMemberName("projectListAsStore");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsPartner() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("partner");
		member.setMemberName("projectListAsPartner");
		member.setRelationName("projectOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialViewRecord projectMaterialViewRecordList() {
		ProjectMaterialViewRecord member = new ProjectMaterialViewRecord();
		member.setModelTypeName("project_material_view_record");
		member.setName("merchant");
		member.setMemberName("projectMaterialViewRecordList");
		member.setRelationName("merchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterialOperationLog projectMaterialOperationLogList() {
		ProjectMaterialOperationLog member = new ProjectMaterialOperationLog();
		member.setModelTypeName("project_material_operation_log");
		member.setName("operator_merchant");
		member.setMemberName("projectMaterialOperationLogList");
		member.setRelationName("operatorMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptance projectAcceptanceListAsPropertyOwner() {
		ProjectAcceptance member = new ProjectAcceptance();
		member.setModelTypeName("project_acceptance");
		member.setName("property_owner");
		member.setMemberName("projectAcceptanceListAsPropertyOwner");
		member.setRelationName("propertyOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectAcceptance projectAcceptanceListAsApplicationUnit() {
		ProjectAcceptance member = new ProjectAcceptance();
		member.setModelTypeName("project_acceptance");
		member.setName("application_unit");
		member.setMemberName("projectAcceptanceListAsApplicationUnit");
		member.setRelationName("propertyOwner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Recommendation recommendationList() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("applicant_merchant");
		member.setMemberName("recommendationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("applicant_merchant");
		member.setMemberName("emplacementApplicationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_merchant");
		member.setMemberName("customerProjectApplicationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("applicant_merchant");
		member.setMemberName("partnerSettlementApplicationList");
		member.setRelationName("applicantMerchant");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventShowAllType eventShowAllTypeList() {
		EventShowAllType member = new EventShowAllType();
		member.setModelTypeName("event_show_all_type");
		member.setName("field_biz_candidate");
		member.setMemberName("eventShowAllTypeList");
		member.setRelationName("fieldBizCandidate");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute contactMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		// member.setName("contactMobile");
		member.setName("contact_mobile");
		useMember(member);
		return member;
	}

	public StringAttribute contactAddress(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contactAddress");
		member.setName("contact_address");
		useMember(member);
		return member;
	}

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("avatar");
		member.setName("avatar");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

