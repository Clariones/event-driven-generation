package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class FormField extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.formfield.FormField";
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
		member.setName("locale_key");
		useMember(member);
		return member;
	}

	public StringAttribute parameterName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parameter_name");
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
		member.setName("default_value");
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
		member.setName("field_group");
		useMember(member);
		return member;
	}

	public StringAttribute minimumValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("minimum_value");
		useMember(member);
		return member;
	}

	public StringAttribute maximumValue(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("maximum_value");
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
		member.setName("custom_rendering");
		useMember(member);
		return member;
	}

	public StringAttribute candidateValues(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("candidate_values");
		useMember(member);
		return member;
	}

	public StringAttribute suggestValues(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("suggest_values");
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

