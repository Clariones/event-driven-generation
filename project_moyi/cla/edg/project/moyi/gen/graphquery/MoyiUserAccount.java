package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiUserAccount extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiuseraccount.MoyiUserAccount";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser user() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("user");
		member.setMemberName("user");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MoyiUserAccountRecord moyiUserAccountRecordList() {
		MoyiUserAccountRecord member = new MoyiUserAccountRecord();
		member.setModelTypeName("moyi_user_account_record");
		member.setName("moyi_user_account");
		member.setMemberName("moyiUserAccountRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public MoyiUserAccountRechargeOrder moyiUserAccountRechargeOrderList() {
		MoyiUserAccountRechargeOrder member = new MoyiUserAccountRechargeOrder();
		member.setModelTypeName("moyi_user_account_recharge_order");
		member.setName("moyi_user_account");
		member.setMemberName("moyiUserAccountRechargeOrderList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WithdrawRecord withdrawRecordList() {
		WithdrawRecord member = new WithdrawRecord();
		member.setModelTypeName("withdraw_record");
		member.setName("moyi_user_account");
		member.setMemberName("withdrawRecordList");
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

	public StringAttribute wechatOpenid(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("wechatOpenid");
		useMember(member);
		return member;
	}

	public StringAttribute wechatUnionId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("wechatUnionId");
		useMember(member);
		return member;
	}

	public NumberAttribute balance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("balance");
		useMember(member);
		return member;
	}

	public NumberAttribute frozenAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("frozenAmount");
		useMember(member);
		return member;
	}

	public NumberAttribute recommendationBouns(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("recommendationBouns");
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

