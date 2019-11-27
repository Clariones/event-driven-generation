package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
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
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MoyiUser moyiUserList() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("user_level");
		member.setMemberName("moyiUserList");
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

	public StringAttribute levelName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("levelName");
		useMember(member);
		return member;
	}

	public StringAttribute levelCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("levelCode");
		useMember(member);
		return member;
	}

	public NumberAttribute levelQualifyValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("levelQualifyValue");
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
