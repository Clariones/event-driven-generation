package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedOrder extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.inkdeedorder.InkDeedOrder";
  }
  // 枚举对象

  // 引用的对象

  public InkDeedEntryOrder inkDeedEntryOrder() {
    InkDeedEntryOrder member = new InkDeedEntryOrder();
    member.setModelTypeName("ink_deed_entry_order");
    member.setName("ink_deed_entry_order");
    member.setMemberName("inkDeedEntryOrder");
    member.setReferDirection(true);
    member.setRelationName("inkDeedEntryOrder");
    append(member);
    return member;
  }

  public ArtworkAuction auction() {
    ArtworkAuction member = new ArtworkAuction();
    member.setModelTypeName("artwork_auction");
    member.setName("auction");
    member.setMemberName("auction");
    member.setReferDirection(true);
    member.setRelationName("auction");
    append(member);
    return member;
  }

  public MoyiUser buyer() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("buyer");
    member.setMemberName("buyer");
    member.setReferDirection(true);
    member.setRelationName("buyer");
    append(member);
    return member;
  }

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

  public InkDeedOrderLineItem inkDeedOrderLineItemList() {
    InkDeedOrderLineItem member = new InkDeedOrderLineItem();
    member.setModelTypeName("ink_deed_order_line_item");
    member.setName("ink_deed_order");
    member.setMemberName("inkDeedOrderLineItemList");
    member.setRelationName("inkDeedOrder");
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

  public StringAttribute summary() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("summary");
    member.setName("summary");
    useMember(member);
    return member;
  }

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute unitPrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("unitPrice");
    member.setName("unit_price");
    useMember(member);
    return member;
  }

  public NumberAttribute originalPrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("originalPrice");
    member.setName("original_price");
    useMember(member);
    return member;
  }

  public NumberAttribute finalPrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("finalPrice");
    member.setName("final_price");
    useMember(member);
    return member;
  }

  public StringAttribute buyerHashcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("buyerHashcode");
    member.setName("buyer_hashcode");
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
