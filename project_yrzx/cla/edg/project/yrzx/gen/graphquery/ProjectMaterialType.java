package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectmaterialtype.ProjectMaterialType";
  }
  // 枚举对象

  // 引用的对象

  public ProjectMaterialParentType parent() {
    ProjectMaterialParentType member = new ProjectMaterialParentType();
    member.setModelTypeName("project_material_parent_type");
    member.setName("parent");
    member.setMemberName("parent");
    member.setReferDirection(true);
    member.setRelationName("parent");
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

  public ProjectMaterialTypeConfiguration projectMaterialTypeConfigurationList() {
    ProjectMaterialTypeConfiguration member = new ProjectMaterialTypeConfiguration();
    member.setModelTypeName("project_material_type_configuration");
    member.setName("type");
    member.setMemberName("projectMaterialTypeConfigurationList");
    member.setRelationName("type");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProjectMaterial projectMaterialList() {
    ProjectMaterial member = new ProjectMaterial();
    member.setModelTypeName("project_material");
    member.setName("project_material_type");
    member.setMemberName("projectMaterialList");
    member.setRelationName("projectMaterialType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
