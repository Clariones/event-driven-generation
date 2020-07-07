package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DiscountByVolumePromotion extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.discountbyvolumepromotion.DiscountByVolumePromotion";
  }
  // 枚举对象
  public static EnumAttribute SHOP_ANNUAL_FEE =
      new EnumAttribute(
          "com.terapico.moyi.discountbyvolumepromotion.DiscountByVolumePromotion",
          "SHOP_ANNUAL_FEE");

  // 引用的对象

  public PromotionConfiguration promotionConfiguration() {
    PromotionConfiguration member = new PromotionConfiguration();
    member.setModelTypeName("promotion_configuration");
    member.setName("promotion_configuration");
    member.setMemberName("promotionConfiguration");
    member.setReferDirection(true);
    member.setRelationName("promotionConfiguration");
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

  public NumberAttribute volumeOfTrade() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("volumeOfTrade");
    member.setName("volume_of_trade");
    useMember(member);
    return member;
  }

  public NumberAttribute promotionAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("promotionAmount");
    member.setName("promotion_amount");
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
