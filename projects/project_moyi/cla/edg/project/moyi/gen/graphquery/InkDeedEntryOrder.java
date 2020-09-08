package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedEntryOrder extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.inkdeedentryorder.InkDeedEntryOrder";
  }
  // 枚举对象

  // 引用的对象

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

  public ArtworkAuction artworkAuction() {
    ArtworkAuction member = new ArtworkAuction();
    member.setModelTypeName("artwork_auction");
    member.setName("artwork_auction");
    member.setMemberName("artworkAuction");
    member.setReferDirection(true);
    member.setRelationName("artworkAuction");
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

  public InkDeed inkDeedList() {
    InkDeed member = new InkDeed();
    member.setModelTypeName("ink_deed");
    member.setName("entry_order");
    member.setMemberName("inkDeedList");
    member.setRelationName("entryOrder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public InkDeedOrder inkDeedOrderList() {
    InkDeedOrder member = new InkDeedOrder();
    member.setModelTypeName("ink_deed_order");
    member.setName("ink_deed_entry_order");
    member.setMemberName("inkDeedOrderList");
    member.setRelationName("inkDeedEntryOrder");
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

  public NumberAttribute totalQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("totalQuantity");
    member.setName("total_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute soldQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("soldQuantity");
    member.setName("sold_quantity");
    useMember(member);
    return member;
  }

  public StringAttribute sellerHashcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sellerHashcode");
    member.setName("seller_hashcode");
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

  public StringAttribute inkDeedSet() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("inkDeedSet");
    member.setName("ink_deed_set");
    useMember(member);
    return member;
  }

  public StringAttribute lockByOrder() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("lockByOrder");
    member.setName("lock_by_order");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lockTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("lockTime");
    member.setName("lock_time");
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
