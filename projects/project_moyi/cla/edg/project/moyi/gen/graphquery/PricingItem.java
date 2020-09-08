package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PricingItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.pricingitem.PricingItem";
  }
  // 枚举对象

  // 引用的对象

  public MainOrder mainOrder() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("main_order");
    member.setMemberName("mainOrder");
    member.setReferDirection(true);
    member.setRelationName("mainOrder");
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

  public StringAttribute summary() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("summary");
    member.setName("summary");
    useMember(member);
    return member;
  }

  public StringAttribute itemCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("itemCode");
    member.setName("item_code");
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

  public BooleanAttribute discount() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("discount");
    member.setName("discount");
    useMember(member);
    return member;
  }

  public StringAttribute currencyType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("currencyType");
    member.setName("currency_type");
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
