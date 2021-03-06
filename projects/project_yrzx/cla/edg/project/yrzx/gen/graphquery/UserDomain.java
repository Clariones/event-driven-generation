package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserDomain extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.userdomain.UserDomain";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	public UserWhiteList userWhiteListList() {
		UserWhiteList member = new UserWhiteList();
		member.setModelTypeName("user_white_list");
		member.setName("domain");
		member.setMemberName("userWhiteListList");
		member.setRelationName("domain");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public SecUser secUserList() {
		SecUser member = new SecUser();
		member.setModelTypeName("sec_user");
		member.setName("domain");
		member.setMemberName("secUserList");
		member.setRelationName("domain");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PublicKeyType publicKeyTypeList() {
		PublicKeyType member = new PublicKeyType();
		member.setModelTypeName("public_key_type");
		member.setName("domain");
		member.setMemberName("publicKeyTypeList");
		member.setRelationName("domain");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

