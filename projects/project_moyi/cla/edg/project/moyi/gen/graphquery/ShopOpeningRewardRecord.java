package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShopOpeningRewardRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.shopopeningrewardrecord.ShopOpeningRewardRecord";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser beneficiary() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("beneficiary");
    member.setMemberName("beneficiary");
    member.setReferDirection(true);
    member.setRelationName("beneficiary");
    append(member);
    return member;
  }

  public MoyiShop moyiShop() {
    MoyiShop member = new MoyiShop();
    member.setModelTypeName("moyi_shop");
    member.setName("moyi_shop");
    member.setMemberName("moyiShop");
    member.setReferDirection(true);
    member.setRelationName("moyiShop");
    append(member);
    return member;
  }

  public PaymentStatus status() {
    PaymentStatus member = new PaymentStatus();
    member.setModelTypeName("payment_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public ShopOperating showIn() {
    ShopOperating member = new ShopOperating();
    member.setModelTypeName("shop_operating");
    member.setName("show_in");
    member.setMemberName("showIn");
    member.setReferDirection(true);
    member.setRelationName("showIn");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute rule() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("rule");
    member.setName("rule");
    useMember(member);
    return member;
  }

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public StringAttribute detail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("detail");
    member.setName("detail");
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

  public DateTimeAttribute paidTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("paidTime");
    member.setName("paid_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
