package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RimlessFrameAvailableLensShape extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.rimlessframeavailablelensshape.RimlessFrameAvailableLensShape";
  }
  // 枚举对象

  // 引用的对象

  public Frame frame() {
    Frame member = new Frame();
    member.setModelTypeName("frame");
    member.setName("frame");
    member.setMemberName("frame");
    member.setReferDirection(true);
    member.setRelationName("frame");
    append(member);
    return member;
  }

  public RimlessLensShape rimlessLensShape() {
    RimlessLensShape member = new RimlessLensShape();
    member.setModelTypeName("rimless_lens_shape");
    member.setName("rimless_lens_shape");
    member.setMemberName("rimlessLensShape");
    member.setReferDirection(true);
    member.setRelationName("rimlessLensShape");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
