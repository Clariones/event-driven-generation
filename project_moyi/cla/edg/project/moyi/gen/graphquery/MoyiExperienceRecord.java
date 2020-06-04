package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiExperienceRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiexperiencerecord.MoyiExperienceRecord";
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

	public MoyiExperienceRule appliedRule() {
		MoyiExperienceRule member = new MoyiExperienceRule();
		member.setModelTypeName("moyi_experience_rule");
		member.setName("applied_rule");
		member.setMemberName("appliedRule");
		member.setReferDirection(true);
		member.setRelationName("appliedRule");
		append(member);
		return member;
	}

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


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("summary");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public NumberAttribute appliedPoint(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("appliedPoint");
		member.setName("applied_point");
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

	public StringAttribute relatedObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("relatedObjectType");
		member.setName("related_object_type");
		useMember(member);
		return member;
	}

	public StringAttribute relatedObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("relatedObjectId");
		member.setName("related_object_id");
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

