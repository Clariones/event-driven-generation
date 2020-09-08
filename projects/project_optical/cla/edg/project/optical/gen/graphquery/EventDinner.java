package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventDinner extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.eventdinner.EventDinner";
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

  public StringAttribute invitorName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("invitorName");
    member.setName("invitor_name");
    useMember(member);
    return member;
  }

  public StringAttribute dinnerType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("dinnerType");
    member.setName("dinner_type");
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
