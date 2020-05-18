package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class UserDomain extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.userdomain.UserDomain";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public UserWhiteList userWhiteListList() {
		UserWhiteList member = new UserWhiteList();
		member.setModelTypeName("user_white_list");
		member.setName("domain");
		member.setMemberName("userWhiteListList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SecUser secUserList() {
		SecUser member = new SecUser();
		member.setModelTypeName("sec_user");
		member.setName("domain");
		member.setMemberName("secUserList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

