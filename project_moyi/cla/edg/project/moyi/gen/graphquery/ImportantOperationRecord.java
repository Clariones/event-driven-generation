package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class ImportantOperationRecord extends BaseModelBean{
	public String getFullClassName() {
		return "com.terapico.moyi.importantoperationrecord.ImportantOperationRecord";
	}
	// 枚举对象

	// 引用的对象

	// 被引用的对象

	
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

	public StringAttribute operationType(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("operationType");
		useMember(member);
		return member;
	}

	public StringAttribute actorSecUser(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("actorSecUser");
		useMember(member);
		return member;
	}

	public StringAttribute actorMoyiUser(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("actorMoyiUser");
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

	public StringAttribute comments(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_longtext");
		member.setName("comments");
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

