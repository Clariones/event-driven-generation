package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ViolationItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.violationitem.ViolationItem";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant responsibleMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("responsible_merchant");
		member.setMemberName("responsibleMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant impactMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("impact_merchant");
		member.setMemberName("impactMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ViolationTerm violationTerm() {
		ViolationTerm member = new ViolationTerm();
		member.setModelTypeName("violation_term");
		member.setName("violation_term");
		member.setMemberName("violationTerm");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ViolationItemStatus violationItemStatus() {
		ViolationItemStatus member = new ViolationItemStatus();
		member.setModelTypeName("violation_item_status");
		member.setName("violation_item_status");
		member.setMemberName("violationItemStatus");
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

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
		useMember(member);
		return member;
	}

	public StringAttribute violationImage1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("violationImage1");
		useMember(member);
		return member;
	}

	public StringAttribute violationImage2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("violationImage2");
		useMember(member);
		return member;
	}

	public StringAttribute violationImage3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("violationImage3");
		useMember(member);
		return member;
	}

	public StringAttribute violationImage4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("violationImage4");
		useMember(member);
		return member;
	}

	public StringAttribute violationImage5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("violationImage5");
		useMember(member);
		return member;
	}

	public DateTimeAttribute occurTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		member.setName("occurTime");
		useMember(member);
		return member;
	}

	public NumberAttribute deductAmount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("deductAmount");
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

