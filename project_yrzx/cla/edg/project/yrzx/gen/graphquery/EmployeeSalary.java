package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EmployeeSalary extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.employeesalary.EmployeeSalary";
  }
  // 枚举对象

  // 引用的对象

  public Merchant employer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("employer");
    member.setMemberName("employer");
    member.setReferDirection(true);
    member.setRelationName("employer");
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

  public NumberAttribute baseSalary() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("baseSalary");
    member.setName("base_salary");
    useMember(member);
    return member;
  }

  public NumberAttribute bonusSalary() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("bonusSalary");
    member.setName("bonus_salary");
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
