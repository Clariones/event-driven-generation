package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectJob extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectjob.ProjectJob";
	}
	// 枚举对象

	// 引用的对象

	public ProjectJobType type() {
		ProjectJobType member = new ProjectJobType();
		member.setModelTypeName("project_job_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ProjectJobAssignment projectJobAssignmentList() {
		ProjectJobAssignment member = new ProjectJobAssignment();
		member.setModelTypeName("project_job_assignment");
		member.setName("job");
		member.setMemberName("projectJobAssignmentList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectJobAssignmentRecord projectJobAssignmentRecordList() {
		ProjectJobAssignmentRecord member = new ProjectJobAssignmentRecord();
		member.setModelTypeName("project_job_assignment_record");
		member.setName("job");
		member.setMemberName("projectJobAssignmentRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
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

	public StringAttribute englishTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("englishTitle");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("displayOrder");
		useMember(member);
		return member;
	}

	public StringAttribute parentId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parentId");
		useMember(member);
		return member;
	}

	public StringAttribute parentPath(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parentPath");
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

