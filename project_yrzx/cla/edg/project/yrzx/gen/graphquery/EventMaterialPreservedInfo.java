package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMaterialPreservedInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventmaterialpreservedinfo.EventMaterialPreservedInfo";
  }
  // 枚举对象

  // 引用的对象

  public ProjectNomination materialManager() {
    ProjectNomination member = new ProjectNomination();
    member.setModelTypeName("project_nomination");
    member.setName("material_manager");
    member.setMemberName("materialManager");
    member.setReferDirection(true);
    member.setRelationName("materialManager");
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

  public StringAttribute sealUpMaterialName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sealUpMaterialName");
    member.setName("seal_up_material_name");
    useMember(member);
    return member;
  }

  public StringAttribute images() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("images");
    member.setName("images");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comments");
    member.setName("comments");
    useMember(member);
    return member;
  }

  public StringAttribute createTime() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("createTime");
    member.setName("create_time");
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
