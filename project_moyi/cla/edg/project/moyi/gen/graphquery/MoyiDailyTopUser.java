package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
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

	public StringAttribute userIdentification(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userIdentification");
		useMember(member);
		return member;
	}

	public StringAttribute userName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userName");
		useMember(member);
		return member;
	}

	public StringAttribute userProfileImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("userProfileImage");
		useMember(member);
		return member;
	}

	public NumberAttribute userDailyRank(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("userDailyRank");
		useMember(member);
		return member;
	}

	public StringAttribute userInkDeltaValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("userInkDeltaValue");
		useMember(member);
		return member;
	}

	public DateTimeAttribute date(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("date");
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
