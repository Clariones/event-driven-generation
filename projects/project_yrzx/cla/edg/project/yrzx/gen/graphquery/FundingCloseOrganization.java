package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FundingCloseOrganization extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.fundingcloseorganization.FundingCloseOrganization";
	}
	// 枚举对象

	// 引用的对象

	public FundingCloseOrganizationType fundingCloseOrganizationType() {
		FundingCloseOrganizationType member = new FundingCloseOrganizationType();
		member.setModelTypeName("funding_close_organization_type");
		member.setName("funding_close_organization_type");
		member.setMemberName("fundingCloseOrganizationType");
		member.setReferDirection(true);
		member.setRelationName("fundingCloseOrganizationType");
		append(member);
		return member;
	}

	public Merchant merchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("merchant");
		member.setMemberName("merchant");
		member.setReferDirection(true);
		member.setRelationName("merchant");
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
		member.setReferDirection(true);
		member.setRelationName("platform");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}



}

