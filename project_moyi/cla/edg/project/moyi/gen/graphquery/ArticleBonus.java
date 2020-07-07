package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArticleBonus extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.articlebonus.ArticleBonus";
  }
  // 枚举对象

  // 引用的对象

  public Article article() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("article");
    member.setMemberName("article");
    member.setReferDirection(true);
    member.setRelationName("article");
    append(member);
    return member;
  }

  public MoyiUser moderator() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("moderator");
    member.setMemberName("moderator");
    member.setReferDirection(true);
    member.setRelationName("moderator");
    append(member);
    return member;
  }

  public BonusType bonusType() {
    BonusType member = new BonusType();
    member.setModelTypeName("bonus_type");
    member.setName("bonus_type");
    member.setMemberName("bonusType");
    member.setReferDirection(true);
    member.setRelationName("bonusType");
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

  public NumberAttribute bonusValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("bonusValue");
    member.setName("bonus_value");
    useMember(member);
    return member;
  }

  public StringAttribute bonusComment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("bonusComment");
    member.setName("bonus_comment");
    useMember(member);
    return member;
  }

  public DateTimeAttribute bonusDatetime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("bonusDatetime");
    member.setName("bonus_datetime");
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
