package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GenericAccountBookItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.genericaccountbookitem.GenericAccountBookItem";
	}
	// 枚举对象

	// 引用的对象

	public AccountChangeType type() {
		AccountChangeType member = new AccountChangeType();
		member.setModelTypeName("account_change_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public AccountBookItemStatus status() {
		AccountBookItemStatus member = new AccountBookItemStatus();
		member.setModelTypeName("account_book_item_status");
		member.setName("status");
		member.setMemberName("status");
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

	public NumberAttribute originAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("originAmount");
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

	public StringAttribute referedObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("referedObjectType");
		useMember(member);
		return member;
	}

	public StringAttribute referedObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("referedObjectId");
		useMember(member);
		return member;
	}

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
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

