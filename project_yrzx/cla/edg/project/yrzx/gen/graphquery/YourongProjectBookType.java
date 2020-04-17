package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class YourongProjectBookType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType";
	}
	// 枚举对象
	public static EnumAttribute PROPOSAL = new EnumAttribute("com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType", "PROPOSAL");
	public static EnumAttribute DESIGN = new EnumAttribute("com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType", "DESIGN");
	public static EnumAttribute PRICING = new EnumAttribute("com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType", "PRICING");
	public static EnumAttribute CONSTRUCTION = new EnumAttribute("com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType", "CONSTRUCTION");
	public static EnumAttribute DESIGN_RFP = new EnumAttribute("com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType", "DESIGN_RFP");
	public static EnumAttribute CONSTRUCTION_RFP = new EnumAttribute("com.yrdec.yrzx.yourongprojectbooktype.YourongProjectBookType", "CONSTRUCTION_RFP");

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public YourongProjectBook yourongProjectBookList() {
		YourongProjectBook member = new YourongProjectBook();
		member.setModelTypeName("yourong_project_book");
		member.setName("type");
		member.setMemberName("yourongProjectBookList");
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

	public StringAttribute imageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("imageUrl");
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

