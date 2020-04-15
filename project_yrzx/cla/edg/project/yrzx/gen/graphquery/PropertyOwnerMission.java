package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PropertyOwnerMission extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.propertyownermission.PropertyOwnerMission";
	}
	// 枚举对象

	// 引用的对象

	public PropertyOwnerMissionType type() {
		PropertyOwnerMissionType member = new PropertyOwnerMissionType();
		member.setModelTypeName("property_owner_mission_type");
		member.setName("type");
		member.setMemberName("type");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public DocumentTag documentTag() {
		DocumentTag member = new DocumentTag();
		member.setModelTypeName("document_tag");
		member.setName("document_tag");
		member.setMemberName("documentTag");
		member.setReferDirection(true);
		append(member);
		return member;
	}

	public PlatformConfiguration platformConfiguration() {
		PlatformConfiguration member = new PlatformConfiguration();
		member.setModelTypeName("platform_configuration");
		member.setName("platform_configuration");
		member.setMemberName("platformConfiguration");
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

	public StringAttribute title(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("title");
		useMember(member);
		return member;
	}

	public StringAttribute icon(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("icon");
		useMember(member);
		return member;
	}

	public StringAttribute tips(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("tips");
		useMember(member);
		return member;
	}

	public NumberAttribute displayOrder(){
		NumberAttribute member = new NumberAttribute();
		member.setModelTypeName("int");
		member.setName("displayOrder");
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

