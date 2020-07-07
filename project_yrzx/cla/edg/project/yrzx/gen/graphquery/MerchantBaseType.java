package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantBaseType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.merchantbasetype.MerchantBaseType";
  }
  // 枚举对象
  public static EnumAttribute PLATFORM_CIVIL_CENTER =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PLATFORM_CIVIL_CENTER");
  public static EnumAttribute PLATFORM_PROVINCE_CENTER =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PLATFORM_PROVINCE_CENTER");
  public static EnumAttribute PLATFORM_CITY_CENTER =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PLATFORM_CITY_CENTER");
  public static EnumAttribute PLATFORM_DISTRICT_CENTER =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PLATFORM_DISTRICT_CENTER");
  public static EnumAttribute PROPRIETOR =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PROPRIETOR");
  public static EnumAttribute VENDOR_CONSTRUCTION =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "VENDOR_CONSTRUCTION");
  public static EnumAttribute VENDOR_DESIGNER =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "VENDOR_DESIGNER");
  public static EnumAttribute PARTNER_UP_ORG =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PARTNER_UP_ORG");
  public static EnumAttribute PARTNER_DOWN_ORG =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PARTNER_DOWN_ORG");
  public static EnumAttribute MANAGEMENT_SUPERVISOR =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MANAGEMENT_SUPERVISOR");
  public static EnumAttribute MANAGEMENT_MANAGER =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MANAGEMENT_MANAGER");
  public static EnumAttribute MANAGEMENT_SURVEYOR =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MANAGEMENT_SURVEYOR");
  public static EnumAttribute MANAGEMENT_AUDITOR =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MANAGEMENT_AUDITOR");
  public static EnumAttribute MONITOR_QUALITY =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MONITOR_QUALITY");
  public static EnumAttribute MONITOR_CONSTRUCTION =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MONITOR_CONSTRUCTION");
  public static EnumAttribute MONITOR_PLANNING =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "MONITOR_PLANNING");
  public static EnumAttribute COMMERCE_ASSOCIATION =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "COMMERCE_ASSOCIATION");
  public static EnumAttribute PERSONAL_SENIOR_MANAGER =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PERSONAL_SENIOR_MANAGER");
  public static EnumAttribute PERSONAL_TECH_MANAGER =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PERSONAL_TECH_MANAGER");
  public static EnumAttribute PERSONAL_ENTERPRISE_MANAGER =
      new EnumAttribute(
          "com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PERSONAL_ENTERPRISE_MANAGER");
  public static EnumAttribute PERSONAL_EMPLOYEE =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PERSONAL_EMPLOYEE");
  public static EnumAttribute PERSONAL_ENGINEER =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PERSONAL_ENGINEER");
  public static EnumAttribute PERSONAL_MECHANIC =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "PERSONAL_MECHANIC");
  public static EnumAttribute OTHER =
      new EnumAttribute("com.yrdec.yrzx.merchantbasetype.MerchantBaseType", "OTHER");

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
    member.setName("merchant_base_type");
    member.setMemberName("merchantList");
    member.setRelationName("merchantBaseType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventCreateMerchant eventCreateMerchantList() {
    EventCreateMerchant member = new EventCreateMerchant();
    member.setModelTypeName("event_create_merchant");
    member.setName("base_type");
    member.setMemberName("eventCreateMerchantList");
    member.setRelationName("baseType");
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

  public StringAttribute category() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("category");
    member.setName("category");
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
