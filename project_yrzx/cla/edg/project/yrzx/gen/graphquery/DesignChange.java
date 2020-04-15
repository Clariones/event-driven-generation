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
		append(member);
		return member;
	}

	public Design design() {
		Design member = new Design();
		member.setModelTypeName("design");
		member.setName("design");
		member.setMemberName("design");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant sponsor() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("sponsor");
		member.setMemberName("sponsor");
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

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute changeContent(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("changeContent");
		useMember(member);
		return member;
	}

	public StringAttribute changeFile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("changeFile");
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

