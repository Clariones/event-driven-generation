package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TransactionDirection extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.transactiondirection.TransactionDirection";
	}
	// 枚举对象
	public static EnumAttribute INCOME = new EnumAttribute("com.terapico.moyi.transactiondirection.TransactionDirection", "INCOME");
	public static EnumAttribute OUTCOME = new EnumAttribute("com.terapico.moyi.transactiondirection.TransactionDirection", "OUTCOME");

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

	public RewardDetailRecord rewardDetailRecordList() {
		RewardDetailRecord member = new RewardDetailRecord();
		member.setModelTypeName("reward_detail_record");
		member.setName("transaction_direction");
		member.setMemberName("rewardDetailRecordList");
		member.setRelationName("transactionDirection");
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

