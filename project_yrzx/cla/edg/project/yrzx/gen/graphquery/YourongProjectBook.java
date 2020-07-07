package cla.edg.project.yrzx.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class YourongProjectBook extends BaseModelBean {
  public String getFullClassName() {
    return "com.yrdec.yrzx.yourongprojectbook.YourongProjectBook";
  }
  // 枚举对象

  // 引用的对象

  public YourongProjectBookType type() {
    YourongProjectBookType member = new YourongProjectBookType();
    member.setModelTypeName("yourong_project_book_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public YourongProjectBookStatus status() {
    YourongProjectBookStatus member = new YourongProjectBookStatus();
    member.setModelTypeName("yourong_project_book_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public StringAttribute documentUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("documentUrl");
    member.setName("document_url");
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
