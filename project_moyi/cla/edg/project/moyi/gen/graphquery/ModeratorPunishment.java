package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ModeratorPunishment extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moderatorpunishment.ModeratorPunishment";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser punisher() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("punisher");
		member.setMemberName("punisher");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser punishedUser() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("punished_user");
		member.setMemberName("punishedUser");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Article violationArticle() {
		Article member = new Article();
		member.setModelTypeName("article");
		member.setName("violation_article");
		member.setMemberName("violationArticle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Review violationReview() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("violation_review");
		member.setMemberName("violationReview");
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

	public DateTimeAttribute punishedDatetime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("punishedDatetime");
		useMember(member);
		return member;
	}

	public StringAttribute punishedComment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("punishedComment");
		useMember(member);
		return member;
	}

	public NumberAttribute punishedExperienceValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("punishedExperienceValue");
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
