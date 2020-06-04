package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FavoriteShopOfUser extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.favoriteshopofuser.FavoriteShopOfUser";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser actorMoyiUser() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("actor_moyi_user");
		member.setMemberName("actorMoyiUser");
		member.setReferDirection(true);
		member.setRelationName("actorMoyiUser");
		append(member);
		return member;
	}

	public MoyiShop targetMoyiShop() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("target_moyi_shop");
		member.setMemberName("targetMoyiShop");
		member.setReferDirection(true);
		member.setRelationName("targetMoyiShop");
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

	public BooleanAttribute available(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("available");
		member.setName("available");
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

