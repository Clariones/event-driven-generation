package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectReport extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectreport.ProjectReport";
	}
	// 枚举对象

	// 引用的对象

	public Project project() {
		Project member = new Project();
		member.setModelTypeName("project");
		member.setName("project");
		member.setMemberName("project");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant reporter() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("reporter");
		member.setMemberName("reporter");
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

	public StringAttribute content(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("content");
		useMember(member);
		return member;
	}

	public StringAttribute image1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image1");
		useMember(member);
		return member;
	}

	public StringAttribute image2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image2");
		useMember(member);
		return member;
	}

	public StringAttribute image3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image3");
		useMember(member);
		return member;
	}

	public StringAttribute image4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image4");
		useMember(member);
		return member;
	}

	public StringAttribute image5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("image5");
		useMember(member);
		return member;
	}

	public DateTimeAttribute reportDatetime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("reportDatetime");
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

