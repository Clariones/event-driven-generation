package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectRunningContract extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectrunningcontract.ProjectRunningContract";
	}
	// 枚举对象

	// 引用的对象

	public ProjectContractType contractType() {
		ProjectContractType member = new ProjectContractType();
		member.setModelTypeName("project_contract_type");
		member.setName("contract_type");
		member.setMemberName("contractType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectContractStatus contractStatus() {
		ProjectContractStatus member = new ProjectContractStatus();
		member.setModelTypeName("project_contract_status");
		member.setName("contract_status");
		member.setMemberName("contractStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant firstPartMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("first_part_merchant");
		member.setMemberName("firstPartMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant secondPartMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("second_part_merchant");
		member.setMemberName("secondPartMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectRunningContractConfirmRecord projectRunningContractConfirmRecordList() {
		ProjectRunningContractConfirmRecord member = new ProjectRunningContractConfirmRecord();
		member.setModelTypeName("project_running_contract_confirm_record");
		member.setName("contract");
		member.setMemberName("projectRunningContractConfirmRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractLedger contractLedgerList() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("project_running_contract");
		member.setMemberName("contractLedgerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("project_running_contract");
		member.setMemberName("contractRiskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("project_running_contract");
		member.setMemberName("contractReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("project_running_contract");
		member.setMemberName("contractStatisticReportList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public StringAttribute documentUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("documentUrl");
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

