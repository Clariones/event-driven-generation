package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class InkCoinIncentiveRule extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule";
	}
	// 枚举对象
	public static EnumAttribute REGISTRATION = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "REGISTRATION");
	public static EnumAttribute INVITATION = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "INVITATION");
	public static EnumAttribute CHECK_IN = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "CHECK_IN");
	public static EnumAttribute POST_ARTICLE = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "POST_ARTICLE");
	public static EnumAttribute POST_ARTWORK = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "POST_ARTWORK");
	public static EnumAttribute POST_ARTWORK_REVIEW = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "POST_ARTWORK_REVIEW");
	public static EnumAttribute POST_REVIEW = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "POST_REVIEW");
	public static EnumAttribute POST_LIKED = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "POST_LIKED");
	public static EnumAttribute SHARE_CONTENT = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "SHARE_CONTENT");
	public static EnumAttribute ARTWORK_REVIEWED = new EnumAttribute("com.terapico.moyi.inkcoinincentiverule.InkCoinIncentiveRule", "ARTWORK_REVIEWED");

	// 引用的对象

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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
		useMember(member);
		return member;
	}

	public NumberAttribute settlementDurationHour(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("settlementDurationHour");
		useMember(member);
		return member;
	}

	public NumberAttribute ruleValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("ruleValue");
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

