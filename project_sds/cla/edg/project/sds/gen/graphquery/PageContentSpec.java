package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageContentSpec extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.pagecontentspec.PageContentSpec";
	}
	// 枚举对象

	// 引用的对象

	public User owner() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("owner");
		member.setMemberName("owner");
		member.setReferDirection(true);
		member.setRelationName("owner");
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

	public StringAttribute scene(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("scene");
		member.setName("scene");
		useMember(member);
		return member;
	}

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("brief");
		member.setName("brief");
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

