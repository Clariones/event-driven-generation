package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectOrganizationType extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType";
	}
	// 枚举对象

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
		append(member);
		return member;
	}

	// 被引用的对象

	public ProjectNomination projectNominationList() {
		ProjectNomination member = new ProjectNomination();
		member.setModelTypeName("project_nomination");
		member.setName("type");
		member.setMemberName("projectNominationList");
		member.setRelationName("type");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public EventProjectWorkPosition eventProjectWorkPositionList() {
		EventProjectWorkPosition member = new EventProjectWorkPosition();
		member.setModelTypeName("event_project_work_position");
		member.setName("project_job");
		member.setMemberName("eventProjectWorkPositionList");
		member.setRelationName("projectJob");
		member.setReferDirection(false);
		append(member);
		return member;
	}


	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute category(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("category");
		member.setName("category");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
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

