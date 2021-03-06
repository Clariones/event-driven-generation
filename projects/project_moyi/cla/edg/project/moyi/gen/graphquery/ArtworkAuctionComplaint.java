package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAuctionComplaint extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkauctioncomplaint.ArtworkAuctionComplaint";
  }
  // 枚举对象

  // 引用的对象

  public ArtworkAuctionOrder auctionOrder() {
    ArtworkAuctionOrder member = new ArtworkAuctionOrder();
    member.setModelTypeName("artwork_auction_order");
    member.setName("auction_order");
    member.setMemberName("auctionOrder");
    member.setReferDirection(true);
    member.setRelationName("auctionOrder");
    append(member);
    return member;
  }

  public MoyiUser complainant() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("complainant");
    member.setMemberName("complainant");
    member.setReferDirection(true);
    member.setRelationName("complainant");
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

  public ArtworkAuctionComplaintReply artworkAuctionComplaintReplyList() {
    ArtworkAuctionComplaintReply member = new ArtworkAuctionComplaintReply();
    member.setModelTypeName("artwork_auction_complaint_reply");
    member.setName("complaint");
    member.setMemberName("artworkAuctionComplaintReplyList");
    member.setRelationName("complaint");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute image1() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image1");
    member.setName("image1");
    useMember(member);
    return member;
  }

  public StringAttribute image2() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image2");
    member.setName("image2");
    useMember(member);
    return member;
  }

  public StringAttribute image3() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image3");
    member.setName("image3");
    useMember(member);
    return member;
  }

  public StringAttribute image4() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image4");
    member.setName("image4");
    useMember(member);
    return member;
  }

  public StringAttribute image5() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image5");
    member.setName("image5");
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
