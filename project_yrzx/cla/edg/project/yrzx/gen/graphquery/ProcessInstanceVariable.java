package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProcessInstanceVariable extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.processinstancevariable.ProcessInstanceVariable";
  }
  // 枚举对象

  // 引用的对象

  public ProcessInstance processInstance() {
    ProcessInstance member = new ProcessInstance();
    member.setModelTypeName("process_instance");
    member.setName("process_instance");
    member.setMemberName("processInstance");
    member.setReferDirection(true);
    member.setRelationName("processInstance");
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

  public StringAttribute value() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("value");
    member.setName("value");
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
