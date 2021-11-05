package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class InkDeedHoldingStatistic extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkdeedholdingstatistic.InkDeedHoldingStatistic";
	}
	// 枚举对象

	// 引用的对象

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ArtworkAuction auction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("auction");
		member.setMemberName("auction");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser holder() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("holder");
		member.setMemberName("holder");
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

	public NumberAttribute holdingQuantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("holdingQuantity");
		useMember(member);
		return member;
	}

	public NumberAttribute sellingQuantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("sellingQuantity");
		useMember(member);
		return member;
	}

	public NumberAttribute totalQuantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("totalQuantity");
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

