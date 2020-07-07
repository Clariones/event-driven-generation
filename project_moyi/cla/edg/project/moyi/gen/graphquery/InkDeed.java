package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeed extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.inkdeed.InkDeed";
  }
  // 枚举对象

  // 引用的对象

  public InkDeedStatus status() {
    InkDeedStatus member = new InkDeedStatus();
    member.setModelTypeName("ink_deed_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
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

  public MoyiUser holder() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("holder");
    member.setMemberName("holder");
    member.setReferDirection(true);
    member.setRelationName("holder");
    append(member);
    return member;
  }

  public MoyiUser seller() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("seller");
    member.setMemberName("seller");
    member.setReferDirection(true);
    member.setRelationName("seller");
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

  public Artwork artwork() {
    Artwork member = new Artwork();
    member.setModelTypeName("artwork");
    member.setName("artwork");
    member.setMemberName("artwork");
    member.setReferDirection(true);
    member.setRelationName("artwork");
    append(member);
    return member;
  }

  public InkDeedEntryOrder entryOrder() {
    InkDeedEntryOrder member = new InkDeedEntryOrder();
    member.setModelTypeName("ink_deed_entry_order");
    member.setName("entry_order");
    member.setMemberName("entryOrder");
    member.setReferDirection(true);
    member.setRelationName("entryOrder");
    append(member);
    return member;
  }

  // 被引用的对象

  public InkDeedTradeRecord inkDeedTradeRecordList() {
    InkDeedTradeRecord member = new InkDeedTradeRecord();
    member.setModelTypeName("ink_deed_trade_record");
    member.setName("ink_deed");
    member.setMemberName("inkDeedTradeRecordList");
    member.setRelationName("inkDeed");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public InkDeedOrderLineItem inkDeedOrderLineItemList() {
    InkDeedOrderLineItem member = new InkDeedOrderLineItem();
    member.setModelTypeName("ink_deed_order_line_item");
    member.setName("ink_deed");
    member.setMemberName("inkDeedOrderLineItemList");
    member.setRelationName("inkDeed");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public NumberAttribute soledTimes() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("soledTimes");
    member.setName("soled_times");
    useMember(member);
    return member;
  }

  public NumberAttribute issuePrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("issuePrice");
    member.setName("issue_price");
    useMember(member);
    return member;
  }

  public NumberAttribute purchasePrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("purchasePrice");
    member.setName("purchase_price");
    useMember(member);
    return member;
  }

  public NumberAttribute cashValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("cashValue");
    member.setName("cash_value");
    useMember(member);
    return member;
  }

  public NumberAttribute usufructRatio() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("usufructRatio");
    member.setName("usufruct_ratio");
    useMember(member);
    return member;
  }

  public StringAttribute coverImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("coverImage");
    member.setName("cover_image");
    useMember(member);
    return member;
  }

  public StringAttribute author() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("author");
    member.setName("author");
    useMember(member);
    return member;
  }

  public BooleanAttribute cashed() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("cashed");
    member.setName("cashed");
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
