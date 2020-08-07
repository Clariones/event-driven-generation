package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PrescriptionSku extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.prescriptionsku.PrescriptionSku";
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

  public Lens lens() {
    Lens member = new Lens();
    member.setModelTypeName("lens");
    member.setName("lens");
    member.setMemberName("lens");
    member.setReferDirection(true);
    member.setRelationName("lens");
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

  public Sku skuList() {
    Sku member = new Sku();
    member.setModelTypeName("sku");
    member.setName("prescription_sku");
    member.setMemberName("skuList");
    member.setRelationName("prescriptionSku");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
