package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class CertificateStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.certificatestatus.CertificateStatus";
	}
	// 枚举对象
	public static EnumAttribute NEED_CERTIFICATE = new EnumAttribute("com.terapico.moyi.certificatestatus.CertificateStatus", "NEED_CERTIFICATE");
	public static EnumAttribute PROCESSING = new EnumAttribute("com.terapico.moyi.certificatestatus.CertificateStatus", "PROCESSING");
	public static EnumAttribute CERTIFICATED = new EnumAttribute("com.terapico.moyi.certificatestatus.CertificateStatus", "CERTIFICATED");
	public static EnumAttribute FAILED = new EnumAttribute("com.terapico.moyi.certificatestatus.CertificateStatus", "FAILED");
	public static EnumAttribute ABATE = new EnumAttribute("com.terapico.moyi.certificatestatus.CertificateStatus", "ABATE");

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
		member.setName("certificate_status");
		member.setMemberName("moyiShopCertificationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ArtworkOwnershipCertificate artworkOwnershipCertificateList() {
		ArtworkOwnershipCertificate member = new ArtworkOwnershipCertificate();
		member.setModelTypeName("artwork_ownership_certificate");
		member.setName("certificate_status");
		member.setMemberName("artworkOwnershipCertificateList");
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

