package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkAuctionComplaintReply extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworkauctioncomplaintreply.ArtworkAuctionComplaintReply";
	}
	// 枚举对象

	// 引用的对象

	public ArtworkAuctionComplaint complaint() {
		ArtworkAuctionComplaint member = new ArtworkAuctionComplaint();
		member.setModelTypeName("artwork_auction_complaint");
		member.setName("complaint");
		member.setMemberName("complaint");
		member.setReferDirection(true);
		member.setRelationName("complaint");
		append(member);
		return member;
	}

	public MoyiUser author() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("author");
		member.setMemberName("author");
		member.setReferDirection(true);
		member.setRelationName("author");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("description");
		member.setName("description");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

