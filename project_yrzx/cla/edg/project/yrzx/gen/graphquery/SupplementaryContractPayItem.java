package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SupplementaryContractPayItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.supplementarycontractpayitem.SupplementaryContractPayItem";
  }
  // 枚举对象

  // 引用的对象

  public SupplementaryContract contract() {
    SupplementaryContract member = new SupplementaryContract();
    member.setModelTypeName("supplementary_contract");
    member.setName("contract");
    member.setMemberName("contract");
    member.setReferDirection(true);
    member.setRelationName("contract");
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

  public NumberAttribute payAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("payAmount");
    member.setName("pay_amount");
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
