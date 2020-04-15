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

	public Merchant firstPartMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("first_part_merchant");
		member.setMemberName("firstPartMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant secondPartMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("second_part_merchant");
		member.setMemberName("secondPartMerchant");
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

	public NumberAttribute income(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("income");
		useMember(member);
		return member;
	}

	public NumberAttribute outgo(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("outgo");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

