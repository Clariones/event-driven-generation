package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractLedger extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractledger.ContractLedger";
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

	public Merchant firstPartMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("first_part_merchant");
		member.setMemberName("firstPartMerchant");
		member.setReferDirection(true);
		member.setRelationName("firstPartMerchant");
		append(member);
		return member;
	}

	public Merchant secondPartMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("second_part_merchant");
		member.setMemberName("secondPartMerchant");
		member.setReferDirection(true);
		member.setRelationName("secondPartMerchant");
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

	public NumberAttribute income(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("income");
		member.setName("income");
		useMember(member);
		return member;
	}

	public NumberAttribute outgo(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("outgo");
		member.setName("outgo");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
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

