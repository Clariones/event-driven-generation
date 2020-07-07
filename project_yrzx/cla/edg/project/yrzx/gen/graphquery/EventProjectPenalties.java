package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProjectPenalties extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventprojectpenalties.EventProjectPenalties";
  }
  // 枚举对象

  // 引用的对象

  public StandardContract workPackageContract() {
    StandardContract member = new StandardContract();
    member.setModelTypeName("standard_contract");
    member.setName("work_package_contract");
    member.setMemberName("workPackageContract");
    member.setReferDirection(true);
    member.setRelationName("workPackageContract");
    append(member);
    return member;
  }

  public EmployeeNomination penaltiesExecutor() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("penalties_executor");
    member.setMemberName("penaltiesExecutor");
    member.setReferDirection(true);
    member.setRelationName("penaltiesExecutor");
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

  public StringAttribute penaltiesId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("penaltiesId");
    member.setName("penalties_id");
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

  public StringAttribute projectName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("projectName");
    member.setName("project_name");
    useMember(member);
    return member;
  }

  public StringAttribute dailyTaskTypeId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("dailyTaskTypeId");
    member.setName("daily_task_type_id");
    useMember(member);
    return member;
  }

  public StringAttribute penaltiesType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("penaltiesType");
    member.setName("penalties_type");
    useMember(member);
    return member;
  }

  public NumberAttribute forfeit() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("forfeit");
    member.setName("forfeit");
    useMember(member);
    return member;
  }

  public StringAttribute reason() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("reason");
    member.setName("reason");
    useMember(member);
    return member;
  }

  public StringAttribute images() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("images");
    member.setName("images");
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
