package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ClipOnType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.clipontype.ClipOnType";
  }
  // 枚举对象
  public static EnumAttribute MAG_CLIP_ON =
      new EnumAttribute("com.doublechaintech.optical.clipontype.ClipOnType", "MAG_CLIP_ON");
  public static EnumAttribute NORMAL_CLIP_ON =
      new EnumAttribute("com.doublechaintech.optical.clipontype.ClipOnType", "NORMAL_CLIP_ON");

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

  public Frame frameList() {
    Frame member = new Frame();
    member.setModelTypeName("frame");
    member.setName("clip_on_type");
    member.setMemberName("frameList");
    member.setRelationName("clipOnType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FrameAvailableClipOnType frameAvailableClipOnTypeList() {
    FrameAvailableClipOnType member = new FrameAvailableClipOnType();
    member.setModelTypeName("frame_available_clip_on_type");
    member.setName("clip_on_type");
    member.setMemberName("frameAvailableClipOnTypeList");
    member.setRelationName("clipOnType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ClipOn clipOnList() {
    ClipOn member = new ClipOn();
    member.setModelTypeName("clip_on");
    member.setName("clip_on_type");
    member.setMemberName("clipOnList");
    member.setRelationName("clipOnType");
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
