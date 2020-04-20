package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventReportCheckItem extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventreportcheckitem.EventReportCheckItem";
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
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute checkResult(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("checkResult");
		member.setName("check_result");
		useMember(member);
		return member;
	}

	public StringAttribute processResult(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("processResult");
		member.setName("process_result");
		useMember(member);
		return member;
	}

	public StringAttribute patrolImages(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("patrolImages");
		member.setName("patrol_images");
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

