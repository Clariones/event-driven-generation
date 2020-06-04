package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.arttype.ArtType";
	}
	// 枚举对象

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

	public Channel channelList() {
		Channel member = new Channel();
		member.setModelTypeName("channel");
		member.setName("art_type");
		member.setMemberName("channelList");
		member.setRelationName("artType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkType artworkTypeList() {
		ArtworkType member = new ArtworkType();
		member.setModelTypeName("artwork_type");
		member.setName("art_type");
		member.setMemberName("artworkTypeList");
		member.setRelationName("artType");
		member.setReferDirection(false);
		append(member);
		return member;
	}


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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

