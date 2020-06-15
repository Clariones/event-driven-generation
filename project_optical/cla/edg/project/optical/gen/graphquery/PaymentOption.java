package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentOption extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.paymentoption.PaymentOption";
  }
  // 枚举对象
  public static EnumAttribute BALANCE =
      new EnumAttribute("com.doublechaintech.optical.paymentoption.PaymentOption", "BALANCE");
  public static EnumAttribute WECHAT_APP =
      new EnumAttribute("com.doublechaintech.optical.paymentoption.PaymentOption", "WECHAT_APP");
  public static EnumAttribute WECHAT_JSAPI =
      new EnumAttribute("com.doublechaintech.optical.paymentoption.PaymentOption", "WECHAT_JSAPI");
  public static EnumAttribute WECHAT_NATIVE =
      new EnumAttribute("com.doublechaintech.optical.paymentoption.PaymentOption", "WECHAT_NATIVE");
  public static EnumAttribute ALIPAY =
      new EnumAttribute("com.doublechaintech.optical.paymentoption.PaymentOption", "ALIPAY");
  public static EnumAttribute UNION_PAY =
      new EnumAttribute("com.doublechaintech.optical.paymentoption.PaymentOption", "UNION_PAY");

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
    member.setName("payment_option");
    member.setMemberName("paymentDetailList");
    member.setRelationName("paymentOption");
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
