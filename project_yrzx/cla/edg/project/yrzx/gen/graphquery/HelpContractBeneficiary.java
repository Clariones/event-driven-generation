package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class HelpContractBeneficiary extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.helpcontractbeneficiary.HelpContractBeneficiary";
  }
  // 枚举对象

  // 引用的对象

  public HelpContract helpContract() {
    HelpContract member = new HelpContract();
    member.setModelTypeName("help_contract");
    member.setName("help_contract");
    member.setMemberName("helpContract");
    member.setReferDirection(true);
    member.setRelationName("helpContract");
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
