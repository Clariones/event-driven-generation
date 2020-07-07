package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialViewRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectmaterialviewrecord.ProjectMaterialViewRecord";
  }
  // 枚举对象

  // 引用的对象

  public ProjectMaterial projectMaterial() {
    ProjectMaterial member = new ProjectMaterial();
    member.setModelTypeName("project_material");
    member.setName("project_material");
    member.setMemberName("projectMaterial");
    member.setReferDirection(true);
    member.setRelationName("projectMaterial");
    append(member);
    return member;
  }

  public Merchant merchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant");
    member.setMemberName("merchant");
    member.setReferDirection(true);
    member.setRelationName("merchant");
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

  public NumberAttribute viewCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("viewCount");
    member.setName("view_count");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
