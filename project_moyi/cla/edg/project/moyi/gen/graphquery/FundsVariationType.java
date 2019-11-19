package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class FundsVariationType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.fundsvariationtype.FundsVariationType";
	}
	// 枚举对象
	public static EnumAttribute INCOME = new EnumAttribute("com.terapico.moyi.fundsvariationtype.FundsVariationType", "INCOME");
	public static EnumAttribute EXPEND = new EnumAttribute("com.terapico.moyi.fundsvariationtype.FundsVariationType", "EXPEND");
	public static EnumAttribute RESERVE = new EnumAttribute("com.terapico.moyi.fundsvariationtype.FundsVariationType", "RESERVE");
	public static EnumAttribute RELEASE = new EnumAttribute("com.terapico.moyi.fundsvariationtype.FundsVariationType", "RELEASE");

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MoyiShopDepositRecord moyiShopDepositRecordList() {
		MoyiShopDepositRecord member = new MoyiShopDepositRecord();
		member.setModelTypeName("moyi_shop_deposit_record");
		member.setName("variation_type");
		member.setMemberName("moyiShopDepositRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiUserAccountRecord moyiUserAccountRecordList() {
		MoyiUserAccountRecord member = new MoyiUserAccountRecord();
		member.setModelTypeName("moyi_user_account_record");
		member.setName("variation_type");
		member.setMemberName("moyiUserAccountRecordList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

