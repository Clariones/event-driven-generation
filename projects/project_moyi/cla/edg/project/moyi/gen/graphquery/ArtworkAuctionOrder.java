package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAuctionOrder extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.artworkauctionorder.ArtworkAuctionOrder";
  }
  // 枚举对象

  // 引用的对象

  public MainOrder mainOrder() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("main_order");
    member.setMemberName("mainOrder");
    member.setReferDirection(true);
    member.setRelationName("mainOrder");
    append(member);
    return member;
  }

  public ArtworkAuction auction() {
    ArtworkAuction member = new ArtworkAuction();
    member.setModelTypeName("artwork_auction");
    member.setName("auction");
    member.setMemberName("auction");
    member.setReferDirection(true);
    member.setRelationName("auction");
    append(member);
    return member;
  }

  public OrderStatus orderStatus() {
    OrderStatus member = new OrderStatus();
    member.setModelTypeName("order_status");
    member.setName("order_status");
    member.setMemberName("orderStatus");
    member.setReferDirection(true);
    member.setRelationName("orderStatus");
    append(member);
    return member;
  }

  public MoyiUser seller() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("seller");
    member.setMemberName("seller");
    member.setReferDirection(true);
    member.setRelationName("seller");
    append(member);
    return member;
  }

  public MoyiUser buyer() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("buyer");
    member.setMemberName("buyer");
    member.setReferDirection(true);
    member.setRelationName("buyer");
    append(member);
    return member;
  }

  public MoyiUser referee() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("referee");
    member.setMemberName("referee");
    member.setReferDirection(true);
    member.setRelationName("referee");
    append(member);
    return member;
  }

  public ArtworkOwnershipCertificate artworkOwnershipCertificate() {
    ArtworkOwnershipCertificate member = new ArtworkOwnershipCertificate();
    member.setModelTypeName("artwork_ownership_certificate");
    member.setName("artwork_ownership_certificate");
    member.setMemberName("artworkOwnershipCertificate");
    member.setReferDirection(true);
    member.setRelationName("artworkOwnershipCertificate");
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

  public ArtworkAuctionOrderLog artworkAuctionOrderLogList() {
    ArtworkAuctionOrderLog member = new ArtworkAuctionOrderLog();
    member.setModelTypeName("artwork_auction_order_log");
    member.setName("artwork_auction_order");
    member.setMemberName("artworkAuctionOrderLogList");
    member.setRelationName("artworkAuctionOrder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArtworkAuctionComplaint artworkAuctionComplaintList() {
    ArtworkAuctionComplaint member = new ArtworkAuctionComplaint();
    member.setModelTypeName("artwork_auction_complaint");
    member.setName("auction_order");
    member.setMemberName("artworkAuctionComplaintList");
    member.setRelationName("auctionOrder");
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

  public NumberAttribute price() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("price");
    member.setName("price");
    useMember(member);
    return member;
  }

  public StringAttribute sellerHashcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sellerHashcode");
    member.setName("seller_hashcode");
    useMember(member);
    return member;
  }

  public StringAttribute buyerHashcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("buyerHashcode");
    member.setName("buyer_hashcode");
    useMember(member);
    return member;
  }

  public StringAttribute refereeHashcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("refereeHashcode");
    member.setName("referee_hashcode");
    useMember(member);
    return member;
  }

  public StringAttribute receiverName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receiverName");
    member.setName("receiver_name");
    useMember(member);
    return member;
  }

  public StringAttribute receiverMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("receiverMobile");
    member.setName("receiver_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute receiverAddressDetail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receiverAddressDetail");
    member.setName("receiver_address_detail");
    useMember(member);
    return member;
  }

  public NumberAttribute shippingCost() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("shippingCost");
    member.setName("shipping_cost");
    useMember(member);
    return member;
  }

  public StringAttribute expressCompany() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("expressCompany");
    member.setName("express_company");
    useMember(member);
    return member;
  }

  public StringAttribute expressTrackingNumber() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("expressTrackingNumber");
    member.setName("express_tracking_number");
    useMember(member);
    return member;
  }

  public DateTimeAttribute dealTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("dealTime");
    member.setName("deal_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute paidTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("paidTime");
    member.setName("paid_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute deliverTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("deliverTime");
    member.setName("deliver_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute confirmTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("confirmTime");
    member.setName("confirm_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute cancelTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("cancelTime");
    member.setName("cancel_time");
    useMember(member);
    return member;
  }

  public BooleanAttribute autoTimeoutChecking() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("autoTimeoutChecking");
    member.setName("auto_timeout_checking");
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
