package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Answer extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.answer.Answer";
	}
	// 枚举对象

	// 引用的对象

	public Question question() {
		Question member = new Question();
		member.setModelTypeName("question");
		member.setName("question");
		member.setMemberName("question");
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

	public StringAttribute comment(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("comment");
		useMember(member);
		return member;
	}

	public StringAttribute relateDocument(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("relateDocument");
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

