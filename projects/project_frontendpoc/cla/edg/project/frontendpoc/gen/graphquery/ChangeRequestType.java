package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.changerequesttype.ChangeRequestType";
	}
	// 枚举对象
	public static EnumAttribute SHOW_ALL_TYPE = new EnumAttribute("com.doublechaintech.frontendpoc.changerequesttype.ChangeRequestType", "SHOW_ALL_TYPE");
	public static EnumAttribute PROJECT_MANAGER_DAILY_REPORT = new EnumAttribute("com.doublechaintech.frontendpoc.changerequesttype.ChangeRequestType", "PROJECT_MANAGER_DAILY_REPORT");
	public static EnumAttribute TASK_DAILY_REPORT = new EnumAttribute("com.doublechaintech.frontendpoc.changerequesttype.ChangeRequestType", "TASK_DAILY_REPORT");

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

