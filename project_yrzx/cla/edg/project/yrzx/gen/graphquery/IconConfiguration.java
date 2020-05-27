package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IconConfiguration extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.iconconfiguration.IconConfiguration";
	}
	// 枚举对象
	public static EnumAttribute SY_RK_JZLP = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_RK_JZLP");
	public static EnumAttribute SY_RK_SYLS = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_RK_SYLS");
	public static EnumAttribute SY_RK_SHXH = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_RK_SHXH");
	public static EnumAttribute SY_RK_JGDW = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_RK_JGDW");
	public static EnumAttribute SY_GN_WYZX = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_GN_WYZX");
	public static EnumAttribute SY_GN_XMTJ = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_GN_XMTJ");
	public static EnumAttribute SY_GN_XMGL = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_GN_XMGL");
	public static EnumAttribute SY_GN_WXRZ = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "SY_GN_WXRZ");
	public static EnumAttribute YM_XM_XMFM = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "YM_XM_XMFM");
	public static EnumAttribute XM_DT_YRWS = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XM_DT_YRWS");
	public static EnumAttribute XM_DT_XMZZ = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XM_DT_XMZZ");
	public static EnumAttribute XM_DT_HTRW = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XM_DT_HTRW");
	public static EnumAttribute XM_DT_ZLDA = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "XM_DT_ZLDA");
	public static EnumAttribute ME_GLYG = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ME_GLYG");
	public static EnumAttribute ME_WDXM = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ME_WDXM");
	public static EnumAttribute ME_WDZH = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ME_WDZH");
	public static EnumAttribute ME_WDDD = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ME_WDDD");
	public static EnumAttribute ME_QHZH = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ME_QHZH");
	public static EnumAttribute ME_TCDL = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ME_TCDL");
	public static EnumAttribute TEST_FOR_YR = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "TEST_FOR_YR");
	public static EnumAttribute COMMENT_BTN = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "COMMENT_BTN");
	public static EnumAttribute REVIEW_BTN = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "REVIEW_BTN");
	public static EnumAttribute CANCEL_BTN = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "CANCEL_BTN");
	public static EnumAttribute EDIT_BTN = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "EDIT_BTN");
	public static EnumAttribute ADD_BTN = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "ADD_BTN");
	public static EnumAttribute DEBIT_CARD = new EnumAttribute("com.yrdec.yrzx.iconconfiguration.IconConfiguration", "DEBIT_CARD");

	// 引用的对象

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
		member.setReferDirection(true);
		member.setRelationName("platformConfiguration");
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

