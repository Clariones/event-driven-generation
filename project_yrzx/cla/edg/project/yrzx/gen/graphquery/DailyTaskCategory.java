package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DailyTaskCategory extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory";
	}
	// 枚举对象
	public static EnumAttribute INFO = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "INFO");
	public static EnumAttribute DIRECTIVE = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "DIRECTIVE");
	public static EnumAttribute REPORT = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "REPORT");
	public static EnumAttribute PROGRESS = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "PROGRESS");
	public static EnumAttribute NOTICE = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "NOTICE");
	public static EnumAttribute DESIGN = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "DESIGN");
	public static EnumAttribute ACCEPTANCE = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "ACCEPTANCE");
	public static EnumAttribute QUALITY = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "QUALITY");
	public static EnumAttribute ENGINEER_REPLY = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "ENGINEER_REPLY");
	public static EnumAttribute TECH_DISCLOSURE = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "TECH_DISCLOSURE");
	public static EnumAttribute CONSTRUCTION_DEPLOY = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "CONSTRUCTION_DEPLOY");
	public static EnumAttribute COST = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "COST");
	public static EnumAttribute BIDDING = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "BIDDING");
	public static EnumAttribute LABOR = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "LABOR");
	public static EnumAttribute SECURE = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "SECURE");
	public static EnumAttribute CHANGE_DESIGN = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "CHANGE_DESIGN");
	public static EnumAttribute VIOLATION = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "VIOLATION");
	public static EnumAttribute MATERIAL = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "MATERIAL");
	public static EnumAttribute AFTER_SALE = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "AFTER_SALE");
	public static EnumAttribute COMPENSATION = new EnumAttribute("com.yrdec.yrzx.dailytaskcategory.DailyTaskCategory", "COMPENSATION");

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

	public DailyTaskType dailyTaskTypeList() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("category");
		member.setMemberName("dailyTaskTypeList");
		member.setRelationName("category");
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

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("icon");
		member.setName("icon");
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

