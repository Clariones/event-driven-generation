package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrontEndStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.frontendstatus.FrontEndStatus";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public FrontEndDocumentItem frontEndDocumentItemList() {
		FrontEndDocumentItem member = new FrontEndDocumentItem();
		member.setModelTypeName("front_end_document_item");
		member.setName("status");
		member.setMemberName("frontEndDocumentItemList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FrontEndCard frontEndCardList() {
		FrontEndCard member = new FrontEndCard();
		member.setModelTypeName("front_end_card");
		member.setName("status");
		member.setMemberName("frontEndCardList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

