package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class AuctionBiddingDepositBill extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.auctionbiddingdepositbill.AuctionBiddingDepositBill";
	}
	// 枚举对象

	// 引用的对象

	public ArtworkAuction auction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("auction");
		member.setMemberName("auction");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser bidder() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("bidder");
		member.setMemberName("bidder");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public OrderStatus orderStatus() {
		OrderStatus member = new OrderStatus();
		member.setModelTypeName("order_status");
		member.setName("order_status");
		member.setMemberName("orderStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MainOrder mainOrder() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("main_order");
		member.setMemberName("mainOrder");
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

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public NumberAttribute serviceFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("serviceFee");
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
