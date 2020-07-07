package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EngineeringType extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.engineeringtype.EngineeringType";
  }
  // 枚举对象

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

  public MerchantDetail merchantDetailList() {
    MerchantDetail member = new MerchantDetail();
    member.setModelTypeName("merchant_detail");
    member.setName("engineering_type");
    member.setMemberName("merchantDetailList");
    member.setRelationName("engineeringType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WorkPackage workPackageList() {
    WorkPackage member = new WorkPackage();
    member.setModelTypeName("work_package");
    member.setName("engineering_type");
    member.setMemberName("workPackageList");
    member.setRelationName("engineeringType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventFillPersonalDetail eventFillPersonalDetailList() {
    EventFillPersonalDetail member = new EventFillPersonalDetail();
    member.setModelTypeName("event_fill_personal_detail");
    member.setName("engineering_type");
    member.setMemberName("eventFillPersonalDetailList");
    member.setRelationName("engineeringType");
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
