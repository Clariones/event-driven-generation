package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectMaterialReviewRecordStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectmaterialreviewrecordstatus.ProjectMaterialReviewRecordStatus";
  }
  // 枚举对象
  public static EnumAttribute APPROVED =
      new EnumAttribute(
          "com.yrdec.yrzx.projectmaterialreviewrecordstatus.ProjectMaterialReviewRecordStatus",
          "APPROVED");
  public static EnumAttribute UNAPPROVED =
      new EnumAttribute(
          "com.yrdec.yrzx.projectmaterialreviewrecordstatus.ProjectMaterialReviewRecordStatus",
          "UNAPPROVED");
  public static EnumAttribute PENDING =
      new EnumAttribute(
          "com.yrdec.yrzx.projectmaterialreviewrecordstatus.ProjectMaterialReviewRecordStatus",
          "PENDING");

  // 引用的对象

  // 被引用的对象

  public ProjectMaterialReviewRecord projectMaterialReviewRecordList() {
    ProjectMaterialReviewRecord member = new ProjectMaterialReviewRecord();
    member.setModelTypeName("project_material_review_record");
    member.setName("status");
    member.setMemberName("projectMaterialReviewRecordList");
    member.setRelationName("status");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
