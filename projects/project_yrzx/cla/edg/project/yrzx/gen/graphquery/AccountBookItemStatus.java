package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBookItemStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.accountbookitemstatus.AccountBookItemStatus";
	}
	// 枚举对象
	public static EnumAttribute PROCESSING = new EnumAttribute("com.yrdec.yrzx.accountbookitemstatus.AccountBookItemStatus", "PROCESSING");
	public static EnumAttribute COMPLETED = new EnumAttribute("com.yrdec.yrzx.accountbookitemstatus.AccountBookItemStatus", "COMPLETED");
	public static EnumAttribute FROZEN = new EnumAttribute("com.yrdec.yrzx.accountbookitemstatus.AccountBookItemStatus", "FROZEN");

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

	public AccountBookItem accountBookItemList() {
		AccountBookItem member = new AccountBookItem();
		member.setModelTypeName("account_book_item");
		member.setName("status");
		member.setMemberName("accountBookItemList");
		member.setRelationName("status");
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

