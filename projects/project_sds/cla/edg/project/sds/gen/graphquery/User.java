package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class User extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.user.User";
	}
	// 枚举对象

	// 引用的对象

	public Company company() {
		Company member = new Company();
		member.setModelTypeName("company");
		member.setName("company");
		member.setMemberName("company");
		member.setReferDirection(true);
		member.setRelationName("company");
		append(member);
		return member;
	}

	// 被引用的对象

	public UserProject userProjectList() {
		UserProject member = new UserProject();
		member.setModelTypeName("user_project");
		member.setName("user");
		member.setMemberName("userProjectList");
		member.setRelationName("user");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PageFlowSpec pageFlowSpecList() {
		PageFlowSpec member = new PageFlowSpec();
		member.setModelTypeName("page_flow_spec");
		member.setName("owner");
		member.setMemberName("pageFlowSpecList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public WorkFlowSpec workFlowSpecList() {
		WorkFlowSpec member = new WorkFlowSpec();
		member.setModelTypeName("work_flow_spec");
		member.setName("owner");
		member.setMemberName("workFlowSpecList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public ChangeRequestSpec changeRequestSpecList() {
		ChangeRequestSpec member = new ChangeRequestSpec();
		member.setModelTypeName("change_request_spec");
		member.setName("owner");
		member.setMemberName("changeRequestSpecList");
		member.setRelationName("owner");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public PageContentSpec pageContentSpecList() {
		PageContentSpec member = new PageContentSpec();
		member.setModelTypeName("page_content_spec");
		member.setName("owner");
		member.setMemberName("pageContentSpecList");
		member.setRelationName("owner");
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

	public DateTimeAttribute joinTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date");
		// member.setName("joinTime");
		member.setName("join_time");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

