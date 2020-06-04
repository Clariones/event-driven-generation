package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AffiliateBanner extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.affiliatebanner.AffiliateBanner";
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


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute image(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image");
		member.setName("image");
		useMember(member);
		return member;
	}

	public StringAttribute linkToUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("linkToUrl");
		member.setName("link_to_url");
		useMember(member);
		return member;
	}

	public StringAttribute tips(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("tips");
		member.setName("tips");
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

