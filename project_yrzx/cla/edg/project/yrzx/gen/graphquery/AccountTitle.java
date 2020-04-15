package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountTitle extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.accounttitle.AccountTitle";
	}
	// 枚举对象

	// 引用的对象

	public Merchant merchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant");
		member.setMemberName("merchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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
	
	public AccountTitleMapping accountTitleMappingListAsPayerAccountTitle() {
		AccountTitleMapping member = new AccountTitleMapping();
		member.setModelTypeName("account_title_mapping");
		member.setName("payer_account_title");
		member.setMemberName("accountTitleMappingListAsPayerAccountTitle");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public AccountTitleMapping accountTitleMappingListAsPayeeAccountTitle() {
		AccountTitleMapping member = new AccountTitleMapping();
		member.setModelTypeName("account_title_mapping");
		member.setName("payee_account_title");
		member.setMemberName("accountTitleMappingListAsPayeeAccountTitle");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RunningAccountRecord runningAccountRecordList() {
		RunningAccountRecord member = new RunningAccountRecord();
		member.setModelTypeName("running_account_record");
		member.setName("account_title");
		member.setMemberName("runningAccountRecordList");
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

	public NumberAttribute titleCode(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("titleCode");
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

