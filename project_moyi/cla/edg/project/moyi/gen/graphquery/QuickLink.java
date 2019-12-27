package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class QuickLink extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.quicklink.QuickLink";
	}
	// 枚举对象

	// 引用的对象

	public UserApp app() {
		UserApp member = new UserApp();
		member.setModelTypeName("user_app");
		member.setName("app");
		member.setMemberName("app");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("icon");
		useMember(member);
		return member;
	}

	public StringAttribute imagePath(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image_path");
		useMember(member);
		return member;
	}

	public StringAttribute linkTarget(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("link_target");
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

