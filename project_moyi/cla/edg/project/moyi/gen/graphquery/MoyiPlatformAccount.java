package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiPlatformAccount extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiplatformaccount.MoyiPlatformAccount";
	}
	// 枚举对象

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
	
	public MoyiPlatformAccountRecord moyiPlatformAccountRecordList() {
		MoyiPlatformAccountRecord member = new MoyiPlatformAccountRecord();
		member.setModelTypeName("moyi_platform_account_record");
		member.setName("account");
		member.setMemberName("moyiPlatformAccountRecordList");
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

	public NumberAttribute cashBalance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("cash_balance");
		useMember(member);
		return member;
	}

	public NumberAttribute ibBalance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("ib_balance");
		useMember(member);
		return member;
	}

	public NumberAttribute estimatedBankServiceFee(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("estimated_bank_service_fee");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("last_update_time");
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

