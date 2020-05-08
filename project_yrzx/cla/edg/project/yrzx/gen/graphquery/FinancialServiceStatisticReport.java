package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FinancialServiceStatisticReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.financialservicestatisticreport.FinancialServiceStatisticReport";
	}
	// 枚举对象

	// 引用的对象

	public LoanFund loanFund() {
		LoanFund member = new LoanFund();
		member.setModelTypeName("loan_fund");
		member.setName("loan_fund");
		member.setMemberName("loanFund");
		member.setReferDirection(true);
		member.setRelationName("loanFund");
		append(member);
		return member;
	}

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

	public LoanContract loanContract() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("loan_contract");
		member.setMemberName("loanContract");
		member.setReferDirection(true);
		member.setRelationName("loanContract");
		append(member);
		return member;
	}

	public Merchant owner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
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

	public StringAttribute reportLinkUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("reportLinkUrl");
		member.setName("report_link_url");
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

