package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectBid extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.projectbid.ProjectBid";
	}
	// 枚举对象

	// 引用的对象

	public Merchant projectOwner() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("project_owner");
		member.setMemberName("projectOwner");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Merchant responsibleMerchant() {
		Merchant member = new Merchant();
		member.setModelTypeName("merchant");
		member.setName("responsible_merchant");
		member.setMemberName("responsibleMerchant");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public Platform platform() {
		Platform member = new Platform();
		member.setModelTypeName("platform");
		member.setName("platform");
		member.setMemberName("platform");
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

	public StringAttribute bidName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("bidName");
		useMember(member);
		return member;
	}

	public StringAttribute bidFile(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_document");
		member.setName("bidFile");
		useMember(member);
		return member;
	}

	public StringAttribute projectOwnerSignature(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("projectOwnerSignature");
		useMember(member);
		return member;
	}

	public StringAttribute responsibleMerchantSignature(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("responsibleMerchantSignature");
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

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		member.setName("lastUpdateTime");
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

