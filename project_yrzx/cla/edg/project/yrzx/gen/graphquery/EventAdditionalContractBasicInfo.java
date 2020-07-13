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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
