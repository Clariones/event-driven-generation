package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FormMessage extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.formmessage.FormMessage";
	}
	// 枚举对象

	// 引用的对象

	public GenericForm form() {
		GenericForm member = new GenericForm();
		member.setModelTypeName("generic_form");
		member.setName("form");
		member.setMemberName("form");
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

	public StringAttribute level(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("level");
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

