package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantWarehouse extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.merchantwarehouse.MerchantWarehouse";
	}
	// 枚举对象

	// 引用的对象

	public Merchant merchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant");
		member.setMemberName("merchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectParticipatorContract projectParticipatorContractList() {
		ProjectParticipatorContract member = new ProjectParticipatorContract();
		member.setModelTypeName("project_participator_contract");
		member.setName("merchant_warehouse");
		member.setMemberName("projectParticipatorContractList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public WorkPackageParticipatorContract workPackageParticipatorContractList() {
		WorkPackageParticipatorContract member = new WorkPackageParticipatorContract();
		member.setModelTypeName("work_package_participator_contract");
		member.setName("merchant_warehouse");
		member.setMemberName("workPackageParticipatorContractList");
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

	public StringAttribute address(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("address");
		useMember(member);
		return member;
	}

	public NumberAttribute latitude(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("latitude");
		useMember(member);
		return member;
	}

	public NumberAttribute longitude(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("longitude");
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

