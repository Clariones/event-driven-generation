package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProjectMaterialComments extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.eventprojectmaterialcomments.EventProjectMaterialComments";
	}
	// 枚举对象

	// 引用的对象

	public ProjectMaterialReviewStatus reviewResult() {
		ProjectMaterialReviewStatus member = new ProjectMaterialReviewStatus();
		member.setModelTypeName("project_material_review_status");
		member.setName("review_result");
		member.setMemberName("reviewResult");
		member.setReferDirection(true);
		member.setRelationName("reviewResult");
		append(member);
		return member;
	}

	public ChangeRequest changeRequest() {
		ChangeRequest member = new ChangeRequest();
		member.setModelTypeName("change_request");
		member.setName("change_request");
		member.setMemberName("changeRequest");
		member.setReferDirection(true);
		member.setRelationName("changeRequest");
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

	public StringAttribute projectMaterial(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectMaterial");
		member.setName("project_material");
		useMember(member);
		return member;
	}

	public StringAttribute approveResult(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("approveResult");
		member.setName("approve_result");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("comments");
		member.setName("comments");
		useMember(member);
		return member;
	}

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("fieldGroup");
		member.setName("field_group");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorType");
		member.setName("event_initiator_type");
		useMember(member);
		return member;
	}

	public StringAttribute eventInitiatorId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("eventInitiatorId");
		member.setName("event_initiator_id");
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

