package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageSlide extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.pageslide.PageSlide";
	}
	// 枚举对象

	// 引用的对象

	public PageType pageType() {
		PageType member = new PageType();
		member.setModelTypeName("page_type");
		member.setName("page_type");
		member.setMemberName("pageType");
		member.setReferDirection(true);
		member.setRelationName("pageType");
		append(member);
		return member;
	}

	public PageSlideType slideType() {
		PageSlideType member = new PageSlideType();
		member.setModelTypeName("page_slide_type");
		member.setName("slide_type");
		member.setMemberName("slideType");
		member.setReferDirection(true);
		member.setRelationName("slideType");
		append(member);
		return member;
	}

	public Artwork artwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("artwork");
		member.setMemberName("artwork");
		member.setReferDirection(true);
		member.setRelationName("artwork");
		append(member);
		return member;
	}

	public Article article() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("article");
		member.setMemberName("article");
		member.setReferDirection(true);
		member.setRelationName("article");
		append(member);
		return member;
	}

	public ArtworkAuction auction() {
		ArtworkAuction member = new ArtworkAuction();
		member.setModelTypeName("artwork_auction");
		member.setName("auction");
		member.setMemberName("auction");
		member.setReferDirection(true);
		member.setRelationName("auction");
		append(member);
		return member;
	}

	public MoyiShop moyiShop() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("moyi_shop");
		member.setMemberName("moyiShop");
		member.setReferDirection(true);
		member.setRelationName("moyiShop");
		append(member);
		return member;
	}

	public Artist artist() {
		Artist member = new Artist();
		member.setModelTypeName("artist");
		member.setName("artist");
		member.setMemberName("artist");
		member.setReferDirection(true);
		member.setRelationName("artist");
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


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
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

	public StringAttribute linkToUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("linkToUrl");
		member.setName("link_to_url");
		useMember(member);
		return member;
	}

	public StringAttribute imageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("imageUrl");
		member.setName("image_url");
		useMember(member);
		return member;
	}

	public StringAttribute videoUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("videoUrl");
		member.setName("video_url");
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

