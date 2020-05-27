package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SkuInventory extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.skuinventory.SkuInventory";
	}
	// 枚举对象

	// 引用的对象

	public Sku sku() {
		Sku member = new Sku();
		member.setModelTypeName("sku");
		member.setName("sku");
		member.setMemberName("sku");
		member.setReferDirection(true);
		member.setRelationName("sku");
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


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute quantity(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("quantity");
		member.setName("quantity");
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

