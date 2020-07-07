package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SafetyInstruction extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.safetyinstruction.SafetyInstruction";
  }
  // 枚举对象

  // 引用的对象

  public Merchant postBy() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("post_by");
    member.setMemberName("postBy");
    member.setReferDirection(true);
    member.setRelationName("postBy");
    append(member);
    return member;
  }

  public Platform platform() {
    Platform member = new Platform();
    member.setModelTypeName("platform");
    member.setName("platform");
    member.setMemberName("platform");
    member.setReferDirection(true);
    member.setRelationName("platform");
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

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("content");
    member.setName("content");
    useMember(member);
    return member;
  }

  public DateTimeAttribute postDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("postDate");
    member.setName("post_date");
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
