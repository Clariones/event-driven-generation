package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectProgress extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectprogress.ProjectProgress";
	}
	// 枚举对象

	// 引用的对象

	public ProjectProgressStatus status() {
		ProjectProgressStatus member = new ProjectProgressStatus();
		member.setModelTypeName("project_progress_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectPhase projectPhase() {
		ProjectPhase member = new ProjectPhase();
		member.setModelTypeName("project_phase");
		member.setName("project_phase");
		member.setMemberName("projectPhase");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public DateTimeAttribute displayTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		member.setName("displayTime");
		useMember(member);
		return member;
	}

	public StringAttribute relatedObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("relatedObjectType");
		useMember(member);
		return member;
	}

	public StringAttribute relatedObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("relatedObjectId");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

