package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CcRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.ccrecord.CcRecord";
  }
  // 枚举对象

  // 引用的对象

  public Merchant ccTo() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("cc_to");
    member.setMemberName("ccTo");
    member.setReferDirection(true);
    member.setRelationName("ccTo");
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

  public StringAttribute ccItemType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("ccItemType");
    member.setName("cc_item_type");
    useMember(member);
    return member;
  }

  public StringAttribute ccItemId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("ccItemId");
    member.setName("cc_item_id");
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
