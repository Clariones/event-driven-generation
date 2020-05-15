package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class UserInviteRegistrationInfo extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.userinviteregistrationinfo.UserInviteRegistrationInfo";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser inviter() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("inviter");
		member.setMemberName("inviter");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser invitee() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("invitee");
		member.setMemberName("invitee");
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

	public StringAttribute inviteCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("invite_code");
		useMember(member);
		return member;
	}

	public DateTimeAttribute registrationDate(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("registration_date");
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

