package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectProgress extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectprogress.ProjectProgress";
	}
	// 枚举对象

	// 引用的对象

	public ProjectProgressStatus status() {
		ProjectProgressStatus member = new ProjectProgressStatus();
		member.setModelTypeName("project_progress_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
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

	public ProjectPhase projectPhase() {
		ProjectPhase member = new ProjectPhase();
		member.setModelTypeName("project_phase");
		member.setName("project_phase");
		member.setMemberName("projectPhase");
		member.setReferDirection(true);
		member.setRelationName("projectPhase");
		append(member);
		return member;
	}

	// 被引用的对象

	public ContractPayItem contractPayItemList() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("project_progress");
		member.setMemberName("contractPayItemList");
		member.setRelationName("projectProgress");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LaborWageManagementSheet laborWageManagementSheetList() {
		LaborWageManagementSheet member = new LaborWageManagementSheet();
		member.setModelTypeName("labor_wage_management_sheet");
		member.setName("project_progress");
		member.setMemberName("laborWageManagementSheetList");
		member.setRelationName("projectProgress");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanContract loanContractList() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("project_progress");
		member.setMemberName("loanContractList");
		member.setRelationName("projectProgress");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MaterialRecord materialRecordList() {
		MaterialRecord member = new MaterialRecord();
		member.setModelTypeName("material_record");
		member.setName("planned_approach_phase");
		member.setMemberName("materialRecordList");
		member.setRelationName("plannedApproachPhase");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventContractPaymentPhase eventContractPaymentPhaseList() {
		EventContractPaymentPhase member = new EventContractPaymentPhase();
		member.setModelTypeName("event_contract_payment_phase");
		member.setName("project_progress");
		member.setMemberName("eventContractPaymentPhaseList");
		member.setRelationName("projectProgress");
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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("brief");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public DateTimeAttribute planStartDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("planStartDate");
		member.setName("plan_start_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute actualStartDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("actualStartDate");
		member.setName("actual_start_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute planFinishDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("planFinishDate");
		member.setName("plan_finish_date");
		useMember(member);
		return member;
	}

	public DateTimeAttribute actualFinishDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("actualFinishDate");
		member.setName("actual_finish_date");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

