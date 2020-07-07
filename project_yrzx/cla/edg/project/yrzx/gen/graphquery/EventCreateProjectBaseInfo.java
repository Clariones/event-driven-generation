package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventCreateProjectBaseInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventcreateprojectbaseinfo.EventCreateProjectBaseInfo";
  }
  // 枚举对象

  // 引用的对象

  public Merchant projectOwner() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("project_owner");
    member.setMemberName("projectOwner");
    member.setReferDirection(true);
    member.setRelationName("projectOwner");
    append(member);
    return member;
  }

  public Merchant store() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("store");
    member.setMemberName("store");
    member.setReferDirection(true);
    member.setRelationName("store");
    append(member);
    return member;
  }

  public Merchant partner() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("partner");
    member.setMemberName("partner");
    member.setReferDirection(true);
    member.setRelationName("partner");
    append(member);
    return member;
  }

  public ProjectType projectType() {
    ProjectType member = new ProjectType();
    member.setModelTypeName("project_type");
    member.setName("project_type");
    member.setMemberName("projectType");
    member.setReferDirection(true);
    member.setRelationName("projectType");
    append(member);
    return member;
  }

  public ProjectServiceType projectServiceType() {
    ProjectServiceType member = new ProjectServiceType();
    member.setModelTypeName("project_service_type");
    member.setName("project_service_type");
    member.setMemberName("projectServiceType");
    member.setReferDirection(true);
    member.setRelationName("projectServiceType");
    append(member);
    return member;
  }

  public ProjectPhase projectPhase() {
    ProjectPhase member = new ProjectPhase();
    member.setModelTypeName("project_phase");
    member.setName("project_phase");
    member.setMemberName("projectPhase");
    member.setReferDirection(true);
    member.setRelationName("projectPhase");
    append(member);
    return member;
  }

  public WorkingStatus designStatus() {
    WorkingStatus member = new WorkingStatus();
    member.setModelTypeName("working_status");
    member.setName("design_status");
    member.setMemberName("designStatus");
    member.setReferDirection(true);
    member.setRelationName("designStatus");
    append(member);
    return member;
  }

  public WorkingStatus constructionStatus() {
    WorkingStatus member = new WorkingStatus();
    member.setModelTypeName("working_status");
    member.setName("construction_status");
    member.setMemberName("constructionStatus");
    member.setReferDirection(true);
    member.setRelationName("constructionStatus");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute location() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("location");
    member.setName("location");
    useMember(member);
    return member;
  }

  public NumberAttribute projectArea() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("projectArea");
    member.setName("project_area");
    useMember(member);
    return member;
  }

  public NumberAttribute projectRoughBudget() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("projectRoughBudget");
    member.setName("project_rough_budget");
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
