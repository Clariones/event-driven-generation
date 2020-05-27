package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LensArCoating extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.lensarcoating.LensArCoating";
	}
	// 枚举对象

	// 引用的对象

	public CoatingType coatingType() {
		CoatingType member = new CoatingType();
		member.setModelTypeName("coating_type");
		member.setName("coating_type");
		member.setMemberName("coatingType");
		member.setReferDirection(true);
		member.setRelationName("coatingType");
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象

	public LensAvailableCoating lensAvailableCoatingList() {
		LensAvailableCoating member = new LensAvailableCoating();
		member.setModelTypeName("lens_available_coating");
		member.setName("coating");
		member.setMemberName("lensAvailableCoatingList");
		member.setRelationName("coating");
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

	public NumberAttribute externalCode(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("externalCode");
		member.setName("external_code");
		useMember(member);
		return member;
	}

	public NumberAttribute price(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("price");
		member.setName("price");
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

