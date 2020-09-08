package cla.edg.project.iscm.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Platform extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.iscm.platform.Platform";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象
	
	public SystemConfiguration systemConfigurationList() {
		SystemConfiguration member = new SystemConfiguration();
		member.setModelTypeName("system_configuration");
		member.setName("platform");
		member.setMemberName("systemConfigurationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public SalesPerson salesPersonList() {
		SalesPerson member = new SalesPerson();
		member.setModelTypeName("sales_person");
		member.setName("platform");
		member.setMemberName("salesPersonList");
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

