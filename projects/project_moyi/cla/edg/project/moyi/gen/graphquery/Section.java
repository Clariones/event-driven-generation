package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Section extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.section.Section";
  }
  // 枚举对象

  // 引用的对象

  public SurvivalStatus active() {
    SurvivalStatus member = new SurvivalStatus();
    member.setModelTypeName("survival_status");
    member.setName("active");
    member.setMemberName("active");
    member.setReferDirection(true);
    member.setRelationName("active");
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

  public ChannelSection channelSectionList() {
    ChannelSection member = new ChannelSection();
    member.setModelTypeName("channel_section");
    member.setName("section");
    member.setMemberName("channelSectionList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SectionArtworkRelationship sectionArtworkRelationshipList() {
    SectionArtworkRelationship member = new SectionArtworkRelationship();
    member.setModelTypeName("section_artwork_relationship");
    member.setName("section");
    member.setMemberName("sectionArtworkRelationshipList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SectionFans sectionFansList() {
    SectionFans member = new SectionFans();
    member.setModelTypeName("section_fans");
    member.setName("section");
    member.setMemberName("sectionFansList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Moderator moderatorList() {
    Moderator member = new Moderator();
    member.setModelTypeName("moderator");
    member.setName("responsible_section");
    member.setMemberName("moderatorList");
    member.setRelationName("responsibleSection");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EliteArticle eliteArticleList() {
    EliteArticle member = new EliteArticle();
    member.setModelTypeName("elite_article");
    member.setName("section");
    member.setMemberName("eliteArticleList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SectionTopArticle sectionTopArticleList() {
    SectionTopArticle member = new SectionTopArticle();
    member.setModelTypeName("section_top_article");
    member.setName("section");
    member.setMemberName("sectionTopArticleList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SectionBroadcastArticle sectionBroadcastArticleList() {
    SectionBroadcastArticle member = new SectionBroadcastArticle();
    member.setModelTypeName("section_broadcast_article");
    member.setName("section");
    member.setMemberName("sectionBroadcastArticleList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Article articleList() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("section");
    member.setMemberName("articleList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ContentTag contentTagList() {
    ContentTag member = new ContentTag();
    member.setModelTypeName("content_tag");
    member.setName("section");
    member.setMemberName("contentTagList");
    member.setRelationName("section");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverArticle deliverArticleList() {
    DeliverArticle member = new DeliverArticle();
    member.setModelTypeName("deliver_article");
    member.setName("section");
    member.setMemberName("deliverArticleList");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute sectionSlogan() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sectionSlogan");
    member.setName("section_slogan");
    useMember(member);
    return member;
  }

  public StringAttribute sectionIntroduction() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("sectionIntroduction");
    member.setName("section_introduction");
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

  public NumberAttribute sectionAccount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("sectionAccount");
    member.setName("section_account");
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
