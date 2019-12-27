package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class AuditType extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.audittype.AuditType";
	}
	// 枚举对象
	public static EnumAttribute AUDIT = new EnumAttribute("com.doublechain.storedev.audittype.AuditType", "AUDIT");
	public static EnumAttribute CARBON_COPY = new EnumAttribute("com.doublechain.storedev.audittype.AuditType", "CARBON_COPY");

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
	
	public CompanyAuditRoleRelationship companyAuditRoleRelationshipList() {
		CompanyAuditRoleRelationship member = new CompanyAuditRoleRelationship();
		member.setModelTypeName("company_audit_role_relationship");
		member.setName("audit_type");
		member.setMemberName("companyAuditRoleRelationshipList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public RecommendedStoreAuditTask recommendedStoreAuditTaskList() {
		RecommendedStoreAuditTask member = new RecommendedStoreAuditTask();
		member.setModelTypeName("recommended_store_audit_task");
		member.setName("audit_type");
		member.setMemberName("recommendedStoreAuditTaskList");
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

