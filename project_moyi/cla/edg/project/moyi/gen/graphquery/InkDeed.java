package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class InkDeed extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkdeed.InkDeed";
	}
	// 枚举对象

	// 引用的对象

	public InkDeedStatus status() {
		InkDeedStatus member = new InkDeedStatus();
		member.setModelTypeName("ink_deed_status");
		member.setName("status");
		member.setMemberName("status");
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

	public MoyiUser seller() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("seller");
		member.setMemberName("seller");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public InkDeedEntryOrder entryOrder() {
		InkDeedEntryOrder member = new InkDeedEntryOrder();
		member.setModelTypeName("ink_deed_entry_order");
		member.setName("entry_order");
		member.setMemberName("entryOrder");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public InkDeedTradeRecord inkDeedTradeRecordList() {
		InkDeedTradeRecord member = new InkDeedTradeRecord();
		member.setModelTypeName("ink_deed_trade_record");
		member.setName("ink_deed");
		member.setMemberName("inkDeedTradeRecordList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public NumberAttribute soledTimes(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("soledTimes");
		useMember(member);
		return member;
	}

	public NumberAttribute issuePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("issuePrice");
		useMember(member);
		return member;
	}

	public NumberAttribute purchasePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("purchasePrice");
		useMember(member);
		return member;
	}

	public NumberAttribute cashValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("cashValue");
		useMember(member);
		return member;
	}

	public NumberAttribute usufructRatio(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("usufructRatio");
		useMember(member);
		return member;
	}

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("coverImage");
		useMember(member);
		return member;
	}

	public StringAttribute author(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("author");
		useMember(member);
		return member;
	}

	public BooleanAttribute cashed(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("cashed");
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

