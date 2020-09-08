package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AfterSales extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.aftersales.AfterSales";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		member.setRelationName("project");
		append(member);
		return member;
	}

	public EmployeeNomination creator() {
		EmployeeNomination member = new EmployeeNomination();
		member.setModelTypeName("employee_nomination");
		member.setName("creator");
		member.setMemberName("creator");
		member.setReferDirection(true);
		member.setRelationName("creator");
		append(member);
		return member;
	}

	public AfterSalesStatus status() {
		AfterSalesStatus member = new AfterSalesStatus();
		member.setModelTypeName("after_sales_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

	public DailyTaskType dailyTaskType() {
		DailyTaskType member = new DailyTaskType();
		member.setModelTypeName("daily_task_type");
		member.setName("daily_task_type");
		member.setMemberName("dailyTaskType");
		member.setReferDirection(true);
		member.setRelationName("dailyTaskType");
		append(member);
		return member;
	}

	public ProjectNomination solver() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("solver");
		member.setMemberName("solver");
		member.setReferDirection(true);
		member.setRelationName("solver");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("title");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("description");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute images(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("images");
		member.setName("images");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public StringAttribute resolveComments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("resolveComments");
		member.setName("resolve_comments");
		useMember(member);
		return member;
	}

	public DateTimeAttribute solveTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("solveTime");
		member.setName("solve_time");
		useMember(member);
		return member;
	}

	public StringAttribute solveImages(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		// member.setName("solveImages");
		member.setName("solve_images");
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

