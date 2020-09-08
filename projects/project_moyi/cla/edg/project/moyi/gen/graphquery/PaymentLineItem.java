package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PaymentLineItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.paymentlineitem.PaymentLineItem";
  }
  // 枚举对象

  // 引用的对象

  public PaymentDetail paymentDetail() {
    PaymentDetail member = new PaymentDetail();
    member.setModelTypeName("payment_detail");
    member.setName("payment_detail");
    member.setMemberName("paymentDetail");
    member.setReferDirection(true);
    member.setRelationName("paymentDetail");
    append(member);
    return member;
  }

  public PaymentMethod paymentMethod() {
    PaymentMethod member = new PaymentMethod();
    member.setModelTypeName("payment_method");
    member.setName("payment_method");
    member.setMemberName("paymentMethod");
    member.setReferDirection(true);
    member.setRelationName("paymentMethod");
    append(member);
    return member;
  }

  public PaymentStatus paymentStatus() {
    PaymentStatus member = new PaymentStatus();
    member.setModelTypeName("payment_status");
    member.setName("payment_status");
    member.setMemberName("paymentStatus");
    member.setReferDirection(true);
    member.setRelationName("paymentStatus");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("amount");
    member.setName("amount");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
