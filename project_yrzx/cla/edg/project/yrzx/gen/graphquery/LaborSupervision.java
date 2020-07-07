package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborSupervision extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.laborsupervision.LaborSupervision";
  }
  // 枚举对象

  // 引用的对象

  public Merchant employee() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("employee");
    member.setMemberName("employee");
    member.setReferDirection(true);
    member.setRelationName("employee");
    append(member);
    return member;
  }

  public Merchant employer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("employer");
    member.setMemberName("employer");
    member.setReferDirection(true);
    member.setRelationName("employer");
    append(member);
    return member;
  }

  public Task workTask() {
    Task member = new Task();
    member.setModelTypeName("task");
    member.setName("work_task");
    member.setMemberName("workTask");
    member.setReferDirection(true);
    member.setRelationName("workTask");
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

  public StringAttribute workContent() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("workContent");
    member.setName("work_content");
    useMember(member);
    return member;
  }

  public DateTimeAttribute workDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("workDate");
    member.setName("work_date");
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
