package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiShopType extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyishoptype.MoyiShopType";
	}
	// 枚举对象
	public static EnumAttribute PERSONAL = new EnumAttribute("com.terapico.moyi.moyishoptype.MoyiShopType", "PERSONAL");
	public static EnumAttribute ENTERPRISE = new EnumAttribute("com.terapico.moyi.moyishoptype.MoyiShopType", "ENTERPRISE");

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
	
	public MoyiShopCertification moyiShopCertificationList() {
		MoyiShopCertification member = new MoyiShopCertification();
		member.setModelTypeName("moyi_shop_certification");
		member.setName("moyi_shop_type");
		member.setMemberName("moyiShopCertificationList");
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

