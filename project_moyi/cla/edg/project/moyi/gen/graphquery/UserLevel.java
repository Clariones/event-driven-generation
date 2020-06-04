package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserLevel extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.userlevel.UserLevel";
	}
	// 枚举对象

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

	public MoyiUser moyiUserList() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("user_level");
		member.setMemberName("moyiUserList");
		member.setRelationName("userLevel");
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

	public StringAttribute levelName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("levelName");
		member.setName("level_name");
		useMember(member);
		return member;
	}

	public StringAttribute levelCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("levelCode");
		member.setName("level_code");
		useMember(member);
		return member;
	}

	public NumberAttribute levelQualifyValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("levelQualifyValue");
		member.setName("level_qualify_value");
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

