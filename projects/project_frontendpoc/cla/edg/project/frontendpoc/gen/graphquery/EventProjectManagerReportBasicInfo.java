package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProjectManagerReportBasicInfo extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.eventprojectmanagerreportbasicinfo.EventProjectManagerReportBasicInfo";
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

	public StringAttribute projectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("projectId");
		useMember(member);
		return member;
	}

	public StringAttribute projectName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("projectName");
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
	













