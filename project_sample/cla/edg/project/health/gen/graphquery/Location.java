package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Location extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.location.Location";
	}
	// 枚举对象

	// 引用的对象

	public District district() {
		District member = new District();
		member.setModelTypeName("district");
		member.setName("district");
		member.setMemberName("district");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Province province() {
		Province member = new Province();
		member.setModelTypeName("province");
		member.setName("province");
		member.setMemberName("province");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public WechatUser wechatUserList() {
		WechatUser member = new WechatUser();
		member.setModelTypeName("wechat_user");
		member.setName("address");
		member.setMemberName("wechatUserList");
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

	public StringAttribute address(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("address");
		useMember(member);
		return member;
	}

	public NumberAttribute latitude(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("latitude");
		useMember(member);
		return member;
	}

	public NumberAttribute longitude(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("longitude");
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

