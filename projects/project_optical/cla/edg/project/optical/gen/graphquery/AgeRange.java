package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AgeRange extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.agerange.AgeRange";
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

  public Prescription prescriptionList() {
    Prescription member = new Prescription();
    member.setModelTypeName("prescription");
    member.setName("age_range");
    member.setMemberName("prescriptionList");
    member.setRelationName("ageRange");
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

  public NumberAttribute ageFrom() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("ageFrom");
    member.setName("age_from");
    useMember(member);
    return member;
  }

  public NumberAttribute ageTo() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("ageTo");
    member.setName("age_to");
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
