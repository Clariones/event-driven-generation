package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectPenaltiesStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectpenaltiesstatus.ProjectPenaltiesStatus";
  }
  // 枚举对象
  public static EnumAttribute SUBMITTED =
      new EnumAttribute(
          "com.yrdec.yrzx.projectpenaltiesstatus.ProjectPenaltiesStatus", "SUBMITTED");
  public static EnumAttribute PROCESSING =
      new EnumAttribute(
          "com.yrdec.yrzx.projectpenaltiesstatus.ProjectPenaltiesStatus", "PROCESSING");
  public static EnumAttribute FINISHED =
      new EnumAttribute("com.yrdec.yrzx.projectpenaltiesstatus.ProjectPenaltiesStatus", "FINISHED");

  // 引用的对象

  // 被引用的对象

  public ProjectPenalties projectPenaltiesList() {
    ProjectPenalties member = new ProjectPenalties();
    member.setModelTypeName("project_penalties");
    member.setName("status");
    member.setMemberName("projectPenaltiesList");
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
