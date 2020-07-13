package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAddDebitCard extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventadddebitcard.EventAddDebitCard";
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

  public StringAttribute bank() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("bank");
    member.setName("bank");
    useMember(member);
    return member;
  }

  public StringAttribute accountName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("accountName");
    member.setName("account_name");
    useMember(member);
    return member;
  }

  public StringAttribute bankAddress() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("bankAddress");
    member.setName("bank_address");
    useMember(member);
    return member;
  }

  public StringAttribute number() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("number");
    member.setName("number");
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
