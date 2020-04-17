package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractTemplate extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contracttemplate.ContractTemplate";
	}
	// 枚举对象

	// 引用的对象

	public ContractType templateType() {
		ContractType member = new ContractType();
		member.setModelTypeName("contract_type");
		member.setName("template_type");
		member.setMemberName("templateType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination submitter() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("submitter");
		member.setMemberName("submitter");
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
	
	public StandardContract standardContractList() {
		StandardContract member = new StandardContract();
		member.setModelTypeName("standard_contract");
		member.setName("contract_template");
		member.setMemberName("standardContractList");
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

	public StringAttribute template(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("template");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

