package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMaterialChangeAudit extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventmaterialchangeaudit.EventMaterialChangeAudit";
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

  public StringAttribute projectConstructor() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectConstructor");
    member.setName("project_constructor");
    useMember(member);
    return member;
  }

  public StringAttribute projectSupervision() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectSupervision");
    member.setName("project_supervision");
    useMember(member);
    return member;
  }

  public StringAttribute projectManager() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectManager");
    member.setName("project_manager");
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
