package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectOrganizationType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType";
  }
  // 枚举对象
  public static EnumAttribute YR_CONSTRUCTION_AGENCY =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType",
          "YR_CONSTRUCTION_AGENCY");
  public static EnumAttribute PROJECT_CONSTRUCTION =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_CONSTRUCTION");
  public static EnumAttribute BRAND =
      new EnumAttribute("com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "BRAND");
  public static EnumAttribute BIM =
      new EnumAttribute("com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "BIM");
  public static EnumAttribute PROJECT_SUPERVISION =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_SUPERVISION");
  public static EnumAttribute PROJECT_DESIGN =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_DESIGN");
  public static EnumAttribute PROJECT_SURVEY =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_SURVEY");
  public static EnumAttribute PROJECT_BIDDING =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_BIDDING");
  public static EnumAttribute PROJECT_COST =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_COST");
  public static EnumAttribute QUALITY_CONTROL =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "QUALITY_CONTROL");
  public static EnumAttribute PROJECT_AUDIT =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_AUDIT");
  public static EnumAttribute PROJECT_PLANNING =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_PLANNING");
  public static EnumAttribute HOUSING_MANAGEMENT =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "HOUSING_MANAGEMENT");
  public static EnumAttribute FILE_MANAGEMENT =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "FILE_MANAGEMENT");
  public static EnumAttribute PROJECT_MANAGEMENT =
      new EnumAttribute(
          "com.yrdec.yrzx.projectorganizationtype.ProjectOrganizationType", "PROJECT_MANAGEMENT");

  // 引用的对象

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

  public ProjectNomination projectNominationList() {
    ProjectNomination member = new ProjectNomination();
    member.setModelTypeName("project_nomination");
    member.setName("type");
    member.setMemberName("projectNominationList");
    member.setRelationName("type");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventProjectWorkPosition eventProjectWorkPositionList() {
    EventProjectWorkPosition member = new EventProjectWorkPosition();
    member.setModelTypeName("event_project_work_position");
    member.setName("project_job");
    member.setMemberName("eventProjectWorkPositionList");
    member.setRelationName("projectJob");
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

  public NumberAttribute displayOrder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("displayOrder");
    member.setName("display_order");
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
