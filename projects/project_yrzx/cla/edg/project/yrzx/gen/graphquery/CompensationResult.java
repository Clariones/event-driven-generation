package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CompensationResult extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.compensationresult.CompensationResult";
	}
	// 枚举对象

	// 引用的对象

	public CompensationInvestigation compensationInvestigation() {
		CompensationInvestigation member = new CompensationInvestigation();
		member.setModelTypeName("compensation_investigation");
		member.setName("compensation_investigation");
		member.setMemberName("compensationInvestigation");
		member.setReferDirection(true);
		member.setRelationName("compensationInvestigation");
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

	public CompensationResultStatus status() {
		CompensationResultStatus member = new CompensationResultStatus();
		member.setModelTypeName("compensation_result_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute document(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		// member.setName("document");
		member.setName("document");
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

