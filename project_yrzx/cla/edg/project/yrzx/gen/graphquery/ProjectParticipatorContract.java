package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectParticipatorContract extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectparticipatorcontract.ProjectParticipatorContract";
	}
	// 枚举对象

	// 引用的对象

	public Merchant merchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant");
		member.setMemberName("merchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MerchantWarehouse merchantWarehouse() {
		MerchantWarehouse member = new MerchantWarehouse();
		member.setModelTypeName("merchant_warehouse");
		member.setName("merchant_warehouse");
		member.setMemberName("merchantWarehouse");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ParticipatorType participatorType() {
		ParticipatorType member = new ParticipatorType();
		member.setModelTypeName("participator_type");
		member.setName("participator_type");
		member.setMemberName("participatorType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public FeeType feeType() {
		FeeType member = new FeeType();
		member.setModelTypeName("fee_type");
		member.setName("fee_type");
		member.setMemberName("feeType");
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
	
	public ContractLedger contractLedgerList() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("project_participator_contract");
		member.setMemberName("contractLedgerList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("project_participator_contract");
		member.setMemberName("contractRiskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("project_participator_contract");
		member.setMemberName("contractReportList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("project_participator_contract");
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

	public NumberAttribute profitSharingRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("profitSharingRatio");
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

