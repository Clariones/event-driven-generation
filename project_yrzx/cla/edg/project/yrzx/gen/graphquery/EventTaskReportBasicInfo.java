package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventTaskReportBasicInfo extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventtaskreportbasicinfo.EventTaskReportBasicInfo";
	}
	// 枚举对象

	// 引用的对象

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
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

	public StringAttribute taskId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("taskId");
		useMember(member);
		return member;
	}

	public StringAttribute taskName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("taskName");
		useMember(member);
		return member;
	}

	public StringAttribute subcontractorName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("subcontractorName");
		useMember(member);
		return member;
	}

	public StringAttribute responsibleName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("responsibleName");
		useMember(member);
		return member;
	}

	public NumberAttribute temperature(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("temperature");
		useMember(member);
		return member;
	}

	public StringAttribute weatherConditions(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("weatherConditions");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldGroup");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventInitiatorType");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("eventInitiatorId");
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

