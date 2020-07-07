package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SubcontractApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.subcontractapplication.SubcontractApplication";
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

  public CareerType careerType() {
    CareerType member = new CareerType();
    member.setModelTypeName("career_type");
    member.setName("career_type");
    member.setMemberName("careerType");
    member.setReferDirection(true);
    member.setRelationName("careerType");
    append(member);
    return member;
  }

  public MerchantType merchantType() {
    MerchantType member = new MerchantType();
    member.setModelTypeName("merchant_type");
    member.setName("merchant_type");
    member.setMemberName("merchantType");
    member.setReferDirection(true);
    member.setRelationName("merchantType");
    append(member);
    return member;
  }

  public Merchant applicationMerchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("application_merchant");
    member.setMemberName("applicationMerchant");
    member.setReferDirection(true);
    member.setRelationName("applicationMerchant");
    append(member);
    return member;
  }

  public Merchant applicant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("applicant");
    member.setMemberName("applicant");
    member.setReferDirection(true);
    member.setRelationName("applicant");
    append(member);
    return member;
  }

  public WorkPackageType workPackageType() {
    WorkPackageType member = new WorkPackageType();
    member.setModelTypeName("work_package_type");
    member.setName("work_package_type");
    member.setMemberName("workPackageType");
    member.setReferDirection(true);
    member.setRelationName("workPackageType");
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

  public StringAttribute applicationReason() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("applicationReason");
    member.setName("application_reason");
    useMember(member);
    return member;
  }

  public StringAttribute phone() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("phone");
    member.setName("phone");
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
