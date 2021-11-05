package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
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
	
	public SectionArtworkRelationship sectionArtworkRelationshipList() {
		SectionArtworkRelationship member = new SectionArtworkRelationship();
		member.setModelTypeName("section_artwork_relationship");
		member.setName("artwork_type");
		member.setMemberName("sectionArtworkRelationshipList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Artwork artworkList() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork_type");
		member.setMemberName("artworkList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkTypeImage artworkTypeImageList() {
		ArtworkTypeImage member = new ArtworkTypeImage();
		member.setModelTypeName("artwork_type_image");
		member.setName("artwork_type");
		member.setMemberName("artworkTypeImageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkFontStyle artworkFontStyleList() {
		ArtworkFontStyle member = new ArtworkFontStyle();
		member.setModelTypeName("artwork_font_style");
		member.setName("artwork_type");
		member.setMemberName("artworkFontStyleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DeliverArtwork deliverArtworkList() {
		DeliverArtwork member = new DeliverArtwork();
		member.setModelTypeName("deliver_artwork");
		member.setName("artwork_type");
		member.setMemberName("deliverArtworkList");
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

	public StringAttribute chineseName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("chineseName");
		useMember(member);
		return member;
	}

	public StringAttribute englishName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("englishName");
		useMember(member);
		return member;
	}

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("coverImage");
		useMember(member);
		return member;
	}

	public BooleanAttribute display(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("display");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

