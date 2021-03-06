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
		member.setRelationName("employee");
		append(member);
		return member;
	}

	public Merchant employer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("employer");
		member.setMemberName("employer");
		member.setReferDirection(true);
		member.setRelationName("employer");
		append(member);
		return member;
	}

	public Role role() {
		Role member = new Role();
		member.setModelTypeName("role");
		member.setName("role");
		member.setMemberName("role");
		member.setReferDirection(true);
		member.setRelationName("role");
		append(member);
		return member;
	}

	public Job job() {
		Job member = new Job();
		member.setModelTypeName("job");
		member.setName("job");
		member.setMemberName("job");
		member.setReferDirection(true);
		member.setRelationName("job");
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

	public ContractTemplate contractTemplateList() {
		ContractTemplate member = new ContractTemplate();
		member.setModelTypeName("contract_template");
		member.setName("submitter");
		member.setMemberName("contractTemplateList");
		member.setRelationName("submitter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("submitter");
		member.setMemberName("standardContractList");
		member.setRelationName("submitter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SupplementaryContract supplementaryContractList() {
		SupplementaryContract member = new SupplementaryContract();
		member.setModelTypeName("supplementary_contract");
		member.setName("submitter");
		member.setMemberName("supplementaryContractList");
		member.setRelationName("submitter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MerchantActiveNomination merchantActiveNominationList() {
		MerchantActiveNomination member = new MerchantActiveNomination();
		member.setModelTypeName("merchant_active_nomination");
		member.setName("nomination");
		member.setMemberName("merchantActiveNominationList");
		member.setRelationName("nomination");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("authenticator");
		member.setMemberName("licenseList");
		member.setRelationName("authenticator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectNomination projectNominationList() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("worker");
		member.setMemberName("projectNominationList");
		member.setRelationName("worker");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DailyTaskTemplate dailyTaskTemplateList() {
		DailyTaskTemplate member = new DailyTaskTemplate();
		member.setModelTypeName("daily_task_template");
		member.setName("creator");
		member.setMemberName("dailyTaskTemplateList");
		member.setRelationName("creator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectMaterial projectMaterialList() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("material_submitter");
		member.setMemberName("projectMaterialList");
		member.setRelationName("materialSubmitter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AfterSales afterSalesList() {
		AfterSales member = new AfterSales();
		member.setModelTypeName("after_sales");
		member.setName("creator");
		member.setMemberName("afterSalesList");
		member.setRelationName("creator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CompensationApplication compensationApplicationList() {
		CompensationApplication member = new CompensationApplication();
		member.setModelTypeName("compensation_application");
		member.setName("submitter");
		member.setMemberName("compensationApplicationList");
		member.setRelationName("submitter");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Recommendation recommendationList() {
		Recommendation member = new Recommendation();
		member.setModelTypeName("recommendation");
		member.setName("applicant_employee");
		member.setMemberName("recommendationList");
		member.setRelationName("applicantEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CustomerProjectApplication customerProjectApplicationList() {
		CustomerProjectApplication member = new CustomerProjectApplication();
		member.setModelTypeName("customer_project_application");
		member.setName("applicant_employee");
		member.setMemberName("customerProjectApplicationList");
		member.setRelationName("applicantEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PartnerSettlementApplication partnerSettlementApplicationList() {
		PartnerSettlementApplication member = new PartnerSettlementApplication();
		member.setModelTypeName("partner_settlement_application");
		member.setName("applicant_employee");
		member.setMemberName("partnerSettlementApplicationList");
		member.setRelationName("applicantEmployee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectWorkPosition eventProjectWorkPositionList() {
		EventProjectWorkPosition member = new EventProjectWorkPosition();
		member.setModelTypeName("event_project_work_position");
		member.setName("employee");
		member.setMemberName("eventProjectWorkPositionList");
		member.setRelationName("employee");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectPenalties eventProjectPenaltiesList() {
		EventProjectPenalties member = new EventProjectPenalties();
		member.setModelTypeName("event_project_penalties");
		member.setName("penalties_executor");
		member.setMemberName("eventProjectPenaltiesList");
		member.setRelationName("penaltiesExecutor");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Process processList() {
		Process member = new Process();
		member.setModelTypeName("process");
		member.setName("creator");
		member.setMemberName("processList");
		member.setRelationName("creator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public TodoList todoListList() {
		TodoList member = new TodoList();
		member.setModelTypeName("todo_list");
		member.setName("creator");
		member.setMemberName("todoListList");
		member.setRelationName("creator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessApplication processApplicationList() {
		ProcessApplication member = new ProcessApplication();
		member.setModelTypeName("process_application");
		member.setName("creator");
		member.setMemberName("processApplicationList");
		member.setRelationName("creator");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StaffFiles staffFilesList() {
		StaffFiles member = new StaffFiles();
		member.setModelTypeName("staff_files");
		member.setName("employment");
		member.setMemberName("staffFilesList");
		member.setRelationName("employment");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EmployeeRelation employeeRelationList() {
		EmployeeRelation member = new EmployeeRelation();
		member.setModelTypeName("employee_relation");
		member.setName("employment");
		member.setMemberName("employeeRelationList");
		member.setRelationName("employment");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EconomicVerificationForm economicVerificationFormList() {
		EconomicVerificationForm member = new EconomicVerificationForm();
		member.setModelTypeName("economic_verification_form");
		member.setName("responsible_employee");
		member.setMemberName("economicVerificationFormList");
		member.setRelationName("responsibleEmployee");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("description");
		member.setName("description");
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

