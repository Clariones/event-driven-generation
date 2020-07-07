package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventContractBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventcontractbasicinfo.EventContractBasicInfo";
  }
  // 枚举对象

  // 引用的对象

  public ContractStatus status() {
    ContractStatus member = new ContractStatus();
    member.setModelTypeName("contract_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public Merchant partyA() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("party_a");
    member.setMemberName("partyA");
    member.setReferDirection(true);
    member.setRelationName("partyA");
    append(member);
    return member;
  }

  public Merchant partyB() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("party_b");
    member.setMemberName("partyB");
    member.setReferDirection(true);
    member.setRelationName("partyB");
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

  public StringAttribute projectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectId");
    member.setName("project_id");
    useMember(member);
    return member;
  }

  public StringAttribute contractTypeId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contractTypeId");
    member.setName("contract_type_id");
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

  public StringAttribute contractType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contractType");
    member.setName("contract_type");
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

  public StringAttribute projectLocation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectLocation");
    member.setName("project_location");
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

  public StringAttribute importantRules() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("importantRules");
    member.setName("important_rules");
    useMember(member);
    return member;
  }

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public DateTimeAttribute startDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("startDate");
    member.setName("start_date");
    useMember(member);
    return member;
  }

  public DateTimeAttribute endDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("endDate");
    member.setName("end_date");
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
