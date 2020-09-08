package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ClipOn extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.clipon.ClipOn";
  }
  // 枚举对象

  // 引用的对象

  public ClipOnType clipOnType() {
    ClipOnType member = new ClipOnType();
    member.setModelTypeName("clip_on_type");
    member.setName("clip_on_type");
    member.setMemberName("clipOnType");
    member.setReferDirection(true);
    member.setRelationName("clipOnType");
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

  public LensRestrictClipOn lensRestrictClipOnList() {
    LensRestrictClipOn member = new LensRestrictClipOn();
    member.setModelTypeName("lens_restrict_clip_on");
    member.setName("clip_on");
    member.setMemberName("lensRestrictClipOnList");
    member.setRelationName("clipOn");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FrameAvailableClipOn frameAvailableClipOnList() {
    FrameAvailableClipOn member = new FrameAvailableClipOn();
    member.setModelTypeName("frame_available_clip_on");
    member.setName("clip_on");
    member.setMemberName("frameAvailableClipOnList");
    member.setRelationName("clipOn");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Sku skuList() {
    Sku member = new Sku();
    member.setModelTypeName("sku");
    member.setName("clip_on_sku");
    member.setMemberName("skuList");
    member.setRelationName("clipOnSku");
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

  public StringAttribute externalCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("externalCode");
    member.setName("external_code");
    useMember(member);
    return member;
  }

  public NumberAttribute price() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("price");
    member.setName("price");
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
