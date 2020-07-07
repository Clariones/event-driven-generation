package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContractStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.contractstatus.ContractStatus";
  }
  // 枚举对象
  public static EnumAttribute NEED_CONFIRM =
      new EnumAttribute("com.yrdec.yrzx.contractstatus.ContractStatus", "NEED_CONFIRM");
  public static EnumAttribute FULFILLING =
      new EnumAttribute("com.yrdec.yrzx.contractstatus.ContractStatus", "FULFILLING");
  public static EnumAttribute END_FULFILLED =
      new EnumAttribute("com.yrdec.yrzx.contractstatus.ContractStatus", "END_FULFILLED");
  public static EnumAttribute RISK =
      new EnumAttribute("com.yrdec.yrzx.contractstatus.ContractStatus", "RISK");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.yrdec.yrzx.contractstatus.ContractStatus", "CANCELLED");

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

  public StandardContract standardContractList() {
    StandardContract member = new StandardContract();
    member.setModelTypeName("standard_contract");
    member.setName("contract_status");
    member.setMemberName("standardContractList");
    member.setRelationName("contractStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplementaryContract supplementaryContractList() {
    SupplementaryContract member = new SupplementaryContract();
    member.setModelTypeName("supplementary_contract");
    member.setName("status");
    member.setMemberName("supplementaryContractList");
    member.setRelationName("status");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventContractBasicInfo eventContractBasicInfoList() {
    EventContractBasicInfo member = new EventContractBasicInfo();
    member.setModelTypeName("event_contract_basic_info");
    member.setName("status");
    member.setMemberName("eventContractBasicInfoList");
    member.setRelationName("status");
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
