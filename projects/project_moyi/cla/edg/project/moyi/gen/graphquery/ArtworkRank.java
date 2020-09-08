package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkRank extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkrank.ArtworkRank";
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

  public NumberAttribute rankPoint() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rankPoint");
    member.setName("rank_point");
    useMember(member);
    return member;
  }

  public NumberAttribute bonusPoint() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("bonusPoint");
    member.setName("bonus_point");
    useMember(member);
    return member;
  }

  public NumberAttribute artworkLikedCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("artworkLikedCount");
    member.setName("artwork_liked_count");
    useMember(member);
    return member;
  }

  public NumberAttribute artworkFansCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("artworkFansCount");
    member.setName("artwork_fans_count");
    useMember(member);
    return member;
  }

  public NumberAttribute artworkReviewCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("artworkReviewCount");
    member.setName("artwork_review_count");
    useMember(member);
    return member;
  }

  public NumberAttribute artworkViewedCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("artworkViewedCount");
    member.setName("artwork_viewed_count");
    useMember(member);
    return member;
  }

  public NumberAttribute artworkInkValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("artworkInkValue");
    member.setName("artwork_ink_value");
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
