package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectJobAssignmentRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectjobassignmentrecord.ProjectJobAssignmentRecord";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectJob job() {
		ProjectJob member = new ProjectJob();
		member.setModelTypeName("project_job");
		member.setName("job");
		member.setMemberName("job");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination employee() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("employee");
		member.setMemberName("employee");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public EmployeeNomination operator() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("operator");
		member.setMemberName("operator");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("comments");
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

