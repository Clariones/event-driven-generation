package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventApplyDecoration extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.eventapplydecoration.EventApplyDecoration";
  }
  // 枚举对象

  // 引用的对象

  public EstatePropertyType propertyType() {
    EstatePropertyType member = new EstatePropertyType();
    member.setModelTypeName("estate_property_type");
    member.setName("property_type");
    member.setMemberName("propertyType");
    member.setReferDirection(true);
    member.setRelationName("propertyType");
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

  public NumberAttribute propertyArea() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("propertyArea");
    member.setName("property_area");
    useMember(member);
    return member;
  }

  public StringAttribute propertyLocation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("propertyLocation");
    member.setName("property_location");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
