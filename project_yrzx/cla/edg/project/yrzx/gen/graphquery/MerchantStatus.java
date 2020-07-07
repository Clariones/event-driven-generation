package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.merchantstatus.MerchantStatus";
  }
  // 枚举对象
  public static EnumAttribute OPENNING =
      new EnumAttribute("com.yrdec.yrzx.merchantstatus.MerchantStatus", "OPENNING");
  public static EnumAttribute STOPPED =
      new EnumAttribute("com.yrdec.yrzx.merchantstatus.MerchantStatus", "STOPPED");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.yrdec.yrzx.merchantstatus.MerchantStatus", "CANCELLED");

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

  public Merchant merchantList() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant_status");
    member.setMemberName("merchantList");
    member.setRelationName("merchantStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventCreateMerchant eventCreateMerchantList() {
    EventCreateMerchant member = new EventCreateMerchant();
    member.setModelTypeName("event_create_merchant");
    member.setName("status");
    member.setMemberName("eventCreateMerchantList");
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
