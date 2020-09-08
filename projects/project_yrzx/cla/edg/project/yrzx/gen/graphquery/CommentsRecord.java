package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CommentsRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.commentsrecord.CommentsRecord";
	}
	// 枚举对象

	// 引用的对象

	public Merchant submitter() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("submitter");
		member.setMemberName("submitter");
		member.setReferDirection(true);
		member.setRelationName("submitter");
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

	public StringAttribute commentObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("commentObjectType");
		member.setName("comment_object_type");
		useMember(member);
		return member;
	}

	public StringAttribute commentObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("commentObjectId");
		member.setName("comment_object_id");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("comments");
		member.setName("comments");
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

