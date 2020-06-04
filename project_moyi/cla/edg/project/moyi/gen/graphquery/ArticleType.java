package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArticleType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.articletype.ArticleType";
	}
	// 枚举对象
	public static EnumAttribute COLUMN = new EnumAttribute("com.terapico.moyi.articletype.ArticleType", "COLUMN");
	public static EnumAttribute ARTWORK_REVIEW = new EnumAttribute("com.terapico.moyi.articletype.ArticleType", "ARTWORK_REVIEW");
	public static EnumAttribute MASTER_OPINION = new EnumAttribute("com.terapico.moyi.articletype.ArticleType", "MASTER_OPINION");
	public static EnumAttribute SECTION_ARTICLE = new EnumAttribute("com.terapico.moyi.articletype.ArticleType", "SECTION_ARTICLE");
	public static EnumAttribute QUESTION = new EnumAttribute("com.terapico.moyi.articletype.ArticleType", "QUESTION");
	public static EnumAttribute QUESTION_AND_ANSWER = new EnumAttribute("com.terapico.moyi.articletype.ArticleType", "QUESTION_AND_ANSWER");

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

	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("article_type");
		member.setMemberName("articleList");
		member.setRelationName("articleType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public DeliverArticle deliverArticleList() {
		DeliverArticle member = new DeliverArticle();
		member.setModelTypeName("deliver_article");
		member.setName("article_type");
		member.setMemberName("deliverArticleList");
		member.setRelationName("articleType");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

