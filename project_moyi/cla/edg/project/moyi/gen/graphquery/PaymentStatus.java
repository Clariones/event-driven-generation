package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.paymentstatus.PaymentStatus";
  }
  // 枚举对象
  public static EnumAttribute NEED_PAY =
      new EnumAttribute("com.terapico.moyi.paymentstatus.PaymentStatus", "NEED_PAY");
  public static EnumAttribute PROCESSING =
      new EnumAttribute("com.terapico.moyi.paymentstatus.PaymentStatus", "PROCESSING");
  public static EnumAttribute PAID =
      new EnumAttribute("com.terapico.moyi.paymentstatus.PaymentStatus", "PAID");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.terapico.moyi.paymentstatus.PaymentStatus", "CANCELLED");

  // 引用的对象

  public Moyi moyi() {
    Moyi member = new Moyi();
    member.setModelTypeName("moyi");
    member.setName("moyi");
    member.setMemberName("moyi");
    member.setReferDirection(true);
    member.setRelationName("moyi");
    append(member);
    return member;
  }

  // 被引用的对象

  public PaymentDetail paymentDetailList() {
    PaymentDetail member = new PaymentDetail();
    member.setModelTypeName("payment_detail");
    member.setName("payment_status");
    member.setMemberName("paymentDetailList");
    member.setRelationName("paymentStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public PaymentLineItem paymentLineItemList() {
    PaymentLineItem member = new PaymentLineItem();
    member.setModelTypeName("payment_line_item");
    member.setName("payment_status");
    member.setMemberName("paymentLineItemList");
    member.setRelationName("paymentStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ShopOpeningRewardRecord shopOpeningRewardRecordList() {
    ShopOpeningRewardRecord member = new ShopOpeningRewardRecord();
    member.setModelTypeName("shop_opening_reward_record");
    member.setName("status");
    member.setMemberName("shopOpeningRewardRecordList");
    member.setRelationName("status");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
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
