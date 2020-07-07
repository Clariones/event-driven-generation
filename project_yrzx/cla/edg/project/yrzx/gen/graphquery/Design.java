package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Design extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.design.Design";
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

  public Merchant designer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("designer");
    member.setMemberName("designer");
    member.setReferDirection(true);
    member.setRelationName("designer");
    append(member);
    return member;
  }

  public Merchant reviewer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("reviewer");
    member.setMemberName("reviewer");
    member.setReferDirection(true);
    member.setRelationName("reviewer");
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

  public DesignChange designChangeList() {
    DesignChange member = new DesignChange();
    member.setModelTypeName("design_change");
    member.setName("design");
    member.setMemberName("designChangeList");
    member.setRelationName("design");
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

  public StringAttribute designWork() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("designWork");
    member.setName("design_work");
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

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
