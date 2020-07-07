package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SupplementaryContractPayItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.supplementarycontractpayitem.SupplementaryContractPayItem";
  }
  // 枚举对象

  // 引用的对象

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

  public SupplementaryContract supplementaryContract() {
    SupplementaryContract member = new SupplementaryContract();
    member.setModelTypeName("supplementary_contract");
    member.setName("supplementary_contract");
    member.setMemberName("supplementaryContract");
    member.setReferDirection(true);
    member.setRelationName("supplementaryContract");
    append(member);
    return member;
  }

  public Merchant payer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("payer");
    member.setMemberName("payer");
    member.setReferDirection(true);
    member.setRelationName("payer");
    append(member);
    return member;
  }

  public Merchant payee() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("payee");
    member.setMemberName("payee");
    member.setReferDirection(true);
    member.setRelationName("payee");
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

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public NumberAttribute ajustment() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("ajustment");
    member.setName("ajustment");
    useMember(member);
    return member;
  }

  public StringAttribute payCriteira() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("payCriteira");
    member.setName("pay_criteira");
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
