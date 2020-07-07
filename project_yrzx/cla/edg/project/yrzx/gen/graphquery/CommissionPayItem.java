package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CommissionPayItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.commissionpayitem.CommissionPayItem";
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

  public PayItemStatus payItemStatus() {
    PayItemStatus member = new PayItemStatus();
    member.setModelTypeName("pay_item_status");
    member.setName("pay_item_status");
    member.setMemberName("payItemStatus");
    member.setReferDirection(true);
    member.setRelationName("payItemStatus");
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

  public NumberAttribute payRate() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("payRate");
    member.setName("pay_rate");
    useMember(member);
    return member;
  }

  public NumberAttribute payAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("payAmount");
    member.setName("pay_amount");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
