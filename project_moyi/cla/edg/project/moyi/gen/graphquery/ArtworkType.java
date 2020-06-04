package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArtworkType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.artworktype.ArtworkType";
	}
	// 枚举对象

	// 引用的对象

	public ArtType artType() {
		ArtType member = new ArtType();
		member.setModelTypeName("art_type");
		member.setName("art_type");
		member.setMemberName("artType");
		member.setReferDirection(true);
		member.setRelationName("artType");
		append(member);
		return member;
	}

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

	public SectionArtworkRelationship sectionArtworkRelationshipList() {
		SectionArtworkRelationship member = new SectionArtworkRelationship();
		member.setModelTypeName("section_artwork_relationship");
		member.setName("artwork_type");
		member.setMemberName("sectionArtworkRelationshipList");
		member.setRelationName("artworkType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Artwork artworkList() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork_type");
		member.setMemberName("artworkList");
		member.setRelationName("artworkType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkTypeImage artworkTypeImageList() {
		ArtworkTypeImage member = new ArtworkTypeImage();
		member.setModelTypeName("artwork_type_image");
		member.setName("artwork_type");
		member.setMemberName("artworkTypeImageList");
		member.setRelationName("artworkType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkFontStyle artworkFontStyleList() {
		ArtworkFontStyle member = new ArtworkFontStyle();
		member.setModelTypeName("artwork_font_style");
		member.setName("artwork_type");
		member.setMemberName("artworkFontStyleList");
		member.setRelationName("artworkType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DeliverArtwork deliverArtworkList() {
		DeliverArtwork member = new DeliverArtwork();
		member.setModelTypeName("deliver_artwork");
		member.setName("artwork_type");
		member.setMemberName("deliverArtworkList");
		member.setRelationName("artworkType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ArtworkTypeRank artworkTypeRankList() {
		ArtworkTypeRank member = new ArtworkTypeRank();
		member.setModelTypeName("artwork_type_rank");
		member.setName("artwork_type");
		member.setMemberName("artworkTypeRankList");
		member.setRelationName("artworkType");
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

	public StringAttribute chineseName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("chineseName");
		member.setName("chinese_name");
		useMember(member);
		return member;
	}

	public StringAttribute englishName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("englishName");
		member.setName("english_name");
		useMember(member);
		return member;
	}

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("coverImage");
		member.setName("cover_image");
		useMember(member);
		return member;
	}

	public BooleanAttribute display(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("display");
		member.setName("display");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
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

