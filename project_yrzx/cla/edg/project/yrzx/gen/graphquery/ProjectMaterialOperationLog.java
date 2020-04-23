package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialOperationLog extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectmaterialoperationlog.ProjectMaterialOperationLog";
	}
	// 枚举对象

	// 引用的对象

	public ProjectMaterial projectMaterial() {
		ProjectMaterial member = new ProjectMaterial();
		member.setModelTypeName("project_material");
		member.setName("project_material");
		member.setMemberName("projectMaterial");
		member.setReferDirection(true);
		member.setRelationName("projectMaterial");
		append(member);
		return member;
	}

	public Merchant operatorMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("operator_merchant");
		member.setMemberName("operatorMerchant");
		member.setReferDirection(true);
		member.setRelationName("operatorMerchant");
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

	public StringAttribute logType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("logType");
		member.setName("log_type");
		useMember(member);
		return member;
	}

	public StringAttribute referObjectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("referObjectType");
		member.setName("refer_object_type");
		useMember(member);
		return member;
	}

	public StringAttribute referObjectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("referObjectId");
		member.setName("refer_object_id");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

