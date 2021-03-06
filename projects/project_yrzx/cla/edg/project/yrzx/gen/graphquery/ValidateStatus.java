package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ValidateStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.validatestatus.ValidateStatus";
	}
	// 枚举对象
	public static EnumAttribute VALID = new EnumAttribute("com.yrdec.yrzx.validatestatus.ValidateStatus", "VALID");
	public static EnumAttribute EXPIRED = new EnumAttribute("com.yrdec.yrzx.validatestatus.ValidateStatus", "EXPIRED");
	public static EnumAttribute ABOLISHED = new EnumAttribute("com.yrdec.yrzx.validatestatus.ValidateStatus", "ABOLISHED");
	public static EnumAttribute REVOKE = new EnumAttribute("com.yrdec.yrzx.validatestatus.ValidateStatus", "REVOKE");

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

	public License licenseList() {
		License member = new License();
		member.setModelTypeName("license");
		member.setName("validate_status");
		member.setMemberName("licenseList");
		member.setRelationName("validateStatus");
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

