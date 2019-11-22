package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class UserWhiteList extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.userwhitelist.UserWhiteList";
	}
	// 枚举对象

	// 引用的对象

	public UserDomain domain() {
		UserDomain member = new UserDomain();
		member.setModelTypeName("user_domain");
		member.setName("domain");
		member.setMemberName("domain");
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

	public StringAttribute userIdentity(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userIdentity");
		useMember(member);
		return member;
	}

	public StringAttribute userSpecialFunctions(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userSpecialFunctions");
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

