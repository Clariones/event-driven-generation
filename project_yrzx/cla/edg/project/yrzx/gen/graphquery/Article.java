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
	
	public PageArticle pageArticleList() {
		PageArticle member = new PageArticle();
		member.setModelTypeName("page_article");
		member.setName("article");
		member.setMemberName("pageArticleList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
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

	public StringAttribute authorName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("authorName");
		member.setName("author_name");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

