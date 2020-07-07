package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkOvertimeRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.workovertimerecord.WorkOvertimeRecord";
  }
  // 枚举对象

  // 引用的对象

  public Merchant owner() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("owner");
    member.setMemberName("owner");
    member.setReferDirection(true);
    member.setRelationName("owner");
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

  public DateTimeAttribute attendanceDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("attendanceDate");
    member.setName("attendance_date");
    useMember(member);
    return member;
  }

  public DateTimeAttribute startTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("startTime");
    member.setName("start_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute endTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("endTime");
    member.setName("end_time");
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
