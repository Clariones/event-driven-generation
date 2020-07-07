package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventCreateMerchant extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventcreatemerchant.EventCreateMerchant";
  }
  // 枚举对象

  // 引用的对象

  public MerchantType type() {
    MerchantType member = new MerchantType();
    member.setModelTypeName("merchant_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public MerchantBaseType baseType() {
    MerchantBaseType member = new MerchantBaseType();
    member.setModelTypeName("merchant_base_type");
    member.setName("base_type");
    member.setMemberName("baseType");
    member.setReferDirection(true);
    member.setRelationName("baseType");
    append(member);
    return member;
  }

  public MerchantStatus status() {
    MerchantStatus member = new MerchantStatus();
    member.setModelTypeName("merchant_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public StringAttribute companyName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("companyName");
    member.setName("company_name");
    useMember(member);
    return member;
  }

  public StringAttribute companyAddress() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("companyAddress");
    member.setName("company_address");
    useMember(member);
    return member;
  }

  public StringAttribute contactorName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactorName");
    member.setName("contactor_name");
    useMember(member);
    return member;
  }

  public StringAttribute contactorJob() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactorJob");
    member.setName("contactor_job");
    useMember(member);
    return member;
  }

  public StringAttribute contactorPhone() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("contactorPhone");
    member.setName("contactor_phone");
    useMember(member);
    return member;
  }

  public StringAttribute image() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image");
    member.setName("image");
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
