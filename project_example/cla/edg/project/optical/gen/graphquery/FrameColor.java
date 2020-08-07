package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrameColor extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.framecolor.FrameColor";
  }
  // 枚举对象
  public static EnumAttribute BLACK =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "BLACK");
  public static EnumAttribute BLUE =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "BLUE");
  public static EnumAttribute BROWN =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "BROWN");
  public static EnumAttribute CREAM =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "CREAM");
  public static EnumAttribute GRAY =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "GRAY");
  public static EnumAttribute GREEN =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "GREEN");
  public static EnumAttribute MULTIPCOLOR =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "MULTIPCOLOR");
  public static EnumAttribute ORANGE =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "ORANGE");
  public static EnumAttribute PATTERN =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "PATTERN");
  public static EnumAttribute PINK =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "PINK");
  public static EnumAttribute PURPLE =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "PURPLE");
  public static EnumAttribute RED =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "RED");
  public static EnumAttribute SILVER =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "SILVER");
  public static EnumAttribute TORTOISESHELL =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "TORTOISESHELL");
  public static EnumAttribute TRANSLUCENT =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "TRANSLUCENT");
  public static EnumAttribute WHITE =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "WHITE");
  public static EnumAttribute WOOD_TEXTURE =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "WOOD_TEXTURE");
  public static EnumAttribute YELLOW =
      new EnumAttribute("com.doublechaintech.optical.framecolor.FrameColor", "YELLOW");

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

  public DemoSku demoSkuList() {
    DemoSku member = new DemoSku();
    member.setModelTypeName("demo_sku");
    member.setName("color");
    member.setMemberName("demoSkuList");
    member.setRelationName("color");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Frame frameList() {
    Frame member = new Frame();
    member.setModelTypeName("frame");
    member.setName("frame_color");
    member.setMemberName("frameList");
    member.setRelationName("frameColor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Sku skuList() {
    Sku member = new Sku();
    member.setModelTypeName("sku");
    member.setName("color");
    member.setMemberName("skuList");
    member.setRelationName("color");
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
