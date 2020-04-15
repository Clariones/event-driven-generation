package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectDocumentChangeRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectdocumentchangerecord.ProjectDocumentChangeRecord";
	}
	// 枚举对象

	// 引用的对象

	public ProjectDocument projectDocument() {
		ProjectDocument member = new ProjectDocument();
		member.setModelTypeName("project_document");
		member.setName("project_document");
		member.setMemberName("projectDocument");
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

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("id");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

