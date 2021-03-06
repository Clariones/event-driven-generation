package cla.edg.project.yrcms.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Section extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrcms.section.Section";
  }
  // 枚举对象

  // 引用的对象

  public Page page() {
    Page member = new Page();
    member.setModelTypeName("page");
    member.setName("page");
    member.setMemberName("page");
    member.setReferDirection(true);
    member.setRelationName("page");
    append(member);
    return member;
  }

  public ArticleCategory articleCategory() {
    ArticleCategory member = new ArticleCategory();
    member.setModelTypeName("article_category");
    member.setName("article_category");
    member.setMemberName("articleCategory");
    member.setReferDirection(true);
    member.setRelationName("articleCategory");
    append(member);
    return member;
  }

  // 被引用的对象

  public PageArticle pageArticleList() {
    PageArticle member = new PageArticle();
    member.setModelTypeName("page_article");
    member.setName("section");
    member.setMemberName("pageArticleList");
    member.setRelationName("section");
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

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public NumberAttribute displayOrder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("displayOrder");
    member.setName("display_order");
    useMember(member);
    return member;
  }

  public StringAttribute viewGroup() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("viewGroup");
    member.setName("view_group");
    useMember(member);
    return member;
  }

  public StringAttribute linkToUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("linkToUrl");
    member.setName("link_to_url");
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
