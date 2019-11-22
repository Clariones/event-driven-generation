package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ServiceFee extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.servicefee.ServiceFee";
	}
	// 枚举对象
	public static EnumAttribute SHOP_CERTIFICATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "SHOP_CERTIFICATE");
	public static EnumAttribute FAVOURABLE_SHOP_CERTIFICATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "FAVOURABLE_SHOP_CERTIFICATE");
	public static EnumAttribute ARTWORK_CERTIFICATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "ARTWORK_CERTIFICATE");
	public static EnumAttribute FAVOURABLE_ARTWORK_CERTIFICATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "FAVOURABLE_ARTWORK_CERTIFICATE");
	public static EnumAttribute INK_DEED_ISSUE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "INK_DEED_ISSUE");
	public static EnumAttribute FAVOURABLE_INK_DEED_ISSUE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "FAVOURABLE_INK_DEED_ISSUE");
	public static EnumAttribute AUCTION_SERVICE_RATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "AUCTION_SERVICE_RATE");
	public static EnumAttribute FAVOURABLE_AUCTION_SERVICE_RATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "FAVOURABLE_AUCTION_SERVICE_RATE");
	public static EnumAttribute INK_DEED_REDEEM_RATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "INK_DEED_REDEEM_RATE");
	public static EnumAttribute FAVOURABLE_INK_DEED_REDEEM_RATE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "FAVOURABLE_INK_DEED_REDEEM_RATE");
	public static EnumAttribute SHOP_ANNUAL_FEE = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "SHOP_ANNUAL_FEE");
	public static EnumAttribute SHOP_DEPOSIT = new EnumAttribute("com.terapico.moyi.servicefee.ServiceFee", "SHOP_DEPOSIT");

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

	public NumberAttribute ibPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("ibPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute rmbPrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("rmbPrice");
		useMember(member);
		return member;
	}

	public NumberAttribute ibSalePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("ibSalePrice");
		useMember(member);
		return member;
	}

	public NumberAttribute rmbSalePrice(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("double");
		member.setName("rmbSalePrice");
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

