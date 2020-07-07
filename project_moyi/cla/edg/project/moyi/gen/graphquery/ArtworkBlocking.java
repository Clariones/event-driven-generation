package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkBlocking extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkblocking.ArtworkBlocking";
  }
  // 枚举对象

  // 引用的对象

  public BlockingType blockingType() {
    BlockingType member = new BlockingType();
    member.setModelTypeName("blocking_type");
    member.setName("blocking_type");
    member.setMemberName("blockingType");
    member.setReferDirection(true);
    member.setRelationName("blockingType");
    append(member);
    return member;
  }

  public Artwork blockedArtwork() {
    Artwork member = new Artwork();
    member.setModelTypeName("artwork");
    member.setName("blocked_artwork");
    member.setMemberName("blockedArtwork");
    member.setReferDirection(true);
    member.setRelationName("blockedArtwork");
    append(member);
    return member;
  }

  public MoyiUser sponsor() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("sponsor");
    member.setMemberName("sponsor");
    member.setReferDirection(true);
    member.setRelationName("sponsor");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
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
