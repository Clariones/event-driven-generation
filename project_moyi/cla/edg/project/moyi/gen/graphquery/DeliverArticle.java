package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class DeliverArticle extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.deliverarticle.DeliverArticle";
	}
	// 枚举对象

	// 引用的对象

	public ArticleType articleType() {
		ArticleType member = new ArticleType();
		member.setModelTypeName("article_type");
		member.setName("article_type");
		member.setMemberName("articleType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MasterColumn masterColumn() {
		MasterColumn member = new MasterColumn();
		member.setModelTypeName("master_column");
		member.setName("master_column");
		member.setMemberName("masterColumn");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Artwork relatedArtwork() {
		Artwork member = new Artwork();
		member.setModelTypeName("artwork");
		member.setName("related_artwork");
		member.setMemberName("relatedArtwork");
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

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute sourceInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("source_info");
		useMember(member);
		return member;
	}

	public StringAttribute imageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image_url");
		useMember(member);
		return member;
	}

	public StringAttribute imageText(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("image_text");
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

