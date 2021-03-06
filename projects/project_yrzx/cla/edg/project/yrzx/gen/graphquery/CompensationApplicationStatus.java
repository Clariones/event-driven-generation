package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CompensationApplicationStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.compensationapplicationstatus.CompensationApplicationStatus";
	}
	// 枚举对象
	public static EnumAttribute ACCEPTING = new EnumAttribute("com.yrdec.yrzx.compensationapplicationstatus.CompensationApplicationStatus", "ACCEPTING");
	public static EnumAttribute ACCEPTED = new EnumAttribute("com.yrdec.yrzx.compensationapplicationstatus.CompensationApplicationStatus", "ACCEPTED");

	// 引用的对象

	// 被引用的对象

	public CompensationApplication compensationApplicationList() {
		CompensationApplication member = new CompensationApplication();
		member.setModelTypeName("compensation_application");
		member.setName("status");
		member.setMemberName("compensationApplicationList");
		member.setRelationName("status");
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

