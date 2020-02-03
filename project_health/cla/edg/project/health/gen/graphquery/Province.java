package cla.edg.project.health.gen.graphquery;

import java.util.Map;

import cla.edg.Utils;
import cla.edg.modelbean.*;

public class Province extends BaseModelBean{
	public String getFullClassName() {
		return "com.doublechaintech.health.province.Province";
	}
	// 枚举对象

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
	
	public City cityList() {
		City member = new City();
		member.setModelTypeName("city");
		member.setName("province");
		member.setMemberName("cityList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public Location locationList() {
		Location member = new Location();
		member.setModelTypeName("location");
		member.setName("province");
		member.setMemberName("locationList");
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

