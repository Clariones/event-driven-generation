package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAuctionSortingItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkauctionsortingitem.ArtworkAuctionSortingItem";
	}
	// 枚举对象

	// 引用的对象

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		member.setRelationName("artwork");
		append(member);
		return member;
	}

	public MoyiShop moyiShop() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("moyi_shop");
		member.setMemberName("moyiShop");
		member.setReferDirection(true);
		member.setRelationName("moyiShop");
		append(member);
		return member;
	}

	public ArtworkAuction artworkAuction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("artwork_auction");
		member.setMemberName("artworkAuction");
		member.setReferDirection(true);
		member.setRelationName("artworkAuction");
		append(member);
		return member;
	}

	public ArtworkAuction lastArtworkAuction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("last_artwork_auction");
		member.setMemberName("lastArtworkAuction");
		member.setReferDirection(true);
		member.setRelationName("lastArtworkAuction");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute recordReason(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("recordReason");
		member.setName("record_reason");
		useMember(member);
		return member;
	}

	public DateTimeAttribute recordTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("recordTime");
		member.setName("record_time");
		useMember(member);
		return member;
	}

	public NumberAttribute sortPriority(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("sortPriority");
		member.setName("sort_priority");
		useMember(member);
		return member;
	}

	public StringAttribute lastRecordReason(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("lastRecordReason");
		member.setName("last_record_reason");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastRecordTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("lastRecordTime");
		member.setName("last_record_time");
		useMember(member);
		return member;
	}

	public NumberAttribute lastSortPriority(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("lastSortPriority");
		member.setName("last_sort_priority");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

