package cla.edg.project.moyi.gen.graphquery;

import cla.edg.modelbean.BaseModelBean;
import cla.edg.modelbean.EnumAttribute;
import cla.edg.modelbean.NumberAttribute;
import cla.edg.modelbean.StringAttribute;

public class AdditionalPlatformConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration";
	}
	// 枚举对象
	public static EnumAttribute PRIVACY_DECLARATION_LINK = new EnumAttribute("com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration", "PRIVACY_DECLARATION_LINK");
	public static EnumAttribute TRADING_DECLARATION_LINK = new EnumAttribute("com.terapico.moyi.additionalplatformconfiguration.AdditionalPlatformConfiguration", "TRADING_DECLARATION_LINK");

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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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

	public StringAttribute value(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("value");
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

