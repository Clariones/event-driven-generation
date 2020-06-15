package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.paymentstatus.PaymentStatus";
  }
  // 枚举对象
  public static EnumAttribute UNPAID =
      new EnumAttribute("com.doublechaintech.optical.paymentstatus.PaymentStatus", "UNPAID");
  public static EnumAttribute PAYING =
      new EnumAttribute("com.doublechaintech.optical.paymentstatus.PaymentStatus", "PAYING");
  public static EnumAttribute PAID =
      new EnumAttribute("com.doublechaintech.optical.paymentstatus.PaymentStatus", "PAID");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.doublechaintech.optical.paymentstatus.PaymentStatus", "CANCELLED");
  public static EnumAttribute FAILED =
      new EnumAttribute("com.doublechaintech.optical.paymentstatus.PaymentStatus", "FAILED");

  // 引用的对象

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
