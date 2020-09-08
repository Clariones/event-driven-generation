package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RequestElement extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.requestelement.RequestElement";
	}
	// 枚举对象

	// 引用的对象

	public PageFlowSpec spec() {
		PageFlowSpec member = new PageFlowSpec();
		member.setModelTypeName("page_flow_spec");
		member.setName("spec");
		member.setMemberName("spec");
		member.setReferDirection(true);
		member.setRelationName("spec");
		append(member);
		return member;
	}

	// 被引用的对象

	public ConnectionToRequest connectionToRequestList() {
		ConnectionToRequest member = new ConnectionToRequest();
		member.setModelTypeName("connection_to_request");
		member.setName("request");
		member.setMemberName("connectionToRequestList");
		member.setRelationName("request");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public BranchFromRequest branchFromRequestList() {
		BranchFromRequest member = new BranchFromRequest();
		member.setModelTypeName("branch_from_request");
		member.setName("request");
		member.setMemberName("branchFromRequestList");
		member.setRelationName("request");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	public RequestParameter requestParameterList() {
		RequestParameter member = new RequestParameter();
		member.setModelTypeName("request_parameter");
		member.setName("request");
		member.setMemberName("requestParameterList");
		member.setRelationName("request");
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

	public StringAttribute chineseName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("chineseName");
		member.setName("chinese_name");
		useMember(member);
		return member;
	}

	public StringAttribute englishName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("englishName");
		member.setName("english_name");
		useMember(member);
		return member;
	}

	public NumberAttribute positionX(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("positionX");
		member.setName("position_x");
		useMember(member);
		return member;
	}

	public NumberAttribute positionY(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("positionY");
		member.setName("position_y");
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

	public BooleanAttribute needLogin(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		// member.setName("needLogin");
		member.setName("need_login");
		useMember(member);
		return member;
	}

	public StringAttribute footPrintScope(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("footPrintScope");
		member.setName("foot_print_scope");
		useMember(member);
		return member;
	}

	public StringAttribute requestDataType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("requestDataType");
		member.setName("request_data_type");
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

