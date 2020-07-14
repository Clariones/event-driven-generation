package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventCheckVerifyCode extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventcheckverifycode.EventCheckVerifyCode";
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

  public StringAttribute verifyCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("verifyCode");
    member.setName("verify_code");
    useMember(member);
    return member;
  }

  public StringAttribute itemId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("itemId");
    member.setName("item_id");
    useMember(member);
    return member;
  }

  public StringAttribute itemType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("itemType");
    member.setName("item_type");
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
