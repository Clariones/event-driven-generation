package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Article extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.article.Article";
	}
	// 枚举对象

	// 引用的对象

	public ArticleCategory category() {
		ArticleCategory member = new ArticleCategory();
		member.setModelTypeName("article_category");
		member.setName("category");
		member.setMemberName("category");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant postByMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("post_by_merchant");
		member.setMemberName("postByMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination postByEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("post_by_employee");
		member.setMemberName("postByEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ArticleParagraph articleParagraphList() {
		ArticleParagraph member = new ArticleParagraph();
		member.setModelTypeName("article_paragraph");
		member.setName("article");
		member.setMemberName("articleParagraphList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HomepageSlide homepageSlideList() {
		HomepageSlide member = new HomepageSlide();
		member.setModelTypeName("homepage_slide");
		member.setName("article");
		member.setMemberName("homepageSlideList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public HomepageArticle homepageArticleList() {
		HomepageArticle member = new HomepageArticle();
		member.setModelTypeName("homepage_article");
		member.setName("article");
		member.setMemberName("homepageArticleList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
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

	public StringAttribute authorName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("authorName");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

