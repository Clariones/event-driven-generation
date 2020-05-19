package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class MoyiPlatformConfigurationV2 extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiplatformconfigurationv2.MoyiPlatformConfigurationV2";
	}
	// 枚举对象

	// 引用的对象

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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public BooleanAttribute inGracePeriod(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("in_grace_period");
		useMember(member);
		return member;
	}

	public StringAttribute auctionProcedurePage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("auction_procedure_page");
		useMember(member);
		return member;
	}

	public NumberAttribute ibExchangeRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("ib_exchange_rate");
		useMember(member);
		return member;
	}

	public NumberAttribute publicNoticePeriodMinHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("public_notice_period_min_hour");
		useMember(member);
		return member;
	}

	public NumberAttribute publicNoticePeriodMaxHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("public_notice_period_max_hour");
		useMember(member);
		return member;
	}

	public NumberAttribute auctionPeriodMinHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("auction_period_min_hour");
		useMember(member);
		return member;
	}

	public NumberAttribute auctionPeriodMaxHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("auction_period_max_hour");
		useMember(member);
		return member;
	}

	public NumberAttribute hoursToPayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("hours_to_pay_order");
		useMember(member);
		return member;
	}

	public NumberAttribute hoursToDeliverOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("hours_to_deliver_order");
		useMember(member);
		return member;
	}

	public NumberAttribute daysToConfirmOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("days_to_confirm_order");
		useMember(member);
		return member;
	}

	public NumberAttribute minimalStartingPriceForInkDeedSelling(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("minimal_starting_price_for_ink_deed_selling");
		useMember(member);
		return member;
	}

	public NumberAttribute minimalBiddingDeposit(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("minimal_bidding_deposit");
		useMember(member);
		return member;
	}

	public StringAttribute inkDeedSaleProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("ink_deed_sale_protocol");
		useMember(member);
		return member;
	}

	public StringAttribute shopLocatingProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("shop_locating_protocol");
		useMember(member);
		return member;
	}

	public StringAttribute ownershipCertificateProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("ownership_certificate_protocol");
		useMember(member);
		return member;
	}

	public StringAttribute artworkAuctionProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("artwork_auction_protocol");
		useMember(member);
		return member;
	}

	public StringAttribute autoBuyIbProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("auto_buy_ib_protocol");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("affiliate_server_prefix");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateServerLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("affiliate_server_link");
		useMember(member);
		return member;
	}

	public NumberAttribute affiliateProfitSharingRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("affiliate_profit_sharing_rate");
		useMember(member);
		return member;
	}

	public NumberAttribute refereeProfitSharingRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("referee_profit_sharing_rate");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateActivityIntroduction(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("affiliate_activity_introduction");
		useMember(member);
		return member;
	}

	public StringAttribute withdrawIntroductionUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("withdraw_introduction_url");
		useMember(member);
		return member;
	}

	public StringAttribute refereeDashboardImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("referee_dashboard_image");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateDashboardImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("affiliate_dashboard_image");
		useMember(member);
		return member;
	}

	public NumberAttribute firstSuccessAuctionSellerIbBouns(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("first_success_auction_seller_ib_bouns");
		useMember(member);
		return member;
	}

	public NumberAttribute firstSuccessAuctionBuyerIbBouns(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("first_success_auction_buyer_ib_bouns");
		useMember(member);
		return member;
	}

	public StringAttribute inkDeedTradeZongBackgroundImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("ink_deed_trade_zong_background_image");
		useMember(member);
		return member;
	}

	public StringAttribute artworkTradeZongBackgroundImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("artwork_trade_zong_background_image");
		useMember(member);
		return member;
	}

	public StringAttribute complainTips(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("complain_tips");
		useMember(member);
		return member;
	}

	public StringAttribute auctionTips(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("auction_tips");
		useMember(member);
		return member;
	}

	public StringAttribute shopDepositProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("shop_deposit_protocol");
		useMember(member);
		return member;
	}

	public StringAttribute customerServicePage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("customer_service_page");
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

