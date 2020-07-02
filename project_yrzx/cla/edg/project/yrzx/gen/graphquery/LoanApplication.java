package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LoanApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.loanapplication.LoanApplication";
	}
	// 枚举对象

	// 引用的对象

	public Project loanProject() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("loan_project");
		member.setMemberName("loanProject");
		member.setReferDirection(true);
		member.setRelationName("loanProject");
		append(member);
		return member;
	}

	public StandardContract pledgedContract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("pledged_contract");
		member.setMemberName("pledgedContract");
		member.setReferDirection(true);
		member.setRelationName("pledgedContract");
		append(member);
		return member;
	}

	public EmployeeNomination applicant() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("applicant");
		member.setMemberName("applicant");
		member.setReferDirection(true);
		member.setRelationName("applicant");
		append(member);
		return member;
	}

	public AuditStatus status() {
		AuditStatus member = new AuditStatus();
		member.setModelTypeName("audit_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
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

	public LoanContract loanContractList() {
		LoanContract member = new LoanContract();
		member.setModelTypeName("loan_contract");
		member.setName("loan_application");
		member.setMemberName("loanContractList");
		member.setRelationName("loanApplication");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public FinancialServiceStatisticReport financialServiceStatisticReportList() {
		FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
		member.setModelTypeName("financial_service_statistic_report");
		member.setName("loan_application");
		member.setMemberName("financialServiceStatisticReportList");
		member.setRelationName("loanApplication");
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

	public NumberAttribute applicationAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("applicationAmount");
		member.setName("application_amount");
		useMember(member);
		return member;
	}

	public DateTimeAttribute applicationTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("applicationTime");
		member.setName("application_time");
		useMember(member);
		return member;
	}

	public StringAttribute loanUsage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("loanUsage");
		member.setName("loan_usage");
		useMember(member);
		return member;
	}

	public DateTimeAttribute expectedRepaymentTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("expectedRepaymentTime");
		member.setName("expected_repayment_time");
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

