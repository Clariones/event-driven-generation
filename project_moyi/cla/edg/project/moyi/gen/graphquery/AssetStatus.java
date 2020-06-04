package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AssetStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.assetstatus.AssetStatus";
	}
	// 枚举对象
	public static EnumAttribute RECEIVABLE = new EnumAttribute("com.terapico.moyi.assetstatus.AssetStatus", "RECEIVABLE");
	public static EnumAttribute FROZEN = new EnumAttribute("com.terapico.moyi.assetstatus.AssetStatus", "FROZEN");
	public static EnumAttribute RELEASED = new EnumAttribute("com.terapico.moyi.assetstatus.AssetStatus", "RELEASED");
	public static EnumAttribute SEND_BACK = new EnumAttribute("com.terapico.moyi.assetstatus.AssetStatus", "SEND_BACK");
	public static EnumAttribute INVALID = new EnumAttribute("com.terapico.moyi.assetstatus.AssetStatus", "INVALID");

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

	public UserFrozenAccountRecord userFrozenAccountRecordList() {
		UserFrozenAccountRecord member = new UserFrozenAccountRecord();
		member.setModelTypeName("user_frozen_account_record");
		member.setName("status");
		member.setMemberName("userFrozenAccountRecordList");
		member.setRelationName("status");
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
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

