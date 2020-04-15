package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GenericAccountBook extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.genericaccountbook.GenericAccountBook";
	}
	// 枚举对象

	// 引用的对象

	public Merchant owner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AccountBookType accountBookType() {
		AccountBookType member = new AccountBookType();
		member.setModelTypeName("account_book_type");
		member.setName("account_book_type");
		member.setMemberName("accountBookType");
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
	
	public OriginalEvidenceRecord originalEvidenceRecordList() {
		OriginalEvidenceRecord member = new OriginalEvidenceRecord();
		member.setModelTypeName("original_evidence_record");
		member.setName("payer_account");
		member.setMemberName("originalEvidenceRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RunningAccountRecord runningAccountRecordList() {
		RunningAccountRecord member = new RunningAccountRecord();
		member.setModelTypeName("running_account_record");
		member.setName("account_book");
		member.setMemberName("runningAccountRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public GenericAccountBookItem genericAccountBookItemList() {
		GenericAccountBookItem member = new GenericAccountBookItem();
		member.setModelTypeName("generic_account_book_item");
		member.setName("account_book");
		member.setMemberName("genericAccountBookItemList");
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

	public NumberAttribute balanceAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("balanceAmount");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

