package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MoyiUserDailyInkValue extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.moyiuserdailyinkvalue.MoyiUserDailyInkValue";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser user() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("user");
    member.setMemberName("user");
    member.setReferDirection(true);
    member.setRelationName("user");
    append(member);
    return member;
  }

  public Moyi moyi() {
    Moyi member = new Moyi();
    member.setModelTypeName("moyi");
    member.setName("moyi");
    member.setMemberName("moyi");
    member.setReferDirection(true);
    member.setRelationName("moyi");
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

  public StringAttribute userIdentification() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("userIdentification");
    member.setName("user_identification");
    useMember(member);
    return member;
  }

  public NumberAttribute artworkInkValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("artworkInkValue");
    member.setName("artwork_ink_value");
    useMember(member);
    return member;
  }

  public DateTimeAttribute date() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("date");
    member.setName("date");
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
