package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShopOpeningRewardRule extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.shopopeningrewardrule.ShopOpeningRewardRule";
  }
  // 枚举对象
  public static EnumAttribute OPENING_IB_REWARD =
      new EnumAttribute(
          "com.terapico.moyi.shopopeningrewardrule.ShopOpeningRewardRule", "OPENING_IB_REWARD");
  public static EnumAttribute SHOP_REFERRAL_OPENING_CASH_REWARD =
      new EnumAttribute(
          "com.terapico.moyi.shopopeningrewardrule.ShopOpeningRewardRule",
          "SHOP_REFERRAL_OPENING_CASH_REWARD");
  public static EnumAttribute RECOMMENDED =
      new EnumAttribute(
          "com.terapico.moyi.shopopeningrewardrule.ShopOpeningRewardRule", "RECOMMENDED");
  public static EnumAttribute REFERRAL_PROFIT_SHARE =
      new EnumAttribute(
          "com.terapico.moyi.shopopeningrewardrule.ShopOpeningRewardRule", "REFERRAL_PROFIT_SHARE");

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

  public NumberAttribute numericValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("numericValue");
    member.setName("numeric_value");
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
