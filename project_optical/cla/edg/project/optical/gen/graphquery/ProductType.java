package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProductType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.producttype.ProductType";
	}
	// 枚举对象
	public static EnumAttribute PRESCRIPTION_GLASSES = new EnumAttribute("com.doublechaintech.optical.producttype.ProductType", "PRESCRIPTION_GLASSES");
	public static EnumAttribute STANDARD_GLASSES = new EnumAttribute("com.doublechaintech.optical.producttype.ProductType", "STANDARD_GLASSES");
	public static EnumAttribute STANDARD_ACCESSORY = new EnumAttribute("com.doublechaintech.optical.producttype.ProductType", "STANDARD_ACCESSORY");
	public static EnumAttribute CLIP_ON = new EnumAttribute("com.doublechaintech.optical.producttype.ProductType", "CLIP_ON");

	// 引用的对象

	public ProductCategory category() {
		ProductCategory member = new ProductCategory();
		member.setModelTypeName("product_category");
		member.setName("category");
		member.setMemberName("category");
		member.setReferDirection(true);
		member.setRelationName("category");
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

	public Product productList() {
		Product member = new Product();
		member.setModelTypeName("product");
		member.setName("product_type");
		member.setMemberName("productList");
		member.setRelationName("productType");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Sku skuList() {
		Sku member = new Sku();
		member.setModelTypeName("sku");
		member.setName("product_type");
		member.setMemberName("skuList");
		member.setRelationName("productType");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

