package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class BonusType extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.bonustype.BonusType";
  }
  // 枚举对象

  // 引用的对象

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

  public ArticleBonus articleBonusList() {
    ArticleBonus member = new ArticleBonus();
    member.setModelTypeName("article_bonus");
    member.setName("bonus_type");
    member.setMemberName("articleBonusList");
    member.setRelationName("bonusType");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public NumberAttribute bonusMaxValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("bonusMaxValue");
    member.setName("bonus_max_value");
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
