package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SurvivalStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.survivalstatus.SurvivalStatus";
	}
	// 枚举对象
	public static EnumAttribute NORMAL = new EnumAttribute("com.terapico.moyi.survivalstatus.SurvivalStatus", "NORMAL");
	public static EnumAttribute DELETED_BY_OWNER = new EnumAttribute("com.terapico.moyi.survivalstatus.SurvivalStatus", "DELETED_BY_OWNER");
	public static EnumAttribute DELETED_BY_ADMIN = new EnumAttribute("com.terapico.moyi.survivalstatus.SurvivalStatus", "DELETED_BY_ADMIN");

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
		member.setName("active");
		member.setMemberName("channelList");
		member.setRelationName("active");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ChannelSection channelSectionList() {
		ChannelSection member = new ChannelSection();
		member.setModelTypeName("channel_section");
		member.setName("active");
		member.setMemberName("channelSectionList");
		member.setRelationName("active");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MasterColumn masterColumnList() {
		MasterColumn member = new MasterColumn();
		member.setModelTypeName("master_column");
		member.setName("active");
		member.setMemberName("masterColumnList");
		member.setRelationName("active");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Section sectionList() {
		Section member = new Section();
		member.setModelTypeName("section");
		member.setName("active");
		member.setMemberName("sectionList");
		member.setRelationName("active");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Artwork artworkList() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("active");
		member.setMemberName("artworkList");
		member.setRelationName("active");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("active");
		member.setMemberName("articleList");
		member.setRelationName("active");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Review reviewList() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("active");
		member.setMemberName("reviewList");
		member.setRelationName("active");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

