package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserTryOnAvatar extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.optical.usertryonavatar.UserTryOnAvatar";
	}
	// 枚举对象

	// 引用的对象

	public Sku tryOnGlasses() {
		Sku member = new Sku();
		member.setModelTypeName("sku");
		member.setName("try_on_glasses");
		member.setMemberName("tryOnGlasses");
		member.setReferDirection(true);
		member.setRelationName("tryOnGlasses");
		append(member);
		return member;
	}

	public User user() {
		User member = new User();
		member.setModelTypeName("user");
		member.setName("user");
		member.setMemberName("user");
		member.setReferDirection(true);
		member.setRelationName("user");
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

	public StringAttribute avatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("avatar");
		member.setName("avatar");
		useMember(member);
		return member;
	}

	public StringAttribute tryOnAvatar(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		// member.setName("tryOnAvatar");
		member.setName("try_on_avatar");
		useMember(member);
		return member;
	}

	public DateTimeAttribute createTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_create");
		// member.setName("createTime");
		member.setName("create_time");
		useMember(member);
		return member;
	}

	public DateTimeAttribute lastUpdateTime(){
		DateTimeAttribute member = new DateTimeAttribute();
		member.setModelTypeName("date_time_update");
		// member.setName("lastUpdateTime");
		member.setName("last_update_time");
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

