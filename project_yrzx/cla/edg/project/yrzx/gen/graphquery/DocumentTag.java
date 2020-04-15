package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DocumentTag extends BaseModelBean{
	public String getFullClassName() {
		return "com.yrdec.yrzx.documenttag.DocumentTag";
	}
	// 枚举对象

	// 引用的对象

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
	
	public PropertyOwnerMission propertyOwnerMissionList() {
		PropertyOwnerMission member = new PropertyOwnerMission();
		member.setModelTypeName("property_owner_mission");
		member.setName("document_tag");
		member.setMemberName("propertyOwnerMissionList");
		member.setReferDirection(false);
		append(member);
		return member;
	}
	
	public ProjectDocument projectDocumentList() {
		ProjectDocument member = new ProjectDocument();
		member.setModelTypeName("project_document");
		member.setName("tag");
		member.setMemberName("projectDocumentList");
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

	public StringAttribute englishTitle(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("englishTitle");
		useMember(member);
		return member;
	}

	public StringAttribute imageUrl(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string_image");
		member.setName("imageUrl");
		useMember(member);
		return member;
	}

	public StringAttribute parentPath(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parentPath");
		useMember(member);
		return member;
	}

	public StringAttribute parentId(){
		StringAttribute member = new StringAttribute();
		member.setModelTypeName("string");
		member.setName("parentId");
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

