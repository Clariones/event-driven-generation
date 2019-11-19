package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class SecUserBlocking extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.secuserblocking.SecUserBlocking";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public SecUser secUserList() {
		SecUser member = new SecUser();
		member.setModelTypeName("sec_user");
		member.setName("blocking");
		member.setMemberName("secUserList");
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

	public StringAttribute who(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("who");
		useMember(member);
		return member;
	}

	public DateTimeAttribute blockTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("blockTime");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("comments");
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

