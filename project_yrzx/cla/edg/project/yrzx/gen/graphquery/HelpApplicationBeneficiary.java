package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HelpApplicationBeneficiary extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.helpapplicationbeneficiary.HelpApplicationBeneficiary";
  }
  // 枚举对象

  // 引用的对象

  public HelpApplication helpApplication() {
    HelpApplication member = new HelpApplication();
    member.setModelTypeName("help_application");
    member.setName("help_application");
    member.setMemberName("helpApplication");
    member.setReferDirection(true);
    member.setRelationName("helpApplication");
    append(member);
    return member;
  }

  public Merchant merchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant");
    member.setMemberName("merchant");
    member.setReferDirection(true);
    member.setRelationName("merchant");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
