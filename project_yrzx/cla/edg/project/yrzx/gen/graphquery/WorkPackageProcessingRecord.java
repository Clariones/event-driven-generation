package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkPackageProcessingRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.workpackageprocessingrecord.WorkPackageProcessingRecord";
	}
	// 枚举对象

	// 引用的对象

	public Merchant actor() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("actor");
		member.setMemberName("actor");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
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

