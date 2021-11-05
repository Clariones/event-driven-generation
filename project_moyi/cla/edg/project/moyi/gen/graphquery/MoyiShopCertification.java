package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class MoyiShopCertification extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.moyishopcertification.MoyiShopCertification";
	}
	// 枚举对象

	// 引用的对象

	public MoyiShopType moyiShopType() {
		MoyiShopType member = new MoyiShopType();
		member.setModelTypeName("moyi_shop_type");
		member.setName("moyi_shop_type");
		member.setMemberName("moyiShopType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public CertificateStatus certificateStatus() {
		CertificateStatus member = new CertificateStatus();
		member.setModelTypeName("certificate_status");
		member.setName("certificate_status");
		member.setMemberName("certificateStatus");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public MoyiUser shopkeeper() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("shopkeeper");
		member.setMemberName("shopkeeper");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public MoyiShop moyiShopList() {
		MoyiShop member = new MoyiShop();
		member.setModelTypeName("moyi_shop");
		member.setName("certificate");
		member.setMemberName("moyiShopList");
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

	public StringAttribute shopkeeperRealName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("shopkeeperRealName");
		useMember(member);
		return member;
	}

	public StringAttribute shopkeeperIdCardNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("shopkeeperIdCardNumber");
		useMember(member);
		return member;
	}

	public StringAttribute idCardHoldingImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("idCardHoldingImage");
		useMember(member);
		return member;
	}

	public StringAttribute idCardFrontImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("idCardFrontImage");
		useMember(member);
		return member;
	}

	public StringAttribute idCardBackImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("idCardBackImage");
		useMember(member);
		return member;
	}

	public StringAttribute companyName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("companyName");
		useMember(member);
		return member;
	}

	public StringAttribute businessLicenseCopyImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("businessLicenseCopyImage");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		member.setName("createTime");
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

