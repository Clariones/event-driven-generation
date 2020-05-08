package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contracttype.ContractType";
	}
	// 枚举对象

	// 引用的对象

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
		member.setName("template_type");
		member.setMemberName("contractTemplateList");
		member.setRelationName("templateType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("contract_type");
		member.setMemberName("standardContractList");
		member.setRelationName("contractType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractLedger contractLedgerList() {
		ContractLedger member = new ContractLedger();
		member.setModelTypeName("contract_ledger");
		member.setName("contract_type");
		member.setMemberName("contractLedgerList");
		member.setRelationName("contractType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractRisk contractRiskList() {
		ContractRisk member = new ContractRisk();
		member.setModelTypeName("contract_risk");
		member.setName("contract_type");
		member.setMemberName("contractRiskList");
		member.setRelationName("contractType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractReport contractReportList() {
		ContractReport member = new ContractReport();
		member.setModelTypeName("contract_report");
		member.setName("contract_type");
		member.setMemberName("contractReportList");
		member.setRelationName("contractType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractStatisticReport contractStatisticReportList() {
		ContractStatisticReport member = new ContractStatisticReport();
		member.setModelTypeName("contract_statistic_report");
		member.setName("contract_type");
		member.setMemberName("contractStatisticReportList");
		member.setRelationName("contractType");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute category(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("category");
		member.setName("category");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("icon");
		member.setName("icon");
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

