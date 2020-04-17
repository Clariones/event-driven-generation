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
		append(member);
		return member;
	}

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

	public StringAttribute propertyOwnerId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("propertyOwnerId");
		useMember(member);
		return member;
	}

	public StringAttribute propertyOwnerName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("propertyOwnerName");
		useMember(member);
		return member;
	}

	public StringAttribute epcManageCompany(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("epcManageCompany");
		useMember(member);
		return member;
	}

	public StringAttribute projectManagerId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("projectManagerId");
		useMember(member);
		return member;
	}

	public StringAttribute projectManager(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("projectManager");
		useMember(member);
		return member;
	}

	public StringAttribute supervisorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("supervisorId");
		useMember(member);
		return member;
	}

	public StringAttribute supervisor(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("supervisor");
		useMember(member);
		return member;
	}

	public DateTimeAttribute acceptanceTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("acceptanceTime");
		useMember(member);
		return member;
	}

	public StringAttribute applicationUnitId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("applicationUnitId");
		useMember(member);
		return member;
	}

	public StringAttribute applicationUnit(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("applicationUnit");
		useMember(member);
		return member;
	}

	public StringAttribute applicationTime(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("applicationTime");
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

