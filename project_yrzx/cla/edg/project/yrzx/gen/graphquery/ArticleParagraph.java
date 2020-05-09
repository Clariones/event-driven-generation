package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArticleParagraph extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.articleparagraph.ArticleParagraph";
	}
	// 枚举对象

	// 引用的对象

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

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("content");
		member.setName("content");
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

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
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

