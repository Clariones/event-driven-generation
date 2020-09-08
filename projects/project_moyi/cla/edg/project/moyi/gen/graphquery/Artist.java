package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Artist extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artist.Artist";
  }
  // 枚举对象

  // 引用的对象

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

  public MoyiUser creator() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("creator");
    member.setMemberName("creator");
    member.setReferDirection(true);
    member.setRelationName("creator");
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

  public ArtistFans artistFansList() {
    ArtistFans member = new ArtistFans();
    member.setModelTypeName("artist_fans");
    member.setName("artist");
    member.setMemberName("artistFansList");
    member.setRelationName("artist");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Artwork artworkList() {
    Artwork member = new Artwork();
    member.setModelTypeName("artwork");
    member.setName("author");
    member.setMemberName("artworkList");
    member.setRelationName("author");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RecommendArtist recommendArtistList() {
    RecommendArtist member = new RecommendArtist();
    member.setModelTypeName("recommend_artist");
    member.setName("artist");
    member.setMemberName("recommendArtistList");
    member.setRelationName("artist");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public PageSlide pageSlideList() {
    PageSlide member = new PageSlide();
    member.setModelTypeName("page_slide");
    member.setName("artist");
    member.setMemberName("pageSlideList");
    member.setRelationName("artist");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public HotArtistRank hotArtistRankList() {
    HotArtistRank member = new HotArtistRank();
    member.setModelTypeName("hot_artist_rank");
    member.setName("artist");
    member.setMemberName("hotArtistRankList");
    member.setRelationName("artist");
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

  public StringAttribute profileImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("profileImage");
    member.setName("profile_image");
    useMember(member);
    return member;
  }

  public StringAttribute artistResume() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("artistResume");
    member.setName("artist_resume");
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
