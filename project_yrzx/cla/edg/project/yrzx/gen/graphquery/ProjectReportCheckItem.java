package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectReportCheckItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectreportcheckitem.ProjectReportCheckItem";
  }
  // 枚举对象

  // 引用的对象

  public ProjectReport projectReport() {
    ProjectReport member = new ProjectReport();
    member.setModelTypeName("project_report");
    member.setName("project_report");
    member.setMemberName("projectReport");
    member.setReferDirection(true);
    member.setRelationName("projectReport");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute checkResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("checkResult");
    member.setName("check_result");
    useMember(member);
    return member;
  }

  public StringAttribute processResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("processResult");
    member.setName("process_result");
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
