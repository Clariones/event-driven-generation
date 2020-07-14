package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMaterialCheck extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventmaterialcheck.EventMaterialCheck";
  }
  // 枚举对象

  // 引用的对象

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public StringAttribute plannedMaterialCount() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("plannedMaterialCount");
    member.setName("planned_material_count");
    useMember(member);
    return member;
  }

  public StringAttribute actualMaterialCount() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("actualMaterialCount");
    member.setName("actual_material_count");
    useMember(member);
    return member;
  }

  public StringAttribute actualArrivedCount() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("actualArrivedCount");
    member.setName("actual_arrived_count");
    useMember(member);
    return member;
  }

  public StringAttribute isBroken() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("isBroken");
    member.setName("is_broken");
    useMember(member);
    return member;
  }

  public BooleanAttribute materialMatches() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("materialMatches");
    member.setName("material_matches");
    useMember(member);
    return member;
  }

  public BooleanAttribute meetQuanlityStandard() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("meetQuanlityStandard");
    member.setName("meet_quanlity_standard");
    useMember(member);
    return member;
  }

  public BooleanAttribute hasCertificates() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("hasCertificates");
    member.setName("has_certificates");
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
