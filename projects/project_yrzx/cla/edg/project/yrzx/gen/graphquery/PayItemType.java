package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PayItemType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.payitemtype.PayItemType";
	}
	// 枚举对象
	public static EnumAttribute LABOR = new EnumAttribute("com.yrdec.yrzx.payitemtype.PayItemType", "LABOR");
	public static EnumAttribute MATERIAL = new EnumAttribute("com.yrdec.yrzx.payitemtype.PayItemType", "MATERIAL");
	public static EnumAttribute OTHER = new EnumAttribute("com.yrdec.yrzx.payitemtype.PayItemType", "OTHER");

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

	public ContractPayItem contractPayItemList() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("pay_item_type");
		member.setMemberName("contractPayItemList");
		member.setRelationName("payItemType");
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

