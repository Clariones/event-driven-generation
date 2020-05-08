package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class StandardContract extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.standardcontract.StandardContract";
	}
	// 枚举对象

	// 引用的对象

	public Merchant partyA() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("party_a");
		member.setMemberName("partyA");
		member.setReferDirection(true);
		member.setRelationName("partyA");
		append(member);
		return member;
	}

	public Merchant partyB() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("party_b");
		member.setMemberName("partyB");
		member.setReferDirection(true);
		member.setRelationName("partyB");
		append(member);
		return member;
	}

	public ContractStatus contractStatus() {
		ContractStatus member = new ContractStatus();
		member.setModelTypeName("contract_status");
		member.setName("contract_status");
		member.setMemberName("contractStatus");
		member.setReferDirection(true);
		member.setRelationName("contractStatus");
		append(member);
		return member;
	}

	public ContractType contractType() {
		ContractType member = new ContractType();
		member.setModelTypeName("contract_type");
		member.setName("contract_type");
		member.setMemberName("contractType");
		member.setReferDirection(true);
		member.setRelationName("contractType");
		append(member);
		return member;
	}

	public ContractTemplate contractTemplate() {
		ContractTemplate member = new ContractTemplate();
		member.setModelTypeName("contract_template");
		member.setName("contract_template");
		member.setMemberName("contractTemplate");
		member.setReferDirection(true);
		member.setRelationName("contractTemplate");
		append(member);
		return member;
	}

	public EmployeeNomination submitter() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("submitter");
		member.setMemberName("submitter");
		member.setReferDirection(true);
		member.setRelationName("submitter");
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		member.setRelationName("project");
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		member.setRelationName("workPackage");
		append(member);
		return member;
	}

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
		member.setReferDirection(true);
		member.setRelationName("task");
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

	public ContractPayItem contractPayItemList() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("contract");
		member.setMemberName("contractPayItemList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public CommissionPayItem commissionPayItemList() {
		CommissionPayItem member = new CommissionPayItem();
		member.setModelTypeName("commission_pay_item");
		member.setName("contract");
		member.setMemberName("commissionPayItemList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReviewRecord contractReviewRecordList() {
		ContractReviewRecord member = new ContractReviewRecord();
		member.setModelTypeName("contract_review_record");
		member.setName("contract");
		member.setMemberName("contractReviewRecordList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractCommentsRecord contractCommentsRecordList() {
		ContractCommentsRecord member = new ContractCommentsRecord();
		member.setModelTypeName("contract_comments_record");
		member.setName("contract");
		member.setMemberName("contractCommentsRecordList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractViewRecord contractViewRecordList() {
		ContractViewRecord member = new ContractViewRecord();
		member.setModelTypeName("contract_view_record");
		member.setName("contract");
		member.setMemberName("contractViewRecordList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractOperationLog contractOperationLogList() {
		ContractOperationLog member = new ContractOperationLog();
		member.setModelTypeName("contract_operation_log");
		member.setName("contract");
		member.setMemberName("contractOperationLogList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProjectPenalties projectPenaltiesList() {
		ProjectPenalties member = new ProjectPenalties();
		member.setModelTypeName("project_penalties");
		member.setName("contract");
		member.setMemberName("projectPenaltiesList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborWageManagementSheet laborWageManagementSheetList() {
		LaborWageManagementSheet member = new LaborWageManagementSheet();
		member.setModelTypeName("labor_wage_management_sheet");
		member.setName("contract");
		member.setMemberName("laborWageManagementSheetList");
		member.setRelationName("contract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectPenalties eventProjectPenaltiesList() {
		EventProjectPenalties member = new EventProjectPenalties();
		member.setModelTypeName("event_project_penalties");
		member.setName("work_package_contract");
		member.setMemberName("eventProjectPenaltiesList");
		member.setRelationName("workPackageContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerListAsProjectParticipatorContract() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("project_participator_contract");
		member.setMemberName("contractLedgerListAsProjectParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerListAsProjectRunningContract() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("project_running_contract");
		member.setMemberName("contractLedgerListAsProjectRunningContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerListAsWorkPackageParticipatorContract() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("work_package_participator_contract");
		member.setMemberName("contractLedgerListAsWorkPackageParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractRisk contractRiskListAsProjectParticipatorContract() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("project_participator_contract");
		member.setMemberName("contractRiskListAsProjectParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractRisk contractRiskListAsProjectRunningContract() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("project_running_contract");
		member.setMemberName("contractRiskListAsProjectRunningContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractRisk contractRiskListAsWorkPackageParticipatorContract() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("work_package_participator_contract");
		member.setMemberName("contractRiskListAsWorkPackageParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReport contractReportListAsProjectParticipatorContract() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("project_participator_contract");
		member.setMemberName("contractReportListAsProjectParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReport contractReportListAsProjectRunningContract() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("project_running_contract");
		member.setMemberName("contractReportListAsProjectRunningContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReport contractReportListAsWorkPackageParticipatorContract() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("work_package_participator_contract");
		member.setMemberName("contractReportListAsWorkPackageParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatisticReport contractStatisticReportListAsProjectParticipatorContract() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("project_participator_contract");
		member.setMemberName("contractStatisticReportListAsProjectParticipatorContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatisticReport contractStatisticReportListAsProjectRunningContract() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("project_running_contract");
		member.setMemberName("contractStatisticReportListAsProjectRunningContract");
		member.setRelationName("projectParticipatorContract");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatisticReport contractStatisticReportListAsWorkPackageParticipatorContract() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("work_package_participator_contract");
		member.setMemberName("contractStatisticReportListAsWorkPackageParticipatorContract");
		member.setRelationName("projectParticipatorContract");
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

	public StringAttribute contractNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("contractNumber");
		member.setName("contract_number");
		useMember(member);
		return member;
	}

	public StringAttribute contract(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		// member.setName("contract");
		member.setName("contract");
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

	public StringAttribute contractSummary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("contractSummary");
		member.setName("contract_summary");
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

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("amount");
		member.setName("amount");
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

