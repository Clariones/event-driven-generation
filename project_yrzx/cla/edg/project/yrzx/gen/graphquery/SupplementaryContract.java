package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SupplementaryContract extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.supplementarycontract.SupplementaryContract";
  }
  // 枚举对象

  // 引用的对象

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

  public SupplementaryContractType type() {
    SupplementaryContractType member = new SupplementaryContractType();
    member.setModelTypeName("supplementary_contract_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
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

  public AuditStatus auditStatus() {
    AuditStatus member = new AuditStatus();
    member.setModelTypeName("audit_status");
    member.setName("audit_status");
    member.setMemberName("auditStatus");
    member.setReferDirection(true);
    member.setRelationName("auditStatus");
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

  public SupplementaryContractPayItem supplementaryContractPayItemList() {
    SupplementaryContractPayItem member = new SupplementaryContractPayItem();
    member.setModelTypeName("supplementary_contract_pay_item");
    member.setName("supplementary_contract");
    member.setMemberName("supplementaryContractPayItemList");
    member.setRelationName("supplementaryContract");
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

  public StringAttribute contractNumber() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contractNumber");
    member.setName("contract_number");
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

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public StringAttribute images() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("images");
    member.setName("images");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
