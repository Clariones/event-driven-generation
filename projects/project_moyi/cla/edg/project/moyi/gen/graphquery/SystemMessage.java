package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemMessage extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.systemmessage.SystemMessage";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser moyiUser() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("moyi_user");
    member.setMemberName("moyiUser");
    member.setReferDirection(true);
    member.setRelationName("moyiUser");
    append(member);
    return member;
  }

  public MoyiUser actUser() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("act_user");
    member.setMemberName("actUser");
    member.setReferDirection(true);
    member.setRelationName("actUser");
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

  public BooleanAttribute alreadyRead() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("alreadyRead");
    member.setName("already_read");
    useMember(member);
    return member;
  }

  public StringAttribute relatedObjectType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("relatedObjectType");
    member.setName("related_object_type");
    useMember(member);
    return member;
  }

  public StringAttribute relatedObjectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("relatedObjectId");
    member.setName("related_object_id");
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
