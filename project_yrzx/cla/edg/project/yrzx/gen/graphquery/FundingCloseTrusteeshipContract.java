package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FundingCloseTrusteeshipContract extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.fundingclosetrusteeshipcontract.FundingCloseTrusteeshipContract";
  }
  // 枚举对象

  // 引用的对象

  public ContractTemplateFile contractTemplateFile() {
    ContractTemplateFile member = new ContractTemplateFile();
    member.setModelTypeName("contract_template_file");
    member.setName("contract_template_file");
    member.setMemberName("contractTemplateFile");
    member.setReferDirection(true);
    member.setRelationName("contractTemplateFile");
    append(member);
    return member;
  }

  public Merchant fundingVendor() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("funding_vendor");
    member.setMemberName("fundingVendor");
    member.setReferDirection(true);
    member.setRelationName("fundingVendor");
    append(member);
    return member;
  }

  public Merchant fundingConsumer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("funding_consumer");
    member.setMemberName("fundingConsumer");
    member.setReferDirection(true);
    member.setRelationName("fundingConsumer");
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

  public StringAttribute contractFile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("contractFile");
    member.setName("contract_file");
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
