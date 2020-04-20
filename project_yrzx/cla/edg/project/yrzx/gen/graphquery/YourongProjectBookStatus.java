package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class YourongProjectBookStatus extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus";
	}
	// 枚举对象
	public static EnumAttribute NONE = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "NONE");
	public static EnumAttribute PROCESSING = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "PROCESSING");
	public static EnumAttribute NEED_CONFIRM = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "NEED_CONFIRM");
	public static EnumAttribute CONFIRMED = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "CONFIRMED");
	public static EnumAttribute BIDDING = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "BIDDING");
	public static EnumAttribute BID_WIN = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "BID_WIN");
	public static EnumAttribute COMPLETED = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "COMPLETED");
	public static EnumAttribute INVALID = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "INVALID");
	public static EnumAttribute REJECTED = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "REJECTED");
	public static EnumAttribute UNNECESSARY = new EnumAttribute("com.yrdec.yrzx.yourongprojectbookstatus.YourongProjectBookStatus", "UNNECESSARY");

	// 引用的对象

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
	
	public YourongProjectBook yourongProjectBookList() {
		YourongProjectBook member = new YourongProjectBook();
		member.setModelTypeName("yourong_project_book");
		member.setName("status");
		member.setMemberName("yourongProjectBookList");
		member.setReferDirection(false);
		append(member);
		return member;
	}

	
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		// member.setName("version");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

