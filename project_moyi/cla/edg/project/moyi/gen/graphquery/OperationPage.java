package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class OperationPage extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.operationpage.OperationPage";
	}
	// 枚举对象

	// 引用的对象

	public MoyiPlatformConfiguration config() {
		MoyiPlatformConfiguration member = new MoyiPlatformConfiguration();
		member.setModelTypeName("moyi_platform_configuration");
		member.setName("config");
		member.setMemberName("config");
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

	public StringAttribute linkToUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_url");
		member.setName("link_to_url");
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

