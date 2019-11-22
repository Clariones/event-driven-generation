package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
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
		member.setName("inGracePeriod");
		useMember(member);
		return member;
	}

	public StringAttribute auctionProcedurePage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("auctionProcedurePage");
		useMember(member);
		return member;
	}

	public NumberAttribute ibExchangeRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("ibExchangeRate");
		useMember(member);
		return member;
	}

	public NumberAttribute publicNoticePeriodMinHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("publicNoticePeriodMinHour");
		useMember(member);
		return member;
	}

	public NumberAttribute publicNoticePeriodMaxHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("publicNoticePeriodMaxHour");
		useMember(member);
		return member;
	}

	public NumberAttribute auctionPeriodMinHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("auctionPeriodMinHour");
		useMember(member);
		return member;
	}

	public NumberAttribute auctionPeriodMaxHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("auctionPeriodMaxHour");
		useMember(member);
		return member;
	}

	public NumberAttribute hoursToPayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("hoursToPayOrder");
		useMember(member);
		return member;
	}

	public NumberAttribute hoursToDeliverOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("hoursToDeliverOrder");
		useMember(member);
		return member;
	}

	public NumberAttribute daysToConfirmOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("daysToConfirmOrder");
		useMember(member);
		return member;
	}

	public NumberAttribute minimalStartingPriceForInkDeedSelling(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("minimalStartingPriceForInkDeedSelling");
		useMember(member);
		return member;
	}

	public NumberAttribute minimalBiddingDeposit(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("minimalBiddingDeposit");
		useMember(member);
		return member;
	}

	public StringAttribute inkDeedSaleProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("inkDeedSaleProtocol");
		useMember(member);
		return member;
	}

	public StringAttribute shopLocatingProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("shopLocatingProtocol");
		useMember(member);
		return member;
	}

	public StringAttribute ownershipCertificateProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("ownershipCertificateProtocol");
		useMember(member);
		return member;
	}

	public StringAttribute artworkAuctionProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("artworkAuctionProtocol");
		useMember(member);
		return member;
	}

	public StringAttribute autoBuyIbProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("autoBuyIbProtocol");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateServerPrefix(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("affiliateServerPrefix");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateServerLink(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("affiliateServerLink");
		useMember(member);
		return member;
	}

	public NumberAttribute affiliateProfitSharingRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("affiliateProfitSharingRate");
		useMember(member);
		return member;
	}

	public NumberAttribute refereeProfitSharingRate(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("refereeProfitSharingRate");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateActivityIntroduction(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("affiliateActivityIntroduction");
		useMember(member);
		return member;
	}

	public StringAttribute withdrawIntroductionUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("withdrawIntroductionUrl");
		useMember(member);
		return member;
	}

	public StringAttribute refereeDashboardImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("refereeDashboardImage");
		useMember(member);
		return member;
	}

	public StringAttribute affiliateDashboardImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("affiliateDashboardImage");
		useMember(member);
		return member;
	}

	public NumberAttribute firstSuccessAuctionSellerIbBouns(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("firstSuccessAuctionSellerIbBouns");
		useMember(member);
		return member;
	}

	public NumberAttribute firstSuccessAuctionBuyerIbBouns(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("firstSuccessAuctionBuyerIbBouns");
		useMember(member);
		return member;
	}

	public StringAttribute inkDeedTradeZongBackgroundImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("inkDeedTradeZongBackgroundImage");
		useMember(member);
		return member;
	}

	public StringAttribute artworkTradeZongBackgroundImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("artworkTradeZongBackgroundImage");
		useMember(member);
		return member;
	}

	public StringAttribute complainTips(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("complainTips");
		useMember(member);
		return member;
	}

	public StringAttribute auctionTips(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("auctionTips");
		useMember(member);
		return member;
	}

	public StringAttribute shopDepositProtocol(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("shopDepositProtocol");
		useMember(member);
		return member;
	}

	public StringAttribute customerServicePage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("customerServicePage");
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

