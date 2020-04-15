package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDocument extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdocument.ProjectDocument";
	}
	// 枚举对象

	// 引用的对象

	public DocumentTag tag() {
		DocumentTag member = new DocumentTag();
		member.setModelTypeName("document_tag");
		member.setName("tag");
		member.setMemberName("tag");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectDocumentProcessStyle processStyle() {
		ProjectDocumentProcessStyle member = new ProjectDocumentProcessStyle();
		member.setModelTypeName("project_document_process_style");
		member.setName("process_style");
		member.setMemberName("processStyle");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public ProjectDocumentStatus status() {
		ProjectDocumentStatus member = new ProjectDocumentStatus();
		member.setModelTypeName("project_document_status");
		member.setName("status");
		member.setMemberName("status");
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

	public WorkPackage workPackage() {
		WorkPackage member = new WorkPackage();
		member.setModelTypeName("work_package");
		member.setName("work_package");
		member.setMemberName("workPackage");
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

	// 被引用的对象
	
	public ProjectDocumentChangeRecord projectDocumentChangeRecordList() {
		ProjectDocumentChangeRecord member = new ProjectDocumentChangeRecord();
		member.setModelTypeName("project_document_change_record");
		member.setName("project_document");
		member.setMemberName("projectDocumentChangeRecordList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocumentConfirmRecord projectDocumentConfirmRecordList() {
		ProjectDocumentConfirmRecord member = new ProjectDocumentConfirmRecord();
		member.setModelTypeName("project_document_confirm_record");
		member.setName("project_document");
		member.setMemberName("projectDocumentConfirmRecordList");
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

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public StringAttribute documentUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("documentUrl");
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

