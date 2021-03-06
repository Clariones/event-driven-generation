package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CommunityStatistic extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.communitystatistic.CommunityStatistic";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute indexTitle() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("indexTitle");
    member.setName("index_title");
    useMember(member);
    return member;
  }

  public NumberAttribute indexValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("indexValue");
    member.setName("index_value");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
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
