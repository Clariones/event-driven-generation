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
		member.setRelationName("contractType");
		append(member);
		return member;
	}

	public StandardContract projectParticipatorContract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("project_participator_contract");
		member.setMemberName("projectParticipatorContract");
		member.setReferDirection(true);
		member.setRelationName("projectParticipatorContract");
		append(member);
		return member;
	}

	public StandardContract projectRunningContract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("project_running_contract");
		member.setMemberName("projectRunningContract");
		member.setReferDirection(true);
		member.setRelationName("projectRunningContract");
		append(member);
		return member;
	}

	public StandardContract workPackageParticipatorContract() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("work_package_participator_contract");
		member.setMemberName("workPackageParticipatorContract");
		member.setReferDirection(true);
		member.setRelationName("workPackageParticipatorContract");
		append(member);
		return member;
	}

	public Merchant owner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
		append(member);
		return member;
	}

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

	public StringAttribute reportLinkUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("reportLinkUrl");
		member.setName("report_link_url");
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

