package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Violation extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.violation.Violation";
  }
  // 枚举对象

  // 引用的对象

  public Project project() {
    Project member = new Project();
    member.setModelTypeName("project");
    member.setName("project");
    member.setMemberName("project");
    member.setReferDirection(true);
    member.setRelationName("project");
    append(member);
    return member;
  }

  public WorkPackage relatedWorkPackage() {
    WorkPackage member = new WorkPackage();
    member.setModelTypeName("work_package");
    member.setName("related_work_package");
    member.setMemberName("relatedWorkPackage");
    member.setReferDirection(true);
    member.setRelationName("relatedWorkPackage");
    append(member);
    return member;
  }

  public Merchant responsibleMerchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("responsible_merchant");
    member.setMemberName("responsibleMerchant");
    member.setReferDirection(true);
    member.setRelationName("responsibleMerchant");
    append(member);
    return member;
  }

  public Merchant impactMerchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("impact_merchant");
    member.setMemberName("impactMerchant");
    member.setReferDirection(true);
    member.setRelationName("impactMerchant");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute violationImage1() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("violationImage1");
    member.setName("violation_image1");
    useMember(member);
    return member;
  }

  public StringAttribute violationImage2() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("violationImage2");
    member.setName("violation_image2");
    useMember(member);
    return member;
  }

  public StringAttribute violationImage3() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("violationImage3");
    member.setName("violation_image3");
    useMember(member);
    return member;
  }

  public StringAttribute violationImage4() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("violationImage4");
    member.setName("violation_image4");
    useMember(member);
    return member;
  }

  public StringAttribute violationImage5() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("violationImage5");
    member.setName("violation_image5");
    useMember(member);
    return member;
  }

  public DateTimeAttribute occurTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("occurTime");
    member.setName("occur_time");
    useMember(member);
    return member;
  }

  public NumberAttribute deductAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("deductAmount");
    member.setName("deduct_amount");
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
