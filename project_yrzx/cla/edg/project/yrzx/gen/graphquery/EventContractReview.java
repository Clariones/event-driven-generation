package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventContractReview extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventcontractreview.EventContractReview";
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

  public StringAttribute projectName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectName");
    member.setName("project_name");
    useMember(member);
    return member;
  }

  public StringAttribute contractId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contractId");
    member.setName("contract_id");
    useMember(member);
    return member;
  }

  public StringAttribute sceneCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sceneCode");
    member.setName("scene_code");
    useMember(member);
    return member;
  }

  public BooleanAttribute passed() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("passed");
    member.setName("passed");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comments");
    member.setName("comments");
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
