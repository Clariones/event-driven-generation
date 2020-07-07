package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAdditionalContractBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventadditionalcontractbasicinfo.EventAdditionalContractBasicInfo";
  }
  // 枚举对象

  // 引用的对象

  public SupplementaryContractType contractType() {
    SupplementaryContractType member = new SupplementaryContractType();
    member.setModelTypeName("supplementary_contract_type");
    member.setName("contract_type");
    member.setMemberName("contractType");
    member.setReferDirection(true);
    member.setRelationName("contractType");
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

  public StringAttribute contractId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contractId");
    member.setName("contract_id");
    useMember(member);
    return member;
  }

  public StringAttribute projectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectId");
    member.setName("project_id");
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

  public StringAttribute number() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("number");
    member.setName("number");
    useMember(member);
    return member;
  }

  public StringAttribute mainContract() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("mainContract");
    member.setName("main_contract");
    useMember(member);
    return member;
  }

  public StringAttribute projectName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectName");
    member.setName("project_name");
    useMember(member);
    return member;
  }

  public StringAttribute summary() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("summary");
    member.setName("summary");
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
