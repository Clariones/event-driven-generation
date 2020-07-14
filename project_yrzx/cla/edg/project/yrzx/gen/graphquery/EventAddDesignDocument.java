package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAddDesignDocument extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventadddesigndocument.EventAddDesignDocument";
  }
  // 枚举对象

  // 引用的对象

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

  public DailyTaskType type() {
    DailyTaskType member = new DailyTaskType();
    member.setModelTypeName("daily_task_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public Merchant submitter() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("submitter");
    member.setMemberName("submitter");
    member.setReferDirection(true);
    member.setRelationName("submitter");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute document() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("document");
    member.setName("document");
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
