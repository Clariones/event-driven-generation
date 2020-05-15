package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class SlideType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.slidetype.SlideType";
	}
	// 枚举对象
	public static EnumAttribute ARTWORK = new EnumAttribute("com.terapico.moyi.slidetype.SlideType", "ARTWORK");
	public static EnumAttribute ARTICLE = new EnumAttribute("com.terapico.moyi.slidetype.SlideType", "ARTICLE");
	public static EnumAttribute H5 = new EnumAttribute("com.terapico.moyi.slidetype.SlideType", "H5");
	public static EnumAttribute IMAGE = new EnumAttribute("com.terapico.moyi.slidetype.SlideType", "IMAGE");

	// 引用的对象

	public Moyi moyi() {
		Moyi member = new Moyi();
		member.setModelTypeName("moyi");
		member.setName("moyi");
		member.setMemberName("moyi");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public Slide slideList() {
		Slide member = new Slide();
		member.setModelTypeName("slide");
		member.setName("slide_type");
		member.setMemberName("slideList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

