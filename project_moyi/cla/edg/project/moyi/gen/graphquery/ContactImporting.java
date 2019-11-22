package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ContactImporting extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.contactimporting.ContactImporting";
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

	public StringAttribute importMobile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_china_mobile_phone");
		member.setName("importMobile");
		useMember(member);
		return member;
	}

	public StringAttribute importName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("importName");
		useMember(member);
		return member;
	}

	public StringAttribute originImportPhonenumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("originImportPhonenumber");
		useMember(member);
		return member;
	}

	public BooleanAttribute alreadyRegisterWhenImport(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("alreadyRegisterWhenImport");
		useMember(member);
		return member;
	}

	public BooleanAttribute invitedSmsSent(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("invitedSmsSent");
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

