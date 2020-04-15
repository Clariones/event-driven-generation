package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class YourongBill extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.yourongbill.YourongBill";
	}
	// 枚举对象

	// 引用的对象

	public BillStatus billStatus() {
		BillStatus member = new BillStatus();
		member.setModelTypeName("bill_status");
		member.setName("bill_status");
		member.setMemberName("billStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public FeeType feeType() {
		FeeType member = new FeeType();
		member.setModelTypeName("fee_type");
		member.setName("fee_type");
		member.setMemberName("feeType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant payerMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payer_merchant");
		member.setMemberName("payerMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant payeeMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("payee_merchant");
		member.setMemberName("payeeMerchant");
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
	
	public YourongBillRecord yourongBillRecordList() {
		YourongBillRecord member = new YourongBillRecord();
		member.setModelTypeName("yourong_bill_record");
		member.setName("bill");
		member.setMemberName("yourongBillRecordList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("amount");
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

