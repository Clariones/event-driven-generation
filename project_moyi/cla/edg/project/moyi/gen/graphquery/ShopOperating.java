package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShopOperating extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.shopoperating.ShopOperating";
	}
	// 枚举对象

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		member.setRelationName("moyi");
		append(member);
		return member;
	}

	// 被引用的对象

	public ShopReferralRecord shopReferralRecordList() {
		ShopReferralRecord member = new ShopReferralRecord();
		member.setModelTypeName("shop_referral_record");
		member.setName("show_in");
		member.setMemberName("shopReferralRecordList");
		member.setRelationName("showIn");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ShopOpeningRewardRecord shopOpeningRewardRecordList() {
		ShopOpeningRewardRecord member = new ShopOpeningRewardRecord();
		member.setModelTypeName("shop_opening_reward_record");
		member.setName("show_in");
		member.setMemberName("shopOpeningRewardRecordList");
		member.setRelationName("showIn");
		member.setReferDirection(false);
		append(member);
		return member;
	}


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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

