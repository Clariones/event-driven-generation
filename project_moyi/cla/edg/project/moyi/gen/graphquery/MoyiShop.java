package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiShop extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.moyishop.MoyiShop";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser shopkeeper() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("shopkeeper");
    member.setMemberName("shopkeeper");
    member.setReferDirection(true);
    member.setRelationName("shopkeeper");
    append(member);
    return member;
  }

  public MoyiShopCertification certificate() {
    MoyiShopCertification member = new MoyiShopCertification();
    member.setModelTypeName("moyi_shop_certification");
    member.setName("certificate");
    member.setMemberName("certificate");
    member.setReferDirection(true);
    member.setRelationName("certificate");
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

  public MoyiShopDepositBill moyiShopDepositBillList() {
    MoyiShopDepositBill member = new MoyiShopDepositBill();
    member.setModelTypeName("moyi_shop_deposit_bill");
    member.setName("moyi_shop");
    member.setMemberName("moyiShopDepositBillList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MoyiShopDepositRefund moyiShopDepositRefundList() {
    MoyiShopDepositRefund member = new MoyiShopDepositRefund();
    member.setModelTypeName("moyi_shop_deposit_refund");
    member.setName("moyi_shop");
    member.setMemberName("moyiShopDepositRefundList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MoyiShopDepositRecord moyiShopDepositRecordList() {
    MoyiShopDepositRecord member = new MoyiShopDepositRecord();
    member.setModelTypeName("moyi_shop_deposit_record");
    member.setName("moyi_shop");
    member.setMemberName("moyiShopDepositRecordList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArtworkAuction artworkAuctionList() {
    ArtworkAuction member = new ArtworkAuction();
    member.setModelTypeName("artwork_auction");
    member.setName("moyi_shop");
    member.setMemberName("artworkAuctionList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ShopReferralRecord shopReferralRecordList() {
    ShopReferralRecord member = new ShopReferralRecord();
    member.setModelTypeName("shop_referral_record");
    member.setName("shop");
    member.setMemberName("shopReferralRecordList");
    member.setRelationName("shop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ShopOpeningRewardRecord shopOpeningRewardRecordList() {
    ShopOpeningRewardRecord member = new ShopOpeningRewardRecord();
    member.setModelTypeName("shop_opening_reward_record");
    member.setName("moyi_shop");
    member.setMemberName("shopOpeningRewardRecordList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MoyiShopAnnualInfo moyiShopAnnualInfoList() {
    MoyiShopAnnualInfo member = new MoyiShopAnnualInfo();
    member.setModelTypeName("moyi_shop_annual_info");
    member.setName("shop");
    member.setMemberName("moyiShopAnnualInfoList");
    member.setRelationName("shop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FavoriteShopOfUser favoriteShopOfUserList() {
    FavoriteShopOfUser member = new FavoriteShopOfUser();
    member.setModelTypeName("favorite_shop_of_user");
    member.setName("target_moyi_shop");
    member.setMemberName("favoriteShopOfUserList");
    member.setRelationName("targetMoyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public PageSlide pageSlideList() {
    PageSlide member = new PageSlide();
    member.setModelTypeName("page_slide");
    member.setName("moyi_shop");
    member.setMemberName("pageSlideList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public HotShopRank hotShopRankList() {
    HotShopRank member = new HotShopRank();
    member.setModelTypeName("hot_shop_rank");
    member.setName("moyi_shop");
    member.setMemberName("hotShopRankList");
    member.setRelationName("moyiShop");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArtworkAuctionSortingItem artworkAuctionSortingItemList() {
    ArtworkAuctionSortingItem member = new ArtworkAuctionSortingItem();
    member.setModelTypeName("artwork_auction_sorting_item");
    member.setName("moyi_shop");
    member.setMemberName("artworkAuctionSortingItemList");
    member.setRelationName("moyiShop");
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

  public StringAttribute shopName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("shopName");
    member.setName("shop_name");
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

  public StringAttribute shopLogo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("shopLogo");
    member.setName("shop_logo");
    useMember(member);
    return member;
  }

  public StringAttribute contactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactName");
    member.setName("contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute contactMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("contactMobile");
    member.setName("contact_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute contactEmail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_email");
    // member.setName("contactEmail");
    member.setName("contact_email");
    useMember(member);
    return member;
  }

  public NumberAttribute availableDeposit() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("availableDeposit");
    member.setName("available_deposit");
    useMember(member);
    return member;
  }

  public NumberAttribute payableDeposit() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("payableDeposit");
    member.setName("payable_deposit");
    useMember(member);
    return member;
  }

  public NumberAttribute frozenDeposit() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("frozenDeposit");
    member.setName("frozen_deposit");
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

  public DateTimeAttribute certificateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("certificateTime");
    member.setName("certificate_time");
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
