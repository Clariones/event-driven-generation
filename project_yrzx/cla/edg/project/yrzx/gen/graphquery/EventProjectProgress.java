package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProjectProgress extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventprojectprogress.EventProjectProgress";
  }
  // 枚举对象

  // 引用的对象

  public ProjectProgressStatus projectProgressStatus() {
    ProjectProgressStatus member = new ProjectProgressStatus();
    member.setModelTypeName("project_progress_status");
    member.setName("project_progress_status");
    member.setMemberName("projectProgressStatus");
    member.setReferDirection(true);
    member.setRelationName("projectProgressStatus");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public StringAttribute projectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectId");
    member.setName("project_id");
    useMember(member);
    return member;
  }

  public StringAttribute projectName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectName");
    member.setName("project_name");
    useMember(member);
    return member;
  }

  public StringAttribute phaseName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("phaseName");
    member.setName("phase_name");
    useMember(member);
    return member;
  }

  public StringAttribute phaseId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("phaseId");
    member.setName("phase_id");
    useMember(member);
    return member;
  }

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public DateTimeAttribute planStartDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("planStartDate");
    member.setName("plan_start_date");
    useMember(member);
    return member;
  }

  public DateTimeAttribute actualStartDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("actualStartDate");
    member.setName("actual_start_date");
    useMember(member);
    return member;
  }

  public DateTimeAttribute planFinishDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("planFinishDate");
    member.setName("plan_finish_date");
    useMember(member);
    return member;
  }

  public DateTimeAttribute actualFinishDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("actualFinishDate");
    member.setName("actual_finish_date");
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
