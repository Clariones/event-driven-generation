package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PrescriptionPdType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.prescriptionpdtype.PrescriptionPdType";
  }
  // 枚举对象
  public static EnumAttribute SINGLE_PD =
      new EnumAttribute(
          "com.doublechaintech.optical.prescriptionpdtype.PrescriptionPdType", "SINGLE_PD");
  public static EnumAttribute DUAL_PD =
      new EnumAttribute(
          "com.doublechaintech.optical.prescriptionpdtype.PrescriptionPdType", "DUAL_PD");

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

  public Prescription prescriptionList() {
    Prescription member = new Prescription();
    member.setModelTypeName("prescription");
    member.setName("prescription_pd_type");
    member.setMemberName("prescriptionList");
    member.setRelationName("prescriptionPdType");
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
