package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RimlessLensShape extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.rimlesslensshape.RimlessLensShape";
  }
  // 枚举对象

  // 引用的对象

  public PupilDistanceRange pupilDistanceRange() {
    PupilDistanceRange member = new PupilDistanceRange();
    member.setModelTypeName("pupil_distance_range");
    member.setName("pupil_distance_range");
    member.setMemberName("pupilDistanceRange");
    member.setReferDirection(true);
    member.setRelationName("pupilDistanceRange");
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

  public RimlessFrameAvailableLensShape rimlessFrameAvailableLensShapeList() {
    RimlessFrameAvailableLensShape member = new RimlessFrameAvailableLensShape();
    member.setModelTypeName("rimless_frame_available_lens_shape");
    member.setName("rimless_lens_shape");
    member.setMemberName("rimlessFrameAvailableLensShapeList");
    member.setRelationName("rimlessLensShape");
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

  public StringAttribute externalCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("externalCode");
    member.setName("external_code");
    useMember(member);
    return member;
  }

  public StringAttribute width() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("width");
    member.setName("width");
    useMember(member);
    return member;
  }

  public StringAttribute height() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("height");
    member.setName("height");
    useMember(member);
    return member;
  }

  public NumberAttribute horizontalWidth() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("horizontalWidth");
    member.setName("horizontal_width");
    useMember(member);
    return member;
  }

  public NumberAttribute verticalHeight() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("verticalHeight");
    member.setName("vertical_height");
    useMember(member);
    return member;
  }

  public NumberAttribute diagonalLength() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("diagonalLength");
    member.setName("diagonal_length");
    useMember(member);
    return member;
  }

  public StringAttribute shapeImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("shapeImage");
    member.setName("shape_image");
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
