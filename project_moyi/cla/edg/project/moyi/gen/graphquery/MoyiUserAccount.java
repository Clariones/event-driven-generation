package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

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
		member.setRelationName("user");
		append(member);
		return member;
	}

	// 被引用的对象

	public MoyiUserAccountRecord moyiUserAccountRecordList() {
		MoyiUserAccountRecord member = new MoyiUserAccountRecord();
		member.setModelTypeName("moyi_user_account_record");
		member.setName("moyi_user_account");
		member.setMemberName("moyiUserAccountRecordList");
		member.setRelationName("moyiUserAccount");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public MoyiUserAccountRechargeOrder moyiUserAccountRechargeOrderList() {
		MoyiUserAccountRechargeOrder member = new MoyiUserAccountRechargeOrder();
		member.setModelTypeName("moyi_user_account_recharge_order");
		member.setName("moyi_user_account");
		member.setMemberName("moyiUserAccountRechargeOrderList");
		member.setRelationName("moyiUserAccount");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WithdrawRecord withdrawRecordList() {
		WithdrawRecord member = new WithdrawRecord();
		member.setModelTypeName("withdraw_record");
		member.setName("moyi_user_account");
		member.setMemberName("withdrawRecordList");
		member.setRelationName("moyiUserAccount");
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

	public StringAttribute wechatOpenid(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("wechatOpenid");
		member.setName("wechat_openid");
		useMember(member);
		return member;
	}

	public StringAttribute wechatUnionId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("wechatUnionId");
		member.setName("wechat_union_id");
		useMember(member);
		return member;
	}

	public NumberAttribute balance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("balance");
		member.setName("balance");
		useMember(member);
		return member;
	}

	public NumberAttribute frozenAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("frozenAmount");
		member.setName("frozen_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute recommendationBouns(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("recommendationBouns");
		member.setName("recommendation_bouns");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

