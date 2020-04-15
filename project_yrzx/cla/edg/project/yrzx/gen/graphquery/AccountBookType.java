package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBookType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.accountbooktype.AccountBookType";
	}
	// 枚举对象

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
	
	public AccountTitleMapping accountTitleMappingListAsPayerAccountBookType() {
		AccountTitleMapping member = new AccountTitleMapping();
		member.setModelTypeName("account_title_mapping");
		member.setName("payer_account_book_type");
		member.setMemberName("accountTitleMappingListAsPayerAccountBookType");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AccountTitleMapping accountTitleMappingListAsPayeeAccountBookType() {
		AccountTitleMapping member = new AccountTitleMapping();
		member.setModelTypeName("account_title_mapping");
		member.setName("payee_account_book_type");
		member.setMemberName("accountTitleMappingListAsPayeeAccountBookType");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public GenericAccountBook genericAccountBookList() {
		GenericAccountBook member = new GenericAccountBook();
		member.setModelTypeName("generic_account_book");
		member.setName("account_book_type");
		member.setMemberName("genericAccountBookList");
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

