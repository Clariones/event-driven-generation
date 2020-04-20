package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EmployeeNomination extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.employeenomination.EmployeeNomination";
	}
	// 枚举对象

	// 引用的对象

	public Merchant employee() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employee");
		member.setMemberName("employee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant employer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employer");
		member.setMemberName("employer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Role role() {
		Role member = new Role();
		member.setModelTypeName("role");
		member.setName("role");
		member.setMemberName("role");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Job job() {
		Job member = new Job();
		member.setModelTypeName("job");
		member.setName("job");
		member.setMemberName("job");
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
	
	public ContractTemplate contractTemplateList() {
		ContractTemplate member = new ContractTemplate();
		member.setModelTypeName("contract_template");
		member.setName("submitter");
		member.setMemberName("contractTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("submitter");
		member.setMemberName("standardContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("post_by_employee");
		member.setMemberName("articleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MerchantActiveNomination merchantActiveNominationList() {
		MerchantActiveNomination member = new MerchantActiveNomination();
		member.setModelTypeName("merchant_active_nomination");
		member.setName("nomination");
		member.setMemberName("merchantActiveNominationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("authenticator");
		member.setMemberName("licenseList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectNomination projectNominationList() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("worker");
		member.setMemberName("projectNominationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectOrganization projectOrganizationList() {
		ProjectOrganization member = new ProjectOrganization();
		member.setModelTypeName("project_organization");
		member.setName("worker");
		member.setMemberName("projectOrganizationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DailyTaskTemplate dailyTaskTemplateList() {
		DailyTaskTemplate member = new DailyTaskTemplate();
		member.setModelTypeName("daily_task_template");
		member.setName("creator");
		member.setMemberName("dailyTaskTemplateList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectMaterial projectMaterialList() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("material_submitter");
		member.setMemberName("projectMaterialList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Recommendation recommendationListAsApplicantEmployee() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("applicant_employee");
		member.setMemberName("recommendationListAsApplicantEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Recommendation recommendationListAsReferrer() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("referrer");
		member.setMemberName("recommendationListAsReferrer");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EmplacementApplication emplacementApplicationList() {
		EmplacementApplication member = new EmplacementApplication();
		member.setModelTypeName("emplacement_application");
		member.setName("applicant_employee");
		member.setMemberName("emplacementApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_employee");
		member.setMemberName("customerProjectApplicationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("applicant_employee");
		member.setMemberName("partnerSettlementApplicationList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public DateTimeAttribute startDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("startDate");
		member.setName("start_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute endDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("endDate");
		member.setName("end_date");
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

