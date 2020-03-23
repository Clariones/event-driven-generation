package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class OperationCompanyRoleAssignment extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.operationcompanyroleassignment.OperationCompanyRoleAssignment";
	}
	// 枚举对象

	// 引用的对象

	public OperationCompany operationCompany() {
		OperationCompany member = new OperationCompany();
		member.setModelTypeName("operation_company");
		member.setName("operation_company");
		member.setMemberName("operationCompany");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public RoleType roleType() {
		RoleType member = new RoleType();
		member.setModelTypeName("role_type");
		member.setName("role_type");
		member.setMemberName("roleType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public StoreDeveloper assignee() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("assignee");
		member.setMemberName("assignee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

