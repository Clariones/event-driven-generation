package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountTitleMapping extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.accounttitlemapping.AccountTitleMapping";
	}
	// 枚举对象

	// 引用的对象

	public AccountBookType payerAccountBookType() {
		AccountBookType member = new AccountBookType();
		member.setModelTypeName("account_book_type");
		member.setName("payer_account_book_type");
		member.setMemberName("payerAccountBookType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AccountBookType payeeAccountBookType() {
		AccountBookType member = new AccountBookType();
		member.setModelTypeName("account_book_type");
		member.setName("payee_account_book_type");
		member.setMemberName("payeeAccountBookType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AccountTitle payerAccountTitle() {
		AccountTitle member = new AccountTitle();
		member.setModelTypeName("account_title");
		member.setName("payer_account_title");
		member.setMemberName("payerAccountTitle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AccountTitle payeeAccountTitle() {
		AccountTitle member = new AccountTitle();
		member.setModelTypeName("account_title");
		member.setName("payee_account_title");
		member.setMemberName("payeeAccountTitle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public FeeType feeType() {
		FeeType member = new FeeType();
		member.setModelTypeName("fee_type");
		member.setName("fee_type");
		member.setMemberName("feeType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
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

