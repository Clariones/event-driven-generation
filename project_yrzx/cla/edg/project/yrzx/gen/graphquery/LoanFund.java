package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LoanFund extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.loanfund.LoanFund";
  }
  // 枚举对象

  // 引用的对象

  public Merchant fundVendor() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("fund_vendor");
    member.setMemberName("fundVendor");
    member.setReferDirection(true);
    member.setRelationName("fundVendor");
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

  // 被引用的对象

  public FinancialServiceStatisticReport financialServiceStatisticReportList() {
    FinancialServiceStatisticReport member = new FinancialServiceStatisticReport();
    member.setModelTypeName("financial_service_statistic_report");
    member.setName("loan_fund");
    member.setMemberName("financialServiceStatisticReportList");
    member.setRelationName("loanFund");
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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
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
