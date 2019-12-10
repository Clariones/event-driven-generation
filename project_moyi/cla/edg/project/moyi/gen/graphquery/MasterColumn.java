package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MasterColumn extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.mastercolumn.MasterColumn";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser columnAuthor() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("column_author");
		member.setMemberName("columnAuthor");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SurvivalStatus active() {
		SurvivalStatus member = new SurvivalStatus();
		member.setModelTypeName("survival_status");
		member.setName("active");
		member.setMemberName("active");
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
	
	public Article articleList() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("master_column");
		member.setMemberName("articleList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiColumnAuthor moyiColumnAuthorList() {
		MoyiColumnAuthor member = new MoyiColumnAuthor();
		member.setModelTypeName("moyi_column_author");
		member.setName("master_column");
		member.setMemberName("moyiColumnAuthorList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public DeliverArticle deliverArticleList() {
		DeliverArticle member = new DeliverArticle();
		member.setModelTypeName("deliver_article");
		member.setName("master_column");
		member.setMemberName("deliverArticleList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute pinyinName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("pinyin_name");
		useMember(member);
		return member;
	}

	public StringAttribute columnIntroduction(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("column_introduction");
		useMember(member);
		return member;
	}

	public StringAttribute coverImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("cover_image");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("create_time");
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

