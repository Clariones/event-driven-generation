package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class RecommendedStoreAuditTask extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.recommendedstoreaudittask.RecommendedStoreAuditTask";
	}
	// 枚举对象

	// 引用的对象

	public StoreDeveloper responsibleStoreDeveloper() {
		StoreDeveloper member = new StoreDeveloper();
		member.setModelTypeName("store_developer");
		member.setName("responsible_store_developer");
		member.setMemberName("responsibleStoreDeveloper");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public RecommendedStore recommendedStore() {
		RecommendedStore member = new RecommendedStore();
		member.setModelTypeName("recommended_store");
		member.setName("recommended_store");
		member.setMemberName("recommendedStore");
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

	public AuditTaskStatus status() {
		AuditTaskStatus member = new AuditTaskStatus();
		member.setModelTypeName("audit_task_status");
		member.setName("status");
		member.setMemberName("status");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute searchableContent(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("searchableContent");
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

	public StringAttribute comment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("comment");
		useMember(member);
		return member;
	}

	public BooleanAttribute expired(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("expired");
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

