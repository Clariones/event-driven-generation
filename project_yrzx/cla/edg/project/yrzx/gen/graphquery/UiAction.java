package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UiAction extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.uiaction.UiAction";
	}
	// 枚举对象

	// 引用的对象

	public Page page() {
		Page member = new Page();
		member.setModelTypeName("page");
		member.setName("page");
		member.setMemberName("page");
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

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("icon");
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

	public StringAttribute imageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("imageUrl");
		useMember(member);
		return member;
	}

	public StringAttribute linkToUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("linkToUrl");
		useMember(member);
		return member;
	}

	public StringAttribute extraData(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("extraData");
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

