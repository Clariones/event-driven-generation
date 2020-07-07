package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PartnerSettlementApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.partnersettlementapplication.PartnerSettlementApplication";
  }
  // 枚举对象

  // 引用的对象

  public PartnerType partnerType() {
    PartnerType member = new PartnerType();
    member.setModelTypeName("partner_type");
    member.setName("partner_type");
    member.setMemberName("partnerType");
    member.setReferDirection(true);
    member.setRelationName("partnerType");
    append(member);
    return member;
  }

  public AvailableServiceLocation serviceLocation() {
    AvailableServiceLocation member = new AvailableServiceLocation();
    member.setModelTypeName("available_service_location");
    member.setName("service_location");
    member.setMemberName("serviceLocation");
    member.setReferDirection(true);
    member.setRelationName("serviceLocation");
    append(member);
    return member;
  }

  public ApplicationStatus status() {
    ApplicationStatus member = new ApplicationStatus();
    member.setModelTypeName("application_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public Merchant applicantMerchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("applicant_merchant");
    member.setMemberName("applicantMerchant");
    member.setReferDirection(true);
    member.setRelationName("applicantMerchant");
    append(member);
    return member;
  }

  public EmployeeNomination applicantEmployee() {
    EmployeeNomination member = new EmployeeNomination();
    member.setModelTypeName("employee_nomination");
    member.setName("applicant_employee");
    member.setMemberName("applicantEmployee");
    member.setReferDirection(true);
    member.setRelationName("applicantEmployee");
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

  public StringAttribute contactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactName");
    member.setName("contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute contactMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("contactMobile");
    member.setName("contact_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute merchantWebsite() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_url");
    // member.setName("merchantWebsite");
    member.setName("merchant_website");
    useMember(member);
    return member;
  }

  public StringAttribute merchantName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("merchantName");
    member.setName("merchant_name");
    useMember(member);
    return member;
  }

  public StringAttribute merchantLocation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("merchantLocation");
    member.setName("merchant_location");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comments");
    member.setName("comments");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
