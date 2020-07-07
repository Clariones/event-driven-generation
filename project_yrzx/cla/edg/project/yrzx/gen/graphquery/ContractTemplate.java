package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractTemplate extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.contracttemplate.ContractTemplate";
  }
  // 枚举对象

  // 引用的对象

  public ContractType templateType() {
    ContractType member = new ContractType();
    member.setModelTypeName("contract_type");
    member.setName("template_type");
    member.setMemberName("templateType");
    member.setReferDirection(true);
    member.setRelationName("templateType");
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

  public StandardContract standardContractList() {
    StandardContract member = new StandardContract();
    member.setModelTypeName("standard_contract");
    member.setName("contract_template");
    member.setMemberName("standardContractList");
    member.setRelationName("contractTemplate");
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

  public StringAttribute template() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("template");
    member.setName("template");
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
