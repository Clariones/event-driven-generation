package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventApplyForAdvanceCompensation extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventapplyforadvancecompensation.EventApplyForAdvanceCompensation";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute compensationApplicationName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("compensationApplicationName");
    member.setName("compensation_application_name");
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

  public StringAttribute reason() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("reason");
    member.setName("reason");
    useMember(member);
    return member;
  }

  public StringAttribute images() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("images");
    member.setName("images");
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
