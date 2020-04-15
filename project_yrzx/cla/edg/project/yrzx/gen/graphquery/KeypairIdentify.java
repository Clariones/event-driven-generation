package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class KeypairIdentify extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.keypairidentify.KeypairIdentify";
	}
	// 枚举对象

	// 引用的对象

	public PublicKeyType keyType() {
		PublicKeyType member = new PublicKeyType();
		member.setModelTypeName("public_key_type");
		member.setName("key_type");
		member.setMemberName("keyType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public SecUser secUser() {
		SecUser member = new SecUser();
		member.setModelTypeName("sec_user");
		member.setName("sec_user");
		member.setMemberName("secUser");
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

	public StringAttribute publicKey(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("publicKey");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
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

