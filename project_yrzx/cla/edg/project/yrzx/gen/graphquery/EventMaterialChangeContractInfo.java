package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMaterialChangeContractInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventmaterialchangecontractinfo.EventMaterialChangeContractInfo";
  }
  // 枚举对象

  // 引用的对象

  public StandardContract contract() {
    StandardContract member = new StandardContract();
    member.setModelTypeName("standard_contract");
    member.setName("contract");
    member.setMemberName("contract");
    member.setReferDirection(true);
    member.setRelationName("contract");
    append(member);
    return member;
  }

  public MaterialUnitOfMeasurement uom() {
    MaterialUnitOfMeasurement member = new MaterialUnitOfMeasurement();
    member.setModelTypeName("material_unit_of_measurement");
    member.setName("uom");
    member.setMemberName("uom");
    member.setReferDirection(true);
    member.setRelationName("uom");
    append(member);
    return member;
  }

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

  public StringAttribute materialCategoryId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("materialCategoryId");
    member.setName("material_category_id");
    useMember(member);
    return member;
  }

  public StringAttribute materialName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("materialName");
    member.setName("material_name");
    useMember(member);
    return member;
  }

  public StringAttribute model() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("model");
    member.setName("model");
    useMember(member);
    return member;
  }

  public StringAttribute brand() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brand");
    member.setName("brand");
    useMember(member);
    return member;
  }

  public StringAttribute fieldGroup() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("fieldGroup");
    member.setName("field_group");
    useMember(member);
    return member;
  }

  public StringAttribute eventInitiatorType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("eventInitiatorType");
    member.setName("event_initiator_type");
    useMember(member);
    return member;
  }

  public StringAttribute eventInitiatorId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("eventInitiatorId");
    member.setName("event_initiator_id");
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
