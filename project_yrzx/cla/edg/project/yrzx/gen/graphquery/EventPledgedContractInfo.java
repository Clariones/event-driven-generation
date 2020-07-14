package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventPledgedContractInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventpledgedcontractinfo.EventPledgedContractInfo";
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

  public StringAttribute projectName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectName");
    member.setName("project_name");
    useMember(member);
    return member;
  }

  public StringAttribute pledgedContractName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pledgedContractName");
    member.setName("pledged_contract_name");
    useMember(member);
    return member;
  }

  public StringAttribute pledgedAmount() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pledgedAmount");
    member.setName("pledged_amount");
    useMember(member);
    return member;
  }

  public StringAttribute pledgedContractMaterialFee() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pledgedContractMaterialFee");
    member.setName("pledged_contract_material_fee");
    useMember(member);
    return member;
  }

  public StringAttribute pledgedContractPartyA() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pledgedContractPartyA");
    member.setName("pledged_contract_party_a");
    useMember(member);
    return member;
  }

  public StringAttribute pledgedContractStartTime() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pledgedContractStartTime");
    member.setName("pledged_contract_start_time");
    useMember(member);
    return member;
  }

  public StringAttribute pledgedContractEndTime() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pledgedContractEndTime");
    member.setName("pledged_contract_end_time");
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
