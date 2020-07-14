package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HelpApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.helpapplication.HelpApplication";
  }
  // 枚举对象

  // 引用的对象

  public Project helpProject() {
    Project member = new Project();
    member.setModelTypeName("project");
    member.setName("help_project");
    member.setMemberName("helpProject");
    member.setReferDirection(true);
    member.setRelationName("helpProject");
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

  public ProjectNomination submitter() {
    ProjectNomination member = new ProjectNomination();
    member.setModelTypeName("project_nomination");
    member.setName("submitter");
    member.setMemberName("submitter");
    member.setReferDirection(true);
    member.setRelationName("submitter");
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

  public HelpApplicationBeneficiary helpApplicationBeneficiaryList() {
    HelpApplicationBeneficiary member = new HelpApplicationBeneficiary();
    member.setModelTypeName("help_application_beneficiary");
    member.setName("help_application");
    member.setMemberName("helpApplicationBeneficiaryList");
    member.setRelationName("helpApplication");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public HelpContract helpContractList() {
    HelpContract member = new HelpContract();
    member.setModelTypeName("help_contract");
    member.setName("help_application");
    member.setMemberName("helpContractList");
    member.setRelationName("helpApplication");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventSelectLoanApplication eventSelectLoanApplicationList() {
    EventSelectLoanApplication member = new EventSelectLoanApplication();
    member.setModelTypeName("event_select_loan_application");
    member.setName("loan_application");
    member.setMemberName("eventSelectLoanApplicationList");
    member.setRelationName("loanApplication");
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

  public NumberAttribute applicationAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("applicationAmount");
    member.setName("application_amount");
    useMember(member);
    return member;
  }

  public DateTimeAttribute applicationTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("applicationTime");
    member.setName("application_time");
    useMember(member);
    return member;
  }

  public StringAttribute helpReason() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("helpReason");
    member.setName("help_reason");
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

  public BooleanAttribute contractCreated() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("contractCreated");
    member.setName("contract_created");
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
