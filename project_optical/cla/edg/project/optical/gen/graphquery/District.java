package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class District extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.district.District";
  }
  // 枚举对象

  // 引用的对象

  public City city() {
    City member = new City();
    member.setModelTypeName("city");
    member.setName("city");
    member.setMemberName("city");
    member.setReferDirection(true);
    member.setRelationName("city");
    append(member);
    return member;
  }

  // 被引用的对象

  public ShippingAddress shippingAddressList() {
    ShippingAddress member = new ShippingAddress();
    member.setModelTypeName("shipping_address");
    member.setName("district");
    member.setMemberName("shippingAddressList");
    member.setRelationName("district");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
