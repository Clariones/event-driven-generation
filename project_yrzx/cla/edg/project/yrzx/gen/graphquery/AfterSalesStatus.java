package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AfterSalesStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.aftersalesstatus.AfterSalesStatus";
  }
  // 枚举对象
  public static EnumAttribute SUBMITTED =
      new EnumAttribute("com.yrdec.yrzx.aftersalesstatus.AfterSalesStatus", "SUBMITTED");
  public static EnumAttribute PROCESSING =
      new EnumAttribute("com.yrdec.yrzx.aftersalesstatus.AfterSalesStatus", "PROCESSING");
  public static EnumAttribute SOLVED =
      new EnumAttribute("com.yrdec.yrzx.aftersalesstatus.AfterSalesStatus", "SOLVED");

  // 引用的对象

  // 被引用的对象

  public AfterSales afterSalesList() {
    AfterSales member = new AfterSales();
    member.setModelTypeName("after_sales");
    member.setName("status");
    member.setMemberName("afterSalesList");
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
