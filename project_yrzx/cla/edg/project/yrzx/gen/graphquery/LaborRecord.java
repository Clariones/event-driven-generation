package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.laborrecord.LaborRecord";
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

  public LaborRecordType type() {
    LaborRecordType member = new LaborRecordType();
    member.setModelTypeName("labor_record_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
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

  public DateTimeAttribute morningStartWorkingTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("morningStartWorkingTime");
    member.setName("morning_start_working_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute morningEndWorkingTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("morningEndWorkingTime");
    member.setName("morning_end_working_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute afternoonStartWorkingTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("afternoonStartWorkingTime");
    member.setName("afternoon_start_working_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute afternoonEndWorkingTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("afternoonEndWorkingTime");
    member.setName("afternoon_end_working_time");
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
