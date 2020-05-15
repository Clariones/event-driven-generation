package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class ShopReferralRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.shopreferralrecord.ShopReferralRecord";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser referee() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("referee");
		member.setMemberName("referee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser shopkeeper() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("shopkeeper");
		member.setMemberName("shopkeeper");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiShop shop() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("shop");
		member.setMemberName("shop");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ShopOperating showIn() {
		ShopOperating member = new ShopOperating();
		member.setModelTypeName("shop_operating");
		member.setName("show_in");
		member.setMemberName("showIn");
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

