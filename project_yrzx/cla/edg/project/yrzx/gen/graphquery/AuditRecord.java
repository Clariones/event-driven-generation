package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AuditRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.auditrecord.AuditRecord";
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

	public Merchant reviewer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("reviewer");
		member.setMemberName("reviewer");
		member.setReferDirection(true);
		member.setRelationName("reviewer");
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

	public StringAttribute auditObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("auditObjectType");
		member.setName("audit_object_type");
		useMember(member);
		return member;
	}

	public StringAttribute auditObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("auditObjectId");
		member.setName("audit_object_id");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("comments");
		member.setName("comments");
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

