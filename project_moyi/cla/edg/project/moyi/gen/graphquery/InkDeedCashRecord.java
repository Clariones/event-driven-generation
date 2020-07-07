package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedCashRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.inkdeedcashrecord.InkDeedCashRecord";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute inkDeedSet() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("inkDeedSet");
    member.setName("ink_deed_set");
    useMember(member);
    return member;
  }

  public NumberAttribute totalInkDeedCopies() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("totalInkDeedCopies");
    member.setName("total_ink_deed_copies");
    useMember(member);
    return member;
  }

  public NumberAttribute holdingInkDeedCopies() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("holdingInkDeedCopies");
    member.setName("holding_ink_deed_copies");
    useMember(member);
    return member;
  }

  public NumberAttribute unitCashAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("unitCashAmount");
    member.setName("unit_cash_amount");
    useMember(member);
    return member;
  }

  public NumberAttribute cashedAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("cashedAmount");
    member.setName("cashed_amount");
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
