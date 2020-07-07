package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LaborRecordType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.laborrecordtype.LaborRecordType";
  }
  // 枚举对象
  public static EnumAttribute WORD =
      new EnumAttribute("com.yrdec.yrzx.laborrecordtype.LaborRecordType", "WORD");
  public static EnumAttribute REST =
      new EnumAttribute("com.yrdec.yrzx.laborrecordtype.LaborRecordType", "REST");
  public static EnumAttribute VACATION =
      new EnumAttribute("com.yrdec.yrzx.laborrecordtype.LaborRecordType", "VACATION");
  public static EnumAttribute ABSENTEEISM =
      new EnumAttribute("com.yrdec.yrzx.laborrecordtype.LaborRecordType", "ABSENTEEISM");

  // 引用的对象

  // 被引用的对象

  public LaborRecord laborRecordList() {
    LaborRecord member = new LaborRecord();
    member.setModelTypeName("labor_record");
    member.setName("type");
    member.setMemberName("laborRecordList");
    member.setRelationName("type");
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
