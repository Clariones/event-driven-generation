package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ConnectionToRequest extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.connectiontorequest.ConnectionToRequest";
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

	public StringAttribute fromType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("fromType");
		member.setName("from_type");
		useMember(member);
		return member;
	}

	public StringAttribute fromElement(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("fromElement");
		member.setName("from_element");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

