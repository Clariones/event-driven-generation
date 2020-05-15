package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class ChannelSectionType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.channelsectiontype.ChannelSectionType";
	}
	// 枚举对象
	public static EnumAttribute FOCUS = new EnumAttribute("com.terapico.moyi.channelsectiontype.ChannelSectionType", "FOCUS");
	public static EnumAttribute ARTICLE = new EnumAttribute("com.terapico.moyi.channelsectiontype.ChannelSectionType", "ARTICLE");
	public static EnumAttribute ARTWORK_REVIEW = new EnumAttribute("com.terapico.moyi.channelsectiontype.ChannelSectionType", "ARTWORK_REVIEW");

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
	
	public ChannelSection channelSectionList() {
		ChannelSection member = new ChannelSection();
		member.setModelTypeName("channel_section");
		member.setName("channel_section_type");
		member.setMemberName("channelSectionList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

