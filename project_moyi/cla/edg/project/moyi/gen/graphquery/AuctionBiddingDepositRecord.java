package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class AuctionBiddingDepositRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.auctionbiddingdepositrecord.AuctionBiddingDepositRecord";
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

	// 被引用的对象

	
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

	public NumberAttribute incomeAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("income_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute expendAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("expend_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute frozenAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("frozen_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute releaseAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("release_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute availableBalance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("available_balance");
		useMember(member);
		return member;
	}

	public NumberAttribute frozenBalance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("frozen_balance");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("create_time");
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

