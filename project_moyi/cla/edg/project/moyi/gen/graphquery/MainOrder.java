package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MainOrder extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.mainorder.MainOrder";
	}
	// 枚举对象

	// 引用的对象

	public OrderStatus orderStatus() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("order_status");
		member.setMemberName("orderStatus");
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
	
	public PricingItem pricingItemList() {
		PricingItem member = new PricingItem();
		member.setModelTypeName("pricing_item");
		member.setName("main_order");
		member.setMemberName("pricingItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public PaymentDetail paymentDetailList() {
		PaymentDetail member = new PaymentDetail();
		member.setModelTypeName("payment_detail");
		member.setName("main_order");
		member.setMemberName("paymentDetailList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiShopDepositBill moyiShopDepositBillList() {
		MoyiShopDepositBill member = new MoyiShopDepositBill();
		member.setModelTypeName("moyi_shop_deposit_bill");
		member.setName("main_order");
		member.setMemberName("moyiShopDepositBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiUserAccountRechargeOrder moyiUserAccountRechargeOrderList() {
		MoyiUserAccountRechargeOrder member = new MoyiUserAccountRechargeOrder();
		member.setModelTypeName("moyi_user_account_recharge_order");
		member.setName("main_order");
		member.setMemberName("moyiUserAccountRechargeOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiUserIbOrder moyiUserIbOrderList() {
		MoyiUserIbOrder member = new MoyiUserIbOrder();
		member.setModelTypeName("moyi_user_ib_order");
		member.setName("main_order");
		member.setMemberName("moyiUserIbOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkOwnershipCertificateBill artworkOwnershipCertificateBillList() {
		ArtworkOwnershipCertificateBill member = new ArtworkOwnershipCertificateBill();
		member.setModelTypeName("artwork_ownership_certificate_bill");
		member.setName("main_order");
		member.setMemberName("artworkOwnershipCertificateBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionOrder artworkAuctionOrderList() {
		ArtworkAuctionOrder member = new ArtworkAuctionOrder();
		member.setModelTypeName("artwork_auction_order");
		member.setName("main_order");
		member.setMemberName("artworkAuctionOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkTransactionTracking artworkTransactionTrackingList() {
		ArtworkTransactionTracking member = new ArtworkTransactionTracking();
		member.setModelTypeName("artwork_transaction_tracking");
		member.setName("main_order");
		member.setMemberName("artworkTransactionTrackingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AuctionBiddingDepositBill auctionBiddingDepositBillList() {
		AuctionBiddingDepositBill member = new AuctionBiddingDepositBill();
		member.setModelTypeName("auction_bidding_deposit_bill");
		member.setName("main_order");
		member.setMemberName("auctionBiddingDepositBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedIssueBill inkDeedIssueBillList() {
		InkDeedIssueBill member = new InkDeedIssueBill();
		member.setModelTypeName("ink_deed_issue_bill");
		member.setName("main_order");
		member.setMemberName("inkDeedIssueBillList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public InkDeedOrder inkDeedOrderList() {
		InkDeedOrder member = new InkDeedOrder();
		member.setModelTypeName("ink_deed_order");
		member.setName("main_order");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public StringAttribute sceneCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("sceneCode");
		useMember(member);
		return member;
	}

	public NumberAttribute listCashPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("listCashPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute listIbPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("listIbPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute salesCashPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("salesCashPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute salesIbPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("salesIbPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute payCashPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("payCashPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute payIbPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("payIbPrice");
		useMember(member);
		return member;
	}

	public BooleanAttribute useIbBalance(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("useIbBalance");
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

