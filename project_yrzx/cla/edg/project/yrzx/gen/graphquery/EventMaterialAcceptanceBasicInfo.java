package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMaterialAcceptanceBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventmaterialacceptancebasicinfo.EventMaterialAcceptanceBasicInfo";
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

  public ProjectNomination auditor() {
    ProjectNomination member = new ProjectNomination();
    member.setModelTypeName("project_nomination");
    member.setName("auditor");
    member.setMemberName("auditor");
    member.setReferDirection(true);
    member.setRelationName("auditor");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
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

  public StringAttribute materialType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("materialType");
    member.setName("material_type");
    useMember(member);
    return member;
  }

  public StringAttribute userPart() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("userPart");
    member.setName("user_part");
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

  public StringAttribute supplier() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("supplier");
    member.setName("supplier");
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
