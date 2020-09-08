package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TipArticle extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.tiparticle.TipArticle";
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

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("comments");
    member.setName("comments");
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
