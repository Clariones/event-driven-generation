package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Process extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.process.Process";
	}
	// 枚举对象

	// 引用的对象

	public EmployeeNomination creator() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("creator");
		member.setMemberName("creator");
		member.setReferDirection(true);
		member.setRelationName("creator");
		append(member);
		return member;
	}

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

	public ProcessMap processMapList() {
		ProcessMap member = new ProcessMap();
		member.setModelTypeName("process_map");
		member.setName("process");
		member.setMemberName("processMapList");
		member.setRelationName("process");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ProcessAudit processAuditList() {
		ProcessAudit member = new ProcessAudit();
		member.setModelTypeName("process_audit");
		member.setName("process");
		member.setMemberName("processAuditList");
		member.setRelationName("process");
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

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("content");
		member.setName("content");
		useMember(member);
		return member;
	}

	public StringAttribute rules(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("rules");
		member.setName("rules");
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

