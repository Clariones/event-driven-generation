package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAdditionalContractBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventadditionalcontractbasicinfo.EventAdditionalContractBasicInfo";
  }
  // 枚举对象

  // 引用的对象

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

  public StandardContract contract() {
    StandardContract member = new StandardContract();
    member.setModelTypeName("standard_contract");
    member.setName("contract");
    member.setMemberName("contract");
    member.setReferDirection(true);
    member.setRelationName("contract");
    append(member);
    return member;
  }

  public ContractPayItem contractPayItem() {
    ContractPayItem member = new ContractPayItem();
    member.setModelTypeName("contract_pay_item");
    member.setName("contract_pay_item");
    member.setMemberName("contractPayItem");
    member.setReferDirection(true);
    member.setRelationName("contractPayItem");
    append(member);
    return member;
  }

  public SupplementaryContractType contractType() {
    SupplementaryContractType member = new SupplementaryContractType();
    member.setModelTypeName("supplementary_contract_type");
    member.setName("contract_type");
    member.setMemberName("contractType");
    member.setReferDirection(true);
    member.setRelationName("contractType");
    append(member);
    return member;
  }

  public ContractStatus status() {
    ContractStatus member = new ContractStatus();
    member.setModelTypeName("contract_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public EmployeeNomination submitter() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("submitter");
    member.setMemberName("submitter");
    member.setReferDirection(true);
    member.setRelationName("submitter");
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

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
    append(member);
    return member;
  }

  // 被引用的对象

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

  public StringAttribute number() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("number");
    member.setName("number");
    useMember(member);
    return member;
  }

  public StringAttribute summary() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("summary");
    member.setName("summary");
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

  public StringAttribute criteria() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("criteria");
    member.setName("criteria");
    useMember(member);
    return member;
  }

  public NumberAttribute subTotal() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("subTotal");
    member.setName("sub_total");
    useMember(member);
    return member;
  }

  public NumberAttribute laborFee() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("laborFee");
    member.setName("labor_fee");
    useMember(member);
    return member;
  }

  public NumberAttribute materialFee() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("materialFee");
    member.setName("material_fee");
    useMember(member);
    return member;
  }

  public NumberAttribute otherFee() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("otherFee");
    member.setName("other_fee");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comments");
    member.setName("comments");
    useMember(member);
    return member;
  }

  public DateTimeAttribute expectedPayTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("expectedPayTime");
    member.setName("expected_pay_time");
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
