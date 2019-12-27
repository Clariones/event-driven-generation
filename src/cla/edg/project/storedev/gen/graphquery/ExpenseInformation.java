package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ExpenseInformation extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.expenseinformation.ExpenseInformation";
	}
	// 枚举对象

	// 引用的对象

	public SearchStoreMethod searchStore() {
		SearchStoreMethod member = new SearchStoreMethod();
		member.setModelTypeName("search_store_method");
		member.setName("search_store");
		member.setMemberName("searchStore");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
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

	public NumberAttribute rentExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("rentExpense");
		useMember(member);
		return member;
	}

	public StringAttribute recommenderContactInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("recommenderContactInfo");
		useMember(member);
		return member;
	}

	public StringAttribute propertyOwnerName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("propertyOwnerName");
		useMember(member);
		return member;
	}

	public StringAttribute propertyOwnerContactInfo(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("propertyOwnerContactInfo");
		useMember(member);
		return member;
	}

	public NumberAttribute brokerExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("brokerExpense");
		useMember(member);
		return member;
	}

	public NumberAttribute transferExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("transferExpense");
		useMember(member);
		return member;
	}

	public NumberAttribute otherExpense(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("otherExpense");
		useMember(member);
		return member;
	}

	public StringAttribute expenseDescription(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("expenseDescription");
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

