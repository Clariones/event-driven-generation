package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InkDeedStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.inkdeedstatus.InkDeedStatus";
  }
  // 枚举对象
  public static EnumAttribute FRESH =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "FRESH");
  public static EnumAttribute AVALIABLE =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "AVALIABLE");
  public static EnumAttribute BE_DRAWN =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "BE_DRAWN");
  public static EnumAttribute BOOKED =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "BOOKED");
  public static EnumAttribute WAITING =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "WAITING");
  public static EnumAttribute CASHED =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "CASHED");
  public static EnumAttribute DORMANT =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "DORMANT");
  public static EnumAttribute DESTROYED =
      new EnumAttribute("com.terapico.moyi.inkdeedstatus.InkDeedStatus", "DESTROYED");

  // 引用的对象

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

  public InkDeed inkDeedList() {
    InkDeed member = new InkDeed();
    member.setModelTypeName("ink_deed");
    member.setName("status");
    member.setMemberName("inkDeedList");
    member.setRelationName("status");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
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
