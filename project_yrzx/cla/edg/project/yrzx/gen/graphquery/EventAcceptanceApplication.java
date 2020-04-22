package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAcceptanceApplication extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventacceptanceapplication.EventAcceptanceApplication";
	}
	// 枚举对象

	// 引用的对象

	public DailyTaskType acceptanceType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("acceptance_type");
		member.setMemberName("acceptanceType");
		member.setReferDirection(true);
		member.setRelationName("acceptanceType");
		append(member);
		return member;
	}

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

	public StringAttribute propertyOwnerId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("propertyOwnerId");
		member.setName("property_owner_id");
		useMember(member);
		return member;
	}

	public StringAttribute propertyOwnerName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("propertyOwnerName");
		member.setName("property_owner_name");
		useMember(member);
		return member;
	}

	public StringAttribute epcManageCompany(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("epcManageCompany");
		member.setName("epc_manage_company");
		useMember(member);
		return member;
	}

	public StringAttribute projectManagerId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectManagerId");
		member.setName("project_manager_id");
		useMember(member);
		return member;
	}

	public StringAttribute projectManager(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectManager");
		member.setName("project_manager");
		useMember(member);
		return member;
	}

	public StringAttribute supervisorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("supervisorId");
		member.setName("supervisor_id");
		useMember(member);
		return member;
	}

	public StringAttribute supervisor(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("supervisor");
		member.setName("supervisor");
		useMember(member);
		return member;
	}

	public DateTimeAttribute acceptanceTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("acceptanceTime");
		member.setName("acceptance_time");
		useMember(member);
		return member;
	}

	public StringAttribute applicationUnitId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("applicationUnitId");
		member.setName("application_unit_id");
		useMember(member);
		return member;
	}

	public StringAttribute applicationUnit(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("applicationUnit");
		member.setName("application_unit");
		useMember(member);
		return member;
	}

	public StringAttribute applicationTime(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("applicationTime");
		member.setName("application_time");
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

