package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class HotArtistRank extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.hotartistrank.HotArtistRank";
	}
	// 枚举对象

	// 引用的对象

	public Artist artist() {
		Artist member = new Artist();
		member.setModelTypeName("artist");
		member.setName("artist");
		member.setMemberName("artist");
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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute rankPoint(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("rank_point");
		useMember(member);
		return member;
	}

	public NumberAttribute bonusPoint(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("bonus_point");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("artwork_count");
		useMember(member);
		return member;
	}

	public NumberAttribute auctionCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("auction_count");
		useMember(member);
		return member;
	}

	public NumberAttribute artworkSoldCount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("artwork_sold_count");
		useMember(member);
		return member;
	}

	public NumberAttribute totalWatched(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("total_watched");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("last_update_time");
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

