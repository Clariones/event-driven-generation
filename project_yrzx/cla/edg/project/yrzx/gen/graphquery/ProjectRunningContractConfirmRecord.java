package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectRunningContractConfirmRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectrunningcontractconfirmrecord.ProjectRunningContractConfirmRecord";
	}
	// 枚举对象

	// 引用的对象

	public ProjectRunningContract contract() {
		ProjectRunningContract member = new ProjectRunningContract();
		member.setModelTypeName("project_running_contract");
		member.setName("contract");
		member.setMemberName("contract");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant approveMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("approve_merchant");
		member.setMemberName("approveMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination approveEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("approve_employee");
		member.setMemberName("approveEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CommonEventRecord sourceEvent() {
		CommonEventRecord member = new CommonEventRecord();
		member.setModelTypeName("common_event_record");
		member.setName("source_event");
		member.setMemberName("sourceEvent");
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

	public BooleanAttribute confirmed(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("confirmed");
		useMember(member);
		return member;
	}

	public StringAttribute documentUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("documentUrl");
		useMember(member);
		return member;
	}

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("comments");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

