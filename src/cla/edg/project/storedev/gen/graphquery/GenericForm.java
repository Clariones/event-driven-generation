package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class GenericForm extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.genericform.GenericForm";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public FormMessage formMessageList() {
		FormMessage member = new FormMessage();
		member.setModelTypeName("form_message");
		member.setName("form");
		member.setMemberName("formMessageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FormFieldMessage formFieldMessageList() {
		FormFieldMessage member = new FormFieldMessage();
		member.setModelTypeName("form_field_message");
		member.setName("form");
		member.setMemberName("formFieldMessageList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FormField formFieldList() {
		FormField member = new FormField();
		member.setModelTypeName("form_field");
		member.setName("form");
		member.setMemberName("formFieldList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public FormAction formActionList() {
		FormAction member = new FormAction();
		member.setModelTypeName("form_action");
		member.setName("form");
		member.setMemberName("formActionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
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

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("description");
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

