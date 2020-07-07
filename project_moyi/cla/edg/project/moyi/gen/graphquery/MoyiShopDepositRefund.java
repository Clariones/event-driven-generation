package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiShopDepositRefund extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.moyishopdepositrefund.MoyiShopDepositRefund";
  }
  // 枚举对象

  // 引用的对象

  public OrderStatus orderStatus() {
    OrderStatus member = new OrderStatus();
    member.setModelTypeName("order_status");
    member.setName("order_status");
    member.setMemberName("orderStatus");
    member.setReferDirection(true);
    member.setRelationName("orderStatus");
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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
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
