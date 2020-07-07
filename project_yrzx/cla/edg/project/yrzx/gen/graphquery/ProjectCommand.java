package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProjectCommand extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.projectcommand.ProjectCommand";
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

  public DailyTaskType dailyTaskType() {
    DailyTaskType member = new DailyTaskType();
    member.setModelTypeName("daily_task_type");
    member.setName("daily_task_type");
    member.setMemberName("dailyTaskType");
    member.setReferDirection(true);
    member.setRelationName("dailyTaskType");
    append(member);
    return member;
  }

  public ProjectMaterial projectMaterial() {
    ProjectMaterial member = new ProjectMaterial();
    member.setModelTypeName("project_material");
    member.setName("project_material");
    member.setMemberName("projectMaterial");
    member.setReferDirection(true);
    member.setRelationName("projectMaterial");
    append(member);
    return member;
  }

  // 被引用的对象

  public ProjectCommandAssignment projectCommandAssignmentList() {
    ProjectCommandAssignment member = new ProjectCommandAssignment();
    member.setModelTypeName("project_command_assignment");
    member.setName("project_command");
    member.setMemberName("projectCommandAssignmentList");
    member.setRelationName("projectCommand");
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

  public StringAttribute directiveBrief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("directiveBrief");
    member.setName("directive_brief");
    useMember(member);
    return member;
  }

  public BooleanAttribute hasCost() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("hasCost");
    member.setName("has_cost");
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

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("content");
    member.setName("content");
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
