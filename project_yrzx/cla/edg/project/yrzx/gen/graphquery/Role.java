package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Role extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.role.Role";
	}
	// 枚举对象
	public static EnumAttribute ADMIN = new EnumAttribute("com.yrdec.yrzx.role.Role", "ADMIN");
	public static EnumAttribute FINANCE = new EnumAttribute("com.yrdec.yrzx.role.Role", "FINANCE");
	public static EnumAttribute WORKER = new EnumAttribute("com.yrdec.yrzx.role.Role", "WORKER");

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
	
	public EmployeeNomination employeeNominationList() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("role");
		member.setMemberName("employeeNominationList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

