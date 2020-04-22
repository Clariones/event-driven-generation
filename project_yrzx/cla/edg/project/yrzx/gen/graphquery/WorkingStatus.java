package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkingStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.workingstatus.WorkingStatus";
	}
	// 枚举对象
	public static EnumAttribute NONE = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "NONE");
	public static EnumAttribute PLANNING = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "PLANNING");
	public static EnumAttribute PROCESSING = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "PROCESSING");
	public static EnumAttribute PENDING = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "PENDING");
	public static EnumAttribute READY_ACCEPTANCE = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "READY_ACCEPTANCE");
	public static EnumAttribute MAINTAINING = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "MAINTAINING");
	public static EnumAttribute COMPLETED = new EnumAttribute("com.yrdec.yrzx.workingstatus.WorkingStatus", "COMPLETED");

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

	public Project projectListAsDesignStatus() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("design_status");
		member.setMemberName("projectListAsDesignStatus");
		member.setRelationName("designStatus");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public Project projectListAsConstructionStatus() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("construction_status");
		member.setMemberName("projectListAsConstructionStatus");
		member.setRelationName("designStatus");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

