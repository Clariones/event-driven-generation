package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiDailyTopUser extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyidailytopuser.MoyiDailyTopUser";
	}
	// 枚举对象

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		member.setRelationName("moyi");
		append(member);
		return member;
	}

	// 被引用的对象


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute userIdentification(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("userIdentification");
		member.setName("user_identification");
		useMember(member);
		return member;
	}

	public StringAttribute userName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("userName");
		member.setName("user_name");
		useMember(member);
		return member;
	}

	public StringAttribute userProfileImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("userProfileImage");
		member.setName("user_profile_image");
		useMember(member);
		return member;
	}

	public NumberAttribute userDailyRank(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("userDailyRank");
		member.setName("user_daily_rank");
		useMember(member);
		return member;
	}

	public StringAttribute userInkDeltaValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("userInkDeltaValue");
		member.setName("user_ink_delta_value");
		useMember(member);
		return member;
	}

	public DateTimeAttribute date(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("date");
		member.setName("date");
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

