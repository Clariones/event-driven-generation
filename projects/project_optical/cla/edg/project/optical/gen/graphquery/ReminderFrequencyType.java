package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ReminderFrequencyType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.reminderfrequencytype.ReminderFrequencyType";
  }
  // 枚举对象
  public static EnumAttribute HALF_YEAR =
      new EnumAttribute(
          "com.doublechaintech.optical.reminderfrequencytype.ReminderFrequencyType", "HALF_YEAR");
  public static EnumAttribute YEARLY =
      new EnumAttribute(
          "com.doublechaintech.optical.reminderfrequencytype.ReminderFrequencyType", "YEARLY");
  public static EnumAttribute TWO_YEAR =
      new EnumAttribute(
          "com.doublechaintech.optical.reminderfrequencytype.ReminderFrequencyType", "TWO_YEAR");
  public static EnumAttribute NO_REMINDER =
      new EnumAttribute(
          "com.doublechaintech.optical.reminderfrequencytype.ReminderFrequencyType", "NO_REMINDER");

  // 引用的对象

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

  public Prescription prescriptionList() {
    Prescription member = new Prescription();
    member.setModelTypeName("prescription");
    member.setName("reminder_frequency_type");
    member.setMemberName("prescriptionList");
    member.setRelationName("reminderFrequencyType");
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
