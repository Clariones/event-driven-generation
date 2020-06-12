package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RankConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.rankconfiguration.RankConfiguration";
	}
	// 枚举对象
	public static EnumAttribute A_EXAMPLE = new EnumAttribute("com.terapico.moyi.rankconfiguration.RankConfiguration", "A_EXAMPLE");
	public static EnumAttribute INK_VALUE_FOR_ARTWORK = new EnumAttribute("com.terapico.moyi.rankconfiguration.RankConfiguration", "INK_VALUE_FOR_ARTWORK");
	public static EnumAttribute LIKED_ARTWORK_FOR_ARTWORK = new EnumAttribute("com.terapico.moyi.rankconfiguration.RankConfiguration", "LIKED_ARTWORK_FOR_ARTWORK");
	public static EnumAttribute WATCHED_ARTWORK_FOR_ARTWORK = new EnumAttribute("com.terapico.moyi.rankconfiguration.RankConfiguration", "WATCHED_ARTWORK_FOR_ARTWORK");
	public static EnumAttribute COMMENTED_ARTWORK_FOR_ARTWORK = new EnumAttribute("com.terapico.moyi.rankconfiguration.RankConfiguration", "COMMENTED_ARTWORK_FOR_ARTWORK");
	public static EnumAttribute VIEWED_ARTWORK_FOR_ARTWORK = new EnumAttribute("com.terapico.moyi.rankconfiguration.RankConfiguration", "VIEWED_ARTWORK_FOR_ARTWORK");

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


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute value(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("value");
		member.setName("value");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute minValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("minValue");
		member.setName("min_value");
		useMember(member);
		return member;
	}

	public StringAttribute maxValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("maxValue");
		member.setName("max_value");
		useMember(member);
		return member;
	}

	public StringAttribute unit(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("unit");
		member.setName("unit");
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

