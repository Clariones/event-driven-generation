package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Channel extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.channel.Channel";
	}
	// 枚举对象

	// 引用的对象

	public ChannelType channelType() {
		ChannelType member = new ChannelType();
		member.setModelTypeName("channel_type");
		member.setName("channel_type");
		member.setMemberName("channelType");
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

	public ArtType artType() {
		ArtType member = new ArtType();
		member.setModelTypeName("art_type");
		member.setName("art_type");
		member.setMemberName("artType");
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
	
	public ChannelSection channelSectionList() {
		ChannelSection member = new ChannelSection();
		member.setModelTypeName("channel_section");
		member.setName("channel");
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

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("displayOrder");
		useMember(member);
		return member;
	}

	public StringAttribute channelImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("channelImage");
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

