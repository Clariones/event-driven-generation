package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventAddProjectOrganization extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventaddprojectorganization.EventAddProjectOrganization";
  }
  // 枚举对象

  // 引用的对象

  public EmployeeNomination employee() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("employee");
    member.setMemberName("employee");
    member.setReferDirection(true);
    member.setRelationName("employee");
    append(member);
    return member;
  }

  public ProjectOrganizationType projectOrganizationType() {
    ProjectOrganizationType member = new ProjectOrganizationType();
    member.setModelTypeName("project_organization_type");
    member.setName("project_organization_type");
    member.setMemberName("projectOrganizationType");
    member.setReferDirection(true);
    member.setRelationName("projectOrganizationType");
    append(member);
    return member;
  }

  public ProjectRole projectRole() {
    ProjectRole member = new ProjectRole();
    member.setModelTypeName("project_role");
    member.setName("project_role");
    member.setMemberName("projectRole");
    member.setReferDirection(true);
    member.setRelationName("projectRole");
    append(member);
    return member;
  }

  public WorkPackage workPackage() {
    WorkPackage member = new WorkPackage();
    member.setModelTypeName("work_package");
    member.setName("work_package");
    member.setMemberName("workPackage");
    member.setReferDirection(true);
    member.setRelationName("workPackage");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("description");
    member.setName("description");
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
