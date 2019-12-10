package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ChannelArticle extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.channelarticle.ChannelArticle";
	}
	// 枚举对象

	// 引用的对象

	public ChannelSection channelSection() {
		ChannelSection member = new ChannelSection();
		member.setModelTypeName("channel_section");
		member.setName("channel_section");
		member.setMemberName("channelSection");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Article article() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("article");
		member.setMemberName("article");
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

