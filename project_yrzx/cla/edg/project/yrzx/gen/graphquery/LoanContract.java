package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LoanContract extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.loancontract.LoanContract";
	}
	// 枚举对象

	// 引用的对象

	public LoanApplication loanApplication() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("loan_application");
		member.setMemberName("loanApplication");
		member.setReferDirection(true);
		member.setRelationName("loanApplication");
		append(member);
		return member;
	}

	public Merchant borrower() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("borrower");
		member.setMemberName("borrower");
		member.setReferDirection(true);
		member.setRelationName("borrower");
		append(member);
		return member;
	}

	public Merchant lender() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("lender");
		member.setMemberName("lender");
		member.setReferDirection(true);
		member.setRelationName("lender");
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

	public LoanContractStatus status() {
		LoanContractStatus member = new LoanContractStatus();
		member.setModelTypeName("loan_contract_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

	// 被引用的对象

	public FinancialServiceStatisticReport financialServiceStatisticReportList() {
		FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
		member.setModelTypeName("financial_service_statistic_report");
		member.setName("loan_contract");
		member.setMemberName("financialServiceStatisticReportList");
		member.setRelationName("loanContract");
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

	public NumberAttribute loanAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("loanAmount");
		member.setName("loan_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute loanTerm(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("loanTerm");
		member.setName("loan_term");
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

