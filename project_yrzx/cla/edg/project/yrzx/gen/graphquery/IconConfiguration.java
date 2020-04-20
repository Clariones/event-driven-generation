package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IconConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.iconconfiguration.IconConfiguration";
	}
	// 枚举对象
	public static EnumAttribute JZLP_RK_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "JZLP_RK_SY");
	public static EnumAttribute SYLS_RK_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SYLS_RK_SY");
	public static EnumAttribute SHXH_RK_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SHXH_RK_SY");
	public static EnumAttribute JGDW_RK_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "JGDW_RK_SY");
	public static EnumAttribute WYZX_GN_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "WYZX_GN_SY");
	public static EnumAttribute XMTJ_GN_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XMTJ_GN_SY");
	public static EnumAttribute XMGL_GN_SY = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XMGL_GN_SY");
	public static EnumAttribute XMFM_XM_YW = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XMFM_XM_YW");

	// 引用的对象

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象

	
	// 普通属性

	public StringAttribute id(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("id");
		member.setName("id");
		useMember(member);
		return member;
	}

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("name");
		member.setName("name");
		useMember(member);
		return member;
	}

	public StringAttribute code(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("code");
		member.setName("code");
		useMember(member);
		return member;
	}

	public StringAttribute description(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		// member.setName("description");
		member.setName("description");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("icon");
		member.setName("icon");
		useMember(member);
		return member;
	}

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

