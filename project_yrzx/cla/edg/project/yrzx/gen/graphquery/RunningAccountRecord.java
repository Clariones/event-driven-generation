package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RunningAccountRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.runningaccountrecord.RunningAccountRecord";
	}
	// 枚举对象

	// 引用的对象

	public AccountTitle accountTitle() {
		AccountTitle member = new AccountTitle();
		member.setModelTypeName("account_title");
		member.setName("account_title");
		member.setMemberName("accountTitle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AccountChangeType accountChangeType() {
		AccountChangeType member = new AccountChangeType();
		member.setModelTypeName("account_change_type");
		member.setName("account_change_type");
		member.setMemberName("accountChangeType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public GenericAccountBook accountBook() {
		GenericAccountBook member = new GenericAccountBook();
		member.setModelTypeName("generic_account_book");
		member.setName("account_book");
		member.setMemberName("accountBook");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CommonEventRecord sourceEvent() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("source_event");
		member.setMemberName("sourceEvent");
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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

