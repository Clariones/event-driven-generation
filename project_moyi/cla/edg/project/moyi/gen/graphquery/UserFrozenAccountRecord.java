package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserFrozenAccountRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.userfrozenaccountrecord.UserFrozenAccountRecord";
	}
	// 枚举对象

	// 引用的对象

	public AssetStatus status() {
		AssetStatus member = new AssetStatus();
		member.setModelTypeName("asset_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

	public MoyiUser owner() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
		append(member);
		return member;
	}

	public MoyiUser payer() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("payer");
		member.setMemberName("payer");
		member.setReferDirection(true);
		member.setRelationName("payer");
		append(member);
		return member;
	}

	public MainOrder mainOrder() {
		MainOrder member = new MainOrder();
		member.setModelTypeName("main_order");
		member.setName("main_order");
		member.setMemberName("mainOrder");
		member.setReferDirection(true);
		member.setRelationName("mainOrder");
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

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("amount");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public NumberAttribute soldTimes(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("soldTimes");
		member.setName("sold_times");
		useMember(member);
		return member;
	}

	public StringAttribute detailInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("detailInfo");
		member.setName("detail_info");
		useMember(member);
		return member;
	}

	public StringAttribute otherRelatedType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("otherRelatedType");
		member.setName("other_related_type");
		useMember(member);
		return member;
	}

	public StringAttribute otherRelatedId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("otherRelatedId");
		member.setName("other_related_id");
		useMember(member);
		return member;
	}

	public DateTimeAttribute settleTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("settleTime");
		member.setName("settle_time");
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

