package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialReviewStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectmaterialreviewstatus.ProjectMaterialReviewStatus";
	}
	// 枚举对象
	public static EnumAttribute PENDING = new EnumAttribute("com.yrdec.yrzx.projectmaterialreviewstatus.ProjectMaterialReviewStatus", "PENDING");
	public static EnumAttribute QUALIFIED = new EnumAttribute("com.yrdec.yrzx.projectmaterialreviewstatus.ProjectMaterialReviewStatus", "QUALIFIED");
	public static EnumAttribute DISQUALIFICATION = new EnumAttribute("com.yrdec.yrzx.projectmaterialreviewstatus.ProjectMaterialReviewStatus", "DISQUALIFICATION");

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

