package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WelcomeSlide extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.welcomeslide.WelcomeSlide";
  }
  // 枚举对象

  // 引用的对象

  public Page showIn() {
    Page member = new Page();
    member.setModelTypeName("page");
    member.setName("show_in");
    member.setMemberName("showIn");
    member.setReferDirection(true);
    member.setRelationName("showIn");
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

  public StringAttribute imageUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("imageUrl");
    member.setName("image_url");
    useMember(member);
    return member;
  }

  public NumberAttribute displayOrder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("displayOrder");
    member.setName("display_order");
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

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
