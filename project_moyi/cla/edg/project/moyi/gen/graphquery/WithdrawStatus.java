package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class WithdrawStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.withdrawstatus.WithdrawStatus";
	}
	// 枚举对象
	public static EnumAttribute NEED_EXPORT = new EnumAttribute("com.terapico.moyi.withdrawstatus.WithdrawStatus", "NEED_EXPORT");
	public static EnumAttribute NEED_OFFLINE_PROCESSING = new EnumAttribute("com.terapico.moyi.withdrawstatus.WithdrawStatus", "NEED_OFFLINE_PROCESSING");
	public static EnumAttribute NEED_TAKE_OFF_FROZEN = new EnumAttribute("com.terapico.moyi.withdrawstatus.WithdrawStatus", "NEED_TAKE_OFF_FROZEN");
	public static EnumAttribute NEED_RELEASE_FROZEN = new EnumAttribute("com.terapico.moyi.withdrawstatus.WithdrawStatus", "NEED_RELEASE_FROZEN");
	public static EnumAttribute SUCCESS = new EnumAttribute("com.terapico.moyi.withdrawstatus.WithdrawStatus", "SUCCESS");
	public static EnumAttribute CANCELLED = new EnumAttribute("com.terapico.moyi.withdrawstatus.WithdrawStatus", "CANCELLED");

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
	
	public WithdrawRecord withdrawRecordList() {
		WithdrawRecord member = new WithdrawRecord();
		member.setModelTypeName("withdraw_record");
		member.setName("status");
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

