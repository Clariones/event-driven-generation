package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HelpContractStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.helpcontractstatus.HelpContractStatus";
  }
  // 枚举对象
  public static EnumAttribute PENDING_ON_CONFIRMATION =
      new EnumAttribute(
          "com.yrdec.yrzx.helpcontractstatus.HelpContractStatus", "PENDING_ON_CONFIRMATION");
  public static EnumAttribute IN_ACCOMPLISH =
      new EnumAttribute("com.yrdec.yrzx.helpcontractstatus.HelpContractStatus", "IN_ACCOMPLISH");
  public static EnumAttribute PENDING =
      new EnumAttribute("com.yrdec.yrzx.helpcontractstatus.HelpContractStatus", "PENDING");
  public static EnumAttribute ACCOMPLISHED =
      new EnumAttribute("com.yrdec.yrzx.helpcontractstatus.HelpContractStatus", "ACCOMPLISHED");

  // 引用的对象

  // 被引用的对象

  public HelpContract helpContractList() {
    HelpContract member = new HelpContract();
    member.setModelTypeName("help_contract");
    member.setName("status");
    member.setMemberName("helpContractList");
    member.setRelationName("status");
    member.setReferDirection(false);
    append(member);
    return member;
  }

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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
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
