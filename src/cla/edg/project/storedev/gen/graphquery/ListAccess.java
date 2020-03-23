package cla.edg.project.storedev.gen.graphquery;

import java.util.Map;

import com.terapico.generator.Utils;

import cla.edg.modelbean.*;

public class ListAccess extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechain.storedev.listaccess.ListAccess";
	}
	// 枚举对象

	// 引用的对象

	public UserApp app() {
		UserApp member = new UserApp();
		member.setModelTypeName("user_app");
		member.setName("app");
		member.setMemberName("app");
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

	public StringAttribute internalName(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("internalName");
		useMember(member);
		return member;
	}

	public BooleanAttribute readPermission(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("readPermission");
		useMember(member);
		return member;
	}

	public BooleanAttribute createPermission(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("createPermission");
		useMember(member);
		return member;
	}

	public BooleanAttribute deletePermission(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("deletePermission");
		useMember(member);
		return member;
	}

	public BooleanAttribute updatePermission(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("updatePermission");
		useMember(member);
		return member;
	}

	public BooleanAttribute executionPermission(){
		BooleanAttribute member = new BooleanAttribute();
		member.setModelTypeName("bool");
		member.setName("executionPermission");
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

