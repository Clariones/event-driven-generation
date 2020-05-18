package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class ChannelSection extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.channelsection.ChannelSection";
	}
	// 枚举对象

	// 引用的对象

	public ChannelSectionType channelSectionType() {
		ChannelSectionType member = new ChannelSectionType();
		member.setModelTypeName("channel_section_type");
		member.setName("channel_section_type");
		member.setMemberName("channelSectionType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SurvivalStatus active() {
		SurvivalStatus member = new SurvivalStatus();
		member.setModelTypeName("survival_status");
		member.setName("active");
		member.setMemberName("active");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Section section() {
		Section member = new Section();
		member.setModelTypeName("section");
		member.setName("section");
		member.setMemberName("section");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Channel channel() {
		Channel member = new Channel();
		member.setModelTypeName("channel");
		member.setName("channel");
		member.setMemberName("channel");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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
	
	public ChannelArticle channelArticleList() {
		ChannelArticle member = new ChannelArticle();
		member.setModelTypeName("channel_article");
		member.setName("channel_section");
		member.setMemberName("channelArticleList");
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

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("display_order");
		useMember(member);
		return member;
	}

	public DateTimeAttribute addedTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("added_time");
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

