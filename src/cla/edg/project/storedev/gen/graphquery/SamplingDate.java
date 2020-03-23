package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class SamplingDate extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.samplingdate.SamplingDate";
	}
	// 枚举对象
	public static EnumAttribute MONDAY_OR_THURSDAY = new EnumAttribute("com.doublechain.storedev.samplingdate.SamplingDate", "MONDAY_OR_THURSDAY");
	public static EnumAttribute FRIDAY = new EnumAttribute("com.doublechain.storedev.samplingdate.SamplingDate", "FRIDAY");
	public static EnumAttribute SATURDAY_OR_SUNDAY = new EnumAttribute("com.doublechain.storedev.samplingdate.SamplingDate", "SATURDAY_OR_SUNDAY");

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

