package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DesignChange extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.designchange.DesignChange";
	}
	// 枚举对象

	// 引用的对象

	public Merchant designer() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("designer");
		member.setMemberName("designer");
		member.setReferDirection(true);
		member.setRelationName("designer");
		append(member);
		return member;
	}

	public Design design() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("design");
		member.setMemberName("design");
		member.setReferDirection(true);
		member.setRelationName("design");
		append(member);
		return member;
	}

	public Merchant sponsor() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("sponsor");
		member.setMemberName("sponsor");
		member.setReferDirection(true);
		member.setRelationName("sponsor");
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

	public StringAttribute changeContent(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("changeContent");
		member.setName("change_content");
		useMember(member);
		return member;
	}

	public StringAttribute changeFile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		// member.setName("changeFile");
		member.setName("change_file");
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

