package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LensBaseType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.lensbasetype.LensBaseType";
  }
  // 枚举对象
  public static EnumAttribute STANDARD =
      new EnumAttribute("com.doublechaintech.optical.lensbasetype.LensBaseType", "STANDARD");
  public static EnumAttribute POLARIZED =
      new EnumAttribute("com.doublechaintech.optical.lensbasetype.LensBaseType", "POLARIZED");
  public static EnumAttribute PHOTOCHROMIC =
      new EnumAttribute("com.doublechaintech.optical.lensbasetype.LensBaseType", "PHOTOCHROMIC");

  // 引用的对象

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
