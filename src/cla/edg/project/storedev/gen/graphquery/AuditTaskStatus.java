package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class AuditTaskStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.audittaskstatus.AuditTaskStatus";
	}
	// 枚举对象
	public static EnumAttribute AGREE = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "AGREE");
	public static EnumAttribute CARBON_COPY = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "CARBON_COPY");
	public static EnumAttribute PENDING_ON_AUDIT = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "PENDING_ON_AUDIT");
	public static EnumAttribute DISAGREE = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "DISAGREE");
	public static EnumAttribute DISCARDED = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "DISCARDED");
	public static EnumAttribute REJECTED = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "REJECTED");
	public static EnumAttribute REVERTED = new EnumAttribute("com.doublechain.storedev.audittaskstatus.AuditTaskStatus", "REVERTED");

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
	
	public RecommendedStoreAuditTask recommendedStoreAuditTaskList() {
		RecommendedStoreAuditTask member = new RecommendedStoreAuditTask();
		member.setModelTypeName("recommended_store_audit_task");
		member.setName("status");
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

