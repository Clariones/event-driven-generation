package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PersonalizationImage extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.personalizationimage.PersonalizationImage";
  }
  // 枚举对象

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

  public FrameEngravingImage frameEngravingImageList() {
    FrameEngravingImage member = new FrameEngravingImage();
    member.setModelTypeName("frame_engraving_image");
    member.setName("image");
    member.setMemberName("frameEngravingImageList");
    member.setRelationName("image");
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

  public StringAttribute image() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image");
    member.setName("image");
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
