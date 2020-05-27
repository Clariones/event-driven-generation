package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class BranchFromRequest extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.branchfromrequest.BranchFromRequest";
	}
	// 枚举对象

	// 引用的对象

	public RequestElement request() {
		RequestElement member = new RequestElement();
		member.setModelTypeName("request_element");
		member.setName("request");
		member.setMemberName("request");
		member.setReferDirection(true);
		member.setRelationName("request");
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

	public StringAttribute params(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		// member.setName("params");
		member.setName("params");
		useMember(member);
		return member;
	}

	public StringAttribute toType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("toType");
		member.setName("to_type");
		useMember(member);
		return member;
	}

	public StringAttribute toElement(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("toElement");
		member.setName("to_element");
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

