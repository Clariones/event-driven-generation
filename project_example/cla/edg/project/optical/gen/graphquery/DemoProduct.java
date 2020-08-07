package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemoProduct extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.demoproduct.DemoProduct";
  }
  // 枚举对象

  // 引用的对象

  public Category category() {
    Category member = new Category();
    member.setModelTypeName("category");
    member.setName("category");
    member.setMemberName("category");
    member.setReferDirection(true);
    member.setRelationName("category");
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

  public DemoSku demoSkuList() {
    DemoSku member = new DemoSku();
    member.setModelTypeName("demo_sku");
    member.setName("demo_product");
    member.setMemberName("demoSkuList");
    member.setRelationName("demoProduct");
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

  public StringAttribute heroImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("heroImage");
    member.setName("hero_image");
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
