package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ReviewLike extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.reviewlike.ReviewLike";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser moyiUser() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("moyi_user");
		member.setMemberName("moyiUser");
		member.setReferDirection(true);
		member.setRelationName("moyiUser");
		append(member);
		return member;
	}

	public Review review() {
		Review member = new Review();
		member.setModelTypeName("review");
		member.setName("review");
		member.setMemberName("review");
		member.setReferDirection(true);
		member.setRelationName("review");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
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

