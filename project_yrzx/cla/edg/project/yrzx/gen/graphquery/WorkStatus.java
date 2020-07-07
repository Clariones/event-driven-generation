package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.workstatus.WorkStatus";
  }
  // 枚举对象
  public static EnumAttribute PENDING =
      new EnumAttribute("com.yrdec.yrzx.workstatus.WorkStatus", "PENDING");
  public static EnumAttribute PROCESSING =
      new EnumAttribute("com.yrdec.yrzx.workstatus.WorkStatus", "PROCESSING");
  public static EnumAttribute READY_FOR_ACCEPTANCE =
      new EnumAttribute("com.yrdec.yrzx.workstatus.WorkStatus", "READY_FOR_ACCEPTANCE");
  public static EnumAttribute COMPLETED =
      new EnumAttribute("com.yrdec.yrzx.workstatus.WorkStatus", "COMPLETED");

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

  public WorkPackage workPackageList() {
    WorkPackage member = new WorkPackage();
    member.setModelTypeName("work_package");
    member.setName("work_status");
    member.setMemberName("workPackageList");
    member.setRelationName("workStatus");
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
