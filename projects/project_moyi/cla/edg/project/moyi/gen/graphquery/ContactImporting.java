package cla.edg.project.moyi.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ContactImporting extends BaseModelBean {
  public String getFullClassName() {
    return "com.terapico.moyi.contactimporting.ContactImporting";
  }
  // 枚举对象

  // 引用的对象

  public MoyiUser user() {
    MoyiUser member = new MoyiUser();
    member.setModelTypeName("moyi_user");
    member.setName("user");
    member.setMemberName("user");
    member.setReferDirection(true);
    member.setRelationName("user");
    append(member);
    return member;
  }

  public Moyi moyi() {
    Moyi member = new Moyi();
    member.setModelTypeName("moyi");
    member.setName("moyi");
    member.setMemberName("moyi");
    member.setReferDirection(true);
    member.setRelationName("moyi");
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

  public StringAttribute importMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("importMobile");
    member.setName("import_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute importName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("importName");
    member.setName("import_name");
    useMember(member);
    return member;
  }

  public StringAttribute originImportPhonenumber() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("originImportPhonenumber");
    member.setName("origin_import_phonenumber");
    useMember(member);
    return member;
  }

  public BooleanAttribute alreadyRegisterWhenImport() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("alreadyRegisterWhenImport");
    member.setName("already_register_when_import");
    useMember(member);
    return member;
  }

  public BooleanAttribute invitedSmsSent() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("invitedSmsSent");
    member.setName("invited_sms_sent");
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
