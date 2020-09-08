package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FrameRelatedReplacement extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.framerelatedreplacement.FrameRelatedReplacement";
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

  public Frame replacementFrame() {
    Frame member = new Frame();
    member.setModelTypeName("frame");
    member.setName("replacement_frame");
    member.setMemberName("replacementFrame");
    member.setReferDirection(true);
    member.setRelationName("replacementFrame");
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
