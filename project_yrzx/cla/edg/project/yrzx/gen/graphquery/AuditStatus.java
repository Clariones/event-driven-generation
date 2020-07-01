package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AuditStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.auditstatus.AuditStatus";
	}
	// 枚举对象
	public static EnumAttribute PENDING = new EnumAttribute("com.yrdec.yrzx.auditstatus.AuditStatus", "PENDING");
	public static EnumAttribute APPROVED = new EnumAttribute("com.yrdec.yrzx.auditstatus.AuditStatus", "APPROVED");
	public static EnumAttribute UNAPPROVED = new EnumAttribute("com.yrdec.yrzx.auditstatus.AuditStatus", "UNAPPROVED");

	// 引用的对象

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

	public SupplementaryContractPayItem supplementaryContractPayItemList() {
		SupplementaryContractPayItem member = new SupplementaryContractPayItem();
		member.setModelTypeName("supplementary_contract_pay_item");
		member.setName("status");
		member.setMemberName("supplementaryContractPayItemList");
		member.setRelationName("status");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ContractPaymentApplication contractPaymentApplicationList() {
		ContractPaymentApplication member = new ContractPaymentApplication();
		member.setModelTypeName("contract_payment_application");
		member.setName("status");
		member.setMemberName("contractPaymentApplicationList");
		member.setRelationName("status");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public LoanApplication loanApplicationList() {
		LoanApplication member = new LoanApplication();
		member.setModelTypeName("loan_application");
		member.setName("status");
		member.setMemberName("loanApplicationList");
		member.setRelationName("status");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PersonalEmplacementApplication personalEmplacementApplicationList() {
		PersonalEmplacementApplication member = new PersonalEmplacementApplication();
		member.setModelTypeName("personal_emplacement_application");
		member.setName("status");
		member.setMemberName("personalEmplacementApplicationList");
		member.setRelationName("status");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public AuditRecord auditRecordList() {
		AuditRecord member = new AuditRecord();
		member.setModelTypeName("audit_record");
		member.setName("status");
		member.setMemberName("auditRecordList");
		member.setRelationName("status");
		member.setReferDirection(false);
		append(member);
		return member;
	}


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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
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

