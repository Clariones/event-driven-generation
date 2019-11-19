package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Organization extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.organization.Organization";
	}
	// 枚举对象

	// 引用的对象

	public MoyiUser moyiUser() {
		MoyiUser member = new MoyiUser();
		member.setModelTypeName("moyi_user");
		member.setName("moyi_user");
		member.setMemberName("moyiUser");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public OrganizationType organizationType() {
		OrganizationType member = new OrganizationType();
		member.setModelTypeName("organization_type");
		member.setName("organization_type");
		member.setMemberName("organizationType");
		member.setReferDirection(true);
		append(member);
		return member;
	}

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

	public StringAttribute organizationName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("organizationName");
		useMember(member);
		return member;
	}

	public StringAttribute businessLicenseNumber(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_taxpayerid");
		member.setName("businessLicenseNumber");
		useMember(member);
		return member;
	}

	public StringAttribute businessLicenseImage(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("businessLicenseImage");
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

