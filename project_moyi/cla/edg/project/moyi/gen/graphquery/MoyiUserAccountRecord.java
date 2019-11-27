package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiUserAccountRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyiuseraccountrecord.MoyiUserAccountRecord";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUserAccount moyiUserAccount() {
		MoyiUserAccount member = new MoyiUserAccount();
		member.setModelTypeName("moyi_user_account");
		member.setName("moyi_user_account");
		member.setMemberName("moyiUserAccount");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public FundsVariationType variationType() {
		FundsVariationType member = new FundsVariationType();
		member.setModelTypeName("funds_variation_type");
		member.setName("variation_type");
		member.setMemberName("variationType");
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

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public NumberAttribute availableBalance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("availableBalance");
		useMember(member);
		return member;
	}

	public NumberAttribute frozenBalance(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("frozenBalance");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}
