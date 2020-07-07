package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TradeRelatedConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.traderelatedconfiguration.TradeRelatedConfiguration";
  }
  // 枚举对象
  public static EnumAttribute INK_DEED_LOCK_TIME =
      new EnumAttribute(
          "com.terapico.moyi.traderelatedconfiguration.TradeRelatedConfiguration",
          "INK_DEED_LOCK_TIME");
  public static EnumAttribute AUCTION_ORDER_ACCOUNT_PERIOD =
      new EnumAttribute(
          "com.terapico.moyi.traderelatedconfiguration.TradeRelatedConfiguration",
          "AUCTION_ORDER_ACCOUNT_PERIOD");
  public static EnumAttribute AUCTION_START_PREROLL =
      new EnumAttribute(
          "com.terapico.moyi.traderelatedconfiguration.TradeRelatedConfiguration",
          "AUCTION_START_PREROLL");
  public static EnumAttribute BIDDING_DEPOSIT =
      new EnumAttribute(
          "com.terapico.moyi.traderelatedconfiguration.TradeRelatedConfiguration",
          "BIDDING_DEPOSIT");

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

  public StringAttribute unitName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("unitName");
    member.setName("unit_name");
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

  public NumberAttribute value() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("value");
    member.setName("value");
    useMember(member);
    return member;
  }

  public NumberAttribute minValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("minValue");
    member.setName("min_value");
    useMember(member);
    return member;
  }

  public NumberAttribute maxValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("maxValue");
    member.setName("max_value");
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
