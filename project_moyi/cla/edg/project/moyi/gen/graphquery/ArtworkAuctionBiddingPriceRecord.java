package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAuctionBiddingPriceRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkauctionbiddingpricerecord.ArtworkAuctionBiddingPriceRecord";
  }
  // 枚举对象

  // 引用的对象

  public ArtworkAuction artworkAuction() {
    ArtworkAuction member = new ArtworkAuction();
    member.setModelTypeName("artwork_auction");
    member.setName("artwork_auction");
    member.setMemberName("artworkAuction");
    member.setReferDirection(true);
    member.setRelationName("artworkAuction");
    append(member);
    return member;
  }

  public MoyiUser bidder() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("bidder");
    member.setMemberName("bidder");
    member.setReferDirection(true);
    member.setRelationName("bidder");
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

  public StringAttribute bidderHashcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("bidderHashcode");
    member.setName("bidder_hashcode");
    useMember(member);
    return member;
  }

  public NumberAttribute biddingPrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("biddingPrice");
    member.setName("bidding_price");
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
