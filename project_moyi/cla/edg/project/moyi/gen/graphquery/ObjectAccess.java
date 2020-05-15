package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
import cla.edg.modelbean.*;

public class ObjectAccess extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.objectaccess.ObjectAccess";
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

	public StringAttribute objectType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("object_type");
		useMember(member);
		return member;
	}

	public StringAttribute list1(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list1");
		useMember(member);
		return member;
	}

	public StringAttribute list2(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list2");
		useMember(member);
		return member;
	}

	public StringAttribute list3(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list3");
		useMember(member);
		return member;
	}

	public StringAttribute list4(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list4");
		useMember(member);
		return member;
	}

	public StringAttribute list5(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list5");
		useMember(member);
		return member;
	}

	public StringAttribute list6(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list6");
		useMember(member);
		return member;
	}

	public StringAttribute list7(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list7");
		useMember(member);
		return member;
	}

	public StringAttribute list8(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list8");
		useMember(member);
		return member;
	}

	public StringAttribute list9(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("list9");
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

