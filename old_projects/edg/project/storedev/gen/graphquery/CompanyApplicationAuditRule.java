package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class CompanyApplicationAuditRule extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.companyapplicationauditrule.CompanyApplicationAuditRule";
	}
	// 枚举对象

	// 引用的对象

	public OperationCompany operationCompany() {
		OperationCompany member = new OperationCompany();
		member.setModelTypeName("operation_company");
		member.setName("operation_company");
		member.setMemberName("operationCompany");
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
	
	public CompanyAuditRuleRelationship companyAuditRuleRelationshipList() {
		CompanyAuditRuleRelationship member = new CompanyAuditRuleRelationship();
		member.setModelTypeName("company_audit_rule_relationship");
		member.setName("company_application_audit_rule");
		member.setMemberName("companyAuditRuleRelationshipList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public CompanyActiveAuditRule companyActiveAuditRuleList() {
		CompanyActiveAuditRule member = new CompanyActiveAuditRule();
		member.setModelTypeName("company_active_audit_rule");
		member.setName("company_application_audit_rule");
		member.setMemberName("companyActiveAuditRuleList");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

