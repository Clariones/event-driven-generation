package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PublicKeyType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.publickeytype.PublicKeyType";
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
	
	public KeypairIdentify keypairIdentifyList() {
		KeypairIdentify member = new KeypairIdentify();
		member.setModelTypeName("keypair_identify");
		member.setName("key_type");
		member.setMemberName("keypairIdentifyList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
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
