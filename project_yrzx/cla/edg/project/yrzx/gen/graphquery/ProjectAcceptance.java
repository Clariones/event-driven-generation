package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectAcceptance extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectacceptance.ProjectAcceptance";
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

	public Merchant propertyOwner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("property_owner");
		member.setMemberName("propertyOwner");
		member.setReferDirection(true);
		member.setRelationName("propertyOwner");
		append(member);
		return member;
	}

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

	public Merchant applicationUnit() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("application_unit");
		member.setMemberName("applicationUnit");
		member.setReferDirection(true);
		member.setRelationName("applicationUnit");
		append(member);
		return member;
	}

	public ProjectMaterial acceptanceApplication() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("acceptance_application");
		member.setMemberName("acceptanceApplication");
		member.setReferDirection(true);
		member.setRelationName("acceptanceApplication");
		append(member);
		return member;
	}

	public ProjectMaterial acceptance() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("acceptance");
		member.setMemberName("acceptance");
		member.setReferDirection(true);
		member.setRelationName("acceptance");
		append(member);
		return member;
	}

	public ProjectAcceptanceStatus status() {
		ProjectAcceptanceStatus member = new ProjectAcceptanceStatus();
		member.setModelTypeName("project_acceptance_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
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

	public DateTimeAttribute acceptanceTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("acceptanceTime");
		member.setName("acceptance_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute applicationTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time");
		// member.setName("applicationTime");
		member.setName("application_time");
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

