package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ArticleBlocking extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.articleblocking.ArticleBlocking";
	}
	// 枚举对象

	// 引用的对象

	public BlockingType blockingType() {
		BlockingType member = new BlockingType();
		member.setModelTypeName("blocking_type");
		member.setName("blocking_type");
		member.setMemberName("blockingType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Article blockedArticle() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("blocked_article");
		member.setMemberName("blockedArticle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser sponsor() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("sponsor");
		member.setMemberName("sponsor");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("comments");
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

