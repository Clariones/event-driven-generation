package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HotShopRank extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.hotshoprank.HotShopRank";
	}
	// 枚举对象

	// 引用的对象

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


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute rankPoint(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("rankPoint");
		member.setName("rank_point");
		useMember(member);
		return member;
	}

	public NumberAttribute bonusPoint(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("bonusPoint");
		member.setName("bonus_point");
		useMember(member);
		return member;
	}

	public NumberAttribute totalAuction(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("totalAuction");
		member.setName("total_auction");
		useMember(member);
		return member;
	}

	public NumberAttribute totalSold(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("totalSold");
		member.setName("total_sold");
		useMember(member);
		return member;
	}

	public NumberAttribute totalWatched(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("totalWatched");
		member.setName("total_watched");
		useMember(member);
		return member;
	}

	public NumberAttribute runningDays(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("runningDays");
		member.setName("running_days");
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

