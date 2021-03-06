package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class District extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.district.District";
	}
	// 枚举对象

	// 引用的对象

	public City city() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("city");
		member.setMemberName("city");
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
	
	public Location locationList() {
		Location member = new Location();
		member.setModelTypeName("location");
		member.setName("district");
		member.setMemberName("locationList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Organization organizationList() {
		Organization member = new Organization();
		member.setModelTypeName("organization");
		member.setName("district");
		member.setMemberName("organizationList");
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

	public StringAttribute name(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("name");
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

	public NumberAttribute version(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("version");
		useMember(member);
		return member;
	}


	
}

