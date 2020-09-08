package cla.edg.project.yrcms.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArticleCategory extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrcms.articlecategory.ArticleCategory";
  }
  // 枚举对象

  // 引用的对象

  public MobileApp container() {
    MobileApp member = new MobileApp();
    member.setModelTypeName("mobile_app");
    member.setName("container");
    member.setMemberName("container");
    member.setReferDirection(true);
    member.setRelationName("container");
    append(member);
    return member;
  }

  // 被引用的对象

  public Section sectionList() {
    Section member = new Section();
    member.setModelTypeName("section");
    member.setName("article_category");
    member.setMemberName("sectionList");
    member.setRelationName("articleCategory");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Article articleList() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("category");
    member.setMemberName("articleList");
    member.setRelationName("category");
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

  public StringAttribute coverImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("coverImage");
    member.setName("cover_image");
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
