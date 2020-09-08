package cla.edg.project.iscm.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class SystemConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.iscm.systemconfiguration.SystemConfiguration";
	}
	// 枚举对象
	public static EnumAttribute COPY_WRITING = new EnumAttribute("com.terapico.iscm.systemconfiguration.SystemConfiguration", "COPY_WRITING");
	public static EnumAttribute PROTOCOL = new EnumAttribute("com.terapico.iscm.systemconfiguration.SystemConfiguration", "PROTOCOL");
	public static EnumAttribute SERVICE_FEE = new EnumAttribute("com.terapico.iscm.systemconfiguration.SystemConfiguration", "SERVICE_FEE");

	// 引用的对象

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public ConfigurationItem configurationItemList() {
		ConfigurationItem member = new ConfigurationItem();
		member.setModelTypeName("configuration_item");
		member.setName("show_in");
		member.setMemberName("configurationItemList");
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

