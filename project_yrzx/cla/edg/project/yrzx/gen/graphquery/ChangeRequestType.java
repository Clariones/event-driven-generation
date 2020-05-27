package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.changerequesttype.ChangeRequestType";
	}
	// 枚举对象
	public static EnumAttribute RESOLVE_AFTER_SALES = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "RESOLVE_AFTER_SALES");
	public static EnumAttribute COMMENTS_ON_CONTRACT = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "COMMENTS_ON_CONTRACT");
	public static EnumAttribute REVIEW_CONTRACT = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "REVIEW_CONTRACT");
	public static EnumAttribute APPLY_RECOMMENDATION = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "APPLY_RECOMMENDATION");
	public static EnumAttribute SHOW_ALL_TYPE = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "SHOW_ALL_TYPE");
	public static EnumAttribute ADD_PROJECT_NOMINATION = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "ADD_PROJECT_NOMINATION");
	public static EnumAttribute PROJECT_COMMAND = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "PROJECT_COMMAND");
	public static EnumAttribute TASK_REPORT = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "TASK_REPORT");
	public static EnumAttribute ADD_EMPLOYEE = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "ADD_EMPLOYEE");
	public static EnumAttribute ACCEPTANCE_APPLICATION = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "ACCEPTANCE_APPLICATION");
	public static EnumAttribute AFTER_SALES = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "AFTER_SALES");
	public static EnumAttribute APPLY_DECORATION = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "APPLY_DECORATION");
	public static EnumAttribute REVIEW_MATERIALS = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "REVIEW_MATERIALS");
	public static EnumAttribute LABOR_SUPERVISOR = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "LABOR_SUPERVISOR");
	public static EnumAttribute PROJECT_PENALTIES = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "PROJECT_PENALTIES");
	public static EnumAttribute APPLY_EMPLACEMENT = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "APPLY_EMPLACEMENT");
	public static EnumAttribute PROJECT_PROGRESS = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "PROJECT_PROGRESS");
	public static EnumAttribute COMMENTS_ON_MATERIALS = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "COMMENTS_ON_MATERIALS");
	public static EnumAttribute APPLY_FOR_ADVANCE_COMPENSATION = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "APPLY_FOR_ADVANCE_COMPENSATION");
	public static EnumAttribute PROJECT_MANAGER_REPORT = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "PROJECT_MANAGER_REPORT");
	public static EnumAttribute FILL_PERSONAL_DETAIL = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "FILL_PERSONAL_DETAIL");
	public static EnumAttribute PROJECT_SUPERVISION_REPORT = new EnumAttribute("com.yrdec.yrzx.changerequesttype.ChangeRequestType", "PROJECT_SUPERVISION_REPORT");

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象

	public ChangeRequest changeRequestList() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("request_type");
		member.setMemberName("changeRequestList");
		member.setRelationName("requestType");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("icon");
		member.setName("icon");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
		useMember(member);
		return member;
	}

	public StringAttribute bindTypes(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("bindTypes");
		member.setName("bind_types");
		useMember(member);
		return member;
	}

	public StringAttribute stepConfiguration(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("stepConfiguration");
		member.setName("step_configuration");
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

