package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ArtworkAuctionRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkauctionrecord.ArtworkAuctionRecord";
	}
	// 枚举对象

	// 引用的对象

	public ArtworkAuctionStatus artworkAuctionStatus() {
		ArtworkAuctionStatus member = new ArtworkAuctionStatus();
		member.setModelTypeName("artwork_auction_status");
		member.setName("artwork_auction_status");
		member.setMemberName("artworkAuctionStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ArtworkAuction artworkAuction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("artwork_auction");
		member.setMemberName("artworkAuction");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("description");
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

