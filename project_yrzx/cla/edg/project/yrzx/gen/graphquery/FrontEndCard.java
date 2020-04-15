package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrontEndCard extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.frontendcard.FrontEndCard";
	}
	// 枚举对象

	// 引用的对象

	public FrontEndStatus status() {
		FrontEndStatus member = new FrontEndStatus();
		member.setModelTypeName("front_end_status");
		member.setName("status");
		member.setMemberName("status");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute brief(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brief");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createtime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createtime");
		useMember(member);
		return member;
	}

	public StringAttribute imageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("imageUrl");
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

