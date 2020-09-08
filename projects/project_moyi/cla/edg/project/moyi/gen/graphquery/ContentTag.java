package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContentTag extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.contenttag.ContentTag";
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

  public MoyiUser moyiUser() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("moyi_user");
    member.setMemberName("moyiUser");
    member.setReferDirection(true);
    member.setRelationName("moyiUser");
    append(member);
    return member;
  }

  public Section section() {
    Section member = new Section();
    member.setModelTypeName("section");
    member.setName("section");
    member.setMemberName("section");
    member.setReferDirection(true);
    member.setRelationName("section");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
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
