package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaterialRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.materialrecord.MaterialRecord";
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

  public MaterialUnitOfMeasurement materialUnitOfMeasurement() {
    MaterialUnitOfMeasurement member = new MaterialUnitOfMeasurement();
    member.setModelTypeName("material_unit_of_measurement");
    member.setName("material_unit_of_measurement");
    member.setMemberName("materialUnitOfMeasurement");
    member.setReferDirection(true);
    member.setRelationName("materialUnitOfMeasurement");
    append(member);
    return member;
  }

  public ProjectProgress plannedApproachPhase() {
    ProjectProgress member = new ProjectProgress();
    member.setModelTypeName("project_progress");
    member.setName("planned_approach_phase");
    member.setMemberName("plannedApproachPhase");
    member.setReferDirection(true);
    member.setRelationName("plannedApproachPhase");
    append(member);
    return member;
  }

  public Merchant platformInformationManager() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("platform_information_manager");
    member.setMemberName("platformInformationManager");
    member.setReferDirection(true);
    member.setRelationName("platformInformationManager");
    append(member);
    return member;
  }

  public Project project() {
    Project member = new Project();
    member.setModelTypeName("project");
    member.setName("project");
    member.setMemberName("project");
    member.setReferDirection(true);
    member.setRelationName("project");
    append(member);
    return member;
  }

  public MaterialType type() {
    MaterialType member = new MaterialType();
    member.setModelTypeName("material_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public DailyTaskType dailiTaskType() {
    DailyTaskType member = new DailyTaskType();
    member.setModelTypeName("daily_task_type");
    member.setName("daili_task_type");
    member.setMemberName("dailiTaskType");
    member.setReferDirection(true);
    member.setRelationName("dailiTaskType");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
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

  public NumberAttribute bidUnitPrice() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("bidUnitPrice");
    member.setName("bid_unit_price");
    useMember(member);
    return member;
  }

  public StringAttribute materialBrand() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("materialBrand");
    member.setName("material_brand");
    useMember(member);
    return member;
  }

  public NumberAttribute plannedMaterialAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("plannedMaterialAmount");
    member.setName("planned_material_amount");
    useMember(member);
    return member;
  }

  public DateTimeAttribute plannedApproachTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("plannedApproachTime");
    member.setName("planned_approach_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute updateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("updateTime");
    member.setName("update_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
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
