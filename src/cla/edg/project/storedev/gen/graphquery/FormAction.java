package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class FormAction extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.formaction.FormAction";
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

	public StringAttribute label(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("label");
		useMember(member);
		return member;
	}

	public StringAttribute localeKey(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("localeKey");
		useMember(member);
		return member;
	}

	public StringAttribute actionKey(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("actionKey");
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

	public StringAttribute url(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("url");
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

