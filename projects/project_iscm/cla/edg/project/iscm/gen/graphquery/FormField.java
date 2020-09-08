package cla.edg.project.iscm.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class FormField extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.iscm.formfield.FormField";
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

	public StringAttribute parameterName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parameterName");
		useMember(member);
		return member;
	}

	public StringAttribute type(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("type");
		useMember(member);
		return member;
	}

	public StringAttribute placeholder(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("placeholder");
		useMember(member);
		return member;
	}

	public StringAttribute defaultValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("defaultValue");
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

	public StringAttribute fieldGroup(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("fieldGroup");
		useMember(member);
		return member;
	}

	public StringAttribute minimumValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("minimumValue");
		useMember(member);
		return member;
	}

	public StringAttribute maximumValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("maximumValue");
		useMember(member);
		return member;
	}

	public BooleanAttribute required(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("required");
		useMember(member);
		return member;
	}

	public BooleanAttribute disabled(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("disabled");
		useMember(member);
		return member;
	}

	public BooleanAttribute customRendering(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("customRendering");
		useMember(member);
		return member;
	}

	public StringAttribute candidateValues(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("candidateValues");
		useMember(member);
		return member;
	}

	public StringAttribute suggestValues(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("suggestValues");
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

