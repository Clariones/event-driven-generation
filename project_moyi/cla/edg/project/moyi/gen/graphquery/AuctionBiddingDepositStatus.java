package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class AuctionBiddingDepositStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.auctionbiddingdepositstatus.AuctionBiddingDepositStatus";
	}
	// 枚举对象
	public static EnumAttribute PAID = new EnumAttribute("com.terapico.moyi.auctionbiddingdepositstatus.AuctionBiddingDepositStatus", "PAID");
	public static EnumAttribute RETURNED = new EnumAttribute("com.terapico.moyi.auctionbiddingdepositstatus.AuctionBiddingDepositStatus", "RETURNED");
	public static EnumAttribute DEDUCTED = new EnumAttribute("com.terapico.moyi.auctionbiddingdepositstatus.AuctionBiddingDepositStatus", "DEDUCTED");
	public static EnumAttribute TAKE_BY_PAY = new EnumAttribute("com.terapico.moyi.auctionbiddingdepositstatus.AuctionBiddingDepositStatus", "TAKE_BY_PAY");

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
	
	public AuctionBiddingDeposit auctionBiddingDepositList() {
		AuctionBiddingDeposit member = new AuctionBiddingDeposit();
		member.setModelTypeName("auction_bidding_deposit");
		member.setName("status");
		member.setMemberName("auctionBiddingDepositList");
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

