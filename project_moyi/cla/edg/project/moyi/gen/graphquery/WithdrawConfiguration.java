package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WithdrawConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.withdrawconfiguration.WithdrawConfiguration";
	}
	// 枚举对象

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		member.setRelationName("moyi");
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

	public StringAttribute defaultPaymentMethod(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("defaultPaymentMethod");
		member.setName("default_payment_method");
		useMember(member);
		return member;
	}

	public StringAttribute payingAccount(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("payingAccount");
		member.setName("paying_account");
		useMember(member);
		return member;
	}

	public NumberAttribute singleTradeUpperLimit(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("singleTradeUpperLimit");
		member.setName("single_trade_upper_limit");
		useMember(member);
		return member;
	}

	public NumberAttribute singleTradeLowerLimit(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		// member.setName("singleTradeLowerLimit");
		member.setName("single_trade_lower_limit");
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

