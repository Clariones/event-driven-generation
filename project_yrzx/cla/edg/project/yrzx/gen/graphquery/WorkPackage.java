package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkPackage extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.workpackage.WorkPackage";
	}
	// 枚举对象

	// 引用的对象

	public Merchant vendor() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("vendor");
		member.setMemberName("vendor");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackageType workPackageType() {
		WorkPackageType member = new WorkPackageType();
		member.setModelTypeName("work_package_type");
		member.setName("work_package_type");
		member.setMemberName("workPackageType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EngineeringType engineeringType() {
		EngineeringType member = new EngineeringType();
		member.setModelTypeName("engineering_type");
		member.setName("engineering_type");
		member.setMemberName("engineeringType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkStatus workStatus() {
		WorkStatus member = new WorkStatus();
		member.setModelTypeName("work_status");
		member.setName("work_status");
		member.setMemberName("workStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("work_package");
		member.setMemberName("standardContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Task taskList() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("work_package");
		member.setMemberName("taskList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectOrganization projectOrganizationList() {
		ProjectOrganization member = new ProjectOrganization();
		member.setModelTypeName("project_organization");
		member.setName("work_package");
		member.setMemberName("projectOrganizationList");
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

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("content");
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
