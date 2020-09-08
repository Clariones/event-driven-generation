package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractPaymentApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.contractpaymentapplication.ContractPaymentApplication";
	}
	// 枚举对象

	// 引用的对象

	public AuditStatus status() {
		AuditStatus member = new AuditStatus();
		member.setModelTypeName("audit_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

	public ContractPayItem payItem() {
		ContractPayItem member = new ContractPayItem();
		member.setModelTypeName("contract_pay_item");
		member.setName("pay_item");
		member.setMemberName("payItem");
		member.setReferDirection(true);
		member.setRelationName("payItem");
		append(member);
		return member;
	}

	public Merchant submitter() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("submitter");
		member.setMemberName("submitter");
		member.setReferDirection(true);
		member.setRelationName("submitter");
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

