package cla.edg.project.frontendpoc.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SocialProduct extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.frontendpoc.socialproduct.SocialProduct";
	}
	// 枚举对象

	// 引用的对象

	public ExamUser user() {
		ExamUser member = new ExamUser();
		member.setModelTypeName("exam_user");
		member.setName("user");
		member.setMemberName("user");
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

	public StringAttribute productName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("productName");
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

	public StringAttribute brand(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("brand");
		useMember(member);
		return member;
	}

	public StringAttribute heroImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("heroImage");
		useMember(member);
		return member;
	}

	public StringAttribute images(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("images");
		member.setName("images");
		useMember(member);
		return member;
	}

	public NumberAttribute listPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("listPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute salePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("money");
		member.setName("salePrice");
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

