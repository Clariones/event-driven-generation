package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractreport.ContractReport";
	}
	// 枚举对象

	// 引用的对象

	public ContractType contractType() {
		ContractType member = new ContractType();
		member.setModelTypeName("contract_type");
		member.setName("contract_type");
		member.setMemberName("contractType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectParticipatorContract projectParticipatorContract() {
		ProjectParticipatorContract member = new ProjectParticipatorContract();
		member.setModelTypeName("project_participator_contract");
		member.setName("project_participator_contract");
		member.setMemberName("projectParticipatorContract");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectRunningContract projectRunningContract() {
		ProjectRunningContract member = new ProjectRunningContract();
		member.setModelTypeName("project_running_contract");
		member.setName("project_running_contract");
		member.setMemberName("projectRunningContract");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackageParticipatorContract workPackageParticipatorContract() {
		WorkPackageParticipatorContract member = new WorkPackageParticipatorContract();
		member.setModelTypeName("work_package_participator_contract");
		member.setName("work_package_participator_contract");
		member.setMemberName("workPackageParticipatorContract");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant owner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("owner");
		member.setMemberName("owner");
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

	public StringAttribute reportLinkUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("reportLinkUrl");
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

