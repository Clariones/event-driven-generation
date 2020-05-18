package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;
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
		member.setName("operation_type");
		useMember(member);
		return member;
	}

	public StringAttribute actorSecUser(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("actor_sec_user");
		useMember(member);
		return member;
	}

	public StringAttribute actorMoyiUser(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("actor_moyi_user");
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

	public StringAttribute objectId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("object_id");
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
		member.setName("last_update_time");
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

