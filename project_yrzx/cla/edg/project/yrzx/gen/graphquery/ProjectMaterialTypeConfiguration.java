package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialTypeConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectmaterialtypeconfiguration.ProjectMaterialTypeConfiguration";
  }
  // 枚举对象

  // 引用的对象

  public ProjectMaterialType type() {
    ProjectMaterialType member = new ProjectMaterialType();
    member.setModelTypeName("project_material_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public Project project() {
    Project member = new Project();
    member.setModelTypeName("project");
    member.setName("project");
    member.setMemberName("project");
    member.setReferDirection(true);
    member.setRelationName("project");
    append(member);
    return member;
  }

  // 被引用的对象

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public BooleanAttribute display() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("display");
    member.setName("display");
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
