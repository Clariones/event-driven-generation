package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkPackageAcceptanceSettlement extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.workpackageacceptancesettlement.WorkPackageAcceptanceSettlement";
  }
  // 枚举对象

  // 引用的对象

  public WorkPackage workPackage() {
    WorkPackage member = new WorkPackage();
    member.setModelTypeName("work_package");
    member.setName("work_package");
    member.setMemberName("workPackage");
    member.setReferDirection(true);
    member.setRelationName("workPackage");
    append(member);
    return member;
  }

  public Merchant serviceVendor() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("service_vendor");
    member.setMemberName("serviceVendor");
    member.setReferDirection(true);
    member.setRelationName("serviceVendor");
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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public NumberAttribute settlementAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("settlementAmount");
    member.setName("settlement_amount");
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
