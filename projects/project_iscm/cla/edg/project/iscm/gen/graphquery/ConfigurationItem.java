package cla.edg.project.iscm.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ConfigurationItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.iscm.configurationitem.ConfigurationItem";
	}
	// 枚举对象
	public static EnumAttribute INK_DEED_LOCK_TIME = new EnumAttribute("com.terapico.iscm.configurationitem.ConfigurationItem", "INK_DEED_LOCK_TIME");
	public static EnumAttribute AUCTION_ORDER_ACCOUNT_PERIOD = new EnumAttribute("com.terapico.iscm.configurationitem.ConfigurationItem", "AUCTION_ORDER_ACCOUNT_PERIOD");
	public static EnumAttribute AUCTION_START_PREROLL = new EnumAttribute("com.terapico.iscm.configurationitem.ConfigurationItem", "AUCTION_START_PREROLL");
	public static EnumAttribute BIDDING_DEPOSIT = new EnumAttribute("com.terapico.iscm.configurationitem.ConfigurationItem", "BIDDING_DEPOSIT");

	// 引用的对象

	public SystemConfiguration showIn() {
		SystemConfiguration member = new SystemConfiguration();
		member.setModelTypeName("system_configuration");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute value(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("value");
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

	public StringAttribute parameterUnit(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parameterUnit");
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

	public StringAttribute minimalValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("minimalValue");
		useMember(member);
		return member;
	}

	public StringAttribute maximumValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("maximumValue");
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

