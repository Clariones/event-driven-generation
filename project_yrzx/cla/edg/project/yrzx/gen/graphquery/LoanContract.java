package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LoanContract extends BaseModelBean {
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

  public Merchant borrowerUnit() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("borrower_unit");
    member.setMemberName("borrowerUnit");
    member.setReferDirection(true);
    member.setRelationName("borrowerUnit");
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

  public ProjectProgress projectProgress() {
    ProjectProgress member = new ProjectProgress();
    member.setModelTypeName("project_progress");
    member.setName("project_progress");
    member.setMemberName("projectProgress");
    member.setReferDirection(true);
    member.setRelationName("projectProgress");
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

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute loanUsage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("loanUsage");
    member.setName("loan_usage");
    useMember(member);
    return member;
  }

  public NumberAttribute loanAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("loanAmount");
    member.setName("loan_amount");
    useMember(member);
    return member;
  }

  public NumberAttribute interestRate() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("interestRate");
    member.setName("interest_rate");
    useMember(member);
    return member;
  }

  public NumberAttribute repaymentTerm() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("repaymentTerm");
    member.setName("repayment_term");
    useMember(member);
    return member;
  }

  public DateTimeAttribute applyTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("applyTime");
    member.setName("apply_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute expectedRepaymentTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("expectedRepaymentTime");
    member.setName("expected_repayment_time");
    useMember(member);
    return member;
  }

  public StringAttribute document() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("document");
    member.setName("document");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
