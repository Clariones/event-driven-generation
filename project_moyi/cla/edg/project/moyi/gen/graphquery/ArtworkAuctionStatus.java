package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ArtworkAuctionStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus";
	}
	// 枚举对象
	public static EnumAttribute WAIT_FOR_DISPLAY = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "WAIT_FOR_DISPLAY");
	public static EnumAttribute DISPLAYING = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "DISPLAYING");
	public static EnumAttribute BIDDING = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "BIDDING");
	public static EnumAttribute DEAL_WAIT_PROCESS = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "DEAL_WAIT_PROCESS");
	public static EnumAttribute DEAL = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "DEAL");
	public static EnumAttribute BOUGHT_IN_WAIT_PROCESS = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "BOUGHT_IN_WAIT_PROCESS");
	public static EnumAttribute BOUGHT_IN = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "BOUGHT_IN");
	public static EnumAttribute CANCELLED = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "CANCELLED");
	public static EnumAttribute CLOSED = new EnumAttribute("com.terapico.moyi.artworkauctionstatus.ArtworkAuctionStatus", "CLOSED");

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
	
	public ArtworkAuction artworkAuctionList() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("artwork_auction_status");
		member.setMemberName("artworkAuctionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkAuctionRecord artworkAuctionRecordList() {
		ArtworkAuctionRecord member = new ArtworkAuctionRecord();
		member.setModelTypeName("artwork_auction_record");
		member.setName("artwork_auction_status");
		member.setMemberName("artworkAuctionRecordList");
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

