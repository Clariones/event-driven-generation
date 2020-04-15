package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TaskProcessingRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.taskprocessingrecord.TaskProcessingRecord";
	}
	// 枚举对象

	// 引用的对象

	public EmployeeNomination actorEmployee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("actor_employee");
		member.setMemberName("actorEmployee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant actorMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("actor_merchant");
		member.setMemberName("actorMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Task task() {
		Task member = new Task();
		member.setModelTypeName("task");
		member.setName("task");
		member.setMemberName("task");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute detail(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("detail");
		useMember(member);
		return member;
	}

	public StringAttribute recordCode(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("recordCode");
		useMember(member);
		return member;
	}

	public StringAttribute referedObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("referedObjectType");
		useMember(member);
		return member;
	}

	public StringAttribute referedObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("referedObjectId");
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

