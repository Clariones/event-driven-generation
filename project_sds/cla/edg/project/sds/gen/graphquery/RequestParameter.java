package cla.edg.project.sds.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RequestParameter extends BaseModelBean{
	public String getFullClassName() {
		return "com.cla.sds.requestparameter.RequestParameter";
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

	public StringAttribute dataType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("dataType");
		member.setName("data_type");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("displayOrder");
		member.setName("display_order");
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

