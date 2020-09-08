package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborDispute extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.labordispute.LaborDispute";
	}
	// 枚举对象

	// 引用的对象

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
		member.setReferDirection(true);
		member.setRelationName("workPackage");
		append(member);
		return member;
	}

	public LaborDisputeType type() {
		LaborDisputeType member = new LaborDisputeType();
		member.setModelTypeName("labor_dispute_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		member.setRelationName("type");
		append(member);
		return member;
	}

	public LaborDisputeStatus status() {
		LaborDisputeStatus member = new LaborDisputeStatus();
		member.setModelTypeName("labor_dispute_status");
		member.setName("status");
		member.setMemberName("status");
		member.setReferDirection(true);
		member.setRelationName("status");
		append(member);
		return member;
	}

	public ProjectNomination applicant() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("applicant");
		member.setMemberName("applicant");
		member.setReferDirection(true);
		member.setRelationName("applicant");
		append(member);
		return member;
	}

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

	public StringAttribute level(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("level");
		member.setName("level");
		useMember(member);
		return member;
	}

	public StringAttribute summary(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("summary");
		member.setName("summary");
		useMember(member);
		return member;
	}

	public StringAttribute litigant(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("litigant");
		member.setName("litigant");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

