package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LensColor extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.lenscolor.LensColor";
  }
  // 枚举对象
  public static EnumAttribute GRAY =
      new EnumAttribute("com.doublechaintech.optical.lenscolor.LensColor", "GRAY");
  public static EnumAttribute DARK_BROWN =
      new EnumAttribute("com.doublechaintech.optical.lenscolor.LensColor", "DARK_BROWN");
  public static EnumAttribute PURPLE =
      new EnumAttribute("com.doublechaintech.optical.lenscolor.LensColor", "PURPLE");
  public static EnumAttribute BLUE =
      new EnumAttribute("com.doublechaintech.optical.lenscolor.LensColor", "BLUE");
  public static EnumAttribute PINK =
      new EnumAttribute("com.doublechaintech.optical.lenscolor.LensColor", "PINK");

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
