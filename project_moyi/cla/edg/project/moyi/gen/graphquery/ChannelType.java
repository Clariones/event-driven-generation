package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class ChannelType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.channeltype.ChannelType";
	}
	// 枚举对象
	public static EnumAttribute FOCUS = new EnumAttribute("com.terapico.moyi.channeltype.ChannelType", "FOCUS");
	public static EnumAttribute SECTION = new EnumAttribute("com.terapico.moyi.channeltype.ChannelType", "SECTION");

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
	
	public Channel channelList() {
		Channel member = new Channel();
		member.setModelTypeName("channel");
		member.setName("channel_type");
		member.setMemberName("channelList");
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

