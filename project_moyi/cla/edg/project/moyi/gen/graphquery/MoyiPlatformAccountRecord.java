package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiPlatformAccountRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiplatformaccountrecord.MoyiPlatformAccountRecord";
	}
	// 枚举对象

	// 引用的对象

	public MoyiPlatformAccount account() {
		MoyiPlatformAccount member = new MoyiPlatformAccount();
		member.setModelTypeName("moyi_platform_account");
		member.setName("account");
		member.setMemberName("account");
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

	public NumberAttribute cashAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("cash_amount");
		useMember(member);
		return member;
	}

	public NumberAttribute ibAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("ib_amount");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public StringAttribute referToType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("refer_to_type");
		useMember(member);
		return member;
	}

	public StringAttribute referToId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("refer_to_id");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("create_time");
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

