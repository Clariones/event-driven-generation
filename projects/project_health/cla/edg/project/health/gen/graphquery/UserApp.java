package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class UserApp extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.userapp.UserApp";
	}
	// 枚举对象

	// 引用的对象

	public SecUser secUser() {
		SecUser member = new SecUser();
		member.setModelTypeName("sec_user");
		member.setName("sec_user");
		member.setMemberName("secUser");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	// 被引用的对象
	
	public QuickLink quickLinkList() {
		QuickLink member = new QuickLink();
		member.setModelTypeName("quick_link");
		member.setName("app");
		member.setMemberName("quickLinkList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ListAccess listAccessList() {
		ListAccess member = new ListAccess();
		member.setModelTypeName("list_access");
		member.setName("app");
		member.setMemberName("listAccessList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ObjectAccess objectAccessList() {
		ObjectAccess member = new ObjectAccess();
		member.setModelTypeName("object_access");
		member.setName("app");
		member.setMemberName("objectAccessList");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute appIcon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("appIcon");
		useMember(member);
		return member;
	}

	public BooleanAttribute fullAccess(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("fullAccess");
		useMember(member);
		return member;
	}

	public StringAttribute permission(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("permission");
		useMember(member);
		return member;
	}

	public StringAttribute objectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("objectType");
		useMember(member);
		return member;
	}

	public StringAttribute objectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("objectId");
		useMember(member);
		return member;
	}

	public StringAttribute location(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("location");
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

