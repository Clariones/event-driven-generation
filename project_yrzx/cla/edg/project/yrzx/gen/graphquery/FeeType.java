package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FeeType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.feetype.FeeType";
	}
	// 枚举对象

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
	
	public AccountTitleMapping accountTitleMappingList() {
		AccountTitleMapping member = new AccountTitleMapping();
		member.setModelTypeName("account_title_mapping");
		member.setName("fee_type");
		member.setMemberName("accountTitleMappingList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectParticipatorContract projectParticipatorContractList() {
		ProjectParticipatorContract member = new ProjectParticipatorContract();
		member.setModelTypeName("project_participator_contract");
		member.setName("fee_type");
		member.setMemberName("projectParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageParticipatorContract workPackageParticipatorContractList() {
		WorkPackageParticipatorContract member = new WorkPackageParticipatorContract();
		member.setModelTypeName("work_package_participator_contract");
		member.setName("fee_type");
		member.setMemberName("workPackageParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public YourongBill yourongBillList() {
		YourongBill member = new YourongBill();
		member.setModelTypeName("yourong_bill");
		member.setName("fee_type");
		member.setMemberName("yourongBillList");
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

