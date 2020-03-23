package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class SampleItemTitle extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.sampleitemtitle.SampleItemTitle";
	}
	// 枚举对象
	public static EnumAttribute MID = new EnumAttribute("com.doublechain.storedev.sampleitemtitle.SampleItemTitle", "MID");
	public static EnumAttribute AFTER = new EnumAttribute("com.doublechain.storedev.sampleitemtitle.SampleItemTitle", "AFTER");
	public static EnumAttribute NIGHT = new EnumAttribute("com.doublechain.storedev.sampleitemtitle.SampleItemTitle", "NIGHT");
	public static EnumAttribute WEATHER = new EnumAttribute("com.doublechain.storedev.sampleitemtitle.SampleItemTitle", "WEATHER");

	// 引用的对象

	// 被引用的对象

	
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

