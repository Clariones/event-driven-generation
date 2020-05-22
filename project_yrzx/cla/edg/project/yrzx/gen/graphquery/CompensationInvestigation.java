package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CompensationInvestigation extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.compensationinvestigation.CompensationInvestigation";
	}
	// 枚举对象

	// 引用的对象

	public CompensationApplication compensationApplication() {
		CompensationApplication member = new CompensationApplication();
		member.setModelTypeName("compensation_application");
		member.setName("compensation_application");
		member.setMemberName("compensationApplication");
		member.setReferDirection(true);
		member.setRelationName("compensationApplication");
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		member.setRelationName("project");
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

	public CompensationResult compensationResultList() {
		CompensationResult member = new CompensationResult();
		member.setModelTypeName("compensation_result");
		member.setName("compensation_investigation");
		member.setMemberName("compensationResultList");
		member.setRelationName("compensationInvestigation");
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

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

