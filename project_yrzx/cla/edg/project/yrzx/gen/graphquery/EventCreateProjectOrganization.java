package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventCreateProjectOrganization extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventcreateprojectorganization.EventCreateProjectOrganization";
  }
  // 枚举对象

  // 引用的对象

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

  public EmployeeNomination yrConstructionAgency() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("yr_construction_agency");
    member.setMemberName("yrConstructionAgency");
    member.setReferDirection(true);
    member.setRelationName("yrConstructionAgency");
    append(member);
    return member;
  }

  public EmployeeNomination projectConstruction() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_construction");
    member.setMemberName("projectConstruction");
    member.setReferDirection(true);
    member.setRelationName("projectConstruction");
    append(member);
    return member;
  }

  public EmployeeNomination brand() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("brand");
    member.setMemberName("brand");
    member.setReferDirection(true);
    member.setRelationName("brand");
    append(member);
    return member;
  }

  public EmployeeNomination bim() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("bim");
    member.setMemberName("bim");
    member.setReferDirection(true);
    member.setRelationName("bim");
    append(member);
    return member;
  }

  public EmployeeNomination projectSupervision() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_supervision");
    member.setMemberName("projectSupervision");
    member.setReferDirection(true);
    member.setRelationName("projectSupervision");
    append(member);
    return member;
  }

  public EmployeeNomination projectDesign() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_design");
    member.setMemberName("projectDesign");
    member.setReferDirection(true);
    member.setRelationName("projectDesign");
    append(member);
    return member;
  }

  public EmployeeNomination projectSurvey() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_survey");
    member.setMemberName("projectSurvey");
    member.setReferDirection(true);
    member.setRelationName("projectSurvey");
    append(member);
    return member;
  }

  public EmployeeNomination projectBidding() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_bidding");
    member.setMemberName("projectBidding");
    member.setReferDirection(true);
    member.setRelationName("projectBidding");
    append(member);
    return member;
  }

  public EmployeeNomination projectCost() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_cost");
    member.setMemberName("projectCost");
    member.setReferDirection(true);
    member.setRelationName("projectCost");
    append(member);
    return member;
  }

  public EmployeeNomination qualityControl() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("quality_control");
    member.setMemberName("qualityControl");
    member.setReferDirection(true);
    member.setRelationName("qualityControl");
    append(member);
    return member;
  }

  public EmployeeNomination projectAudit() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_audit");
    member.setMemberName("projectAudit");
    member.setReferDirection(true);
    member.setRelationName("projectAudit");
    append(member);
    return member;
  }

  public EmployeeNomination projectPlanning() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_planning");
    member.setMemberName("projectPlanning");
    member.setReferDirection(true);
    member.setRelationName("projectPlanning");
    append(member);
    return member;
  }

  public EmployeeNomination housingManagement() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("housing_management");
    member.setMemberName("housingManagement");
    member.setReferDirection(true);
    member.setRelationName("housingManagement");
    append(member);
    return member;
  }

  public EmployeeNomination fileManagement() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("file_management");
    member.setMemberName("fileManagement");
    member.setReferDirection(true);
    member.setRelationName("fileManagement");
    append(member);
    return member;
  }

  public EmployeeNomination projectManagement() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("project_management");
    member.setMemberName("projectManagement");
    member.setReferDirection(true);
    member.setRelationName("projectManagement");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
