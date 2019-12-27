package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Slide extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.slide.Slide";
	}
	// 枚举对象

	// 引用的对象

	public SlideType slideType() {
		SlideType member = new SlideType();
		member.setModelTypeName("slide_type");
		member.setName("slide_type");
		member.setMemberName("slideType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Artwork linkedArtwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("linked_artwork");
		member.setMemberName("linkedArtwork");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Article linkedArticle() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("linked_article");
		member.setMemberName("linkedArticle");
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

	public StringAttribute image(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image");
		useMember(member);
		return member;
	}

	public StringAttribute linkUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("link_url");
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

