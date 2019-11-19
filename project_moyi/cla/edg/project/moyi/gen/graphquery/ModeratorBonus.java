package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ModeratorBonus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moderatorbonus.ModeratorBonus";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser moderator() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("moderator");
		member.setMemberName("moderator");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
		useMember(member);
		return member;
	}

	public NumberAttribute inkCoinValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("inkCoinValue");
		useMember(member);
		return member;
	}

	public NumberAttribute experienceValue(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("experienceValue");
		useMember(member);
		return member;
	}

	public DateTimeAttribute bonusDatetime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_now");
		member.setName("bonusDatetime");
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

