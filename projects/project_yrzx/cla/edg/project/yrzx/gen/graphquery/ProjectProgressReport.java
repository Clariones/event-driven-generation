package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectProgressReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectprogressreport.ProjectProgressReport";
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

	public Merchant reporter() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("reporter");
		member.setMemberName("reporter");
		member.setReferDirection(true);
		member.setRelationName("reporter");
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

	public StringAttribute projectStatus(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("projectStatus");
		member.setName("project_status");
		useMember(member);
		return member;
	}

	public StringAttribute image1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image1");
		member.setName("image1");
		useMember(member);
		return member;
	}

	public StringAttribute image2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image2");
		member.setName("image2");
		useMember(member);
		return member;
	}

	public StringAttribute image3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image3");
		member.setName("image3");
		useMember(member);
		return member;
	}

	public StringAttribute image4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image4");
		member.setName("image4");
		useMember(member);
		return member;
	}

	public StringAttribute image5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("image5");
		member.setName("image5");
		useMember(member);
		return member;
	}

	public DateTimeAttribute reportDatetime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("reportDatetime");
		member.setName("report_datetime");
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

