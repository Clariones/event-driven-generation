package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LineItemType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.lineitemtype.LineItemType";
	}
	// 枚举对象
	public static EnumAttribute PRODUCE_PRODUCT = new EnumAttribute("com.doublechaintech.optical.lineitemtype.LineItemType", "PRODUCE_PRODUCT");
	public static EnumAttribute PRODUCT = new EnumAttribute("com.doublechaintech.optical.lineitemtype.LineItemType", "PRODUCT");

	// 引用的对象

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

	public LineItem lineItemList() {
		LineItem member = new LineItem();
		member.setModelTypeName("line_item");
		member.setName("line_item_type");
		member.setMemberName("lineItemList");
		member.setRelationName("lineItemType");
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

