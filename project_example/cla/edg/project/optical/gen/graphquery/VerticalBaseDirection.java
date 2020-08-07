package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class VerticalBaseDirection extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.verticalbasedirection.VerticalBaseDirection";
  }
  // 枚举对象
  public static EnumAttribute UP =
      new EnumAttribute(
          "com.doublechaintech.optical.verticalbasedirection.VerticalBaseDirection", "UP");
  public static EnumAttribute DOWN =
      new EnumAttribute(
          "com.doublechaintech.optical.verticalbasedirection.VerticalBaseDirection", "DOWN");

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

  public Prescription prescriptionListAsRightPrismVerticalBaseDirection() {
    Prescription member = new Prescription();
    member.setModelTypeName("prescription");
    member.setName("right_prism_vertical_base_direction");
    member.setMemberName("prescriptionListAsRightPrismVerticalBaseDirection");
    member.setRelationName("rightPrismVerticalBaseDirection");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Prescription prescriptionListAsLeftPrismVerticalBaseDirection() {
    Prescription member = new Prescription();
    member.setModelTypeName("prescription");
    member.setName("left_prism_vertical_base_direction");
    member.setMemberName("prescriptionListAsLeftPrismVerticalBaseDirection");
    member.setRelationName("rightPrismVerticalBaseDirection");
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
