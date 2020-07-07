package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AdditionalPlatformConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration";
  }
  // 枚举对象
  public static EnumAttribute PRIVACY_DECLARATION_LINK =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "PRIVACY_DECLARATION_LINK");
  public static EnumAttribute TRADING_DECLARATION_LINK =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "TRADING_DECLARATION_LINK");
  public static EnumAttribute BUTTON_TITLE_V4HOMEPAGE_LEAD =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "BUTTON_TITLE_V4HOMEPAGE_LEAD");
  public static EnumAttribute MESSAGE_V4HOMEPAGE_LEAD =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "MESSAGE_V4HOMEPAGE_LEAD");
  public static EnumAttribute CONTACT_PHONE =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "CONTACT_PHONE");
  public static EnumAttribute CONTACT_EMAIL =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "CONTACT_EMAIL");
  public static EnumAttribute CONTACT_WECHAT =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "CONTACT_WECHAT");
  public static EnumAttribute MESSAGE_BUY_INKDEED_IN_PDP =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "MESSAGE_BUY_INKDEED_IN_PDP");
  public static EnumAttribute COLORS_FOR_SECTIONS =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "COLORS_FOR_SECTIONS");
  public static EnumAttribute TIPS_WHEN_OPEN_SHOP =
      new EnumAttribute(
          "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration",
          "TIPS_WHEN_OPEN_SHOP");

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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute value() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("value");
    member.setName("value");
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
