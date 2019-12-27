package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class CompanyAuditRuleRelationship extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.companyauditrulerelationship.CompanyAuditRuleRelationship";
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

	public AuditType auditType() {
		AuditType member = new AuditType();
		member.setModelTypeName("audit_type");
		member.setName("audit_type");
		member.setMemberName("auditType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public RoleType roleType() {
		RoleType member = new RoleType();
		member.setModelTypeName("role_type");
		member.setName("role_type");
		member.setMemberName("roleType");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

