package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventLoanApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventloanapplication.EventLoanApplication";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		member.setRelationName("changeRequest");
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

	public StringAttribute projectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectId");
		member.setName("project_id");
		useMember(member);
		return member;
	}

	public StringAttribute projectName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectName");
		member.setName("project_name");
		useMember(member);
		return member;
	}

	public StringAttribute borrower(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("borrower");
		member.setName("borrower");
		useMember(member);
		return member;
	}

	public NumberAttribute amount(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		// member.setName("amount");
		member.setName("amount");
		useMember(member);
		return member;
	}

	public StringAttribute loanUsage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("loanUsage");
		member.setName("loan_usage");
		useMember(member);
		return member;
	}

	public DateTimeAttribute expectedRepaymentTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("expectedRepaymentTime");
		member.setName("expected_repayment_time");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("fieldGroup");
		member.setName("field_group");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorType");
		member.setName("event_initiator_type");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorId");
		member.setName("event_initiator_id");
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

