package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class OrderStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.orderstatus.OrderStatus";
	}
	// 枚举对象
	public static EnumAttribute NEED_PAY = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "NEED_PAY");
	public static EnumAttribute PAYING = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "PAYING");
	public static EnumAttribute NEED_DELIVER = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "NEED_DELIVER");
	public static EnumAttribute NEED_CONFIRM = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "NEED_CONFIRM");
	public static EnumAttribute CLOSED = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "CLOSED");
	public static EnumAttribute PENDING_ARBITRATION = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "PENDING_ARBITRATION");
	public static EnumAttribute CANCELLED = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "CANCELLED");
	public static EnumAttribute BUYER_DEFAULT = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "BUYER_DEFAULT");
	public static EnumAttribute SELLER_DEFAULT = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "SELLER_DEFAULT");
	public static EnumAttribute SEVEN_DAY_WARRANTY = new EnumAttribute("com.terapico.moyi.orderstatus.OrderStatus", "SEVEN_DAY_WARRANTY");

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
	
	public MainOrder mainOrderList() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("order_status");
		member.setMemberName("mainOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiShopDepositBill moyiShopDepositBillList() {
		MoyiShopDepositBill member = new MoyiShopDepositBill();
		member.setModelTypeName("moyi_shop_deposit_bill");
		member.setName("order_status");
		member.setMemberName("moyiShopDepositBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiShopDepositRefund moyiShopDepositRefundList() {
		MoyiShopDepositRefund member = new MoyiShopDepositRefund();
		member.setModelTypeName("moyi_shop_deposit_refund");
		member.setName("order_status");
		member.setMemberName("moyiShopDepositRefundList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiUserAccountRechargeOrder moyiUserAccountRechargeOrderList() {
		MoyiUserAccountRechargeOrder member = new MoyiUserAccountRechargeOrder();
		member.setModelTypeName("moyi_user_account_recharge_order");
		member.setName("order_status");
		member.setMemberName("moyiUserAccountRechargeOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiUserIbOrder moyiUserIbOrderList() {
		MoyiUserIbOrder member = new MoyiUserIbOrder();
		member.setModelTypeName("moyi_user_ib_order");
		member.setName("order_status");
		member.setMemberName("moyiUserIbOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkOwnershipCertificateBill artworkOwnershipCertificateBillList() {
		ArtworkOwnershipCertificateBill member = new ArtworkOwnershipCertificateBill();
		member.setModelTypeName("artwork_ownership_certificate_bill");
		member.setName("order_status");
		member.setMemberName("artworkOwnershipCertificateBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionOrder artworkAuctionOrderList() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("order_status");
		member.setMemberName("artworkAuctionOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionOrderLog artworkAuctionOrderLogList() {
		ArtworkAuctionOrderLog member = new ArtworkAuctionOrderLog();
		member.setModelTypeName("artwork_auction_order_log");
		member.setName("order_status");
		member.setMemberName("artworkAuctionOrderLogList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuctionBiddingDepositBill auctionBiddingDepositBillList() {
		AuctionBiddingDepositBill member = new AuctionBiddingDepositBill();
		member.setModelTypeName("auction_bidding_deposit_bill");
		member.setName("order_status");
		member.setMemberName("auctionBiddingDepositBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedIssueBill inkDeedIssueBillList() {
		InkDeedIssueBill member = new InkDeedIssueBill();
		member.setModelTypeName("ink_deed_issue_bill");
		member.setName("order_status");
		member.setMemberName("inkDeedIssueBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedOrder inkDeedOrderList() {
		InkDeedOrder member = new InkDeedOrder();
		member.setModelTypeName("ink_deed_order");
		member.setName("order_status");
		member.setMemberName("inkDeedOrderList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

