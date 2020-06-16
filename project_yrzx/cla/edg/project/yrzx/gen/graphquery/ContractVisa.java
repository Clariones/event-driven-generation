package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractVisa extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractvisa.ContractVisa";
	}
	// 枚举对象

	// 引用的对象

	public ContractPayItem contractPayItem() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("contract_pay_item");
		member.setMemberName("contractPayItem");
		member.setReferDirection(true);
		member.setRelationName("contractPayItem");
		append(member);
		return member;
	}

	// 被引用的对象


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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("brief");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("amount");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public DateTimeAttribute expectedTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("expectedTime");
		member.setName("expected_time");
		useMember(member);
		return member;
	}

	public StringAttribute payCriteira(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payCriteira");
		member.setName("pay_criteira");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
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

