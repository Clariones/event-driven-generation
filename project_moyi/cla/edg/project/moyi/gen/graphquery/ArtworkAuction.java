package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ArtworkAuction extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkauction.ArtworkAuction";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser seller() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("seller");
		member.setMemberName("seller");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiShop moyiShop() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("moyi_shop");
		member.setMemberName("moyiShop");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser buyer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("buyer");
		member.setMemberName("buyer");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ArtworkOwnershipCertificate artworkOwnershipCertificate() {
		ArtworkOwnershipCertificate member = new ArtworkOwnershipCertificate();
		member.setModelTypeName("artwork_ownership_certificate");
		member.setName("artwork_ownership_certificate");
		member.setMemberName("artworkOwnershipCertificate");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ArtworkAuctionStatus artworkAuctionStatus() {
		ArtworkAuctionStatus member = new ArtworkAuctionStatus();
		member.setModelTypeName("artwork_auction_status");
		member.setName("artwork_auction_status");
		member.setMemberName("artworkAuctionStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MoyiShopDepositBill moyiShopDepositBillList() {
		MoyiShopDepositBill member = new MoyiShopDepositBill();
		member.setModelTypeName("moyi_shop_deposit_bill");
		member.setName("artwork_auction");
		member.setMemberName("moyiShopDepositBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionBiddingPriceRecord artworkAuctionBiddingPriceRecordList() {
		ArtworkAuctionBiddingPriceRecord member = new ArtworkAuctionBiddingPriceRecord();
		member.setModelTypeName("artwork_auction_bidding_price_record");
		member.setName("artwork_auction");
		member.setMemberName("artworkAuctionBiddingPriceRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionRecord artworkAuctionRecordList() {
		ArtworkAuctionRecord member = new ArtworkAuctionRecord();
		member.setModelTypeName("artwork_auction_record");
		member.setName("artwork_auction");
		member.setMemberName("artworkAuctionRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionOrder artworkAuctionOrderList() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("auction");
		member.setMemberName("artworkAuctionOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendationAuction recommendationAuctionList() {
		RecommendationAuction member = new RecommendationAuction();
		member.setModelTypeName("recommendation_auction");
		member.setName("auction");
		member.setMemberName("recommendationAuctionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public EfficientRecommendation efficientRecommendationList() {
		EfficientRecommendation member = new EfficientRecommendation();
		member.setModelTypeName("efficient_recommendation");
		member.setName("auction");
		member.setMemberName("efficientRecommendationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendationIncomeRecord recommendationIncomeRecordList() {
		RecommendationIncomeRecord member = new RecommendationIncomeRecord();
		member.setModelTypeName("recommendation_income_record");
		member.setName("auction");
		member.setMemberName("recommendationIncomeRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAffiliateAllianceAccountRecord artworkAffiliateAllianceAccountRecordList() {
		ArtworkAffiliateAllianceAccountRecord member = new ArtworkAffiliateAllianceAccountRecord();
		member.setModelTypeName("artwork_affiliate_alliance_account_record");
		member.setName("auction");
		member.setMemberName("artworkAffiliateAllianceAccountRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuctionStartNotification auctionStartNotificationList() {
		AuctionStartNotification member = new AuctionStartNotification();
		member.setModelTypeName("auction_start_notification");
		member.setName("auction");
		member.setMemberName("auctionStartNotificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuctionBiddingDepositBill auctionBiddingDepositBillList() {
		AuctionBiddingDepositBill member = new AuctionBiddingDepositBill();
		member.setModelTypeName("auction_bidding_deposit_bill");
		member.setName("auction");
		member.setMemberName("auctionBiddingDepositBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuctionBiddingDeposit auctionBiddingDepositList() {
		AuctionBiddingDeposit member = new AuctionBiddingDeposit();
		member.setModelTypeName("auction_bidding_deposit");
		member.setName("auction");
		member.setMemberName("auctionBiddingDepositList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuctionBiddingDepositRecord auctionBiddingDepositRecordList() {
		AuctionBiddingDepositRecord member = new AuctionBiddingDepositRecord();
		member.setModelTypeName("auction_bidding_deposit_record");
		member.setName("auction");
		member.setMemberName("auctionBiddingDepositRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeed inkDeedList() {
		InkDeed member = new InkDeed();
		member.setModelTypeName("ink_deed");
		member.setName("auction");
		member.setMemberName("inkDeedList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedIssueBill inkDeedIssueBillList() {
		InkDeedIssueBill member = new InkDeedIssueBill();
		member.setModelTypeName("ink_deed_issue_bill");
		member.setName("auction");
		member.setMemberName("inkDeedIssueBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedHoldingStatistic inkDeedHoldingStatisticList() {
		InkDeedHoldingStatistic member = new InkDeedHoldingStatistic();
		member.setModelTypeName("ink_deed_holding_statistic");
		member.setName("auction");
		member.setMemberName("inkDeedHoldingStatisticList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedEntryOrder inkDeedEntryOrderList() {
		InkDeedEntryOrder member = new InkDeedEntryOrder();
		member.setModelTypeName("ink_deed_entry_order");
		member.setName("artwork_auction");
		member.setMemberName("inkDeedEntryOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedCashRecord inkDeedCashRecordList() {
		InkDeedCashRecord member = new InkDeedCashRecord();
		member.setModelTypeName("ink_deed_cash_record");
		member.setName("auction");
		member.setMemberName("inkDeedCashRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedEntryOrderStatistic inkDeedEntryOrderStatisticList() {
		InkDeedEntryOrderStatistic member = new InkDeedEntryOrderStatistic();
		member.setModelTypeName("ink_deed_entry_order_statistic");
		member.setName("auction");
		member.setMemberName("inkDeedEntryOrderStatisticList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute startingPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("startingPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute bidIncrement(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("bidIncrement");
		useMember(member);
		return member;
	}

	public DateTimeAttribute displayStartTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("displayStartTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute auctionStartTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("auctionStartTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute auctionEndTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("auctionEndTime");
		useMember(member);
		return member;
	}

	public BooleanAttribute freeShipping(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("freeShipping");
		useMember(member);
		return member;
	}

	public NumberAttribute shippingPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("shippingPrice");
		useMember(member);
		return member;
	}

	public BooleanAttribute buyItNow(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("buyItNow");
		useMember(member);
		return member;
	}

	public NumberAttribute buyItNowPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("buyItNowPrice");
		useMember(member);
		return member;
	}

	public BooleanAttribute confirmDefault(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("confirmDefault");
		useMember(member);
		return member;
	}

	public StringAttribute sellerHashcode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sellerHashcode");
		useMember(member);
		return member;
	}

	public NumberAttribute usufructRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("usufructRatio");
		useMember(member);
		return member;
	}

	public NumberAttribute currentBiddingPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("currentBiddingPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute hammerPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("hammerPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute viewCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("viewCount");
		useMember(member);
		return member;
	}

	public StringAttribute finishedResult(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("finishedResult");
		useMember(member);
		return member;
	}

	public DateTimeAttribute finishedTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("finishedTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

