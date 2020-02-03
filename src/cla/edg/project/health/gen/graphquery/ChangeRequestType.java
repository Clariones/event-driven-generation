package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.changerequesttype.ChangeRequestType";
	}
	// 枚举对象
	public static EnumAttribute ADD_CLASS = new EnumAttribute("com.doublechaintech.health.changerequesttype.ChangeRequestType", "ADD_CLASS");
	public static EnumAttribute ADD_STUDENT = new EnumAttribute("com.doublechaintech.health.changerequesttype.ChangeRequestType", "ADD_STUDENT");
	public static EnumAttribute PUBLISH_SURVEY = new EnumAttribute("com.doublechaintech.health.changerequesttype.ChangeRequestType", "PUBLISH_SURVEY");
	public static EnumAttribute FILL_SURVEY = new EnumAttribute("com.doublechaintech.health.changerequesttype.ChangeRequestType", "FILL_SURVEY");

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("request_type");
		member.setMemberName("changeRequestList");
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

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("icon");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("displayOrder");
		useMember(member);
		return member;
	}

	public StringAttribute bindTypes(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("bindTypes");
		useMember(member);
		return member;
	}

	public StringAttribute stepConfiguration(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("stepConfiguration");
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

