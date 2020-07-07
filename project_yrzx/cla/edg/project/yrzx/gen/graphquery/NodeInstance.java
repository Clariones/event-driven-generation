package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class NodeInstance extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.nodeinstance.NodeInstance";
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

  public NodeInstanceStatus status() {
    NodeInstanceStatus member = new NodeInstanceStatus();
    member.setModelTypeName("node_instance_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
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
    member.setModelTypeName("string_longtext");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute nodeDefinitionId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("nodeDefinitionId");
    member.setName("node_definition_id");
    useMember(member);
    return member;
  }

  public StringAttribute processResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("processResult");
    member.setName("process_result");
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
