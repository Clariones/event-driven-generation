package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SpamReport extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.spamreport.SpamReport";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser reportUser() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("report_user");
    member.setMemberName("reportUser");
    member.setReferDirection(true);
    member.setRelationName("reportUser");
    append(member);
    return member;
  }

  public Article spamArticle() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("spam_article");
    member.setMemberName("spamArticle");
    member.setReferDirection(true);
    member.setRelationName("spamArticle");
    append(member);
    return member;
  }

  public Review spamReview() {
    Review member = new Review();
    member.setModelTypeName("review");
    member.setName("spam_review");
    member.setMemberName("spamReview");
    member.setReferDirection(true);
    member.setRelationName("spamReview");
    append(member);
    return member;
  }

  public Artwork spamArtwork() {
    Artwork member = new Artwork();
    member.setModelTypeName("artwork");
    member.setName("spam_artwork");
    member.setMemberName("spamArtwork");
    member.setReferDirection(true);
    member.setRelationName("spamArtwork");
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

  public StringAttribute spamDescription() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("spamDescription");
    member.setName("spam_description");
    useMember(member);
    return member;
  }

  public DateTimeAttribute reportDatetime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("reportDatetime");
    member.setName("report_datetime");
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
